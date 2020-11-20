import java.util.Scanner;

public class Uni4Exe05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean resposta = teclado.nextBoolean();

        if (resposta == true) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
        teclado.close();

    }
}
