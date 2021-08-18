package Task9;

public class Rectangle extends Quadrangle implements Figure {

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
        double getLargeDiagonal() {
            return Math.sqrt((a*a)+(b*b));
        }

        @Override
        double getHeight() {
            return Math.min(a, b);
        }

        @Override
        String getColor() {
            return color;
        }

        @Override
        public double area() {
            return a * b;
        }

        @Override
        public double perimeter() {
            return (a * 2) + (b * 2);
        }

}
