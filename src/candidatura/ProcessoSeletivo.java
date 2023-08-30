package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    
    public static void main(String[] args){
        String candidatos[] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candidato: candidatos){

            entrandoEmContato(candidato);

        }

    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1 ;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;

            else
            System.out.println("Contato realizado com Sucesso");

        }while (continuarTentando && tentativasRealizadas < 3);
    
        if(atendeu)
        System.out.println("Conseguimos contato com " + candidato  + " na " + tentativasRealizadas + " tentativa");

        else
        System.out.println("Nao conseguimos contato com " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + "ª realizada");

    }

        //método auxiliar
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados(){
        String candidatos[] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice<candidatos.length; indice++){
            System.out.println("o candidato de numero " + (indice+1) + " é "+ candidatos[indice]);
        }

        for(String candidato: candidatos){
            System.out.println("o candidato selecionado foi " + candidato);
        }

    }

    static void seleçaoCandidatos(){

        String candidatos[ ] =  { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "jORGE"};
        
        int candidatosSelecionados = 0;

        int candidatoAtual = 0;
        
        while(candidatosSelecionados<5 && candidatoAtual < candidatos.length){

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("o candidato" + candidato + " solicitou este valor de salário" + salarioPretendido);
            double salarioBase = 2000.00;
            if(salarioPretendido<salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            }
            
            candidatoAtual++;

        }
    



    }
            static double valorPretendido(){
             return ThreadLocalRandom.current().nextDouble(1800, 2200);
             
        }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }

        else   if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }

        else{

            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        
        }
        
    }
}
