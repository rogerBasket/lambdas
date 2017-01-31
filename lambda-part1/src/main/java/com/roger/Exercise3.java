package com.roger;

import com.roger.interfaz.TwoElementPredicate;

public class Exercise3 {

	public static <T> T betterElement(T generico1, T generico2, TwoElementPredicate<T> tep) {
		if(tep.metodoInterfaz(generico1,generico2))
			return generico1;
		return generico2;
	}
}
