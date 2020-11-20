import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int soma = 0;
        int numero = 8;

        System.out.print("Digite o número de sequências: ");
        int sequencial = teclado.nextInt();

        for (int contador = 2; contador < sequencial; contador++) {
            System.out.println(numero + "," + (numero + 2));
            soma = soma + numero + (numero + 2);
            numero = numero * 2;
        }
        System.out.println("soma: " + soma);
        teclado.close();
    }

}
