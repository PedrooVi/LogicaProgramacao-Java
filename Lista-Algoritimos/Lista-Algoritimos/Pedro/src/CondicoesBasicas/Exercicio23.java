package CondicoesBasicas;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        double porcentagemDesconto;
        double desconto;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sexo [M/F]: ");
        String sexo = scanner.next();

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (sexo.equals("M") || sexo.equals("m")) {
            porcentagemDesconto = 5;
            desconto = (valorCompra * porcentagemDesconto) / 100;
            valorCompra = valorCompra - desconto;
            System.out.println("Valor do desconto: R$" + desconto);
            System.out.println("Valor da compra com desconto: R$" + valorCompra);
        } else if (sexo.equals("F") || sexo.equals("f")) {
            porcentagemDesconto = 13;
            desconto = (valorCompra * porcentagemDesconto) / 100;
            valorCompra = valorCompra - desconto;
            System.out.println("Valor do desconto: R$" + desconto);
            System.out.println("Valor da compra com desconto: R$" + valorCompra);
        }

        scanner.close();

    }
}
