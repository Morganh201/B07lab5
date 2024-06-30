package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTestExtra {
	
	@Test
    void testCircleNotNull(){
		Point center = new Point(10, 46);
        double radius = 3;
        Circle circle = new Circle(center, radius);

        assertNotNull(circle);
    }

    @Test
    void testPerimeter(){
        Point center = new Point(10, 46);
        double radius = 3;
        Circle circle = new Circle(center, radius);

        assertEquals((6 * Math.PI), circle.perimeter());
    }

    @Test
    void testArea(){
        Point center = new Point(10, 46);
        double radius = 3;
        Circle circle = new Circle(center, radius);

        assertEquals(Math.PI * 9, circle.area());
    }
}
