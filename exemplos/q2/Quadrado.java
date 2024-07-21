package q2;

public class Quadrado implements FigurasGeo {
    private double side;

    public Quadrado(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public void getInfo() {
        System.out.printf("Quadrado: side = %.2f\n", side);
        System.out.printf("Area = %.2f\n", calculateArea());
        System.out.printf("Perimetro = %.2f\n", calculatePerimeter());
    }
}

