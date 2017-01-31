package com.roger;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
	private String palabras[] = {
		"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
		"basquetball", "escom", "cinvestav"
	};

	@Test
	public void longitudCadena() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> listaFiltro = Exercise1.allMatches(lista, Utils.longitudCadena(6));
		
		assertEquals(Arrays.asList("algo","eso","escom"),listaFiltro);
	}
	
	@Test
	public void contieneCadena() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> listaFiltro = Exercise1.allMatches(lista, Utils.contieneCadena("p"));
		
		assertEquals(Arrays.asList("palabras"), listaFiltro);
	}
	
	@Test
	public void moduloCadena() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> listaFiltro = Exercise1.allMatches(lista, Utils.moduloCadena(2));
		
		assertEquals(Arrays.asList("palabras","algo","letras","ecuaciones"),
				listaFiltro);
	}
}
