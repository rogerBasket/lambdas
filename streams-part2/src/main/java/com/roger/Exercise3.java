package com.roger;

import java.util.List;
import java.util.Optional;

public class Exercise3 {

	public static String concatenaCadenaComa(List<String> lista) {
		Optional<String> opt = lista.stream().reduce((a, b) -> a + "," + b);
		
		if(opt.isPresent())
			return opt.get();
		return null;
	}
}
