public class Main {
    public static void main (String[] args){
        Clientes lucas = new Clientes();
        lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(lucas);
        cc.depositar(100);

        
        Conta poupanca = new ContaPoupanca(lucas);
        cc.transferir(10, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }    
}
