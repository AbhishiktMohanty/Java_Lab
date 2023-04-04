// A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per
// square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per
// the dimensions given by the user where 3D inherits from 2D.

import java.util.Scanner;

// 2D shape class
class Shape2D {
    protected double length;
    protected double width;

    public Shape2D(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

// 3D shape class that inherits from 2D shape class
class Shape3D extends Shape2D {
    protected double height;

    public Shape3D(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }
}

public class Plastic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dimensions of the plastic sheet (length width): ");
        double sheetLength = input.nextDouble();
        double sheetWidth = input.nextDouble();

        System.out.print("Enter the dimensions of the plastic box (length width height): ");
        double boxLength = input.nextDouble();
        double boxWidth = input.nextDouble();
        double boxHeight = input.nextDouble();

        Shape2D sheet = new Shape2D(sheetLength, sheetWidth);
        Shape3D box = new Shape3D(boxLength, boxWidth, boxHeight);

        double sheetCost = sheet.getArea() * 40;
        double boxCost = box.getVolume() * 60;

        double totalCost = sheetCost + boxCost;

        System.out.println("The cost of plastic is Rs " + totalCost);
    }
}
