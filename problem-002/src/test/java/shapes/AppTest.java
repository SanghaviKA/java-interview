package shapes;

import org.junit.jupiter.api.*;

class AppTest {

    @Test
    public void testSquareWithRightValue() {
        Square sq = new Square(10.0);
        double area = sq.area();
        double perimeter = sq.perimeter();
        Assertions.assertEquals(100, area);
        Assertions.assertEquals(40, perimeter);

    }

    @Test
    public void testSquareWithInvalidValues() {
        Square sq = new Square(0);
        double area = sq.area();
        double perimeter = sq.perimeter();
        Assertions.assertEquals(0, area);
        Assertions.assertEquals(0, perimeter);


    }

    @Test
    public void testSquareWithNegativeValues() {
        Square sq = new Square(-2);
        double area = sq.area();
        double perimeter = sq.perimeter();
        Assertions.assertEquals(4, area);
        Assertions.assertEquals(-8, perimeter);


    }

    @Test
    public void testRectangleWithNegativeValues() {
        Rectangle rect = new Rectangle(-1, -10);
        double area = rect.area();
        double perimeter = rect.perimeter();
        Assertions.assertEquals(0, area);
        Assertions.assertEquals(0, perimeter);

    }

    @Test
    public void testRectangleWithRightValue() {
        Rectangle rect = new Rectangle(10, 5);
        double area = rect.area();
        double perimeter = rect.perimeter();
        Assertions.assertEquals(50, area);
        Assertions.assertEquals(30, perimeter);

    }

    @Test
    public void testRectangleWithPositiveAndNegativeValue() {
        Rectangle rect = new Rectangle(10, -5);
        double area = rect.area();
        double perimeter = rect.perimeter();
        Assertions.assertEquals(0, area);
        Assertions.assertEquals(0, perimeter);

    }

    @Test
    public void testCircleWithRightValue() {
        Circle circle = new Circle(10.0);
        double area = circle.area();
        double perimeter = circle.perimeter();
        Assertions.assertEquals(314.1592653589793, area);
        Assertions.assertEquals(62.83185307179586, perimeter);

    }

    @Test
    public void testCircleWithNegativeValue() {
        Circle circle = new Circle(-1);
        double area = circle.area();
        double perimeter = circle.perimeter();
        Assertions.assertEquals(3.141592653589793, area);
        Assertions.assertEquals(-6.283185307179586, perimeter);

    }


}
