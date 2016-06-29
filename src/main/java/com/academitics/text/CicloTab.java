package com.academitics.text;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.component.panel.Panel;

@ManagedBean
@ViewScoped
public class CicloTab {

	public static Panel panelGrid = new Panel();

	@PostConstruct
	public void init() {
		panelGrid.clearInitialState();		

		for (int col = 0; col < 5; col++) {
			DataTable tabla = new DataTable();
			tabla.setId("tabla" + col);
			
			Panel pnl = new Panel();
			pnl.setHeader("pnl"+ col);
			
			pnl.getChildren().add(tabla);
			
			panelGrid.getChildren().add(pnl);
		}

	}

	public Panel getPanelGrid() {
		return panelGrid;
	}

	public void setPanelGrid(Panel panelGrid) {
		CicloTab.panelGrid = panelGrid;
	}

}
