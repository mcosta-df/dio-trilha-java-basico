import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

       int numeroConta;
       String agencia;
       String nomeCliente;
       Float saldo;

       System.out.print("Digite no numero da agência(XXX-X): ");
       agencia = input.next();

       System.out.print("Digite o numero da conta: ");
       numeroConta = input.nextInt();

       System.out.print("Diginte o nome do cliente: ");
       nomeCliente = input.next();

       System.out.print("Digite o saldo: ");
       saldo = input.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %5.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
    }
}
