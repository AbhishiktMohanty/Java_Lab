class Shape{
    double area;
    void showArea(){
        System.out.println("Area: " + area); 
    }
}

class Circle extends Shape{
    float radius;
    void get(int r){
        radius = r;
    }
    void calcArea(){
        area = 3.14 *radius*radius;
    }
}
class Rectangle extends Shape{
    int lenght, breadth;
    void get(int l, int b){
        lenght=l;
        breadth = b;
    }
    void calcArea(){
        area= lenght*breadth;
    }
}

public class Q4{
    public static void main(String[] args){
        Circle c=new Circle();
        c.get(10);
        c.calcArea();
        c.showArea();
        Rectangle r= new Rectangle();
        r.get(4,5);
        r.calcArea();
        r.showArea();
    }
}