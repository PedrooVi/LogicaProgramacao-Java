package alturas;

import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRepet = 0;
        int tempNumRepet = 0;
        String vetNome[] = new String[10];
        int vetIdade[] = new int[10];
        double vetAltura[] = new double[10];
        double somaAltura = 0;
        double media = 0;
        int idadeMenor16 = 0;
        String nomeMenor16[] = new String[10];
        double porcentagem = 0;
        
        System.out.print("Quantas pessoas serao digitadas: ");
        numRepet = sc.nextInt();
        tempNumRepet = numRepet - 1;
        
        for(int i = 0; i <= tempNumRepet; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa");
            System.out.print("Nome: ");
            vetNome[i] = sc.next();
            System.out.print("Idade: ");
            vetIdade[i] = sc.nextInt();
            
            if(vetIdade[i] < 16) {
                idadeMenor16 = idadeMenor16 + 1;
                nomeMenor16[i] = vetNome[i];
            } else {
                idadeMenor16 += 0;
                nomeMenor16[i] = null;
            }
            
            System.out.print("Altura: ");
            vetAltura[i] = sc.nextDouble();
            somaAltura += vetAltura[i];
        }
       
        double doubleSomaAltura = somaAltura;
        double doubleNumRepet = numRepet;
        double doubleIdadeMenor16 = idadeMenor16;
        
        media = somaAltura/numRepet;
        porcentagem = (doubleIdadeMenor16/doubleNumRepet)*100;
        System.out.println("Altura média: " + media);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        for(int i = 0; i <= tempNumRepet; i++) {
            System.out.println(nomeMenor16[i]);
        }
    }
}
