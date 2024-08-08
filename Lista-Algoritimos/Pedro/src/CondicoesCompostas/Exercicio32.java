package CondicoesCompostas;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um numero de 1 a 5: " );
        int numeroEscolhido = scanner.nextInt();

        Random numRandom = new Random();
        int numeroSorteado = numRandom.nextInt(5) + 1;

        if (numeroEscolhido == numeroSorteado) {
            System.out.println("Numero escolhido: " + numeroEscolhido);
            System.out.println("NUmero sorteado: " + numeroSorteado);
            System.out.println("Você ganhou!");
        } else{
            System.out.println("Numero escolhido: " + numeroEscolhido);
            System.out.println("NUmero sorteado: " + numeroSorteado);
            System.out.println("Você perdeu!");
        }

      scanner.close();   
    }
}
