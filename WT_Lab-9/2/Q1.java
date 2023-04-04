// A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per
// square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as 
// per the dimensions given by the user where 3D inherits from 2D


import java.util.Scanner;

class TwoDimensional {
    private double length;
    private double breadth;

    public TwoDimensional(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

class ThreeDimensional extends TwoDimensional {
    private double height;

    public ThreeDimensional(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}

class PlasticCostCalculator {
    private static final double SHEET_COST_PER_SQ_FT = 40;
    private static final double BOX_COST_PER_CUBIC_FT = 60;

    public static double calculateCost(TwoDimensional shape) {
        double area = shape.getArea();
        return area * SHEET_COST_PER_SQ_FT;
    }

    public static double calculateCost(ThreeDimensional shape) {
        double volume = shape.getVolume();
        return volume * BOX_COST_PER_CUBIC_FT;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimensions of the 2D sheet (length breadth): ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        TwoDimensional sheet = new TwoDimensional(length, breadth);
        double sheetCost = PlasticCostCalculator.calculateCost(sheet);
        System.out.println("Cost of the 2D sheet: Rs " + sheetCost);

        System.out.print("Enter the dimensions of the 3D box (length breadth height): ");
        length = scanner.nextDouble();
        breadth = scanner.nextDouble();
        double height = scanner.nextDouble();
        ThreeDimensional box = new ThreeDimensional(length, breadth, height);
        double boxCost = PlasticCostCalculator.calculateCost(box);
        System.out.println("Cost of the 3D box: Rs " + boxCost);
    }
}
