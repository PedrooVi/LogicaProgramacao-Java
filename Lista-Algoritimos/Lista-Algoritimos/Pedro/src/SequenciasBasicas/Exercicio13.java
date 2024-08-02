import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();
        double aumento = (salario * 15) / 100;

        double salarioComAumento = salario + aumento;

        System.out.println("Salario anterior: R$" + salario );
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Salario com aumento:R$" + salarioComAumento);

        scanner.close();

    }
}
