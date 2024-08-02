/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exercicio003.Exercicio003;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Exercicio003 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        float salarioFuncionario;
        System.out.print("Nome do funcionário: ");
        nome = teclado.nextLine();
        System.out.print("Sálario: ");
        salarioFuncionario = teclado.nextFloat();
        
        System.out.format("O funcionário %s tem um salario de R$%.2f em Julho", nome, salarioFuncionario);
    }
}
