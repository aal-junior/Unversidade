import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroContagem;
        double numeroDigitado = 0;
        double maiorValor = 0;
        double menorValor = 0;

        System.out.println("Digite o número de vezes para contagem");
        numeroContagem = teclado.nextInt();

        for (int contagem = 0; contagem < numeroContagem; contagem++) {
            System.out.println("Digite um número");
            numeroDigitado = teclado.nextDouble();
          
            if (numeroDigitado > maiorValor) {
                maiorValor = numeroDigitado;
            } else {
                menorValor = numeroDigitado;
            }
        }
        System.out.println("Maior valor: " +maiorValor);
        System.out.println("Menor valor: " +menorValor);
        teclado.close();
    }
}
