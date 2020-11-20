import java.util.Scanner;

public class Uni4Exe17 {
    
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a renda anual");
        double rendaAnual = teclado.nextInt();
        System.out.println("Digite o numero de dependentes");
        double numeroDep = teclado.nextInt();
        double rendaLiq=((rendaAnual)-(numeroDep*0.02));
        double rendaApagar;

        //<2000 - isento
        //>=2000<5000 - 5%
        //>=5000<10000 - 10%
        //>=10.000

        if ((rendaLiq>=2000) && (rendaLiq<5000)) {
            rendaApagar=rendaLiq*0.05;
            System.out.printf("O valor a pagar de imposto é: R$ %.2f\n", +rendaApagar);
        } else {
            if ((rendaLiq>=5000) && (rendaLiq<10000)) {
                rendaApagar=rendaLiq*0.10;
                System.out.printf("O valor a pagar da imposto é R$ %.2f\n", +rendaApagar); 
            } else {
                if (rendaLiq>=10000) {
                    rendaApagar=rendaLiq*0.15;
                    System.out.printf("O valor a pagar de imposto é R$ %.2f\n", +rendaApagar); 
                } else {
                    if (rendaLiq<2000) {System.out.printf("O valor a pagar de imposto é R$ %.2f\n", +rendaLiq); }

                }
            }
        teclado.close();
        }
    }
}