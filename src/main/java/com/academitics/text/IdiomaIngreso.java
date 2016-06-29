package com.academitics.text;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UISelectItems;

import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.inputtextarea.InputTextarea;
import org.primefaces.component.outputlabel.OutputLabel;
import org.primefaces.component.panelgrid.PanelGrid;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.context.RequestContext;

import com.academitics.util.LlenarControles;
import com.academitics.util.Maestro;

@ManagedBean
@ViewScoped
public class IdiomaIngreso {
	// campo label id tipo principal prioridad Tabla required
	private static boolean editar = false;
	public static Object[] nuevo = new Object[100];
	public static PanelGrid panelGrid = new PanelGrid();
	private static Object[][] tablaIdioma = {
			{ "Grupo_Idioma", "Grupo Idioma", "grupoIdioma", "2", true, 1,
					null, "GrupoIdioma", true },
			{ "Nombre", "Nombre", true, "0", true, 0, null, null, true },
			{ "Descripcion", "Descripción", true, "1", true, 1, null, null,
					true } };

	public IdiomaIngreso() {
		System.out.println("1 paso por el inicializador " + nuevo[1]
				+ " seleccionado ");
		panelGrid = new PanelGrid();
	}

	static public void Iniciar(Object[] seleccionado) {
		nuevo = seleccionado;

		System.out.println("Iniciar " + nuevo[1] + " seleccionado ");

		crearDOM();
	}

	public void insertar() {
		List<UIComponent> componentes = panelGrid.getChildren();
		String columnas = "";
		String valores = "";

		for (UIComponent items : componentes) {
			if (items instanceof UIInput) {
				UIInput input = (UIInput) items;
				columnas = columnas + input.getId() + ",";
				valores = valores + "'" + input.getValue() + "',";
			}
		}
		// System.out.println("tablas " + tablas + " valores " + valores);

		if (editar) {
			Maestro.editar("Idioma", columnas, valores, "id_idioma", nuevo[0].toString());
		} else {
			Maestro.insertar("Idioma", columnas, valores);
		}

		IdiomaHelper.initTable();
	}

	public static void crearDOM() {
		panelGrid.getChildren().clear();
		RequestContext.getCurrentInstance().update("@form");

		for (int row = 0; row < tablaIdioma.length; row++) {

			OutputLabel ot = new OutputLabel();
			ot.setValue(tablaIdioma[row][1].toString() + ":");
			ot.setId("d" + String.valueOf(row));
			panelGrid.getChildren().add(ot);

			if (tablaIdioma[row][3].toString() == "2") {
				UISelectItems selectItems = new UISelectItems();
				selectItems.setValue(LlenarControles.llenarCombo(Maestro
						.traerDatosSelectOneMenu(
								tablaIdioma[row][2].toString(),
								tablaIdioma[row][7].toString())));

				SelectOneMenu som = new SelectOneMenu();
				som.setId(tablaIdioma[row][0].toString());
				som.getChildren().add(selectItems);
				panelGrid.getChildren().add(som);
			}

			if (tablaIdioma[row][3].toString() == "1") {
				InputTextarea ita = new InputTextarea();
				ita.setId(tablaIdioma[row][0].toString());
				ita.setValue(nuevo[row + 1]);
				ita.setPlaceholder("Ingrese un "
						+ tablaIdioma[row][1].toString());
				ita.setRequired(((Boolean) tablaIdioma[row][8]).booleanValue());
				panelGrid.getChildren().add(ita);
			}

			if (tablaIdioma[row][3].toString() == "0") {
				InputText it = new InputText();
				it.setId(tablaIdioma[row][0].toString());
				it.setRequired(((Boolean) tablaIdioma[row][8]).booleanValue());
				it.setValue(nuevo[row + 1]);
				it.setPlaceholder("Ingrese un "
						+ tablaIdioma[row][1].toString());
				panelGrid.getChildren().add(it);
			}
		}
	}

	static public Object[] getNuevo() {
		return nuevo;
	}

	static public void setNuevo(Object[] nuevo) {
		IdiomaIngreso.nuevo = nuevo;
	}

	public PanelGrid getPanelGrid() {
		return panelGrid;
	}

	public void setPanelGrid(PanelGrid panelGrid) {
		IdiomaIngreso.panelGrid = panelGrid;
	}

}
