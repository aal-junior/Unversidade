import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valor1, valor2, resultado;
        int opcao;

        System.out.print("Digite o Valor 1: ");
        valor1 = teclado.nextInt();
        System.out.print("Digite o Valor 2: ");
        valor2 = teclado.nextInt();
        System.out.println();
        System.out.println("=>  Escolha uma opção:");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                resultado = valor1 + valor2;
                break;
            case 2:
                resultado = valor1 - valor2;
                break;
            case 3:
                resultado = valor1 * valor2;
                break;
            case 4:
                if (valor2 == 0) {
                    System.out.println("INVÁLIDO - Divisão por zero");
                } else {
                    resultado = valor1 / valor2;
                    break;
                }
            default:
                resultado = 0;
                break;
        }

        teclado.close();

        System.out.println(resultado);

    }

}
