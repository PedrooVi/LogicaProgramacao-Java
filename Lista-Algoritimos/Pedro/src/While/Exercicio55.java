package While;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int tentativas = 4;
        Random numRandom = new Random();
        int numeroSorteado = numRandom.nextInt(10) + 1;
        while (tentativas > 0) {
            System.out.print("Digite um numero de 1 a 10: ");
            int numeroEscolhido = scanner.nextInt();
            System.out.println("Numero escolhido: " + numeroEscolhido);
            
            if (numeroEscolhido == numeroSorteado) {
                System.out.println("Você ganhou!");
                break;
            } else {
                System.out.println("Você perdeu!");
            }
            System.out.println("Numero de tentativas restantes: " + (tentativas - 1) );
            
            tentativas --;
        }
        System.out.println("NUmero sorteado: " + numeroSorteado);

        scanner.close();
    }
}
