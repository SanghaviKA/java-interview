import shapes.Circle;
import shapes.Rectangle;
import shapes.Shapes;
import shapes.Square;

public class App {
    public static void computeProperties(Shapes shape) {
         shape.area();
         shape.perimeter();
    }

    public static void main(String[] args) {
        // parameter is sides
        Square square = new Square(5.0);
        // parameter is length and breadth
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        // parameter is radius
        Circle circle = new Circle(5.0);

        computeProperties(square);

        computeProperties(rectangle);

        computeProperties(circle);

    }
}


