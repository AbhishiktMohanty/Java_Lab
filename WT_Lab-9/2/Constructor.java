// Illustrate the execution of constructors in multi-level inheritance with three Java 
// classes - plate(length, width), box(length, width, height), wood box (length, width, height, thick)

class Plate {
    int length, width;

    public Plate(int l, int w) {
        this.length = l;
        this.width = w;
        System.out.println("Plate constructor called");
    }
}

class Box extends Plate {
    int height;

    public Box(int l, int w, int h) {
        super(l, w);
        this.height = h;
        System.out.println("Box constructor called");
    }
}

class WoodBox extends Box {
    int thickness;

    public WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        this.thickness = t;
        System.out.println("WoodBox constructor called");
    }
}

class Constructor{
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox(10, 20, 30, 5);
    }
}