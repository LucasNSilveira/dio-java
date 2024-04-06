public class MinhaClasse {
    public static void main(String[] args){
        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);
        System.out.println(++numero); //valor é atualizado depois do incremento
        System.out.println(numero);


        boolean var = true;

        System.out.println(!var); //valor da variavel não é atualizada 
        System.out.println(var);
    }
}