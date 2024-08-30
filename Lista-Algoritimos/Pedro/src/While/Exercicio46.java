package While;

public class Exercicio46 {
    public static void main(String[] args) {
        int contador = 0;
        int indice = 6;

        while (indice < 100) {
            indice += 2;
            System.out.print(indice + " ") ;
            contador = contador + indice;
        }
        System.out.println("\nA soma dos indices é igual a: " + contador);
    }
}
