package com.roger;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class Exercise2Test {
	private String palabras[] = {
		"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
		"basquetball", "escom", "cinvestav"
	};

	@Test
	public void contieneYLongitud() {
		List<String> lista = Arrays.asList(palabras);	
		
		String resul = Exercise2.firstAllMatch(lista.stream(),
				Utils.contieneCadena("as"),
				Utils.longitudMayorCadena(4),
				Utils.longitudMenorCadena(7));
		
		assertNotNull(resul);
		assertEquals("letras", resul);
	}
}
