package com.roger.interfaz;

public interface RegularPolygon {

	public double getNumSides();
	public double getSideLength();
	
	public static double totalSides(RegularPolygon rp[]) {
		int sum = 0;
		
		for(RegularPolygon aux: rp)
			sum += aux.getNumSides();
		
		return sum;
	}
	
	default double getPerimeter() {
		return getNumSides()*getSideLength();
	}
	
	default double getInteriorAngle() {
		double n = getNumSides();
		
		return (n-2)*Math.PI/n;
	}
}