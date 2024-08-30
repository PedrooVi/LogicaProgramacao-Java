package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int contador = 0;
        double maiorPreco = 0;

        while (contador < 8) {
            System.out.print("Digite o valor do produto: ");
            double preco = scanner.nextDouble();

            if (contador == 0) {
                maiorPreco = preco;

            } else if (preco > maiorPreco) {
                maiorPreco = preco;
            }
            contador++;
        }
        System.out.println(String.format("O maior preço é: R$%.2f", maiorPreco));

        scanner.close();
    }
}
