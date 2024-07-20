package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite quanto de dinheiro voce deseja converter: ");
        float valorReal = scanner.nextFloat();
        float valorDolar = (float) (valorReal / 5.60);
       //System.out.println("R$"+ valorReal + " Equivalem a: US$" + valorDolar);
        System.out.format("R$ %.2f Equivalem a  US$ %.2f", valorReal, valorDolar);

        scanner.close();
    }
}
