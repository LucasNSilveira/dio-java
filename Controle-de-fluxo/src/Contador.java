import java.util.Scanner;
import exception.ParametrosInvalidosException;

public class Contador{
    public static void main(String args []) {
        Scanner terminal = new Scanner(System.in);
        int numero1 = terminal.nextInt();
        int numero2 = terminal.nextInt();
        try{
            contador(numero1, numero2);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("Erro: "+ e.getMessage());
        } finally{
            terminal.close();
        }

        }
    public static void contador(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1>numero2)
            throw new ParametrosInvalidosException();
        else{
            int diferenca = numero2 - numero1;
            for(int indice=1;indice<=diferenca;indice++)
                System.out.print("\nImprimindo o número:" + indice);
            }
    }
    }

