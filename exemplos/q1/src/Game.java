package src;
import java.util.Map;
import java.util.HashMap;
import carros.Car;
import exceptions.removeExcept;


// adicionar e remover carros do jogo de acordo com seu ID
public class Game{
     
    private HashMap<String, Car> gameMap = new HashMap<String, Car>(); 
    //  pode adicionar ou remover carros de acordo com id (podemos usar um HashMap)
    public void setCar(String id, Car car){
        gameMap.put(id, car);
    }

    private boolean existeCar(String id){
        return this.gameMap.containsKey(id);
    }

    public void removeCar(String id) throws removeExcept {
       if(this.existeCar(id)){
          this.gameMap.remove(id);
       }else{
        throw new removeExcept();
       }
    }

    public void showCarros(){
        for (Map.Entry<String, Car> entry : this.gameMap.entrySet()) {
            // entry.getKey() retorna a chave (ID do carro)
            // entry.getValue() retorna o valor (objeto Car)
            System.out.println("ID: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}