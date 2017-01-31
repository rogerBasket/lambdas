package com.roger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.roger.dto.Automovil;
import com.roger.dto.Empleado;

public class Exercise3Test {

	public Exercise3Test() {
		
	}
	
	@Test
	public void salarioMasAlto() {
		Empleado empleado1 = new Empleado(18.98);
		Empleado empleado2 = new Empleado(100.01);	
		
		Empleado e = Exercise3.betterElement(empleado1, empleado2, Utils.salarioMasAlto());
		
		assertEquals(e,empleado2);
	}
	
	@Test
	public void precioMasBajo() {
		Automovil auto1 = new Automovil(987);
		Automovil auto2 = new Automovil(1200);
		
		Automovil a = Exercise3.betterElement(auto1, auto2, Utils.precioMasBajo());
		
		assertEquals(a,auto1);
	}
	
	@Test
	public void sumaMayorCaracteres() {
		String s1 = "1234";
		String s2 = "5678";
		
		String s = Exercise3.betterElement(s1, s2, Utils.sumaMayorCaracteres());
		
		assertEquals(s,s2);
	}
}
