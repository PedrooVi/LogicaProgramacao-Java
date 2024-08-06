package CondicoesCompostas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o comprimento: ");
        int comprimento = scanner.nextInt();

        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();

        int area = largura * comprimento;
        
        if(area < 100){
            System.out.println("Terreno popular");
        }else if (area > 100 && area < 500) {
            System.out.println("Terreno master");
        }else{
            System.out.println("Terreno vip");
        }
        
        scanner.close();
    }
}
