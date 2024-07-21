package q3;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public abstract class Marmita {

    private List<Map<Ingrediente, Integer>> list = new ArrayList<>();
    private double custo;

    public abstract void adicionarIgredientes(Map<Ingrediente, Integer> ingredientes) throws Exception;

    protected void setMarmita(Map<Ingrediente, Integer> ingredientes) {
        this.list.add(ingredientes);
        this.custo = calculateCusto();
    }

    protected void setMarmita(Map<Ingrediente, Integer> ingredientes, double desconto) {
        this.list.add(ingredientes);
        this.custo = calculateCusto(desconto);
    }

    private double calculateCusto() {
        double total = 0;
        for (Map<Ingrediente, Integer> ingredientes : this.list) {
            for (Map.Entry<Ingrediente, Integer> entry : ingredientes.entrySet()) {
                Ingrediente ingrediente = entry.getKey();
                int quantidade = entry.getValue();
                total += ingrediente.getIngredienteValue() * quantidade;
            }
        }
        return total;
    }

    private double calculateCusto(double desconto) {
        return calculateCusto() * desconto;
    }

    public List<Map<Ingrediente, Integer>> getListMarmita() {
        return this.list;
    }

    public double getCusto() {
        return this.custo;
    }
}
