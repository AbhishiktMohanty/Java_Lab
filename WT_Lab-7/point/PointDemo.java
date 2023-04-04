class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(1, 2, 3);
        Point point4 = new Point(4, 5, 10);
        Point point3 = new Point(point4);

        point1.show();
        point2.show();
        point3.show();

        System.out.println("Distance of point2 from origin: " + point2.findDistance());
        System.out.println("Distance between point2 and (4, 5, 6): " + point2.findDistance(4, 5, 6));
        System.out.println("Distance between point2 and point3: " + point2.findDistance(point3));

        System.out.println("point2 is equal to point3: " + point2.isEqual(point3));
        System.out.println("point2 is equal to point1: " + point2.isEqual(point1));
    }
}