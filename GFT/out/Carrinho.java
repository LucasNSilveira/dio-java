package out;

public class Carrinho {
    private String nome;
    private int quantidade;
    private double preco;

    public Carrinho(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
    
    public String toString(){
        return "Item:{" +
        "nome: " + nome+
        ", quantidade: " + quantidade
        + ", preço: " + preco+ '}';
    }
}
