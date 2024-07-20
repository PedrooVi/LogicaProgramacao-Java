/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio006.Exercicio006;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio006 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int antecessor;
        int sucessor;
        
        System.out.print("Digite um número: ");
        numero = teclado.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;
        
        System.out.format("O antecessor de %d e %d \nO sucessor de %d e %d", numero, antecessor, numero, sucessor);
    }
}
