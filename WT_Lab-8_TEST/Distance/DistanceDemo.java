class DistanceDemo {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.setDistance(3, 500);
        Distance d2 = new Distance();
        d2.setDistance(2, 800);
    
        System.out.print("Distance 1: ");
        d1.show();
        System.out.print("Distance 2: ");
        d2.show();
    
        Distance sum = d1.add(d2);
        System.out.print("Sum: ");
        sum.show();
    }
}
