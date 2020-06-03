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

}
