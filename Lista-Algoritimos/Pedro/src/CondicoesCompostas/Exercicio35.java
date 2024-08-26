package CondicoesCompostas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valorTotal;
        double precoPorKM;
        double aluguelPopular = 90.0;
        double aluguelLuxo = 150.0;
        System.out.println("Qual o tipo de carro foi alugado?");
        System.out.println("1 - Carro popular");
        System.out.println("2 - Carro de luxo");
        int tipo = scanner.nextInt();

        System.out.print("Quantos dias o carro ficou alugado?");
        int dias = scanner.nextInt();

        System.out.print("Quantos KMS foram percorridos?");
        int kmPercorridos = scanner.nextInt();

        switch (tipo) {
            case 1:
                if (kmPercorridos <= 100) {
                    precoPorKM = 0.20;
                    valorTotal = (dias * aluguelPopular) + (kmPercorridos * precoPorKM);
                    System.out.println("Você percorreu " + kmPercorridos + "KMS");
                    System.out.println("Valor a pagar pelos KMS percorridos R$" + kmPercorridos * precoPorKM);
                    System.out.println("Valor a pagar pelos dias alugados R$" + dias * aluguelPopular);
                    System.out.println("Valor total a pagar R$" + valorTotal);
                } else {
                    precoPorKM = 0.10;
                    valorTotal = (dias * aluguelPopular) + (kmPercorridos * precoPorKM);
                    System.out.println("Você percorreu " + kmPercorridos + "KMS");
                    System.out.println("Valor a pagar pelos KMS percorridos R$" + kmPercorridos * precoPorKM);
                    System.out.println("Valor a pagar pelos dias alugados R$" + dias * aluguelPopular);
                    System.out.println("Valor total a pagar R$" + valorTotal);
                }
                break;

            case 2:
                if (kmPercorridos <= 200) {
                    precoPorKM = 0.30;
                    valorTotal = (dias * aluguelLuxo) + (kmPercorridos * precoPorKM);
                    System.out.println("Você percorreu " + kmPercorridos + "KMS");
                    System.out.println("Valor a pagar pelos KMS percorridos R$" + kmPercorridos * precoPorKM);
                    System.out.println("Valor a pagar pelos dias alugados R$" + dias * aluguelLuxo);
                    System.out.println("Valor total a pagar R$" + valorTotal);
                } else{
                    precoPorKM = 0.25;
                    valorTotal = (dias * aluguelLuxo) + (kmPercorridos * precoPorKM);
                    System.out.println("Você percorreu " + kmPercorridos + "KMS");
                    System.out.println("Valor a pagar pelos KMS percorridos R$" + kmPercorridos * precoPorKM);
                    System.out.println("Valor a pagar pelos dias alugados R$" + dias * aluguelLuxo);
                    System.out.println("Valor total a pagar R$" + valorTotal);
                }

            default:
                break;
        }
        scanner.close();
    }
}
