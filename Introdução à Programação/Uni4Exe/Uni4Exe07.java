import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o peso da carta em gramas");
        double pesoCarta = teclado.nextInt();
        double valorIndividual = 0.45;
        double valorTotal;

        if (pesoCarta > 50) {
            valorTotal = (((pesoCarta - 50) * 0.0225) + valorIndividual);
            System.out.printf("O valor total a pagar é R$ %.2f\n", +valorTotal);
        } else {
            System.out.println("O valor Total da carta é R$ " + valorIndividual);
            teclado.close();
        }
    }
}
