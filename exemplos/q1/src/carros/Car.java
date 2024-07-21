package carros;
import exceptions.PotExcept;
import exceptions.velMaxExcept;

public abstract class Car{
    
    // Inicialmente setamos uma velocidade máxima do motor : colocamos em um variável final
    // Variável final de forca :: a força vai ser variável a depender do tipo de carro
    // inicalmente a velocidade vai ser usada usando a potencia e forca setada 

    // P=F×V 
    private String id;
    private double velocidade_max;
    private double velocidade_atual;
    private double potencia;

    public Car(String id, double velocidade_max, double potencia) throws PotExcept, velMaxExcept {
        this.id = id;
        this.velocidade_max = velocidade_max;
        this.potencia = potencia;
        checkValores();
    }

    private void checkValores() throws PotExcept, velMaxExcept{
        
        if(velocidade_max < 0){
            throw new velMaxExcept("Velocidade não pode ser negativa");
        }
        else if(potencia < 0){
            throw new PotExcept();
        }
    }

    public void getInformation(){
        // nome do carro, velocidade e potencia
        System.out.printf("--------CARRO----------- \n Id: %s \n Velocidade: %s\n Potencia: %s", this.id, this.velocidade_max, this.potencia);
    }

    // carros diferentes terão tratamentos diferentes de suas potencias e velocidases

    public void setPotencia(double val, double force){
        // Aumenta a potência em 10% para simular a aerodinâmica especial de um conversível
       // usar mesmo calcul = f * v * val
       this.potencia = val;
       this.velocidade_max= val / force; // essa é a nova velocidade máxima suportada pelo motor
       
    }

    public void setVelocidade(double val) throws velMaxExcept{ 
       // A velocidade não pode passar o valor da velocidade máxima estabelecida

       if(val <= this.velocidade_max) this.velocidade_atual = val;
       else throw new velMaxExcept("Velocidade máxima ultrapassada");
    }

    public void setVelocidadeMax(double val) throws velMaxExcept{
        if(val > 0) this.velocidade_max = val;
        else throw new velMaxExcept("Velocidade não pode ser negativa");
        
    }
    public abstract void potencia(double val);
    public abstract void velocidade(double val) throws velMaxExcept;

}