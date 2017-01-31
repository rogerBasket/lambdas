package com.roger.dto;

public class Automovil {
	private Integer precio;
	
	public Automovil() {
		
	}

	public Automovil(Integer precio) {
		super();
		this.precio = precio;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
}
