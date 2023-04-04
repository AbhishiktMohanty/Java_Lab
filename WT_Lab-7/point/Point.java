class Point {
    private int x;
    private int y;
    private int z;

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
        z = 0;
    }

    // Parameterized constructor
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Copy constructor
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    // Calculates the distance of the point from the origin
    public float findDistance() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    // Calculates the distance between two points
    public float findDistance(int x1, int y1, int z1) {
        int dx = x - x1;
        int dy = y - y1;
        int dz = z - z1;
        return (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    // Calculates the distance between two Point objects
    public float findDistance(Point point) {
        return findDistance(point.x, point.y, point.z);
    }

    // Checks if two Point objects are equal
    public boolean isEqual(Point point) {
        return x == point.x && y == point.y && z == point.z;
    }

    // Displays the description of the Point object
    public void show() {
        System.out.println("Point(" + x + ", " + y + ", " + z + ")");
    }
}
