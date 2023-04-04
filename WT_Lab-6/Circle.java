class circle{
    public static void main(String x[]) {
        double radius, area;
        // System.out.println("Enter the radius of the circle ::");
        radius=Double.parseDouble(x[0]);
        area = 3.14*radius*radius;
        System.out.println("Area of the circle is: "+area);
    }
}