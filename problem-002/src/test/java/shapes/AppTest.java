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
  public void testSquereWithInvalidValues(){
    Square sq = new Square(0);
    double area = sq.area();
    double perimeter = sq.perimeter();
    Assertions.assertEquals(0, area);
    Assertions.assertEquals(0, perimeter);
    // Assertions.assertTrue(true);





  }
@Test
  public void testRectWithNagativeValues(){
    Rectangle rect = new Rectangle(-1, -10);
    double area = rect.area();
    double perimeter = rect.perimeter();
    Assertions.assertEquals(-2, area);
    Assertions.assertEquals(-2, perimeter);
    // Assertions.assertTrue(true);
  }

}
