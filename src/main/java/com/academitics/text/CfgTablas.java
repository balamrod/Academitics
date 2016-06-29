package com.academitics.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.util.BasicFormatterImpl;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.hibernate.type.Type;
import org.primefaces.context.RequestContext;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.ReorderEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import com.academitics.DAO.IdiomaDAO;
import com.academitics.mapeo.ConfigTabla;
import com.academitics.mapeo.ConfigTablaId;
import com.academitics.util.CfgUtil;
import com.academitics.util.HibernateUtil;

@ManagedBean
@ViewScoped
public class CfgTablas implements Serializable {

	private TreeNode root;
	private TreeNode tablas;
	private TreeNode selectedNode;
	List<ConfigTabla> configTabla = new ArrayList<ConfigTabla>();
	String strTabla = IdiomaDAO.tblIdiomas;

	@PostConstruct
	public void init() {
		root = new DefaultTreeNode("Root", null);
		root.setExpanded(true);
		tablas = new DefaultTreeNode("Tablas", root);
		tablas.setExpanded(true);
		tablas.setSelectable(false);

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Map<String, ClassMetadata> classMetaDataMap = sessionFactory
				.getAllClassMetadata();
		for (Map.Entry<String, ClassMetadata> metaDataMap : classMetaDataMap
				.entrySet()) {
			ClassMetadata classMetadata = metaDataMap.getValue();
			AbstractEntityPersister abstractEntityPersister = (AbstractEntityPersister) classMetadata;
			String tableName = abstractEntityPersister.getName();

			tablas.getChildren().add(new DefaultTreeNode(tableName));
			System.out.println(abstractEntityPersister);

			// ClassMetadata hibernateMetadata =
			// sessionFactory.getClassMetadata(Idioma.class);

		}

	}

	public void obtenerDatos(NodeSelectEvent event)
			throws NoSuchFieldException, SecurityException {
		String nombreTabla = event.getTreeNode().toString()
				.replace("com.academitics.mapeo.", "");

		System.out.println("select " + event.getTreeNode().toString());

		configTabla = CfgUtil.validarTabla(nombreTabla);

		System.out.println(" estoy vacio? " + configTabla.isEmpty());

		if (configTabla.isEmpty()) {

			ClassMetadata classMetadata = HibernateUtil.getSessionFactory()
					.getClassMetadata(event.getTreeNode().toString());
			List<String> columnasTablas = Arrays.asList(classMetadata
					.getPropertyNames());

			List<Type> tiposDatos = Arrays.asList(classMetadata
					.getPropertyTypes());

			Session session = HibernateUtil.getSessionFactory()
					.getCurrentSession();
			session.beginTransaction();

			AbstractEntityPersister persister = (AbstractEntityPersister) classMetadata;

			String[] columnaskeys = persister.getIdentifierColumnNames();

			for (int i = 0; i < columnaskeys.length; i++) {
				ConfigTablaId id = new ConfigTablaId();
				ConfigTabla regConfigTabla = new ConfigTabla();

				id.setTabla(nombreTabla);
				id.setNombreCampo(columnaskeys[i]);
				regConfigTabla.setId(id);
				regConfigTabla.setFormato(tiposDatos.get(i).getName());
				regConfigTabla.setId_1("1");
				regConfigTabla.setEtiqueta(columnaskeys[i].replace("_", " "));// falta
																				// capitalizar

				System.out.println("tabla " + nombreTabla + " nombre Campo: "
						+ columnaskeys[i]);
				session.save(regConfigTabla);
			}

			for (int i = 0; i < columnasTablas.size(); i++) {

				ConfigTablaId id = new ConfigTablaId();
				ConfigTabla regConfigTabla = new ConfigTabla();

				id.setTabla(nombreTabla);
				id.setNombreCampo(columnasTablas.get(i));

				System.out.println("tabla " + nombreTabla + " nombre Campo: "
						+ columnasTablas.get(i));
				regConfigTabla.setId(id);
				regConfigTabla.setFormato(tiposDatos.get(i).getName());
				regConfigTabla.setEtiqueta(columnasTablas.get(i).replace("_",
						" "));
				System.out.println("Estoy viendo si es fecha "
						+ regConfigTabla.getFormato().equals("timestamp"));
				if (regConfigTabla.getFormato().equals("timestamp")) { // falta
																		// optimizar
																		// codigo
					regConfigTabla.setTipoValidacion("Fecha");
				}
				session.save(regConfigTabla);

				// falta capitalizar
				// columnasTablas.get(i).getClass().getAnnotations(Idioma.class).length();
			}

			session.getTransaction().commit();

			RequestContext.getCurrentInstance().update("@form");
		} else {
			// List<Object[]> test = Maestro.obtenerDatos("CALL traerTablas()");
			/*
			 * Session session = HibernateUtil.getSessionFactory()
			 * .getCurrentSession(); session.beginTransaction(); Query query =
			 * session.getNamedQuery("traerTablas"); List result = query.list();
			 * System.out.println("procedimiento " + result);
			 * session.getTransaction().commit();
			 */

		}
	}

