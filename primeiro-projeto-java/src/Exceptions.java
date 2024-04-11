import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class Exceptions {
  
    public static void main(String[] args){
        try{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite a sua altura");
        int altura = scanner.nextInt();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   
        
        } catch (InputMismatchException e){
            System.out.println("Os campos de idade e altura precisam ser numéricos");
        }
    
    }
}
