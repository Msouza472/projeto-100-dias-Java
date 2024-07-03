import java.util.Scanner;
/**
 * @author Msouza472
 * @version 1.0
 * 
 * class Numeros
 * criada para calcular a média de três numeros fornecidos pelo usuário
 */

public class Numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá digite o primeiro número");
        int numero1 = scanner.nextInt();

        System.out.println("Olá digite o segundo número");
        int numero2 = scanner.nextInt();

        System.out.println("Olá digite o terceiro número");
        int numero3 = scanner.nextInt();

        System.out.println("///// Calculando Média /////");

        double media = (numero1 + numero2 + numero3) / 3.0;
            
        System.out.printf("A média dos números fornecidos é igual a: %.2f%n" + media);

        scanner.close();
        }
    
}



