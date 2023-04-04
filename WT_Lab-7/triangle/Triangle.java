import java.lang.Math;

public class Triangle {
    private double a, b, c;
    
    public void setDim(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean isTriangle() {
        if (a + b > c && b + c > a && c + a > b) {
            return true;
        }
        return false;
    }
    
    public double findArea() {
        if (isTriangle()) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return area;
        } else {
            System.out.println("Not a valid triangle!");
            return 0.0;
        }
    }
    
    public double findPerimeter() {
        if (isTriangle()) {
            double perimeter = a + b + c;
            return perimeter;
        } else {
            System.out.println("Not a valid triangle!");
            return 0.0;
        }
    }
    
    public void show() {
        if (isTriangle()) {
            System.out.println("Sides: a = " + a + ", b = " + b + ", c = " + c);
            System.out.println("Area: " + findArea());
            System.out.println("Perimeter: " + findPerimeter());
        } else {
            System.out.println("Not a valid triangle!");
        }
    }
}
// public class Triangle_Demo {
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.setDim(3, 4, 5);
//         t1.show();
        
//         Triangle t2 = new Triangle();
//         t2.setDim(2, 2, 5);
//         t2.show();
//     }
// }