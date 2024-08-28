package CondicoesCompostas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double valorReajuste = 0.0;
        double porcentagemReajuste;
        System.out.println("Sistema de reajuste salarial");

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sexo [M/F]: ");
        String sexo = scanner.next().toUpperCase();

        System.out.print("Digite seu salario atual: ");
        double salario = scanner.nextDouble();

        System.out.print("Quantos anos você tem de empresa?: ");
        int anosEmpresa = scanner.nextInt();

        switch (sexo) {
            case "F":
                if (anosEmpresa <= 15) {
                    porcentagemReajuste = 5;
                    valorReajuste = (salario * porcentagemReajuste) / 100;
                    salario = salario + valorReajuste;

                } else if (anosEmpresa <= 20) {
                    porcentagemReajuste = 12;
                    valorReajuste = (salario * porcentagemReajuste) / 100;
                    salario = salario + valorReajuste;
                } else {
                    porcentagemReajuste = 23;
                    valorReajuste = (salario * porcentagemReajuste) / 100;
                    salario = salario + valorReajuste;
                }
                break;
            case "M":
                if (anosEmpresa < 20) {
                    porcentagemReajuste = 3;
                    valorReajuste = (salario * porcentagemReajuste) / 100;
                    salario = salario + valorReajuste;
                } else if (anosEmpresa < 30) {
                    porcentagemReajuste = 13;
                    valorReajuste = (salario * porcentagemReajuste) / 100;
                    salario = salario + valorReajuste;
                } else {
                    porcentagemReajuste = 25;
                    valorReajuste = (salario * porcentagemReajuste) / 100;
                    salario = salario + valorReajuste;
                }
            default:
                break;
        }
        System.out.println("Seu salario foi reajustado!");
        System.out.println(String.format("Valor do reajuste R$ %.2f", valorReajuste));
        System.out.println(String.format("Valor do salario reajustado R$ %.2f", salario));

        scanner.close();
    }
}