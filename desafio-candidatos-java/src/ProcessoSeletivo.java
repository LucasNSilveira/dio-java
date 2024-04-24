import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        for(String candidato: candidatosSelecionados){
            entrandoEmContato(candidato);
        }
        
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= Atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }
    
    static boolean Atender(){
        return new Random().nextInt(3) ==1;

    }
    static void imprimirCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int tamanho = candidatos.length;
        for (int indice=0;indice < tamanho;indice++){
            System.out.println("O candidato numero: "+(indice+1)+" é o " + candidatos[indice]);
        }
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salariobase = 2000;
        if(salariobase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else if (salariobase == salarioPretendido){
            System.out.println("Ligar para o candidato e apresentar uma contra proposta");
        }
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }   
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
         
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            candidatoAtual+=1;
            
            System.out.println("O candidato " + candidato + " solicitou este salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato: " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;

            }
            candidatoAtual++;
        }

    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
}
