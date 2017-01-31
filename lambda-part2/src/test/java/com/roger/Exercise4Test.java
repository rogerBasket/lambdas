package com.roger;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Exercise4Test {
	private String palabras[] = {
		"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
		"basquetball", "escom", "cinvestav"
	};
	
	@Test
	public void concatenaCadena() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> listaNueva = Exercise4.transformedList(lista, Utils.concatenaCadena("."));
		
		assertEquals(Arrays.asList("palabras.","algo.","letras.","ecuaciones.",
			"eso.","lambdas.","basquetball.","escom.","cinvestav."), listaNueva);
	}
	
	@Test
	public void reemplazaCadena() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> listaNueva = Exercise4.transformedList(lista,
				Utils.reemplazaCadena("as",""));
		
		assertEquals(Arrays.asList("palabr","algo","letr","ecuaciones","eso",
			"lambd","bquetball","escom","cinvestav"), listaNueva);
	}
	
	@Test
	public void mayusCadena() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> listaNueva = Exercise4.transformedList(lista, Utils.mayusCadena());
		
		assertEquals(Arrays.asList("PALABRAS","ALGO","LETRAS","ECUACIONES",
			"ESO","LAMBDAS","BASQUETBALL","ESCOM","CINVESTAV"), listaNueva);
	}

	@Test
	public void cambioCadena() {
		List<String> lista = Arrays.asList(palabras);
		
		List<Integer> listaNueva = Exercise4.transformedList(lista, Utils.cambioCadena());
		
		assertEquals(Arrays.asList(8,4,6,10,3,7,11,5,9), listaNueva);
	}
}
