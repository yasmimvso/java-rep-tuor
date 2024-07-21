
package q3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Não entendi muito bem a diferença quando utilizado a inserção no catálogo e como cliente. 
// Adaptei as funções

public class Marmitex {
    private Catalogo catalogo;
    private Map<String,List<Marmita>> clienteList;

    public Marmitex() {
        this.catalogo = new Catalogo();
        this.clienteList = new HashMap<>(); 
    }

    public void inserirMarmitaDeTerceiros(String loja, MarmitaDeTerceiros marmita, int quantidade) {
        if (marmita != null) {
            catalogo.adicionarMarmitaDeTerceiros(marmita, quantidade);
        }
    }

    public void inserirMarmitaDoDia(String loja, MarmitaDoDia marmita, int quantidade) {
        if (marmita != null) {
            catalogo.adicionarMarmitaDoDia(marmita, quantidade);
        }
    }

    // optei aqui em inserir marmitas de todos os tipos, não apenas de clientes. 
    public void inserirMarmitaDoCliente(String clienteID, Marmita marmita) {
        if (marmita != null) {
            // verifcar cliente existe e pegar marmitas
            List<Marmita> marmitas = clienteList.get(clienteID);
            
            if (marmitas == null) {
                marmitas = new ArrayList<>();
                clienteList.put(clienteID, marmitas);
            }
            
            marmitas.add(marmita);
        }
    }

    public Map<MarmitaDoDia, Integer> consultaDoDia() {
        return catalogo.getMarmitasDoDia();
    }

    public Map<MarmitaDeTerceiros, Integer> consultaDeTerceiros() {
        return catalogo.getMarmitasDeTerceiros();
    }

    public void simularPedido(String clienteID) {
        // Considerei ainda em utilizar a lista de clientes para guardar tanto marmitas do dia, terceiros e do cliente
        List <Marmita> list = this.clienteList.get(clienteID);
        System.out.println("---- Compra do cliente -----");
        for (Marmita marmita : list) {
            System.out.println(list);
            if (marmita instanceof MarmitaDeTerceiros) {
                catalogo.removerMarmitaDeTerceiros((MarmitaDeTerceiros) marmita, 1); 
            } else if (marmita instanceof MarmitaDoDia) {
                catalogo.removerMarmitaDoDia((MarmitaDoDia) marmita, 1); 
            }
        }
    }
}
