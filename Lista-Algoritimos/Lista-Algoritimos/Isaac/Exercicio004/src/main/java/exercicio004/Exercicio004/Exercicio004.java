/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio004.Exercicio004;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio004 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1;
        int valor2;
        int soma;
        
        System.out.print("Digite um valor: ");
        valor1 = teclado.nextInt();
        System.out.print("Digite outro valor: ");
        valor2 = teclado.nextInt();
        
        soma = valor1 + valor2;
        
        System.out.format("A soma entre %d e %d e: %d", valor1, valor2, soma);
    }
}
