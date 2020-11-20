import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();

        if (A > B) {
            System.out.println("O maior valor é " + A);
        } else {
            System.out.println("O maior valor é " + B);
        }
        teclado.close();
    }
}
