package com.roger;

import com.roger.enumeracion.FigurasGeometricas;
import com.roger.interfaz.RegularPolygon;

public class Square implements RegularPolygon {
	private final double len;
	
	public Square(double len) {
		this.len = len;
	}

	@Override
	public double getNumSides() {
		return FigurasGeometricas.CUADRADO.getLados();
	}

	@Override
	public double getSideLength() {
		return len;
	}

}
