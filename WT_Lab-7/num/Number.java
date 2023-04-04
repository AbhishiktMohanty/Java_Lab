class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return (value % 2 == 0);
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i < value; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }
        return (sum == value);
    }

    public int findFactorial() {
        if (value == 0) {
            return 1;
        }
        else {
            return value * new Number(value - 1).findFactorial();
        }
    }
}
