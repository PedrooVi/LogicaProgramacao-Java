package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int contador = 0;
        double somaAltura = 0;
        int pesoMaiorNoventa = 0;
        int pesoMenorCinquenta = 0;
        int alturaMaiorUmENoventa = 0;

        while (contador < 2) {
            System.out.print("Digite o peso da "+ (contador +  1) + "° pessoa: ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura da "+ (contador +  1) + "° pessoa: ");
            double altura = scanner.nextDouble();

            if (peso > 90) {
                pesoMaiorNoventa ++;
            }else if (peso < 50 && altura < 1.60) {
              pesoMenorCinquenta ++;  
            }
            
            if (peso > 100 && altura > 1.90) {
                alturaMaiorUmENoventa ++;
            }

            somaAltura += altura;

            contador++;
        }

        System.out.println("A média de altura das pessoas é igual a: " + somaAltura/2);
        System.out.println("Quantidade de pessoas que pesam mais que 90KGS: " + pesoMaiorNoventa);
        System.out.println("Quantidade de pessoas que pesam menos de 50KGS e tem menos de 1.60 de altura: " + pesoMenorCinquenta);
        System.out.println("Quantidade de pessoas que medem mais que 1.90 e pesam mais de 100KG: " + alturaMaiorUmENoventa);

        scanner.close();
    }
}
