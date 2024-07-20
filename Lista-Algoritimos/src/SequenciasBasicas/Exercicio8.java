package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite um numero: ");
        double numero = scanner.nextDouble();

        System.out.println("A distancia de "+ numero + " corresponde a: ");
        System.out.println(numero/1000 + " KM");
        System.out.println(numero/100 + " HM");
        System.out.println(numero/10 + " DAM");
        System.out.println(numero*10 + " dm");
        System.out.println(numero + " cm");
        System.out.println(numero*1000 + " mm");
        scanner.close();
        
    }
}
