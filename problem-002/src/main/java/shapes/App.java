package shapes;

public class App {
    public static void computeProperties(Shapes shape) {
        double area = shape.area();
        double perimeter = shape.perimeter();
    }

    public static void main(String[] args) {
        Square s = new Square(5.0);
        Rectangle r = new Rectangle(5.0, 4.0);
        Circle c = new Circle(5.0);

        computeProperties(s);
        computeProperties(r);
        computeProperties(c);

    }
}


