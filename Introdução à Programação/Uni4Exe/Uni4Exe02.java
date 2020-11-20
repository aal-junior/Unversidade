import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva um número maior que zero: ");
        int valor = teclado.nextInt();

        int resultado = valor % 2;

        if (resultado > 0) {
            if (resultado == 1) {
                System.out.println("Ímpar");
            } else {
                System.out.println("Par");
            }
        } else {
            System.out.println("Valor digitado é menor que zero");
            teclado.close();
        }
    }
}
