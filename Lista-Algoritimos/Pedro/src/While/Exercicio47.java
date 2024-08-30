package While;

public class Exercicio47 {
    public static void main(String[] args) {
        int contador = 0;
        int indice = 500;

        while (indice > 0) {
            indice -=50;
            System.out.print(indice + " ") ;
            contador = contador + indice;
        }
        System.out.println("\nA soma dos indices é igual a: " + contador);
    }
}