	public void aplicarOrden() {
		int i = 0;
		for (ConfigTabla registro : configTabla) {
			registro.setOrden(i);
			i++;
		}
	}

	public void guardar() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		int i = 0;
		for (ConfigTabla registro : configTabla) {
			registro.setOrden(i);
			session.saveOrUpdate(registro);
			i++;
		}

		session.getTransaction().commit();
	}

	public void generarQuery() {
		if (!(configTabla.isEmpty())) {
			String[] tblForanea = new String[20];
			String[] nomForaneaArray = new String[20];
			String nomForanea = "";
			String query = "select ";
			String from = "";
			String where = " where i.eliminado != 1 and i.grupoIdioma = gi.grupoIdioma ";
			for (ConfigTabla registro : configTabla) {
				query += registro.getId().getTabla() + "."
						+ registro.getId().getNombreCampo() + ",";
				if (!(from.contains(registro.getId().getTabla() + ","))) {
					from += registro.getId().getTabla() + ",";
				}

				if (registro.getId_1() != null) {
					if (registro.getId_1().equals(2)) { // aquie estoy trabajando 15.35 -  17/03-
						nomForanea += registro.getId().getNombreCampo() + ",";
						System.out.println("soy foranea soy igual a dos" + registro.getId().getNombreCampo());
					}			
				}
			}

			/*query = query.substring(0, query.length() - 1);

			from = from.substring(0, from.length() - 1);
			tblForanea = from.split(",");

			if (!(nomForanea.isEmpty())){
				nomForanea = nomForanea.substring(0, nomForanea.length() - 1);
				nomForaneaArray = nomForanea.split(",");

				String joins = "";
				for (String a : nomForaneaArray) {
					for (String s : tblForanea) {					
						joins += s  + "." + a;
						System.out.println("joins 2for " + joins);
					}
					joins += ",";
					System.out.println("joins 1for " + joins);
				}
			} else 
				System.out.print(" no hay llavens foraneas");

			System.out.println(" salida Query " + query + " " + from);*/
		}
	}

	public void onRowEdit(RowEditEvent event) {

		/*
		 * Lo tenia asi porque editaba cuando realizaba cualquier cambio, ahora
		 * va a ser a la hora de guardar. ConfigTabla nuevosValores =
		 * (ConfigTabla) event.getObject();
		 * 
		 * Session session =
		 * HibernateUtil.getSessionFactory().getCurrentSession();
		 * session.beginTransaction(); session.saveOrUpdate(nuevosValores);
		 * session.getTransaction().commit();
		 */
	}

	public void onRowCancel(RowEditEvent event) {
	}

	public void onRowReorder(ReorderEvent event) {
		ConfigTabla editar = configTabla.get(event.getToIndex());
		editar.setOrden(event.getToIndex());
	}

	public TreeNode getRoot() {
		return root;
	}

	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}

	public List<ConfigTabla> getConfigTabla() {
		return configTabla;
	}

	public void setConfigTabla(List<ConfigTabla> configTabla) {
		this.configTabla = configTabla;
	}

	public String getStrTabla() {
		return strTabla;
	}

	public void setStrTabla(String strTabla) {
		this.strTabla = strTabla;
	}

}
