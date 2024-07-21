package carros.hibrid;
import carros.Car;
import exceptions.PotExcept;
import exceptions.velMaxExcept;

public class Hibrido extends Car {
    // a potencia é diferente a depender do tipo (hibrio ou terrestre)
    // o mesmo pode estar ora atuando como carro terrestre,ora atuando como carro
    // aquático, atualizando sua característica de estado atual
    private boolean terrestre;
    private final double force = 0.8;

    public Hibrido(String id, double velocidade_max, double potencia) throws PotExcept, velMaxExcept{
        super(id, velocidade_max, potencia);
    }

    // o calculo da velocidade e potencia vai ser alterado conforme tipo
    @Override
    public void potencia(double val) {
        if (this.terrestre) {
            super.setPotencia((val * 1.15), force); // ajuste para terrestre
        } else {
            super.setPotencia((val * 0.85), force); // ajuste para aquático
        }
    }

    @Override
    public void velocidade(double val) throws velMaxExcept {
        if (this.terrestre) {
            super.setVelocidade(val * 1.15);
            
        } else {
            super.setVelocidade((val * 0.85));
        }
    }

    public void getInformation() {
        // nome do carro, velocidade e potencia
        super.getInformation();
        System.out.printf("\n Tipo: %s", (this.terrestre ? "Terrestre" : "Aquatico"));
    }

    public void setTerrestre() {
        this.terrestre = true;
    }

    public void setAquatico() {
        this.terrestre = false;
    }
}
