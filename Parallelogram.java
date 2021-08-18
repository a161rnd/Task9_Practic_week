package Task9;

public class Parallelogram extends Quadrangle implements Figure {

    double alpha;
    double beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    double getLargeDiagonal() {
        double alphaR = Math.toRadians(alpha);
        double betaR = Math.toRadians(beta);
        double d1 = Math.sqrt(a * a + b * b + 2 * a * b * Math.cos(alphaR / 2));
        double d2 = Math.sqrt(a * a + b * b + 2 * a * b * Math.cos(betaR / 2));
        return Math.max(d1, d2);
    }

    @Override
    double getHeight() {
        double alphaR = Math.toRadians(alpha);
        double betaR = Math.toRadians(beta);
        return Math.min(a * Math.sin(alphaR), b * Math.sin(betaR));
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        double alphaR = Math.toRadians(alpha);
        return a * b * Math.sin(alphaR);
    }

    @Override
    public double perimeter() {
        return a * 2 + b * 2;
    }
}
