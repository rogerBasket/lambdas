package com.roger;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class Exercise3Test {
	private String palabras[] = {
		"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
		"basquetball", "escom", "cinvestav"
	};

	@Test
	public void contieneOLongitud() {
		List<String> lista = Arrays.asList(palabras);
		
		String resul = Exercise3.firstAnyMatch(lista.stream(), 
				Utils.contieneCadena("bas"),
				Utils.longitudMenorCadena(3));
		
		assertNotNull(resul);
		assertEquals("basquetball", resul);
	}
}
