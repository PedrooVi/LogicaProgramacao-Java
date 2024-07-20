import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.println("O antecessor de "+ numero + " é: " + (numero-1));
        System.out.println("O sucessor de "+ numero + " é: " + (numero+1));
        scanner.close();
    }
}
