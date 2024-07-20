package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite um numero: ");
        double numero = scanner.nextDouble();
        System.out.println("O dobro de " + numero + " é: " + numero*2);
        System.out.println("A terça parte de " + numero + " é: " + numero/3);
        scanner.close();
    }
}
