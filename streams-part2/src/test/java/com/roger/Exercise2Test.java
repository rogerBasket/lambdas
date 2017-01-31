package com.roger;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {
	String palabras[] = {
		"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
		"basquetball", "escom", "cinvestav"
	};
	
	@Test
	public void concatenaCadena() {
		List<String> lista = Arrays.asList(palabras);
		
		String resul = Exercise2.concatenaCadena(lista);
		
		assertEquals("PALABRASALGOLETRASECUACIONESESOLAMBDASBASQUETBALLESCOM"
				+ "CINVESTAV", resul);
	} 
}
