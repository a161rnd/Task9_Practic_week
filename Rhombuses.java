

public class Rhombuses extends Quadrangle implements Figure {

    double alpha;
    double beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    double getLargeDiagonal() {
        double alphaR = Math.toRadians(alpha);
        double betaR = Math.toRadians(beta);
       double d1 = 2 * alphaR * Math.cos(alphaR / 2);
       double d2 = 2 * betaR * Math.cos(betaR / 2);
        return Math.max(d1, d2);
    }

    @Override
    double getHeight() {
        double alphaR = Math.toRadians(alpha);
        return a * Math.sin(alphaR);
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        double alphaR = Math.toRadians(alpha);
        return a * a * Math.sin(alphaR);
    }

    @Override
    public double perimeter() {
        return a * 4;
    }
}
