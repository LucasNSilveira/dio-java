public interface iConta {
    void sacar(double valor);

    void depositar(double valor);
    
    void transferir (double valor, Conta contaDestino);    //Polimorfismo - ser referenciado de várias formas
    
    void imprimirExtrato();
}
