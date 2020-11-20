import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("As cartas disponíveis são (digite o número respectivo):");
        System.out.println("AS = 1:");
        System.out.println("2 = 2");
        System.out.println("3 = 3");
        System.out.println("7 = 7");
        System.out.println("VALETE = 11");
        System.out.println("DAMA = 12");
        System.out.println("REI = 13");
        System.out.print("Digite o número da sua primeira carta: ");
        int carta1 = teclado.nextInt();
        System.out.print("Digite o número da sua segunda carta: ");
        int carta2 = teclado.nextInt();
        System.out.print("Digite o número da sua terceira carta: ");
        int carta3 = teclado.nextInt();
        int qtdCartasBoas = 0;

        if ((carta1 == 1) || (carta1 == 2) || (carta1 == 3)) {
            qtdCartasBoas += 1;
        }
        if ((carta2 == 1) || (carta2 == 2) || (carta2 == 3)) {
            qtdCartasBoas += 1;
        }
        if ((carta3 == 1) || (carta3 == 2) || (carta3 == 3)) {
            qtdCartasBoas += 1;
        }
        if (qtdCartasBoas == 1) {
            System.out.println("TRUCO");
        } else {
            if (qtdCartasBoas == 2) {
                System.out.println("SEIS");
            } else {
                if (qtdCartasBoas == 3) {
                    System.out.println("NOVE");
                }
                teclado.close();
            }
        }
    }
}
