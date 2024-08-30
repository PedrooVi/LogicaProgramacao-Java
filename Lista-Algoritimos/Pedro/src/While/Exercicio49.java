package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int contador = 0;
        int contadorPar = 0;
        int contadorImpar = 0;

        while (contador < 6) {
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            if (numero%2 == 0) {
                contadorPar ++;
            }else{
                contadorImpar ++;
            }
            contador++;
        }
        System.out.println("Quantidade de numeros pares: " + contadorPar);
        System.out.println("Quantidade de numeros impares: " + contadorImpar);

        scanner.close();
    }
}
