
import telefone.Telefone;
import musica.Musica;
import navegador.Safari;


public class Celular {
    public static void main(String[] args) {
       
        Telefone telefone = new Telefone();
        Musica musica = new Musica();
        Safari safari = new Safari();
        
        

        telefone.ligar();
        telefone.atender();
        safari.exibir();
        safari.aba();
        safari.atualizar();
        musica.tocar();
        musica.pausar();
        
    }
}
