import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {

    public static void main(String[] args) {
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        
        int numeroDeTentativas = 3;

        Scanner scanner = new Scanner(System.in);

        while (numeroDeTentativas > 0) {
            System.out.println("Tente adivinhar o número (de 1 a 100):");
            int numeroDoUsuario = scanner.nextInt();

            if (numeroDoUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                break;
            }
            if (numeroDoUsuario > numeroAleatorio) {
                System.out.println("Você está quente, mas o número é menor.");
            } else {
                System.out.println("Você está frio, o número é maior.");
            }

            numeroDeTentativas--;
        }

        if (numeroDeTentativas == 0) {
            System.out.println("Você esgotou suas tentativas. O número era " + numeroAleatorio + ".");
        }

        // Fechar o Scanner
        scanner.close();
    }
}