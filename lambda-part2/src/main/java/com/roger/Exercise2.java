package com.roger;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Exercise2 {
	
	public static <T> List<T> allMatches(List<T> lista, Predicate<T> interfaz) {
		Stream<T> listaFiltro = lista.stream().filter(interfaz);
		
		return listaFiltro.collect(toList());
	}
}
