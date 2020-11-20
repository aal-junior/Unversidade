import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite T para calcular a área de um triângulo de base B e altura H: ");
        System.out.println("Digite Q para calcular a área de um quadrado de lado L");
        System.out.println("Digite R para calcular a área de um retângulo de base B e altura H");
        System.out.println("Digite C para calcular a área de um círculo de Raio R");
        System.out.print("Digite a opção: ");
        char opcao = teclado.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.print("Digite o valor da base B: ");
                double B = teclado.nextDouble();
                System.out.print("Digite o valor da altura H: ");
                double H = teclado.nextDouble();
                System.out.println("A área de um triangulo de base B e altura H é: " + (H * B / 2));
                break;

            case 'Q':
                System.out.print("Digite o valor do lado L: ");
                double L = teclado.nextDouble();
                System.out.println("A área de um quadrado de lado L é: " + (L * L));
                break;

            case 'R':
                System.out.print("Digite o valor da base B: ");
                double B1 = teclado.nextDouble();
                System.out.print("Digite o valor da altura H: ");
                double H1 = teclado.nextDouble();
                System.out.println("A área de um triangulo de base B e altura H é: " + H1 * B1);
                break;

            case 'C':
                System.out.print("Digite o valor do raio R: ");
                double R = teclado.nextDouble();
                System.out.println("A área de um círculo de Raio R é: "
                        + (Math.pow(R, 2) + "π (" + (Math.pow(R, 2) * 3.14159) + ")"));
                break;

            default:
                System.out.println("Você não digitou uma opção válida");
        }
        teclado.close();
    }

}
