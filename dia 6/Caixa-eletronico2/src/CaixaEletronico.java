import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa Caixa Eletronico. Faz a simulação de um caixa eletrônico.
 * O valor inicial é recebido pelo usuário.
 * O usuário pode fazer depósitos e realizar saques.
 * Também é possível transferir valores entre duas contas.
 * 
 * @author Msouza472
 */
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial desejado para a Conta 1: ");
        double saldoInicial1 = scanner.nextDouble();
        Conta conta1 = new Conta(saldoInicial1, 123);

        System.out.print("Digite o saldo inicial desejado para a Conta 2: ");
        double saldoInicial2 = scanner.nextDouble();
        Conta conta2 = new Conta(saldoInicial2, 456);

        int opcao = 0;
        do {
            System.out.println("\nMenu Inicial");
            System.out.println("1. Consultar Saldo Conta 1");
            System.out.println("2. Consultar Saldo Conta 2");
            System.out.println("3. Fazer Depósito na Conta 1");
            System.out.println("4. Fazer Depósito na Conta 2");
            System.out.println("5. Fazer Saque na Conta 1");
            System.out.println("6. Fazer Saque na Conta 2");
            System.out.println("7. Transferir da Conta 1 para Conta 2");
            System.out.println("8. Transferir da Conta 2 para Conta 1");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.next();  // Limpa a entrada inválida
                continue;
            }

            switch (opcao) {
                case 1:
                    conta1.consultarSaldo();
                    break;
                case 2:
                    conta2.consultarSaldo();
                    break;
                case 3:
                    System.out.print("Digite o valor do depósito para a Conta 1: ");
                    double deposito1 = scanner.nextDouble();
                    conta1.fazerDeposito(deposito1);
                    break;
                case 4:
                    System.out.print("Digite o valor do depósito para a Conta 2: ");
                    double deposito2 = scanner.nextDouble();
                    conta2.fazerDeposito(deposito2);
                    break;
                case 5:
                    System.out.print("Digite o valor do saque para a Conta 1: ");
                    double saque1 = scanner.nextDouble();
                    conta1.fazerSaque(saque1);
                    break;
                case 6:
                    System.out.print("Digite o valor do saque para a Conta 2: ");
                    double saque2 = scanner.nextDouble();
                    conta2.fazerSaque(saque2);
                    break;
                case 7:
                    System.out.print("Digite o valor para transferir da Conta 1 para a Conta 2: ");
                    double transferencia1Para2 = scanner.nextDouble();
                    conta1.transferirPara(conta2, transferencia1Para2);
                    break;
                case 8:
                    System.out.print("Digite o valor para transferir da Conta 2 para a Conta 1: ");
                    double transferencia2Para1 = scanner.nextDouble();
                    conta2.transferirPara(conta1, transferencia2Para1);
                    break;
                case 9:
                    sair();
                    break;   
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao != 9);
        scanner.close();
    }

    private static void sair() {
        System.out.println("Programa encerrado.");
    }
}
