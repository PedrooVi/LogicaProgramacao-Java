package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.print("Informe a quantidade de dias trabalhados: ");
    double diasTrabalhados = scanner.nextDouble();
    double valorPorDia = 8 * 25;
    double salarioTotal = valorPorDia * diasTrabalhados;

    System.out.print("O salario total do funcionario é de: R$ "+ salarioTotal);

    scanner.close();
 }
}
