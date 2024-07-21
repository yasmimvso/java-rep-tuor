package q2;

public class Retangulo implements FigurasGeo {
    private double side1, side2;

    public Retangulo(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * side1) + (2 * side2);
    }

    @Override
    public void getInfo() {
        System.out.printf("Rantangulo: sides = %.2f %.2f\n", side1, side2);
        System.out.printf("Area = %.2f\n", calculateArea());
        System.out.printf("Perimetro = %.2f\n", calculatePerimeter());
    }
}

