import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("=================Menu=================");
        System.out.println("Digite o seu nome: ");     
        String nome = scanner.next();
        
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a sua agência: ");
        String agencia = scanner.next();
      
        System.out.println("Digite o seu saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá %s %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nome, sobrenome, agencia, numero, saldo);

		scanner.close();
    }
}
