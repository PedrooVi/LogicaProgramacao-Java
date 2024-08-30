package While;

import java.util.Random;

public class Exercicio50 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int contador = 0;
        int maioresQCinco = 0;
        int divisiveisPorTres = 0;

        while (contador < 20) {
            int numero = aleatorio.nextInt(10);
            contador++;
            System.out.print( numero + " ");
            if (numero > 5) {
                maioresQCinco ++;
            }
            if (numero % 3 == 0) {
                divisiveisPorTres ++;
            }
        }
        System.out.println("Quantidade de numeros maiores que cinco: " + maioresQCinco);
        System.out.println("Quantidade de numeros divisiveis por 3: " + divisiveisPorTres);
    }
}
