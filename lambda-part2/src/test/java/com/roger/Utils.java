package com.roger;

import java.util.function.Function;
import java.util.function.Predicate;

public class Utils {

	public static Predicate<String> longitudCadena(int longitud) {
		return s -> s.length() < longitud;
	}
	
	public static Predicate<String> contieneCadena(String contenido) {
		return s -> s.contains(contenido);
	}
	
	public static Predicate<String> moduloCadena(int modulo) {
		return s -> (s.length() % 2) == 0;
	}
	
	public static Predicate<Integer> comparaNumero(int compara) {
		return i -> i > compara;
	}
	
	public static Function<String, String> concatenaCadena(String concatena) {
		return s -> s + concatena;
	}
	
	public static Function<String, String> reemplazaCadena(String anterior, String reemplaza) {
		return s -> s.replace(anterior,reemplaza);
	}
	
	public static Function<String, String> mayusCadena() {
		return String::toUpperCase;
	}
	
	public static Function<String, Integer> cambioCadena() {
		return String::length;
	}
}
