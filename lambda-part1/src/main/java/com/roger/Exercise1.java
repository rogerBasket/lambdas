package com.roger;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Exercise1 {

	public Exercise1() {
		
	}
	
	public static Stream<String> methodStaticSortByLetter(List<String> lista, char letra) {
		Stream<String> palabras = lista.stream().filter(s -> s.charAt(0) == letra);
		
		return palabras.sorted(String::compareTo);
	}
	
	public List<String> sortByLength(List<String> lista) {
		Stream<String> palabras = lista.stream();
		
		Stream<String> palabrasOrdenadas = palabras.sorted((a, b) -> {
			if(a.length() == b.length())
				return 0;
			else if(a.length() < b.length())
				return -1;
			else
				return 1;
		});
		
		return palabrasOrdenadas.collect(toList());
	}
	
	public List<String> sortReverseLength(List<String> lista) {
		Stream<String> palabras = lista.stream();
		
		Stream<String> palabrasOrdenadas = palabras.sorted((a, b) -> {
			if(a.length() == b.length())
				return 0;
			else if(a.length() < b.length())
				return 1;
			else
				return -1;
		});
		
		return palabrasOrdenadas.collect(toList());
	}
	
	public List<String> sortByFirstCharacter(List<String> lista) {
		Stream<String> palabras = lista.stream();
		
		Stream<String> palabrasOrdenadas = palabras.sorted((a, b) -> {
			return a.charAt(0) - b.charAt(0);
		});
		
		return palabrasOrdenadas.collect(toList());
	}
	
	public List<String> sortByLetter(List<String> lista, char letra) {
		Stream<String> palabras = lista.stream().filter(s -> s.charAt(0) == letra);
		
		Stream<String> palabrasOrdenadas = palabras.sorted((a, b) -> {
			return a.compareTo(b);
		});
		
		return palabrasOrdenadas.collect(toList());
	}
	
	public List<String> methodSortByLetter(List<String> lista, char letra) {
		return methodStaticSortByLetter(lista, letra).collect(toList());
	}
}
	