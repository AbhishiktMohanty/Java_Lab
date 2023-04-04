// import java.util.Scanner;

class Triangle{
    static double a,b,c, s, area, peri;

    public static void set_Dim(double x, double y, double z){
        a = x;
        b = y;
        c = z;
    }

    public static boolean isValidTriangle(){ //(int a, int b, int c) {
        if(a + b > c && b + c > a && c + a > b){
            return true;
        }
        else
            return false;
        }
    


    public static double find_area(){
        if ((a + b > c && b + c > a && c + a > b) == true) {
        // Finding the semi-perimeter
            s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return area;
        } 
        else {
            return 0;
        }
    }

    public static double find_perimeter(){
            peri = (a + b + c);
            return peri;
    }

    public static void show(){
        System.out.println("The sides of the triangle are: "+a+", "+b+" & "+c);
        if (isValidTriangle() == true) {
            System.out.println("The triangle with entered dimensions is valid");
            System.out.println("Area of Triangle is: " + find_area());
            
            System.out.println("Perimeter of Triangle is: " + find_perimeter());
            
        }
        else
            System.out.println("The triangle with entered dimensions is not valid");        
    }

    public static void main(String[] arg){
        set_Dim(3.2, 4.1, 6.0);
        show();
    }
}