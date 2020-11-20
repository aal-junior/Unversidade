import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, valor3;
        int opcao;

        System.out.print("Digite o Valor 1: ");
        valor1 = teclado.nextInt();
        System.out.print("Digite o Valor 2: ");
        valor2 = teclado.nextInt();
        System.out.print("Digite o Valor 3: ");
        valor3 = teclado.nextInt();

        int valorMenor = 0, valorMedio = 0, valorMaior = 0;

        if ((valor1 < valor2) && (valor1 < valor3)) {
            valorMenor = valor1;
            if (valor2 < valor3) {
                valorMedio = valor2;
                valorMaior = valor3;
            } else {
                valorMedio = 3;
                valorMaior = 2;
            }
        } else {
            if ((valor2 < valor1) && (valor2 < valor3)) {
                valorMenor = valor2;
                if (valor1 < valor3) {
                    valorMedio = valor1;
                    valorMaior = valor3;
                } else {
                    valorMedio = valor3;
                    valorMaior = valor1;
                }
            } else {
                valorMenor = valor3;
                if (valor1 < valor2) {
                    valorMedio = valor1;
                    valorMaior = valor2;
                } else {
                    valorMedio = valor2;
                    valorMaior = valor1;
                }
            }
        }

        System.out.println("1 - Ordenar de forma crescente:");
        System.out.println("2 - Ordenar de forma decrescente");
        System.out.println("3 - Coloar o maior número no meio");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1: // ordem crescente
                System.out.println("Crescente:" + valorMenor + ", " + valorMedio + ", " + valorMaior);
                break;
            case 2: // ordem decrescente
                System.out.println("Crescente:" + valorMaior + ", " + valorMedio + ", " + valorMenor);
                break;
            case 3: // a maior no meio
                System.out.println("Crescente:" + valorMenor + ", " + valorMaior + ", " + valorMedio);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        teclado.close();

    }
}
