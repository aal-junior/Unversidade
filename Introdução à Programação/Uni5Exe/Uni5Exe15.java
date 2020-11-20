import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double nota1;
        double nota2;
        char nome = ' ';

        while (nome != 'f') {
            System.out.print("Digite o nome do aluno: ");
            nome = teclado.next().charAt(0);
            if (nome != 'f') {
                System.out.print("Digite a primeira nota: ");
                nota1 = teclado.nextDouble();
                System.out.print("Digite a segunda nota: ");
                nota2 = teclado.nextDouble();
                System.out.println("A média das notas é " + ((nota1 + nota2) / 2));
            }
        }
        teclado.close();
    }
}
