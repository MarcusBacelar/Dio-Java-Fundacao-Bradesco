package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
       String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
       for(String candidato: candidatos){
            entrandoEmContato(candidato);
       }
       
    }
       static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            //elas preciasarão mudar o valor se não ficarão em loop
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                    tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }while (continuarTentando && tentativasRealizadas < 3); {
                if(atendeu)
                    System.out.println("Conseguimos contato com "+ candidato + " Na "+ tentativasRealizadas + "Tentativas");
                else    
                    System.out.println("Não conseguimos contato com "+ candidato + " Número maximo de tentativas  "+ tentativasRealizadas + " realizadas");
                    }
                
       
    }
    // Método auxiliar atender
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        System.out.println("Imprimir a lista de candidatoso informando o indice do elemento");
        
        for(int indice=0; indice<candidatos.length;indice++){
            System.out.println("O candidato de numero " + (indice+1) + " é " + candidatos[indice]);
        }


        System.out.println("Forma abreviada de interação for each"); // Não mostra o indice.

        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }


    static void selecaoCandidatos(){

        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Gustavo", "Monica", "Augusto", "Fabricio", "Mirela", "Daniela","Jorge"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " Solicitou este valor de sálario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
       

    }

