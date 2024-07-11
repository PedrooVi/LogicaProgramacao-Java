import java.util.Locale;
import java.util.Scanner;


public class DadosPessoas {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidadePessoas = scaner.nextInt();
        double maiorAltura = 0;
        double menorAltura = 0;
        int numeroHomens = 0;
        double mediaAlturaMulheres = 0;
        double somaAlturaMuie = 0;
        int contMulher = 0;

        double alturaPessoas [] = new double[quantidadePessoas];
        String generoPessoas [] = new String[quantidadePessoas];


        for(int i = 0; i < quantidadePessoas; i++){
            System.out.print("Altura da " + (i+1) + "° pessoa: ");
            double altura = scaner.nextDouble();
            System.out.print("Genero da " + (i+1) + "° pessoa: ");
            String genero = scaner.next();
            alturaPessoas[i] = altura;
            generoPessoas[i] = genero;


            if(i == 0){
                maiorAltura = alturaPessoas[i];
                
            }else if(alturaPessoas[i] > maiorAltura){
                maiorAltura = alturaPessoas[i];
            }

            if(i == 0){
                menorAltura = alturaPessoas[i];
            }else if(alturaPessoas[i] < menorAltura){
                menorAltura = alturaPessoas[i];
            }

            if("M".equals(generoPessoas[i]) || "m".equals(generoPessoas[i])){
                numeroHomens = numeroHomens + 1;
            } else if("F".equals(generoPessoas[i])|| "f".equals(generoPessoas[i])){
                somaAlturaMuie += alturaPessoas[i];
                contMulher ++;
            }


        
        }



        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Numero de homens = " + numeroHomens);
        mediaAlturaMulheres = somaAlturaMuie/contMulher;
        System.out.println("Media de altura das mulheres = " + mediaAlturaMulheres);

    }
}
