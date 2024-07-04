import java.util.Scanner;

/**
 * O programa recebe um número do usuário e verifica se esse número é primo.
 * 
 * @author Msouza472
 */
public class VerificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número a ser verificado!");
        int numero = scanner.nextInt();

        // Verifica se o número é primo
        boolean isPrimo = true;
        
        if (numero <= 1) {
            isPrimo = false;  // Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }

        // Exibe o resultado
        if (isPrimo) {
            System.out.println("O número " + numero + " é PRIMO!");
        } else {
            System.out.println("O número " + numero + " NÃO é primo.");
        }

        scanner.close();
    }
}