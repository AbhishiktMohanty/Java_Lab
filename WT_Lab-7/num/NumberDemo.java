class NumberDemo {
    public static void main(String[] args) {
        Number num1 = new Number(8);
        // System.out.println("Number: " + num1);
        System.out.println("Is even: " + num1.isEven());
        System.out.println("Is prime: " + num1.isPrime());
        System.out.println("Is perfect: " + num1.isPerfect());
        System.out.println("Factorial: " + num1.findFactorial());

        System.out.println();

        Number num2 = new Number(3);
        // System.out.println("\nNumber: " + num2);
        System.out.println("Is even: " + num2.isEven());
        System.out.println("Is prime: " + num2.isPrime());
        System.out.println("Is perfect: " + num2.isPerfect());
        System.out.println("Factorial: " + num2.findFactorial());
    }
}