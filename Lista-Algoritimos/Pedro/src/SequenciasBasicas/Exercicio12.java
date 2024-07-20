<<<<<<< HEAD
package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        double valorDesconto = (valorProduto * 5 ) / 100;
        double valorProdutoComDesconto = valorProduto - valorDesconto;
        System.out.println("O valor o produto com desconto é: R$" + valorProdutoComDesconto);
        scanner.close();
    }
}
=======
package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        double valorDesconto = (valorProduto * 5 ) / 100;
        double valorProdutoComDesconto = valorProduto - valorDesconto;
        System.out.println("O valor o produto com desconto é: R$" + valorProdutoComDesconto);
        scanner.close();
    }
}
>>>>>>> 70716a54cd1a069dd36cd13ff8fd3808b05e64d7
