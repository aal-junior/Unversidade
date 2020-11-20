import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da parcela: R$ ");
        double valor = teclado.nextInt();
        System.out.print("Digite a data de pagamento: ");
        double datapagamento = teclado.nextInt();
        double datavencimento = 10;

        if ((datapagamento==datavencimento) || (datapagamento<datavencimento)) {
            valor = valor-(valor*0.10);
            System.out.printf("O pagamento está em dia. Valor pago: R$ %.2f\n", +valor); 
        } else{ 
            if ((datapagamento>datavencimento) && (datapagamento<=15)) {
                System.out.printf("O pagamento foi realizado dentre de 5 dias após o vencimento: R$ %.2f\n", +valor);
               } else {
                   if (datapagamento>15) {
                       valor = valor+(valor*((datapagamento-10)*0.02));
                       System.out.printf("O pagamento foi realizado após 5 dias do vencimenento: R$ %.2f\n", +valor); }
                   }
               }
               teclado.close();
            }
        }
    