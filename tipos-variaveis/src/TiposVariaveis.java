public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;
        byte idade = 123;
        short ano = 2021;
        int cep = 70658196;
        long cpf = 546465563L;
        float pi = 3.14F;
        double salario = 2100.33; 



       //  short numeroCurto = 1;
       //  int numeroNormal = numeroCurto;
       //  short numeroCurto2 = numeroNormal; // linguagem estramanete tipada, por isso o erro.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal; // correção do erro.


       final int NUMERO = 1; // Fala q a variavel e absoluta, náo pode mudar o valor. OBS: Escrever em caixa alta.

        System.out.println(NUMERO);

    }
}
