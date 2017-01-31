package com.roger;

import java.util.List;

public class Exercise2 {

	public static String concatenaCadena(List<String> lista) {
		return lista.stream().map(String::toUpperCase)
				.reduce("", String::concat);
	}
}
