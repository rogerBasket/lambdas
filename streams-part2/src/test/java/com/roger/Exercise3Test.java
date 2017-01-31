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
	public void concatenaCadenaComa() {
		List<String> lista = Arrays.asList(palabras);
		
		String resul = Exercise3.concatenaCadenaComa(lista);
		
		assertNotNull(resul);
		assertEquals("palabras,algo,letras,ecuaciones,eso,lambdas,"
				+ "basquetball,escom,cinvestav",resul);
	}
}
