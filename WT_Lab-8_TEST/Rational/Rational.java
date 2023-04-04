class Rational {
    private int num, denum;
    
    void setRational(int n, int d) {
        num = n;
        denum = d;
    }
    
    boolean equal(Rational r) {
        return (num == r.num && denum == r.denum);
    }
    
    void show() {
        if (num == 0) {
            System.out.println("0");
        } 
        else if (denum == 1) {
            System.out.println(num);
        }
        else {
            System.out.println(num + "/" + denum);
        }
    }
}
