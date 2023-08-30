package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    
    public static void main(String[] args){
        seleçaoCandidatos();




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
