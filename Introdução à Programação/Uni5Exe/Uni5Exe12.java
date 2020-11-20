import java.util.Scanner;

public class Uni5Exe12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int linhas;
        int contador1;
        int contador2;
        int numero = 1;

        System.out.println("Digite o número de linhas: ");
        linhas = teclado.nextInt();

        for (contador1 = 1; contador1 <= linhas; contador1++) 
        {
            for (contador2 = 1; contador2 <= contador1; ++contador2) {

                System.out.print(numero + " ");
                numero++;
            }
            System.out.printf("\n");
        
        
        }
    }
}
