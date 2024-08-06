package CondicoesCompostas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a 1° nota: ");
        double nota1 = scanner.nextDouble();

        
        System.out.print("Digite a 2° nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2 ) / 2;

        if (media< 5.0) {
            System.out.println("Media de: " + media);
            System.out.println("Reprovado!");
        }else if(media < 7){
            System.out.println("Media de: " + media);
            System.out.println("Recuperação!");
        } else{
            System.out.println("Media de: " + media);
            System.out.println("Aprovado!");
        }


    
        scanner.close();
    }
}
