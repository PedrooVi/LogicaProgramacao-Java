package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int contador = 0;
        int maioresDeDezoito = 0;
        int menosDeCinco = 0;
        int mediaIdade = 0; 
        int somaIdade = 0;
        int maiorIdade =0;

        while (contador < 10) {
            System.out.print("Digite a idade:");
            int idade = scanner.nextInt();
            somaIdade += idade;
            if(idade > 18){
                maioresDeDezoito ++;
            } else if( idade < 5){
                menosDeCinco ++;
            }

            if(contador == 0){
                maiorIdade = idade;
            }else if(idade > maiorIdade){
                maiorIdade = idade;
            }
            contador++;
        }
        mediaIdade = somaIdade/10;
        System.out.println("A media das idade é: " + mediaIdade);
        System.out.println("Quantidade de pessoas maiores de 18 anos: " + maioresDeDezoito);
        System.out.println("Quantidade de pessoas menores de 5 anos: " + menosDeCinco);
        scanner.close();
    }
}