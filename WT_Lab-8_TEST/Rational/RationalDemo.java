class RationalDemo {
    public static void main(String[] args) {
        Rational r1 = new Rational();
        Rational r2 = new Rational();
        r1.setRational(1, 2);
        r2.setRational(1, 5);

        if (r1.equal(r2)) {
            System.out.println("r1 and r2 are equal");
        }
        else {
            System.out.println("r1 and r2 are not equal");
        }
        
        System.out.print("r1: ");
        r1.show();
        System.out.print("r2: ");
        r2.show();
    }
}