package CondicoesBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o 1° comprimento: ");
        int x = scanner.nextInt();

        System.out.print("Digite o 2° comprimento: ");
        int y = scanner.nextInt();
      
        System.out.print("Digite o 3° comprimento: ");
        int z = scanner.nextInt();


        if ( x < y + z && y < z + x && z < x + y) {
            System.out.println("Esses segmentos podem formar um triangulo");
        } else{
            System.out.println("Essas retas não podem formar um triangulo");
        }

        scanner.close();
    }
}
