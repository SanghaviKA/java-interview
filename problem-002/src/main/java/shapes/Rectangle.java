package shapes;

public class Rectangle implements Shapes {
    double length;
    double bredth;

    Rectangle(double length, double bredth) {

        this.length = length;
        this.bredth = bredth;
    }

    public double area() {
        double area;
        if(this.length <= -1 && this.bredth <= -1){
            return 0;
        }else{
            area = this.length * this.bredth;
            System.out.println("Area of Rect:" + area);
            return area;
        }

    }
    public double perimeter() {
        double perimeter;
        perimeter = 2 * (this.length + this.bredth);
        System.out.println("perimeter of Rect:" + perimeter);
       return perimeter;


    }

}


