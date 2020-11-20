import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
       
        System.out.println("Digite a quantidade de meses que o empregado fora admitido");
        Scanner teclado = new Scanner(System.in);
       
        int qtdMesesAdmissao = teclado.nextInt();

            if ((qtdMesesAdmissao>0) && (qtdMesesAdmissao<=12)) {
            System.out.println("O reajuste a ser aplicado é de 5%"); 
        }
            else {
                if ((qtdMesesAdmissao>=13) && (qtdMesesAdmissao<=48)) {
                    System.out.println("O reajuste a ser aplicado é de 7%");
                }
                        teclado.close();
            }
    }
}
