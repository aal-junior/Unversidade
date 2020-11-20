import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a hora de chegada: ");
        int horaChegada = teclado.nextInt();
        System.out.print("Digite o minuto de chegada: ");
        int minutoChegada = teclado.nextInt();
        System.out.print("Digite a hora de saída: ");
        int horaSaida = teclado.nextInt();
        System.out.print("Digite o minuto de saída: ");
        int minutoSaida = teclado.nextInt();
        int qtdHorasPermanencia;
        double valorApagar = 0;

        if ((horaChegada >= 0) && (horaChegada <= 23) && (horaSaida >= 0) && (horaChegada <=23) && (minutoChegada >= 0)
                && (minutoChegada <= 59) && (minutoSaida >= 0) && (minutoSaida <= 59)) {
            if (minutoChegada >= 30) {
                horaChegada += 1;
            }
            if (minutoSaida >= 30) {
                horaSaida += 1;
            }
            if (horaChegada <= horaSaida) {
                qtdHorasPermanencia = horaSaida - horaChegada;
            } else {
                qtdHorasPermanencia = (24 - horaChegada) + horaSaida;
            }

            switch (qtdHorasPermanencia) {
                case 1:
                    valorApagar = 5.00;
                    break;
                case 2:
                    valorApagar = 10.00;
                    break;
                case 3:
                    valorApagar = 17.50;
                    break;
                case 4:
                    valorApagar = 25.00;
                    break;
                default:
                    valorApagar = 25.00 + ((qtdHorasPermanencia - 4) * 10);
                    break;
            }
            System.out.println("Valor a pagar: R$ " + valorApagar);
        } else {
            System.out.print("Entrada inválida");
        }

        teclado.close();
    }
}
