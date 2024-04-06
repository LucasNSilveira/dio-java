public class Smart_TV {
// TV pode ligar e desligar
// TV aumenta e diminui o volume sempre +1 ou -1
// TV pode mudar de canal de 1 em 1 ou definindo o numero correspondente 
// Ligada = Boolean; Volume = int; canal = int
   
    boolean ligada = false;
    int canal = 1;
    int volume = 10;
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada= false;
    }
    public void aumentarVolume(){
        volume ++;
    }
    
    public void dimunuirVolume(){
        volume --;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
    }
}

