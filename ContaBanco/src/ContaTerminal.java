import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por gentileza para continuar digite seu Nome completo :D - ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Agora por gentileza digite sua agência - ");
        String agencia = scanner.nextLine();

        System.out.print("Qual o número de sua conta, senhor "+nomeCliente+"? - ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: por gentileza digite apenas números.");
            scanner.next();
            System.out.print("Tente novamente por gentileza - ");
        }
        int conta = scanner.nextInt();
        
        double saldo = 237.48;

        System.out.print("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque!");
    }
}
