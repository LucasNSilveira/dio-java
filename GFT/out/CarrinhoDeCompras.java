package out;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Carrinho> carrinhoList;

    public CarrinhoDeCompras(){
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){ 
        carrinhoList.add(new Carrinho(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Carrinho> itensRemovidos = new ArrayList<>();
        for (Carrinho t: itensRemovidos){
            if (t.getNome().equalsIgnoreCase(nome)){
                itensRemovidos.add(t);
            }
            carrinhoList.removeAll(carrinhoList);
        }
    }
    public double calcularValorTotal(){
        double ValorTotal = 0d;
        for(Carrinho item:carrinhoList){
            double ValorItem = item.getPreco()*item.getQuantidade();
            ValorTotal+= ValorItem;
        }
        return ValorTotal;
    }
    public void exibirItens(){
        System.out.println(carrinhoList); 
    }
    
  public static void main(String[] args) {
    // Criando uma instância do carrinho de compras
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
  }
}