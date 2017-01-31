package com.roger;

import java.util.List;
import java.util.Optional;

public class Exercise4 {

	public static Integer numeroCaracteres(List<String> lista) {
		Integer suma = lista.stream().map(a -> a.length()).
				reduce(0,(a, b) -> a+ b);
		
		return suma;
	}
}
