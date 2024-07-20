package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.println("A área a ser pintada equivale a: " + area + "m²");

        System.out.println("A quantidade de litros de tinta para pintar a parede é de: "+ area/2);
        scanner.close();
    }
}
