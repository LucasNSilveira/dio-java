package navegador;



public class Safari implements exibirPagina, adicionarNovaAba, atualizarPagina{
    public void exibir(){
        System.out.println("PÁGINA SENDO EXIBIDA");
    }
    public void aba(){
        System.out.println("ADICIONANDO NOVA ABA");

    }
    public void atualizar(){
        System.out.println("PÁGINA ATUALIZADA");
    }
    
}