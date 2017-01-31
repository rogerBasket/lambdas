package com.roger;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Exercise3 {

	public static List<String> transformedList(List<String> lista, Function<String, String> interfaz) {
		Stream<String> listaTrans = lista.stream().map(interfaz);
		
		return listaTrans.collect(toList());
	}
}
