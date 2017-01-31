package com.roger;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {
	private String palabras[] = {
		"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
		"basquetball", "escom", "cinvestav"
	};

	@Test
	public void numeroCaracteres() {
		List<String> lista = Arrays.asList(palabras);
		
		int suma = Exercise4.numeroCaracteres(lista);
		
		assertEquals(63,suma);
	}
}
