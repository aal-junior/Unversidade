import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        char resposta = teclado.next().charAt(0);

        if (resposta == 'M') {
            System.out.println("Masculino");
        } else if (resposta == 'F') {
            System.out.println("Feminino");
        } else if (resposta == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada Incorreta");
        }

        teclado.close();
    }

}
