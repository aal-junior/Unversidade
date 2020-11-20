import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ano nascimento irmão 1: ");
        int nascIrmao1 = teclado.nextInt();

        System.out.println("Ano nascimento irmão 2: ");
        int nascIrmao2 = teclado.nextInt();

        System.out.println("ano nascimento irmão 3: ");
        int nascIrmao3 = teclado.nextInt();

        if ((nascIrmao1 == nascIrmao2) && (nascIrmao2 == nascIrmao3)) {
            System.out.println("TRIGÊMEOS");
        } else {
            if ((nascIrmao1 == nascIrmao2) && (nascIrmao2 != nascIrmao3)) {
                System.out.println("GÊMEOS");
            } else {
                if ((nascIrmao1 != nascIrmao2) && (nascIrmao2 == nascIrmao3)) {
                    System.out.println("GÊMEOS");
                } else {
                    System.out.println("APENAS IRMÃOS");
                }
            }
            teclado.close();

        }
    }
}
