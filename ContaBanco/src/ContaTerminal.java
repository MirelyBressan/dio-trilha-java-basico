import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        //Solicitar e armazenar as informações:

        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo:");
        Double saldo = scanner.nextDouble();

        //Mensagem exibindo confirmação dos dados

        String mensagem = ("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! O número da sua agência é: "
        + agencia + ", conta: " + numeroConta + " , e seu saldo: " + saldo + ", que já está pronto para o saque!");
        System.out.println(mensagem);

        scanner.close();

    }
}
