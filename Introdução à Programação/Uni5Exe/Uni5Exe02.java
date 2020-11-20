import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args) {

        int impar = 0;
        int par = 0;

        Scanner teclado = new Scanner(System.in);

        for (int contador = teclado.nextInt(); contador <= 100; contador++) {
            if (contador % 2 != 0) {
                impar = impar + contador;
            } else {
                if (contador % 2 == 0) {
                    par = par + contador;
                }
            }
        }
        System.out.println(impar);
        System.out.println(par);
        teclado.close();
    }
}
