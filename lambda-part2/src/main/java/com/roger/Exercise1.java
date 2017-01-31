package com.roger;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Exercise1 {

	public static List<String> allMatches(List<String> lista, Predicate<String> interfaz) {
		Stream<String> listaFiltro = lista.stream().filter(interfaz);
		
		return listaFiltro.collect(toList());
	}
}
