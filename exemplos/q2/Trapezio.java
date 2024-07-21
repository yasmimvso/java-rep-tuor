package q2;


public class Trapezio implements FigurasGeo {
    private double base1, base2, lado1, lado2, altura;
   

    public Trapezio(double base1, double base2, double lado1, double lado2, double altura) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calculateArea() {
        return (this.base1 + this.base2) * this.altura * 0.5;
    }

    @Override
    public double calculatePerimeter() {
        return this.base1 + this.base2 + this.lado1 + this.lado2;
    }

    @Override
    public void getInfo() {
        System.out.printf("Trapezio: base1 = %.2f, base2 = %.2f, altura = %.2f, sides = %.2f, %.2f\n", base1, base2, altura, lado1, lado2);
        System.out.printf("Area = %.2f\n", calculateArea());
        System.out.printf("Perimetro = %.2f\n", calculatePerimeter());
    }
}
