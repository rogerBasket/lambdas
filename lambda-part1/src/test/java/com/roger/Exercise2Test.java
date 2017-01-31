package com.roger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {
	
	public Exercise2Test() {
		
	}
	
	@Test
	public void cadenaMasLarga() {
		String s = Exercise2.betterString("hola", "mundo", Utils.cadenaMasLarga());
		
		assertEquals(s,"mundo");
	}

	@Test
	public void cadenaAlfabetica() {
		String s = Exercise2.betterString("alfabeto", "alacran", Utils.cadenaIgual());
		
		assertEquals(s, "alacran");
	}
}
