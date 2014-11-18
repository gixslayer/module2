package ss.week4;

public class Exponent implements Function {
    private final double n;

    public Exponent(int argN) {
        this.n = argN;
    }

    public Exponent(double argN) {
        this.n = argN;
    }

    @Override
    public double apply(double x) {
        return Math.pow(x, n);
    }

    @Override
    public Function derivative() {
        return new LinearProduct(new Constant(n), new Exponent(n - 1));
    }

    @Override
    public String toString() {
        return String.format("x^%f", n);
    }
}
