package com.roger;

import org.junit.Test;

import com.roger.interfaz.RegularPolygon;

import static org.junit.Assert.assertEquals;

public class RegularPolygonTest {
	private RegularPolygon rp;
	
	@Test
	public void triangleTest() {
		double len = 10.5;

		rp = new EquilateralTriangle(len);
		
		assertEquals(rp.getSideLength(),len,1);
		assertEquals(rp.getNumSides(),3,1);
		assertEquals(rp.getPerimeter(),31.5,1);
		assertEquals(rp.getInteriorAngle(),1.04,2);
	}
	
	@Test
	public void squareTest() {
		double len = 7.6;
		
		rp = new Square(len);
		
		assertEquals(rp.getSideLength(),len,1);
		assertEquals(rp.getNumSides(),4,1);
		assertEquals(rp.getPerimeter(),30.4,1);
		assertEquals(rp.getInteriorAngle(),1.57,2);
	}
}
