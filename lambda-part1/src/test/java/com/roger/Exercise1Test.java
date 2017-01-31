package com.roger;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
	private Exercise1 exercise1;
	private String palabras[] = {
		"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
		"basquetball", "escom", "cinvestav"
	};
	
	public Exercise1Test() {
		exercise1 = new Exercise1();
	}
	
	@Test
	public void sortByLength() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> palabrasOrdenadas = exercise1.sortByLength(lista);
		
		assertEquals(Arrays.asList("eso", "algo", "escom",
				"letras", "lambdas", "palabras", "cinvestav",
				"ecuaciones", "basquetball"), palabrasOrdenadas);
	}
	
	@Test
	public void sortReverseLength() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> palabrasOrdenadas = exercise1.sortReverseLength(lista);
		
		assertEquals(Arrays.asList("basquetball", "ecuaciones", "cinvestav",
				"palabras", "lambdas", "letras", "escom",
				"algo", "eso"), palabrasOrdenadas);
	}
	
	@Test
	public void sortByFirstCharacter() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> palabrasOrdenadas = exercise1.sortByFirstCharacter(lista);
		
		assertEquals(Arrays.asList("algo", "basquetball", "cinvestav", "ecuaciones",
				"eso", "escom", "letras", "lambdas", "palabras"), palabrasOrdenadas);
	}
	
	@Test
	public void sortByLetter() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> palabrasOrdenadas = exercise1.sortByLetter(lista, 'e');
		
		assertEquals(Arrays.asList("ecuaciones", "escom", "eso"), palabrasOrdenadas);
	}
	
	@Test
	public void methodSortByLetter() {
		List<String> lista = Arrays.asList(palabras);
		
		List<String> palabrasOrdenadas = exercise1.methodSortByLetter(lista, 'e');
		
		assertEquals(Arrays.asList("ecuaciones", "escom", "eso"), palabrasOrdenadas);
	}
}
