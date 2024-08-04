package CondicoesBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu ano de nascimento: ");
        int ano = scanner.nextInt();

        int idade = 2024 - ano;

        if (idade >= 16 && idade < 18) {
            System.out.println("Você ja pode votar!");
            System.out.println("Voto não obrigatorio!");
        } else if (idade >= 18){
            System.out.println("Você ja pode votar!");
            System.out.println("Voto obrigatorio!");
        } else{
            System.out.println("Você ainda não pode votar");
        }

        scanner.close();
    }
}
