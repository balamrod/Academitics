package com.academitics.text;

import java.io.Serializable;

public class ColumnModel implements Serializable {

	private String header;
	private int property;

	public ColumnModel(String header, int property) {
		this.header = header;
		this.property = property;
	}

	public String getHeader() {
		return header;
	}

	public int getProperty() {
		return property;
	}
}	