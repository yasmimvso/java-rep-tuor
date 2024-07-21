package exceptions;

public class PotExcept extends Exception{
    public PotExcept(){
        super("Potencia não pode ser negativa");
    }
}
