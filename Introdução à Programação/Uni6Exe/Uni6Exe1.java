import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[10];

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.println("Entre vetor[" + contador + "]: ");
            vetor[contador] = teclado.nextInt();
        }

        for (int contador = vetor.length - 1; contador >= 0; contador--) {
            System.out.println("vetor[" + contador + "]: " + vetor[contador]);
        }

        teclado.close();
    }
}
