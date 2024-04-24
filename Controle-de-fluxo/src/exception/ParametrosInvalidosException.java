package exception;
public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(){
        super("O segundo parametro deve ser menor que o primeiro");
    }
}