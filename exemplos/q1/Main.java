
import src.Game;
import src.carros.conversivel.Conversivel;
import src.carros.hibrid.Hibrido;
import scr.carros.Car;


public class Main {
    
    public static void main(String[] args){
        Game game = new Game();
        
        Conversivel car2 = new Conversivel("conv1", 130, 140);
        Hibrido car3 = new Hibrido("hib1", 230, 190);

        car2.getInformation();
        car3.getInformation();

        car2.setVelocidadeMax(150);
        car3.setAquatico();

        
        game.setCar("conv1", car2);
        game.setCar("hib1", car2);

        // não entendi bem se um carro simples, interpretei como um conversível 

        game.removeCar("conv1");
    }
}
