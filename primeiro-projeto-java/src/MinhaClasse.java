public class MinhaClasse {
    public static void main(String[] args){
        int numero = 5;
        System.out.println(- numero); //valor não é atualizado
        numero = - numero;
        System.out.println(numero);
        System.out.println(++numero); //valor é atualizado depois do incremento
        System.out.println(numero);


        boolean var = true;
        System.out.println(!var); //valor da variavel não é atualizada 
        System.out.println(var);

        int a, b;
        a = 5;
        b=10;
        //String resultado = a ==b ? "verdadeiro" : "falso";
        int resultados = a == b ? 1 : 0;
        System.out.println( resultados);

        boolean simNao = a !=b; //tem que declarar a variavel boolean 
        System.out.println(simNao);
        String nome = "Lucas";
        String nome2 = new String()"Lucas");
        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));
        //Expressões condicionais
        // && - e; ||-ou 
        //Operados de comparação ==; !=; >; >= ; < ;<=;
    }
}