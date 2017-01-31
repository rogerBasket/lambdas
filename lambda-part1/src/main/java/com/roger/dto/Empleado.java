package com.roger.dto;

public class Empleado {
	private double salario;
	
	public Empleado() {
	
	}

	public Empleado(double salario) {
		super();
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
