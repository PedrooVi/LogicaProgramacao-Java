package CondicoesCompostas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double aumento;
        double ajuste;


        System.out.print("Digite o nome do funcionario: ");
        String nome = scanner.next();

        System.out.print("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();

        System.out.print("A quantos anos ele trabalha na empresa: ");
        int anosTrabalhados = scanner.nextInt();

        if(anosTrabalhados <= 3){
            aumento = 3;
            ajuste = (salario * aumento) / 100;
            salario = salario + ajuste;
            System.out.println("Valor do aumento: R$" + ajuste);
            System.out.println("Valor do salario com aumento: R$"+ salario);
        } else if( anosTrabalhados < 10){
            aumento = 12.5;
            ajuste = (salario * aumento) / 100;
            salario = salario + ajuste;
            System.out.println("Valor do aumento: R$" + ajuste);
            System.out.println("Valor do salario com aumento: R$"+ salario);
        } else {
            aumento = 20;
            ajuste = (salario * aumento) / 100;
            salario = salario + ajuste;
            System.out.println("Valor do aumento: R$" + ajuste);
            System.out.println("Valor do salario com aumento: R$"+ salario);
        }

        scanner.close();
    }
}
