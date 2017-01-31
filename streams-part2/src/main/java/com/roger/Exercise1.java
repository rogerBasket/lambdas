package com.roger;

import java.util.List;

public class Exercise1 {

	public static String concatenaCadena(List<String> lista) {
		return lista.stream()
				.reduce("", (s1, s2) -> s1 + s2.toUpperCase());
	}
}
