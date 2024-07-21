package q3;

public class Ingrediente {
    private String nome;
    private String categoria;
    private int quantidade;

    // aqui é para termos acesso ao preço
    public Ingrediente(String nome, String categoria, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public int getIngredienteValue(){
        switch (categoria) {
            case "proteina":
                if (nome.equals("Bife")) return 8;
                if (nome.equals("Frango")) return 5;
                else return 6;

            case "vitamina":
                if (nome.equals("Tomate")) return 4;
                if (nome.equals("Alface")) return 3;
                else return 4;

            case "carboidrato":
                if (nome.equals("Arroz")) return 3;
                if (nome.equals("Macarrão")) return 4;
                else return 4;

            default:
                if (nome.equals("Azeite")) return 2;
                if (nome.equals("Pimenta")) return 3;
                else return 3;
        }
    }

    public String getCategoria(){
        return this.categoria;
    }


}
