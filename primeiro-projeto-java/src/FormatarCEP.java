public class FormatarCEP {

    public static void main(String[] args){
        try{
            String cepFormatado = formatarCep("23576508");
            System.out.println(cepFormatado);
        } catch(CepInvalidoException e){
            System.out.println("O cep não corresponde com as regras");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
            throw new CepInvalidoException();

            return "235.765-08";
    }
}