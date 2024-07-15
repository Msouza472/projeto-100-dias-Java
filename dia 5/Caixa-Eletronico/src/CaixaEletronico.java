import java.util.Scanner;

/**
 * Programa Caixa eletronico, Faz a simulação de um caixa eletrônico
 * o valor inicial é recebido pelo usuário
 * o usuário pode fazer depósitos e realizar saques
 * 
 * @author Msouza472
 */

public class CaixaEletronico {
    public static double saldo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo inicial desejado!");
        
        saldo = scanner.nextDouble();

        int opcao;
        do {
            System.out.println("\nMenu Inicial");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Fazer Depósito");
            System.out.println("3. Fazer Saque");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();
            

            switch (opcao) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    fazerDeposito(scanner);
                    break;
                case 3:
                    fazerSaque(scanner);
                    break;
                case 4:
                    sair();
                    break;    
                default:
                System.out.println("Opção inválida, tente novamente.");
                break;
            }
        } while (opcao != 4);
        scanner.close();
    }

    private static void sair() {
        System.out.println("Programa encerrado.");
  
    }

    private static void fazerSaque(Scanner scanner) {
       System.out.println("Digite o valor do saque desejado!");
       double saque = scanner.nextDouble();
       if (saque <= saldo) {
            saldo -= saque;
            System.out.printf("Saque de R$ realizado com sucesso. R$%.2f\n", saque);
            System.out.printf("Saque realizado. Seu saldo atual é: R$%.2f", saldo);
       }else{
        System.out.println("Saldo indisponível. Realize um depósito!");
       }

    }

    private static void fazerDeposito(Scanner scanner) {
        System.out.println("Digite o valor do depósito desejado!");
        double deposito = scanner.nextDouble();
        if (deposito > 0) {
            saldo += deposito;  
            System.out.printf("Depósito realizado com sucesso de R$%.2f", deposito);
            System.out.printf("O seu saldo atual é: R$%.2f", saldo);
        }else{
            System.out.println("Valor de depósito inválido. Insira um valor acima de R$10,00");
        }
    
    }

    private static void consultarSaldo() {
    System.out.printf("O saldo atual da conta é: R$%.2f", saldo);
    }
}
