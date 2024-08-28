package CondicoesCompostas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio36 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    double pontosPorHora;
    double totalPontos;
    double valorTotal;
    System.out.println("Bem vindo ao sistema de pontos.");
    System.out.print("Quantas horas de atividade fisica você realizou no mes?: ");
    double horasPraticadas = scanner.nextDouble();

    if (horasPraticadas <= 10) {
        pontosPorHora = 2;
        totalPontos = pontosPorHora * horasPraticadas;
        valorTotal = totalPontos * 0.05;
        System.out.println("Você realizou atividades fiscias durante " + horasPraticadas + " horas esse mês!");
        System.out.println("Pontos ganhos por cada hora " + pontosPorHora);
        System.out.println("Valor total ganho: R$" + valorTotal);
    } else if (horasPraticadas <= 20){
        pontosPorHora = 5;
        totalPontos = pontosPorHora * horasPraticadas;
        valorTotal = totalPontos * 0.05;
        System.out.println("Você realizou atividades fiscias durante " + horasPraticadas + " horas esse mês!");
        System.out.println("Pontos ganhos por cada hora " + pontosPorHora);
        System.out.println("Valor total ganho: R$" + valorTotal);
    } else{
        pontosPorHora = 10;
        totalPontos = pontosPorHora * horasPraticadas;
        valorTotal = totalPontos * 0.05;
        System.out.println("Você realizou atividades fiscias durante " + horasPraticadas + " horas esse mês!");
        System.out.println("Pontos ganhos por cada hora " + pontosPorHora);
        System.out.println("Valor total ganho: R$" + valorTotal);
    }


    scanner.close();
 }
}
