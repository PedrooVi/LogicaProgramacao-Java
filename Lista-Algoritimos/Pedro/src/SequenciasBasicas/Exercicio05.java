package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("A media entre " + nota1 + " e " + nota2 + " é igual a: " + media);

        scanner.close();
    }
}
