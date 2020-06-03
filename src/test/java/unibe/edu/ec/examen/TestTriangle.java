package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {
public Triangle triangle;
	@Before
	public void before() {
		triangle = new Triangle(4);
	}
	

	@Test
	public void testcalculatePerimetro() {
		assertEquals(12, triangle.calculatePerimetro(),0.10);
		
	}
	
	@Test
	public void testcalculateArea() {
		assertEquals(4.0, triangle.calculateArea(3.0),0.10);
		
	}
	
	@Test
	public void testcalculateVolume() {
		assertEquals(4.0, triangle.calculateVolume();
		
	}
}
