package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int i = 0;
        System.out.print("Digite um numero para finalizar a contagem: ");
        int numeroFinal = scanner.nextInt();

        while (i <= numeroFinal) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("Acabou!");
        
        scanner.close();
    }
}
