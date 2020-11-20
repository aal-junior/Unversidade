import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int kmPercorrida = 0;
        int litrosGastos = 0;
        int somaTotalLitros = 0;
        int somaKmPercorrida = 0;

        System.out.println("Digite o numero de reabastecimentos");
        int numeroDeReabastecimentos = teclado.nextInt();

        for (int contador = 1; contador <= numeroDeReabastecimentos; contador++) {
            System.out.println("Digite a kmPercorrida");
            kmPercorrida = teclado.nextInt();
            System.out.println("Litros gastos");
            litrosGastos = teclado.nextInt();
            somaKmPercorrida += kmPercorrida;
            somaTotalLitros += litrosGastos;
            System.out.println(+contador + "ª Parada. Consumo: " + (kmPercorrida / litrosGastos) + " KM/L");

        }
        System.out.println("Média total viagem: " + (somaKmPercorrida / somaTotalLitros) + " KM/L");
        teclado.close();
    }
}
