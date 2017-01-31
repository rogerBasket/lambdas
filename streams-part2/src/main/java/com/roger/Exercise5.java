package com.roger;

import java.util.List;

public class Exercise5 {
	
	public static Long contieneNumeroCadena(List<String> lista, String contiene) {
		Long num = lista.stream().filter(s -> s.contains(contiene))
				.count();
		
		return num;
	}
}
