package CondicoesBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media > 7 ){
            System.out.println("Sua media final é: " + media );
            System.out.println("Voce foi aprovado!");
        }else{
            System.out.println("Sua media final é: " + media );
            System.out.println("Você não foi aprovado!");
        }

        scanner.close();
    }
}
