package com.roger;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Exercise2 {

	public static <T> Predicate<T> allPassPredicate(Predicate<T> ... listaPredicados) {
		Predicate<T> inicio = t -> true;
		
		for(Predicate<T> aux: listaPredicados)
			inicio = inicio.and(aux);
		
		return inicio;
	}
	
	public static <T> T firstAllMatch(Stream<T> stream, Predicate<T> ... listaPredicados) {
		Predicate<T> aux = allPassPredicate(listaPredicados);
		
		List<T> lista = stream.filter(aux).limit(1).collect(toList());
		
		if(!lista.isEmpty())
			return lista.get(0);
		return null;	
	}
}
