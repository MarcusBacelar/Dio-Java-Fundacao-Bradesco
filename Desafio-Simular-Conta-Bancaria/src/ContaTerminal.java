import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu Saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: " +  numero + " e seu saldo de R$" + String.format("%.2f", saldo) + " já está disponível para saque.");

        scanner.close();
    }
}