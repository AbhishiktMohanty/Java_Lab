// import java.util.Scanner;

class Plate{
    static double l1,w1;
    Plate(double x, double y){
        this.l1 = x;
        this.w1 = y;
        System.out.println("Plate Details: Length: " + l1 + " Width: " + w1);
    }
}

class Box extends Plate{
    static double l2,w2,h2;
    Box(double x2,double y2,double z2){
        this.l2 = x2;
        this.w2 = y2;
        this.h2 = z2;
        System.out.println("Box Details: Length: " + l2 + " Width: " + w2 + " Height: " + h2);
    }
}

class WoodBox extends Box{
    static double l3,w3,h3, t3;
    WoodBox(double x,double y,double z,double a){
        this.l3 = x;
        this.w3 = y;
        this.h3 = z;
        this.t3 = a;
        System.out.println("Wood Box Details: Length: " + l3 + " Width: " + w3 + " Height: " + h3 + " Thickness: "+ t3);
    }
}


class constructor{
    public static void main(String []args){
        WoodBox c = new WoodBox(9,7,3,1);
    }
}