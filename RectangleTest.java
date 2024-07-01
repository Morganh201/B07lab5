package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangeTest {
	
	@Test
	void getRectangle() {
		Point a = new Point(0,0);
		Point b = new Point(2,2);
		Point c = new Point(0,2);
		Point d = new Point(2,0);
		
		Rectangle rect = new Rectangle(a, b, c, d);
		
		assertEquals(a, rect.A);
		assertEquals(b, rect.B);
		assertEquals(c, rect.C);
		assertEquals(d, rect.D);
	}
	
	@Test
	void getPerimeter() {
		Point a = new Point(0,0);
		Point b = new Point(2,2);
		Point c = new Point(0,2);
		Point d = new Point(2,0);
		
		Rectangle rect = new Rectangle(a, b, c, d);
		double perim = a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a);
		
		assertEquals(rect.perimeter(), perim);
	}
	
	@Test
	void testSquare() {
		Point a = new Point(0,0);
		Point b = new Point(2,2);
		Point c = new Point(0,2);
		Point d = new Point(2,0);
		
		Rectangle rect = new Rectangle(a, b, c, d);
		
		
		assertEquals(rect.isSquare(), (a.distance(b) == b.distance(c) && b.distance(c) == c.distance(d) && c.distance(d) == d.distance(a)));
	}
	
	@Test
	void getArea() {
		Point a = new Point(0,0);
		Point b = new Point(2,2);
		Point c = new Point(0,2);
		Point d = new Point(2,0);
		
		Rectangle rect = new Rectangle(a, b, c, d);
		double area = a.distance(b) * b.distance(c);
		
		assertEquals(rect.area(), area);
	}
}