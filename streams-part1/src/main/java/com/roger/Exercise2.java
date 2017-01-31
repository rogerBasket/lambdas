package com.roger;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Exercise2 {
	
	public Exercise2() {
		
	}
	
	public Exercise2(List<String> lista) {
		
	}

	public void printLine(List<String> lista) {
		lista.stream().forEach(System.out::println);
	}
	
	public static void main(String args[]) {
		String palabras[] = {
			"palabras", "algo", "letras", "ecuaciones", "eso", "lambdas", 
			"basquetball", "escom", "cinvestav"
		};

		//new Exercise2().printLine(Arrays.asList(palabras));
		Supplier<Exercise2> aux = Exercise2::new;
		aux.get().printLine(Arrays.asList(palabras));
	}
}
