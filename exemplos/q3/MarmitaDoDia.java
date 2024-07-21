package q3;
import java.util.Map;
import java.util.HashMap;


public class MarmitaDoDia extends Marmita {
    public MarmitaDoDia() {
        super();
    }

    private boolean validarCategoria(Map<Ingrediente, Integer> ingredientes) {
        int categoria_count = 0;

        Map<String, Integer> categoriaCount = new HashMap<>();
        categoriaCount.put("proteína", 0);
        categoriaCount.put("carboidrato", 0);
        categoriaCount.put("vitamina", 0);
        categoriaCount.put("molho", 0);

        for (Map.Entry<Ingrediente, Integer> entry : ingredientes.entrySet()) {
            Ingrediente ingrediente = entry.getKey();
            String categoria = ingrediente.getCategoria();
           
            if (categoriaCount.containsKey(categoria)) {
                categoriaCount.put(categoria, categoriaCount.get(categoria) + 1);
            } 
        }

        // tem pelo menos 1 categoria
        for (Map.Entry<String, Integer> value : categoriaCount.entrySet()) {

            if (value.getValue() == 0) {
                return false;
            }else categoria_count++;
            
        }

        // tem no máximo 3 unidades
        if(categoria_count > 0){

            for (Map.Entry<Ingrediente, Integer> value : ingredientes.entrySet()) {
                if (value.getValue() > 3) {
                    return false;
                }
            }
        } else return false;
      

        return true;
    }

    @Override
    public void adicionarIgredientes(Map<Ingrediente, Integer> ingredientes) throws Exception{
        boolean valid = true;

        if (validarCategoria(ingredientes)) {
            for (Map.Entry<Ingrediente, Integer> value : ingredientes.entrySet()) {
                int quantidade = value.getValue();
                if (quantidade > 99) {
                    valid = false;
                }
            }

            if (valid) {
                super.setMarmita(ingredientes, 0.87);
            } else {
                throw new Exception("Lista de ingredientes Inválida");
            }
        } else {
            throw new Exception("Lista de ingredientes Inválida");
        }
    }
}

