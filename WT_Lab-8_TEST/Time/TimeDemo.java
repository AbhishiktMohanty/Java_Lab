class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.setTime(1, 30);
        Time t2 = new Time();
        t2.setTime(2, 35);
        Time sum = t1.add(t2);
        System.out.print("t1 = ");
        t1.show();
        System.out.print(", t2 = ");
        t2.show();
        System.out.print(", sum = ");
        sum.show();
    }
}