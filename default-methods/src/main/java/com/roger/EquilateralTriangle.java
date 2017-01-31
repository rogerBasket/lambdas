package com.roger;

import com.roger.enumeracion.FigurasGeometricas;
import com.roger.interfaz.RegularPolygon;

public class EquilateralTriangle implements RegularPolygon {
	private final double len;

	public EquilateralTriangle(double len) {
		this.len = len;
	}
	
	@Override
	public double getNumSides() {
		return FigurasGeometricas.TRIANGULO.getLados();
	}

	@Override
	public double getSideLength() {
		return len;
	}

}
