package shapes;

public class Rectangle extends Shapes {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        double area;
        if (this.length <= -1 || this.breadth <= -1) {
            System.out.println("Computing with the negative value");
            return 0;
        } else {
            area = this.length * this.breadth;
            System.out.println("Area of Rect:" + area);
            return area;
        }

    }

    public double perimeter() {
        double perimeter;
        if (this.length <= -1 || this.breadth <= -1) {
            return 0;
        } else {
            perimeter = 2 * (this.length + this.breadth);
            System.out.println("perimeter of Rect:" + perimeter);
            return perimeter;
        }
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
         this.length = length;
    }

}


