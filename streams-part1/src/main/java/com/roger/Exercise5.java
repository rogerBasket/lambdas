package com.roger;

import java.util.List;
import java.util.function.Predicate;

public class Exercise5 {

	public static Predicate<String> concatenaPredicate(Predicate<String> ...listaPredicate) {
		Predicate<String> unico = s -> true;
		
		for(Predicate<String> aux: listaPredicate)
			unico = unico.and(aux);
		
		return unico;
	}
	
	public static String cadenaFiltro(List<String> lista, Predicate<String> ... listaPredicate) {
		Predicate<String> unico = concatenaPredicate(listaPredicate);
		
		return lista.stream().map(String::toUpperCase).filter(unico).findFirst().orElse(null);
	}
}
