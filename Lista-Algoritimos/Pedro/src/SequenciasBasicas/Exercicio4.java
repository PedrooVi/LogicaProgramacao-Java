package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite um numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite outro numero: ");
        double numero2 = scanner.nextDouble();
        double resultado = numero1 + numero2;

        System.out.println("A soma entre " + numero1 + " + " + numero2 + " é igual a " + resultado);

        scanner.close();
    }
}
