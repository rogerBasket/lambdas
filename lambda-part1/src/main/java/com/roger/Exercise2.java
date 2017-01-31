package com.roger;

import com.roger.interfaz.TwoStringPredicate;

public class Exercise2 {

	public static String betterString(String s1, String s2, TwoStringPredicate tsp) {
		if(tsp.metodoInterfaz(s1, s2))
			return s1;
		return s2;
	}
}
