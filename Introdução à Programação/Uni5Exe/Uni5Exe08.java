import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroContagem;
        int numeroDigitado = 0;
        double somaNumeros = 0;
        double contaMedia = 0;
        int menorValor = 0;

        System.out.println("Digite o número de vezes para contagem");
        numeroContagem = teclado.nextInt();

        for (int contagem = 0; contagem < numeroContagem; contagem++) {
            System.out.println("Digite um número");
            numeroDigitado = teclado.nextInt();
            if (numeroDigitado > 0) {
                somaNumeros += numeroDigitado;
                contaMedia++;
            } else {
                if ((numeroDigitado < menorValor) && (numeroDigitado < 0)) {
                    menorValor = numeroDigitado;
                }
            }
        }
        System.out.println("Média dos Valores Positivos: " + (somaNumeros / contaMedia));
        System.out.println("Menor Valor Negativo: " + menorValor);
        teclado.close();
    }
}
