package numerospares;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRepete = 0;
        int vetorNumeros[] = new int[10];
        
        System.out.print("Quantos nuemros voce vai digitar: ");
        numRepete = sc.nextInt();
        
        for(int i = 0; i < numRepete; i++) {
            System.out.print("Digite um numero: ");
            vetorNumeros[i] = sc.nextInt();
        }
        
        System.out.println("NUMEROS PARES: ");
        
        for(int i = 0; i < numRepete; i++) {
            if(vetorNumeros[i] % 2 == 0) {
                System.out.print(vetorNumeros[i]);
            }
        }
    }
}
