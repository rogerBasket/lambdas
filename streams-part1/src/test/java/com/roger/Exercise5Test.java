package com.roger;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class Exercise5Test {
	private String palabras[] = {
		"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
		"basquetball", "escom", "cinvestav"
	};

	@Test
	public void cadenaFiltro() {
		List<String> lista = Arrays.asList(palabras);
		
		String resul = Exercise5.cadenaFiltro(lista, 
				Utils.contieneCadena("E"),
				Utils.longitudMenorCadena(4));
		
		assertNotNull(resul);
		assertEquals("ESO", resul);
	}
}
