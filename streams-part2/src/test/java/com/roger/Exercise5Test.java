package com.roger;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {
	private String palabras[] = {
		"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
		"basquetball", "escom", "cinvestav"
	};
	
	@Test
	public void contieneNumeroCadena() {
		List<String> lista = Arrays.asList(palabras);
		
		long num = Exercise5.contieneNumeroCadena(lista,"c");
		
		assertEquals(3l,num);
	}
}
