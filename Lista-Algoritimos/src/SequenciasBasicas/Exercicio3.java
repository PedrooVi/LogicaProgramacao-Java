package SequenciasBasicas;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
 public static void main(String[] args) {
   /*Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem. */
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.print("Nome do funcionario: ");
    String nome = scanner.next();
    System.out.print("Salario do funcionario: ");
    double salario = scanner.nextDouble();

    System.out.println("Nome do funcionario: " + nome);
    System.out.println("Salario: " + salario);

    scanner.close();
 }
}
