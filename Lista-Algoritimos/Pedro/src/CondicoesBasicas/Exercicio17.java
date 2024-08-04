package CondicoesBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a velocidade do seu carro: ");
        int velocidade = scanner.nextInt();


        if (velocidade > 80) {
            int velocidadeAcima = velocidade - 80;
            int valorMulta = velocidadeAcima  * 5;
            System.out.println("Você foi multado em R$: " + valorMulta);
        } else{
            System.out.println("Aumente a velocidade!");
        }
        scanner.close();
     }
}
