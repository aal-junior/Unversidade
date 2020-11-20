import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Qual sua opção para formação?");
        System.out.println("1 - Ciência da computação");
        System.out.println("2 - Licenciatura em computação");
        System.out.println("3 - Sistemas de informação");
        System.out.println("---------------------------------");
        System.out.print("Digite o respectivo número: ");
        int opcao = teclado.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("---------------------------------");
                System.out.println("Bacharel em Ciência da Computação");
                System.out.println("---------------------------------");
                break;
            case 2:
                System.out.println("------------------------");
                System.out.println("Licenciado em Computação");
                System.out.println("------------------------");
                break;
            case 3:
                System.out.println("----------------------------------");
                System.out.println("Bacharel em Sistemas de Informação");
                System.out.println("----------------------------------");
        }
        teclado.close();
    }

}
