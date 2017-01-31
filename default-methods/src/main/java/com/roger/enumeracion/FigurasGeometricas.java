package com.roger.enumeracion;

public enum FigurasGeometricas {
	TRIANGULO(3),
	CUADRADO(4);
	
	private final int lados;
	
	private FigurasGeometricas(int lados) {
		this.lados = lados;
	}
	
	public int getLados() {
		return this.lados;
	}
}
