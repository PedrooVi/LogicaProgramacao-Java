<<<<<<< HEAD:Lista-Algoritimos/src/SequenciasBasicas/Exercicio3.java
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
=======
package SequenciasBasicas;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
 public static void main(String[] args) {
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
>>>>>>> 1e0353ba5a0ebb1d6bee330f31b6ff87b8c210e6:Lista-Algoritimos/Pedro/src/SequenciasBasicas/Exercicio3.java
