import java.util.Scanner;

public class Uni4Exe14 {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o dia: ");
        int Dia = teclado.nextInt();
        System.out.print("Insira o mês: ");
        int Mes = teclado.nextInt();
        System.out.print("Insira o ano: ");
        int Ano = teclado.nextInt();
        int AnoBisex = Ano % 4;

        if (((Mes == 1) || (Mes == 3) || (Mes == 5) || (Mes == 7) || (Mes == 8) || (Mes == 10) || (Mes == 12))
                && ((Dia >= 1) && (Dia <= 31))) {
            System.out.println("A data é válida");
        } else {
            if (((Mes == 4) || (Mes == 6) || (Mes == 9) || (Mes == 11)) && ((Dia >= 1) && (Dia <= 30))) {
                System.out.println("A data é válida");
            } else {
                if (((Mes == 2) && (AnoBisex != 0)) && ((Dia >= 1) && (Dia <= 28))) {
                    System.out.println("A data é válida");
                } else {
                    if (((Mes == 2) && (AnoBisex == 0)) && ((Dia >= 1) && (Dia <= 29))) {
                        System.out.println("A data é válida");
                    } else {
                        System.out.println("A data é inválida");
                    }
                    teclado.close();
                }
            }
        }

    }

}
