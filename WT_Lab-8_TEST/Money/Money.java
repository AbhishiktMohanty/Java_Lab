class Money {
    private int rupee;
    private int paisa;

    public void setMoney(int rupee, int paisa) {
        this.rupee = rupee;
        this.paisa = paisa;
    }

    public Money add(Money other) {
        Money result = new Money();
        result.paisa = this.paisa + other.paisa;
        result.rupee = this.rupee + other.rupee + (result.paisa / 100);
        result.paisa = result.paisa % 100;
        return result;
    }

    public void show() {
        System.out.println("Rs " + this.rupee + "." + this.paisa + " paisa");
    }
}
