import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
         System.out.println("Por favor, digite o número da conta: ");
         int num = input.nextInt();

         System.out.println("Por favor, digite o número do Agência: ");
         String agencia = input.next();

         System.out.println("Por favor, digite o nome do Cliente: ");
         String nomeCliente = input.nextLine();

         System.out.println("Por favor, digite o saldo inicial: 0");
         double saldo = input.nextDouble();

         String menssagem = String.format("Olá %s, obrigado por criar um conta em nosso banco sua agência é %s, conta %d e seu saldo  %.2f já está disponível para saque.", nomeCliente, agencia, num, saldo);

         System.out.println(menssagem);

         input.close();
    }
}
