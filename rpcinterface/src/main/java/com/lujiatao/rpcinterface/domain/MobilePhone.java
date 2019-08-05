package com.lujiatao.rpcinterface.domain;

import java.io.Serializable;

public class MobilePhone implements Serializable {

	private static final long serialVersionUID = -3524836058676351806L;
	private String brand;
	private String model;
	private Os os;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setOs(Os os) {
		this.os = os;
	}

	public Os getOs() {
		return os;
	}

}
