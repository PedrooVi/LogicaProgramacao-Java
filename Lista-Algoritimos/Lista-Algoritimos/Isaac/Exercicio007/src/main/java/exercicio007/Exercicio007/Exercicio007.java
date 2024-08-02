/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio007.Exercicio007;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio007 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        float numero;
        float dobro;
        float tercaParte;
        
        System.out.print("Digite um numero: ");
        numero = teclado.nextFloat();
        
        dobro = numero * 2;
        tercaParte = numero/3;
        
        System.out.format("O dobro de %.2f e %.2f \nA terca parte de %.2f e %.2f", numero, dobro, numero, tercaParte);
    }
}
