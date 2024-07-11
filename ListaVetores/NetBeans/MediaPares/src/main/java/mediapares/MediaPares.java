package mediapares;

import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdRepet; 
        int contPar = 0;
        double mediaPares = 0;
        int qtdPar = 0;
        
        System.out.print("Quantos elementos vai ter o vetor: ");
        qtdRepet = sc.nextInt();
        
        int vetNumero[] = new int[qtdRepet];
        
        System.out.println("Digite os numeros: ");
        
        for(int i = 0; i < qtdRepet; i++) {
            vetNumero[i] = sc.nextInt();
            
            if(vetNumero[i] % 2 == 0) {
                contPar += vetNumero[i];
                qtdPar += 1;
            }
        }
        
        if(contPar == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            mediaPares = contPar/qtdPar;
            System.out.print("MEDIA DOS PARES = " + mediaPares);
        }
    }
}
