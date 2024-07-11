
import java.util.Scanner;

public class AbaixoMedia {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor?: ");
        int quantidadeElementos = scanner.nextInt();
        double media = 0;
        double[] vetorMedia = new double[quantidadeElementos];
        double[] numerosAbaixoMedia = new double[quantidadeElementos];

        for(int i = 0; i < quantidadeElementos; i++){
            System.out.print("Digite um numero: ");
            double numero = scanner.nextInt();
            vetorMedia[i] = numero;
            media = (media + vetorMedia[i]);
        }

  
      
        media = media/quantidadeElementos;
        System.out.println("Media do Array: "+ media);

        System.out.println("Numeros abaixo da media: ");
        for (int i = 0; i < quantidadeElementos; i++) {
            if(vetorMedia[i] < media){
                numerosAbaixoMedia[i] = vetorMedia[i];
                System.out.println(numerosAbaixoMedia[i]);
            }
        }
      
        scanner.close();
    }
}
