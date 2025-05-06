public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;
        System.out.println(salarioMinimo);
        byte idade = 123;
        System.out.println(idade);
        short ano = 2021;
        System.out.println(ano);
        int cep = 70658196;
        System.out.println(cep);
        long cpf = 546465563L;
        System.out.println(cpf);
        float pi = 3.14F;
        System.out.println(pi);
        double salario = 2100.33; 
        System.out.println(salario);


       //  short numeroCurto = 1;
       //  int numeroNormal = numeroCurto;
       //  short numeroCurto2 = numeroNormal; // linguagem estramanete tipada, por isso o erro.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal; // correção do erro.
        System.out.println(numeroCurto2);

       final int NUMERO = 1; // Fala q a variavel e absoluta, náo pode mudar o valor. OBS: Escrever em caixa alta.

        System.out.println(NUMERO);

    }
}
