package CondicoesCompostas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o 1° comprimento: ");
        int x = scanner.nextInt();

        System.out.print("Digite o 2° comprimento: ");
        int y = scanner.nextInt();
      
        System.out.print("Digite o 3° comprimento: ");
        int z = scanner.nextInt();


        if(x == z && z == y){
            System.out.println("Esse é um triangulo equilatero");
        }else if( x != y  && y != z && z != x){
            System.out.println("Esse é um triangulo escaleno");
        } else {
            System.out.println("Esse é um triangulo Isoceles");
        }

        scanner.close();
    }
}
