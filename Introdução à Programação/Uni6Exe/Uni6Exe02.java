import java.util.Scanner;

public class Uni6Exe02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double vetor[] = new double[12];
        double somaVetor = 0;
        double divisor = 0;

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.print("Digite o valor: ");
            vetor[contador] = teclado.nextDouble();
            somaVetor += vetor[contador];
            divisor += 1;
        }
        double media = somaVetor / divisor;
        System.out.println("Média: " + media);
        for (int contador = 0; contador < vetor.length; contador++) {
            if (media < vetor[contador]) {
                System.out.println(media + " é menor que " + vetor[contador]+" que está no vetor " +contador);
            }
        }
        teclado.close();
    }

}
