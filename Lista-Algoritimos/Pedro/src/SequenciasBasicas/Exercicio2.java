package SequenciasBasicas;
import java.util.Scanner;

public class Exercicio2 {
 public static void main(String[] args) {
   /* Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela: */
    Scanner scanner = new Scanner(System.in);
    System.out.print("Qual o seu nome? ");
    String nome = scanner.next();
    System.out.println("Olá "+ nome + " seja bem vindo(a)");
    scanner.close();
 }
}

