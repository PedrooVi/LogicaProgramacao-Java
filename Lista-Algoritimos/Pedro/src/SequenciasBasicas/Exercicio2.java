package SequenciasBasicas;
import java.util.Scanner;

public class Exercicio2 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Qual o seu nome? ");
    String nome = scanner.next();
    System.out.println("Olá "+ nome + " seja bem vindo(a)");
    scanner.close();
 }
}
