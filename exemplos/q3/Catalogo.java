package q3;

import java.util.HashMap;
import java.util.Map;

public class Catalogo {
    private static Map<MarmitaDeTerceiros, Integer> marmitasDeTerceiros = new HashMap<>();
    private static Map<MarmitaDoDia, Integer> marmitasDoDia = new HashMap<>();

    public Catalogo() {}

    public void adicionarMarmitaDeTerceiros(MarmitaDeTerceiros marmita, int quantidade) {
        if (marmitasDeTerceiros.containsKey(marmita)) {
            marmitasDeTerceiros.put(marmita, marmitasDeTerceiros.get(marmita) + quantidade);
        } else {
            marmitasDeTerceiros.put(marmita, quantidade);
        }
    }

    public void adicionarMarmitaDoDia(MarmitaDoDia marmita, int quantidade) {
        if (marmitasDoDia.containsKey(marmita)) {
            marmitasDoDia.put(marmita, marmitasDoDia.get(marmita) + quantidade);
        } else {
            marmitasDoDia.put(marmita, quantidade);
        }
    }

    public void removerMarmitaDeTerceiros(MarmitaDeTerceiros marmita, int quantidade) {
        if (marmitasDeTerceiros.containsKey(marmita)) {
            int novaQuantidade = marmitasDeTerceiros.get(marmita) - quantidade;
            if (novaQuantidade <= 0) {
                marmitasDeTerceiros.remove(marmita);
            } else {
                marmitasDeTerceiros.put(marmita, novaQuantidade);
            }
        }
    }

    public void removerMarmitaDoDia(MarmitaDoDia marmita, int quantidade) {
        if (marmitasDoDia.containsKey(marmita)) {
            int novaQuantidade = marmitasDoDia.get(marmita) - quantidade;
            if (novaQuantidade <= 0) {
                marmitasDoDia.remove(marmita);
            } else {
                marmitasDoDia.put(marmita, novaQuantidade);
            }
        }
    }

    public Map<MarmitaDeTerceiros, Integer> getMarmitasDeTerceiros() {
        return marmitasDeTerceiros;
    }

    public Map<MarmitaDoDia, Integer> getMarmitasDoDia() {
        return marmitasDoDia;
    }
}
