package shapes;

public class Circle extends Shapes {
    private double radius;
    static final double PI = Math.PI;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {

        double area;
        area = Math.PI * this.radius * this.radius;
        System.out.println("Area of Circle:" + area);
        return area;
    }

    public double perimeter() {
        double perimeter;
        perimeter = 2 * PI * this.radius;
        System.out.println("perimeter of Circle:" + perimeter);
        return perimeter;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
