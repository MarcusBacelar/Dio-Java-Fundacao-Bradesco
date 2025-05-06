public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + " Java";
        System.out.println(nomeCompleto);


        String concatenacao = "?";
        concatenacao = "1" + ( 1 + 1 + 1);
        System.out.println(concatenacao); 


        // X repetição
        int numero = 2;
        numero = numero + 2;
        System.out.println(numero);


        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);


        int a, b;
    a = 10;
    b = 10;
// O operador ternário verifica se a é igual a b.
// Se a for igual a b, o resultado será "Verdadeiro".
// Caso contrário, o resultado será "Falso".
// O resultado deve ser atribuído a uma variável do tipo String.
    String resultado = a == b ? "Verdadeiro" : "Falso";
    System.out.println(resultado);

    boolean condicao1 = true;
    
    boolean condicao2 = false;

    if(condicao1 && condicao2 ){ // "E"
        System.out.println("As duas condições são verdadeiras");
    }
    if(condicao1 || condicao2 ){ // "OU"
        System.out.println("Uma das duas condições é verdadeiras");
    }
    System.out.println("Fim");

    }
}
