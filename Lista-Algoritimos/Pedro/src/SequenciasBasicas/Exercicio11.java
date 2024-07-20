package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2) - (4 * (a * c));
        System.out.println("O delta equivale a: " + delta);

        scanner.close();
    }
}
