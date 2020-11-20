import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas no mês");
        double horaTrabalhadaMes = teclado.nextDouble();
        System.out.print("Digite o salário por hora: R$ ");
        double valorHoraRegular = teclado.nextDouble();
        double valorTotalMes = horaTrabalhadaMes * valorHoraRegular;

        if (horaTrabalhadaMes > 160) {
            valorTotalMes = ((horaTrabalhadaMes - 160) * 0.5 + valorTotalMes);
            System.out.printf("Valor total: R$ %.2f\n", +valorTotalMes);
        } else {
            System.out.printf("Valor total: R$ %.2f\n", +valorTotalMes);
            teclado.close();
        }
    }

}
