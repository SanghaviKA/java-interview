package shapes;


public class Square extends Shapes {
    private double side;

    public Square(double side) {

        this.side = side;
    }

    public double area() {
        double area = this.side * this.side;
        System.out.println("area of Square:" + area);
        return area;
    }

    public double perimeter() {
        double perimeter = 4 * this.side;
        System.out.println("perimeter of Square:" + perimeter);
        return perimeter;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
