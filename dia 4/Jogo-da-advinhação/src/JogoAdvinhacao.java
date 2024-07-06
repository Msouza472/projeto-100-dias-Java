import java.util.Random;
import java.util.Scanner;

/**
 * O programa escolhe um numero aleatório e o usuário tem que advinhar esse número
 * depois de alguns erros o programa da uma dica para encontrar o número
 * 
 * @author Msouza472
 */

public class JogoAdvinhacao {
    public static void main(String[] args) {
        jogar();
    }

    private static void jogar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String jogarNovamente;

        do {
            int numeroAleatorio = random.nextInt(100) + 1;
            int tentativas = 0;
            int palpite = -1; // Inicializa com um valor diferente para entrar no loop

            System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar!");

            while (palpite != numeroAleatorio) {
                System.out.print("Digite seu palpite: ");
                palpite = scanner.nextInt();
                tentativas++;
              
                //limita o palpite entre 1 e 100
                if (palpite > 100) {
                    System.out.println("Erro! Digite um número entre 1 e 100"); 
                    break;
                } else if(palpite < 1){
                    System.out.println("Erro! Digite um número entre 1 e 100");
                    break; 
                }else{
                    System.out.println();
                }
                
                if (palpite > numeroAleatorio) {
                    System.out.println("Muito alto! Tente novamente. Número de tentativas = " + tentativas);
                } else if (palpite < numeroAleatorio) {
                    System.out.println("Muito baixo! Tente novamente. Número de tentativas = " + tentativas);
                } else {
                    System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
                }

                // Verifica se o número de tentativas atinge 3 ou 5 para fornecer dica ou encerrar o jogo
                if (tentativas == 3 && palpite != numeroAleatorio) {
                    System.out.println("Dica: O número que escolhi está entre " + Math.max(1, numeroAleatorio - 9) + " e " + Math.min(100, numeroAleatorio + 9));
                } else if (tentativas >= 5) {
                    System.out.println("Você atingiu o limite de " + tentativas + " tentativas. O número era " + numeroAleatorio);
                    break;
                }

            }

            System.out.println("Deseja jogar novamente? (sim/não): ");
            jogarNovamente = scanner.next();
        } while (jogarNovamente.equalsIgnoreCase("sim"));

        scanner.close();
    }
}
