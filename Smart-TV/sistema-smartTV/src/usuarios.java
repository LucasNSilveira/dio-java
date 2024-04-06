public class usuarios {
    public static void main(String[] args) throws Exception {
        Smart_TV smartTV = new Smart_TV();
        System.out.println("A televisão está ligada? " + smartTV.ligada);
       

        smartTV.ligar();
        System.out.println("Novo status --> TV ligada? " + smartTV.ligada);
        System.out.println("Volume Atual --> " + smartTV.volume);
        System.out.println("Canal Atual --> " + smartTV.canal);


        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.dimunuirVolume();
        System.out.println("Volume da televisão --> " + smartTV.volume);
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        System.out.println("Canal Atual --> " + smartTV.canal);
         
        smartTV.diminuirCanal();
        System.out.println("Canal Atual --> " + smartTV.canal);
        smartTV.mudarCanal(15);
        System.out.println("Canal Atual --> " + smartTV.canal);



        smartTV.desligar();
        System.out.println("Novo status --> TV desligada? " + smartTV.ligada);
        }
}
