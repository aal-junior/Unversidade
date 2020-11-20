import java.util.Scanner;

public class Uni5Exe16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altura = 1;
        double alturaF = 0;
        char sexo = ' ';
        int contador = 0;
        int contador2 = 0;
        double alturaM = 0;

        while (altura != 0) {
            System.out.print("Digite a altura da pessoa: ");
            altura = teclado.nextDouble();
            if (altura != 0) {
                System.out.println("Digite o sexo da pessoa");
                sexo = teclado.next().charAt(0);
                if (sexo == 'f') {
                    alturaF += altura;
                    contador++;
                } else {
                    if (sexo == 'm') {
                        alturaM += altura;
                        contador2++;
                    }
                }
            }
        }
        System.out.println("Media da altura das mulheres: " + (alturaF / contador));
        System.out.println("Media da altura do grupo: " + ((alturaF + alturaM) / (contador + contador2)));
        teclado.close();
    }
}
