package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int contador = 0;
        int homens = 0;
        int mulheres = 0; 
        int somaIdade = 0;
        int somaIdadeHomens = 0;
        int mulheresMaioresVinte = 0;

        while (contador < 5) {
            System.out.print("Digite  o sexo da " + (contador + 1) + "° pessoa [M/F]: ");
            String sexo = scanner.next();

            System.out.print("Digite  a idade da " + (contador + 1) + "° pessoa: ");
            int idade = scanner.nextInt();
            somaIdade += idade;

            if ("M".equals(sexo) || "m".equals(sexo)) {
                homens ++;
                somaIdadeHomens += idade;
            }else {
                mulheres ++ ;
                if (idade > 20) {
                    mulheresMaioresVinte ++;
                }
            }

            contador ++;
        }
        System.out.println("A quantidade de homens é: " + homens);
        System.out.println("A quantidade de mulheres é: " + mulheres);
        System.out.println("A media de idade do grupo é: " + somaIdade/5);
        System.out.println("A media de idade dos homens é: " + somaIdadeHomens/ homens);
        System.out.println("A quantidade de mulheres maiores de 20 anos é: " + mulheresMaioresVinte);
        scanner.close();
    }
}
