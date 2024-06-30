package lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void getCircle(){
        Point center = new Point(0,0);
        double radius = 1;
        Circle circle = new Circle(center, radius);

        assertEquals(center, circle.center);
        assertEquals(radius, circle.radius);
    }

    @Test
    void getPerimeter(){
        Point center = new Point(0,0);
        double radius = 1;
        Circle circle = new Circle(center, radius);

        assertEquals((2 * Math.PI), circle.perimeter());
    }

    @Test
    void getArea(){
        Point center = new Point(0,0);
        double radius = 1;
        Circle circle = new Circle(center, radius);

        assertEquals(Math.PI, circle.area());
    }

}