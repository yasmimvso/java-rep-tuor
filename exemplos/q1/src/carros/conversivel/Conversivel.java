package carros.conversivel;
import carros.Car;
import exceptions.PotExcept;
import exceptions.velMaxExcept;

public class Conversivel extends Car{

    private final double force = 0.7; // cada carro setei com uma força constante, pra diferencialos

    public Conversivel(String id, double cap_max, double pot) throws PotExcept, velMaxExcept{
        super(id, cap_max, pot);
        
    }

    @Override
    public void potencia(double val){
        // Aumenta a potência em 10% para simular a aerodinâmica especial de um conversível
        // valor se refere a potencia desejada. Porém, pra dar uma variação entre os carros irei aplicar uma variação
        // passa para setPotencia (forca, valor)

       super.setPotencia((val * 1.10), this.force);
    }

    @Override
    public void velocidade(double val) throws velMaxExcept{ 
        // checar se valor não eh negativo
    
        super.setVelocidade((val * 1.10));
    } 

}
