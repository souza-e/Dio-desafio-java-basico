
import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int Numero;
        String Agencia;
        String nomeCliente;
        float Saldo;

        System.out.println("Por favor, digite os 4 numeros da conta: ");
        Numero = scanner.nextInt();
        scanner.nextLine(); // Consome o "enter" do nextInt()

        System.out.println("Por favor, digite os 4 numeros da agencia: ");
        Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        Saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo R$" + Saldo + " já está disponível para saque.");

        scanner.close();
    
        //TODO: Conhecer e importa a classe scanner
        // Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
    }
}
