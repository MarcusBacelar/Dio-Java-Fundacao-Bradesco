package Java.Marcus.PriemeiraSemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7; // Valor final da nota aluno 

        if(mediaFinal<6)    //Média menor que 6 = reprovado
            System.out.println("REPROVADO"); 

        else if (mediaFinal == 6)   //Valor = 6 = prova de recuperação
            System.out.println("PROVA DE RECUPERAÇÃO");

        else    //Se não atender os requisitos anteriores reslutado = aprovado
            System.out.println("APROVADO");
    }

}
