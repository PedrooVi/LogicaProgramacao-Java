package problemanegativos;
import java.util.Scanner;

public class ProblemaNegativos {

    public static void main(String[] args) {
        int vetorInt[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int numRepete = 0;
        do {   
            System.out.print("Qunts números deseja ler (max(10)): ");
            numRepete = sc.nextInt();
        } while (numRepete < 1 && numRepete > 10 );
        
        for(int i = 1; i <= numRepete; i++) {
            System.out.print("Valor de indice " + i + "º: ");
            vetorInt[i] = sc.nextInt();
        }
        
        System.out.println("NUMEROS NEGATIVOS: ");
        
        for(int i = 1; i<= numRepete; i++) {
            if(vetorInt[i]<0){
                System.out.println(vetorInt[i]);
            }
        }
    }
}
