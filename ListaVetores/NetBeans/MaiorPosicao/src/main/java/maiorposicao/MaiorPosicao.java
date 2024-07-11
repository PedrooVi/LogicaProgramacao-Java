package maiorposicao;

import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {
        int numRepet = 0;
        Scanner sc = new Scanner(System.in);
        double vetorNum[] = new double[10];
        double maiorValor = 0;
        int posMaiorValor = 0;
        
        System.out.print("Quantos numeros voce vai digitar: ");
        numRepet = sc.nextInt();
        
        for(int i = 0; i < numRepet; i++) {
            System.out.print("Digite um numero: ");
            vetorNum[i] = sc.nextDouble();
            
            if(i == 0) {
                maiorValor = vetorNum[i];
                posMaiorValor = i;
            } else if(vetorNum[i] > maiorValor) {
                maiorValor = vetorNum[i];
                posMaiorValor = i;
            }
        }
        
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posMaiorValor);
    }
}
