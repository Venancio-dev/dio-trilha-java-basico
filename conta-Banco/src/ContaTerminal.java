import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando e armazenando os dados do usuário
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência:");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        // Exibindo a mensagem final
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        
        // Fechando o Scanner
        scanner.close();
    }
}
