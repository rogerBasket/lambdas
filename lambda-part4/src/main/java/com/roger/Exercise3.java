package com.roger;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Exercise3 {

	public static <T> Predicate<T> anyPassPredicate(Predicate<T> ... listaPredicate) {
		Predicate<T> inicio = t -> false;
		
		for(Predicate<T> aux: listaPredicate)
			inicio = inicio.or(aux);
		
		return inicio;
	}
	
	public static <T> T firstAnyMatch(Stream<T> stream, Predicate<T> ... listaPredicate) {
		Predicate<T> aux = anyPassPredicate(listaPredicate);
		
		List<T> lista = stream.filter(aux).limit(1).collect(toList());
		
		if(!lista.isEmpty())
			return lista.get(0);
		return null;
	}
}
