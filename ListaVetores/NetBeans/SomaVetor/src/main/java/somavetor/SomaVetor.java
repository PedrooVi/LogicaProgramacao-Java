package somavetor;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        double vet[] = new double[10];
        Scanner sc = new Scanner(System.in);
        int numRepet;
        double somaVetor = 0;
        double media = 0;
        
        System.out.print("Quantos numeros voce vai digitar? ");
        numRepet = sc.nextInt();
        
        for(int i = 1; i <= numRepet; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
            somaVetor += vet[i];
        }
        
        media = somaVetor/numRepet;
        
        System.out.print("VALORES = ");
        
        for(int i = 1; i <= numRepet; i++) {
            System.out.print(vet[i] + " ");
        }
        
        System.out.println(""); //Espaço 
        
        System.out.println("SOMA = " + somaVetor);
        System.out.println("MEDIA = " + media);
    }
}
