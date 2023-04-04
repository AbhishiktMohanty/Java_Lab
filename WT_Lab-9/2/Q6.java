// Write a program in java using inheritance to show how to call the base class parameterized constructors 
// from the derived class using super.

class Base {
    private int x;
    
    public Base(int x) {
        this.x = x;
    }
    
    public int getX() {
        return x;
    }
}

class Derived extends Base {
    private int y;
    
    public Derived(int x, int y) {
        super(x); // Call the parameterized constructor of Base class with x
        this.y = y;
    }
    
    public int getY() {
        return y;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Derived d = new Derived(5, 10);
        System.out.println("x = " + d.getX()); // Output: x = 5
        System.out.println("y = " + d.getY()); // Output: y = 10
    }
}