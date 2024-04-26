public abstract class Conta implements iConta {
// Abstrato   
// Garante que ninguém consiga alterar os dados da classe e que ela seja instanciada
// Garante que apenas as classses  filhas sejam implementadas
    protected int agencia;
    protected int numero;
    protected double saldo; //encapsulamento mais adequado
    protected Clientes cliente;
// variável que é estática, mas vai ser incrementada depois da Conta ser criada    
    private static final int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL=1;

    public Conta(Clientes cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
       
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    
    @Override
    public void transferir(double valor, Conta contadDestino) {
        this.sacar(valor);
        contadDestino.depositar(valor);
        
    }

    public void sacar(){

    }
    public void depositar(){

    }
    public void transferir(){

    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta Corrente: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    
}
