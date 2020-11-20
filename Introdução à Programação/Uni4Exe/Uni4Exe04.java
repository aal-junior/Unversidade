import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número :");
        double A = teclado.nextDouble();

        if (A % 1 == 0) {
            System.out.println("O número não possui casa decimal");
        } else {
            System.out.println("O numero possui casa decimal");
        }
        teclado.close();
    }

}
