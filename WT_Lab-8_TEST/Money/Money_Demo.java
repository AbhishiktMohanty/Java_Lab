class Money_Demo {
    public static void main(String[] args) {
        Money m1 = new Money();
        Money m2 = new Money();

        m1.setMoney(2, 50);
        m2.setMoney(3, 55);

        Money sum = m1.add(m2);
        sum.show();
    }
}