import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altura;
        double somaAltura = 0;

        for (int contador = 1; contador <= 20; contador++) {
            System.out.println("Digite a altura da pessoa: ");
            altura = teclado.nextDouble();
            somaAltura += altura;
        }
        System.out.println("A média das alturas é: " +((somaAltura / 20)));
        teclado.close();
    }
}
