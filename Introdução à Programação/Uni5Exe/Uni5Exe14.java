
import java.util.Scanner;


public class Uni5Exe14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double PC = 0;
        double PV = 0;
        double Lucro;
        float somaPV = 0;
        float somaPC = 0;
        int NroMercadoriasMenor10 = 0;
        int NroMercadorias10a20 = 0;
        int NroMercadorias20Mais = 0;
        double somaLucro = 0;

        for (int contador = 1; contador <= 6; contador++) {
            System.out.print("Digite o preço de compra do produto " + contador + ": ");
            PC = teclado.nextDouble();
            System.out.print("Digite o preço de venda do produto " + contador + ": ");
            PV = teclado.nextDouble();
            Lucro = (PV - PC) / (PC * 100);
            somaLucro += Lucro;
            somaPC += PC;
            somaPV += PV;
            System.out.println(Lucro);

            if (Lucro < 10) {
                NroMercadoriasMenor10 += 1;
            } else {
                if ((Lucro >= 10) && (Lucro <= 20)) {
                    NroMercadorias10a20 += 1;
                } else {
                    if (Lucro > 20) {
                        NroMercadorias20Mais += 1;
                    }
                }
            }

        }
        System.out.println("Total de mercadorias com lucro menor que 10%: " +NroMercadoriasMenor10);
        System.out.println("Total de mercadorias com lucro entre 10 e 20%: " + NroMercadorias10a20);
        System.out.println("Total de mercadorias com lucro acima de 20%: " + NroMercadorias20Mais);
        System.out.printf("Total de lucro: %.2f\n", +somaLucro); 
        System.out.printf("Soma do preço de compra: R$ %.2f\n", +somaPC);
        System.out.printf("Soma do preço de venda: R$ %.2f\n", +somaPV);
        teclado.close();
    }
}
