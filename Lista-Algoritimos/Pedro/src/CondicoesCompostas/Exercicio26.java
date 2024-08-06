package CondicoesCompostas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o 1° numero: ");
        int numero1 = scanner.nextInt(); 

        System.out.print("Digite o 2° numero: ");
        int numero2 = scanner.nextInt(); 


        if (numero1 > numero2) {
            System.out.println("O primeiro numero é maior");
        }else if(numero2 > numero1){
            System.out.print("O segundo numero é maior");
        }else {
            System.out.println("Não existe numero maior");
        }

        scanner.close();
    }
}
