package q2;

public class Circulo implements FigurasGeo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.raio * this.raio;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public void getInfo() {
        System.out.printf("Circulo: radio = %.2f\n", raio);
        System.out.printf("Area = %.2f\n", calculateArea());
        System.out.printf("Perimetro = %.2f\n", calculatePerimeter());
    }
}
