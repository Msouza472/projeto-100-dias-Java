import java.util.Scanner;

/**
 * A classe Fibonacci recebe um número (termos) do usuário e gera uma sequência de Fibonacci do número de termos.
 * 
 * @author Msouza472
 */
public class Fibonacci {
    public static void main(String[] args) {
        gerarFibonacci();
    }

    private static void gerarFibonacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja digitar um número de termos para gerar a sequência de Fibonacci? (sim/não):");
        String resposta = scanner.next();
        
        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite um número de termos:");
            int n = scanner.nextInt();
            
            // Verifica se o número é positivo
            if (n <= 0) {
                System.out.println("Por favor, digite um número positivo.");
            } else {
                // Inicialização dos dois primeiros termos
                int num1 = 0, num2 = 1;
                
                System.out.println("A sequência de Fibonacci até " + n + " termos é:");
                
                for (int i = 1; i <= n; i++) {
                    System.out.print(num1 + " ");
                    
                    // Atualiza os termos
                    int nextNum = num1 + num2;
                    num1 = num2;
                    num2 = nextNum;
                }
                System.out.println(); // Para garantir que o cursor passe para a linha seguinte após a sequência
            }
            
            System.out.println("Deseja digitar um novo número de termos? (sim/não):");
            resposta = scanner.next();
        }

        scanner.close();
    }
}
