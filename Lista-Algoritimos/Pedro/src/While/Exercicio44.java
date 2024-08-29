package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor inicial da contagem: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o valor final da contagem: ");
        int valorFinal = scanner.nextInt();

        System.out.print("Digite o valor do incremento: ");
        int incremento = scanner.nextInt();
        
        while (valorInicial <= valorFinal) {
            System.out.print(valorInicial + " ");
            valorInicial = valorInicial + incremento;
        }

        scanner.close();
    }
}
