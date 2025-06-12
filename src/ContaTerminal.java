import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        var NumeroConta = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Digite o número da agência: ");
        String numeroAgencia = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo da conta: ");
        double saldoConta = sc.nextDouble();


        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua conta é: " + NumeroConta + " e agência: " + numeroAgencia);
        System.out.println("Seu saldo é: R$" + saldoConta + ", já está disponível para saque.");




    }
}