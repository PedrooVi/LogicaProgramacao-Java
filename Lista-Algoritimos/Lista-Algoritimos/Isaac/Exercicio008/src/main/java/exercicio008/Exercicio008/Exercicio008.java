/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio008.Exercicio008;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio008 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float m;
        System.out.print("Digite uma distancia em metros: ");
        m = teclado.nextFloat();
        
        System.out.format("A distancia de %.2f corresponde a:\n", m);
        System.out.println(m/1000 + "Km");
        System.out.println(m/100 + "Hm");
        System.out.println(m/10 + "Dam");
        System.out.println(m*10 + "dm");
        System.out.println(m*100 + "cm");
        System.out.println(m*10 + "mm");
    }
}
