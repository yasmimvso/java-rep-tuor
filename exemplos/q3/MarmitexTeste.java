package q3;

import java.util.HashMap;
import java.util.Map;

public class MarmitexTeste {
    public static void main(String[] args) throws Exception {
        System.out.println("================= Marmitex ====================");
        System.out.println("--------- Faça Já o Seu Pedido ------------");
        System.out.println("Lista de Ingredientes");
        System.out.println("| Ingrediente   | Custo |  Tipo |");
          // só coloquei uma simulação do cardápio
        System.out.println("|Bife 8 Proteina | \n Frango 5 Proteina\n Peixe 6 Proteina\n Arroz 3 Carboidrato\n Macarrao 4 Carboidrato\n Feijao 4 Carboidrato\n Tomate 4 Vitamina");
      
        Marmitex marmitex = new Marmitex();

        Ingrediente ingrediente1 = new Ingrediente("Bife", "Proteina", 8);
        Ingrediente ingrediente2 = new Ingrediente("Frango", "Proteina", 5);
        Ingrediente ingrediente3 = new Ingrediente("Arroz", "Carboidrato", 3);
        Ingrediente ingrediente4 = new Ingrediente("Mostarda", "Molho", 2);

        MarmitaCliente minhaMarmita1 = new MarmitaCliente();
        Map<Ingrediente, Integer> ingredientesMarmita1 = new HashMap<>();
        ingredientesMarmita1.put(ingrediente1, 3);
        ingredientesMarmita1.put(ingrediente2, 1);

        minhaMarmita1.setMarmita(ingredientesMarmita1);

        MarmitaDoDia minhaMarmita2 = new MarmitaDoDia();
        Map<Ingrediente, Integer> ingredientesMarmita2 = new HashMap<>();
        ingredientesMarmita2.put(ingrediente2, 4);
        ingredientesMarmita2.put(ingrediente3, 2);
        minhaMarmita2.setMarmita(ingredientesMarmita2);

        MarmitaDeTerceiros minhaMarmita3 = new MarmitaDeTerceiros();
        Map<Ingrediente, Integer> ingredientesMarmita3 = new HashMap<>();
        ingredientesMarmita3.put(ingrediente2, 2);

        minhaMarmita3.setMarmita(ingredientesMarmita3);

        marmitex.inserirMarmitaDoCliente("cliente1", minhaMarmita1);
        
        System.out.println("Custo da primeira marmita do cliente1: " + minhaMarmita1.getCusto());
        // marmitex.inserirMarmitaDoCliente("cliente1", minhaMarmita2);
        // marmitex.inserirMarmitaDoCliente("cliente1", minhaMarmita3);

        marmitex.consultaDeTerceiros();
        marmitex.consultaDoDia();
        
        marmitex.simularPedido("cliente1");
    }
}
