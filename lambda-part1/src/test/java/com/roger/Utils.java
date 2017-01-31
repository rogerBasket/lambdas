package com.roger;

import com.roger.dto.Empleado;
import com.roger.dto.Automovil;
import com.roger.interfaz.TwoElementPredicate;
import com.roger.interfaz.TwoStringPredicate;

public class Utils {

	public static TwoStringPredicate cadenaMasLarga() {
		return (a, b) -> a.length() > b.length();
	}
	
	public static TwoStringPredicate cadenaIgual() {
		return (a, b) -> a.equals(b);
	}
	
	public static TwoElementPredicate<Empleado> salarioMasAlto() {
		return (a, b) -> a.getSalario() > b.getSalario();
	}
	
	public static TwoElementPredicate<Automovil> precioMasBajo() {
		return (a, b) -> a.getPrecio() < b.getPrecio();
	}
	
	public static TwoElementPredicate<String> sumaMayorCaracteres() {
		return (a, b) -> {
			int suma1 = 0, suma2 = 0;
			
			for(char c: a.toCharArray())
				suma1 += (int)c;
			
			for(char c: b.toCharArray())
				suma2 += (int)c;
			
			return suma1 > suma2;
		};
	}
}