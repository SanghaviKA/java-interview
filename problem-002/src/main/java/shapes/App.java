package shapes;

public class App {
    public static void computeProperties(Shapes shape) {
        double area = shape.area();
        double perimeter = shape.perimeter();
    }

    public static void main(String[] args) {
        Square square = new Square(5.0);
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Circle circle = new Circle(5.0);

        computeProperties(square);
        computeProperties(rectangle);
        computeProperties(circle);

    }
}


