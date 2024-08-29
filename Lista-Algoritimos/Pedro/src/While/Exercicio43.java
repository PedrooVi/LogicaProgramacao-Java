package While;

public class Exercicio43 {
    public static void main(String[] args) {
        int i = 30;
        while (i<= 1) {
            i--;
            if (i % 4 == 0) {
                System.out.print("[" + i + "]" + " ");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
