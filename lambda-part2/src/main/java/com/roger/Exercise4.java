package com.roger;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Exercise4 {

	public static <T, R> List<R> transformedList(List<T> lista, Function<T, R> interfaz) {
		Stream<R> listaNueva = lista.stream().map(interfaz);
		
		return listaNueva.collect(toList());
	}
}
