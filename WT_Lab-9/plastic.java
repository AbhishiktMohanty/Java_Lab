import java.util.Scanner; 

class P2D{
    static double p2d = 40;
    double l, b, cal;

    public void getData2D(){
        System.out.print("Enter the lenght and Breath of plastic sheet (in ft.): ");
        Scanner s = new Scanner(System.in);
        this.l = s.nextDouble();
        this.b = s.nextDouble();
    }

    public void P2Dcal(){
        this.cal = this.l*this.b*this.p2d;
        System.out.println("The cost of the 2D sheet is " + this.cal); 
    }
}

class P3D extends P2D{
    static double p3d = 60;
    double a, cal1;

    public void getData3D(){
        System.out.print("Enter side of plastic box (in ft.): ");
        Scanner s1 = new Scanner(System.in);
        this.a = s1.nextDouble();
    }

    public void P3Dcal(){
        this.cal1 = this.a*this.a*this.a*this.p3d;
        System.out.println("The cost of the 3D box is "+ this.cal1);
    }
}

public class plastic{
    public static void main(String arg[]){
        P3D obj = new P3D();
        obj.getData2D();
        obj.P2Dcal();
        obj.getData3D();
        obj.P3Dcal();
    }
}