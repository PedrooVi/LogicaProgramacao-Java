package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int cont = 0;
        int soma = 0;
        while (cont < 7) {
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            soma = soma + numero;
            cont ++;
        }
        System.out.println("\nA soma dos numeros é: " + soma);

        scanner.close();
    }
}
