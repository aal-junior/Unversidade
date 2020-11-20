import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva um valor: ");
        int A = teclado.nextInt();
        System.out.println("Escreva outro valor: ");
        int B = teclado.nextInt();
        int operacao = A % B;
        int operacao2 = B % A;

        if ((operacao == 1) || (operacao2 == 1)) {
            System.out.println("Os números não são múltiplos");
        } else {
            System.out.println("Os números são múltiplos");
        }
        teclado.close();

    }
}
