package CondicoesCompostas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor da casa: ");
        int valorCasa = scanner.nextInt();

        System.out.print("Digite o seu salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Em quantos anos você deseja quitar a casa: ");
        int anos = scanner.nextInt();

        int valorParcelasMensal = (valorCasa / anos) / 12;

        if (valorParcelasMensal > (salario * 30) / 100) {
            System.out.println("Valor da parcela: R$" + valorParcelasMensal);
            System.out.println("Valor salario: R$" + salario);
            System.out.println("Parcelamento NEGADO!");
        } else{
            System.out.println("Valor da parcela: R$" + valorParcelasMensal);
            System.out.println("Valor salario: R$" + salario);
            System.out.println("Parcelamento ACEITO!");
        }

        scanner.close();
    }
} 
