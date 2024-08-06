package CondicoesCompostas;

import java.util.Scanner;

public class Exercicio31 {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para pedra");
        System.out.println("Digite 2 para papel");
        System.out.println("Digite 3 para tesoura");
        System.out.print("Jogador 1: ");
        int jogada1 = scanner.nextInt();

        System.out.print("Jogador 2: ");
        int jogada2 = scanner.nextInt();

        if (jogada1 == jogada2) {
            System.out.println("Empate");
        } else if ((jogada1 == 1 && jogada2 == 3 ) || (jogada1 == 2 && jogada2 == 1)|| (jogada1 == 3 && jogada2 == 2)){
            System.out.println("Vitoria do jogador 1");
        } else{
            System.out.println("Vitoria do jogador 2");
        }


        scanner.close();
    }
}
