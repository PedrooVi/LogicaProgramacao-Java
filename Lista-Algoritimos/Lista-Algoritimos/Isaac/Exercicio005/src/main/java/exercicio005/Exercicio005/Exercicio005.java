/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio005.Exercicio005;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio005 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valor1;
        float valor2;
        float media;
        
        System.out.print("Digite um valor: ");
        valor1 = teclado.nextFloat();
        System.out.print("Digite outro valor: ");
        valor2 = teclado.nextFloat();
        
        media = (valor1+valor2)/2;
        
        System.out.format("A media entre %.2f e %.2f e igual a %.2f", valor1, valor2, media);
        
    }
}
