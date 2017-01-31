package com.roger;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {

	public void printLineTwoSpaces(List<String> lista) {
		lista.stream().forEach(s -> System.out.printf("  %s\n", s));
	}
	
	public static void main(String args[]) {
		String palabras[] = {
			"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
			"basquetball", "escom", "cinvestav"
		};
		
		new Exercise1().printLineTwoSpaces(Arrays.asList(palabras));
	}
}
