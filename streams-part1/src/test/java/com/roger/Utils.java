package com.roger;

import java.util.function.Predicate;

public class Utils {

	public static Predicate<String> contieneCadena(String contiene) {
		return s -> {
			System.out.println(s);
			return s.contains(contiene);
		};
	}
	
	public static Predicate<String> longitudMenorCadena(int longitud) {
		return s -> s.length() < longitud;
	}
}
