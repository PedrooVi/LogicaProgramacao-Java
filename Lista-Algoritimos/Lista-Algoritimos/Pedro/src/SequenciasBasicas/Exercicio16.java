package SequenciasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos cigarros você fuma por dia?: ");
        int cigarrosPorDia = scanner.nextInt();
        System.out.print("A quantos anos você fuma?: ");
        int anosFumados = scanner.nextInt();
        
        int minutosFumados = cigarrosPorDia * 10; 
        int tempoFumado = anosFumados * 365;

        int totMinutos = minutosFumados * tempoFumado;
        
        int totDias = totMinutos / 1440;

        System.out.print("Você perdeu "+ totDias + " dias de vida por causa do cigarro!");



        scanner.close();
    }
}
