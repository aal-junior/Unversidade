import java.util.Scanner;

/**
 * Uni5Exe01
 */
public class Uni5Exe01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        for (int numero = 0; numero <= 20; numero++) {
            numero = teclado.nextInt();
            if (numero % 2 != 0) {
                System.out.println("O numero é ímpar");
            } else {
                System.out.println("O número é par");
            }
        }
        teclado.close();
    }
}
