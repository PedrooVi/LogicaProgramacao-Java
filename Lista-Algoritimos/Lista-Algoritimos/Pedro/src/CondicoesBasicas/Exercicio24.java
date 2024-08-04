package CondicoesBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        double valorPassagem;
        double valorViagem;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a distancia que deseja percorrer (KMS): ");
        int distancia = scanner.nextInt();

        if (distancia <= 200) {
            valorPassagem = 0.50;
            valorViagem = valorPassagem * distancia;
            System.out.println("O valor da sua viagem é de: R$" + valorViagem);
        } else{
            valorPassagem = 0.45;
            valorViagem = valorPassagem * distancia;
            System.out.println("O valor da sua viagem é de: R$" + valorViagem);
        }

        scanner.close();
    }
}
