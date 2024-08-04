package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.print("Digite a quantidade de KMS rodados: ");
    double kmRodados = scanner.nextDouble();
    System.out.print("Quantos dias o carro esteve alugado?: ");
    double diasAlugados = scanner.nextDouble();

    double valorTotalDias = 90 * diasAlugados;
    double valorTotalKms = kmRodados * 0.20;

    double valorTotalPagar = valorTotalDias + valorTotalKms;

    System.out.println("Valor total por dias alugados: R$ " + valorTotalDias);
    System.out.println("Valor total por KMS rodados: R$ " + valorTotalKms);
    System.out.println("Valor total a pagar: R$ " + valorTotalPagar);
    scanner.close();
 }
}
