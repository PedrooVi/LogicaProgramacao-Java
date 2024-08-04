package CondicoesBasicas;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();
        int idade = 2024 - anoNascimento;

        if (idade < 18) {
            int anosParaAlistamento = 18 - idade;
            System.out.println("Faltam " + anosParaAlistamento + " anos para o seu alistamento");
        } else{
            int anosDoAListamento = idade - 18;
            System.out.println("Se passaram " + anosDoAListamento + " anos desde seu alistamento");
        }

        scanner.close();
    }
}
