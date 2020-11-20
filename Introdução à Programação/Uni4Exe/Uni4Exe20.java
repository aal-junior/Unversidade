import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double Nota1 = teclado.nextDouble();
        double Nota2 = teclado.nextDouble();
        double Nota3 = teclado.nextDouble();
        double NotaExerc = teclado.nextDouble();
        double notaFinal = (((Nota1) + (Nota2 * 2) + (Nota3 * 3) + NotaExerc)) / 7;
        char conceito;

        if (notaFinal >= 9) {
            conceito = 'A';
            {
                System.out.println("Conceito: " + conceito + "; Nota Final: " + notaFinal + "; - Aprovado");
            }
        } else {
            if ((notaFinal >= 7.5) && (notaFinal < 9)) {
                conceito = 'B';
                {
                    System.out.println("Conceito: " + conceito + "; Nota Final: " + notaFinal + "; - Aprovado");
                }
            } else {
                if ((notaFinal >= 6) && (notaFinal < 7.5)) {
                    conceito = 'C';
                    {
                        System.out.println("Conceito: " + conceito + "; Nota Final: " + notaFinal + "; - Aprovado");
                    }
                } else {
                    if ((notaFinal >= 4) && (notaFinal < 6)) {
                        conceito = 'D';
                        {
                            System.out
                                    .println("Conceito: " + conceito + "; Nota Final: " + notaFinal + "; - Reprovado");
                        }
                    } else {
                        if (notaFinal < 4) {
                            conceito = 'E';
                            {
                                System.out.println(
                                        "Conceito: " + conceito + "; Nota Final: " + notaFinal + "; - Reprovado");
                            }
                        }
                    }
                    teclado.close();
                }
            }
        }
    }
}
