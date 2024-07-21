package q2;
import q2.Circulo;
import q2.Quadrado;
import q2.Retangulo;
import q2.Trapezio;


public class Main {

    public static void main(String[] args){
        System.out.println("----------- Figuras Geometricas ---------");
        Circulo circulo = new Circulo(3.3);
        Retangulo retangulo = new Retangulo(12.3, 45);
        Quadrado quadrado = new Quadrado(8);
        Trapezio trapezio = new Trapezio(3, 12, 1.78, 0, 23);

        circulo.getInfo();
        retangulo.getInfo();
        quadrado.getInfo();
        trapezio.getInfo();
    }
    
}
