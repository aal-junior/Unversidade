import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Idade Marquinhos: ");
        int idMarquinhos = teclado.nextInt();

        System.out.println("Idade Zezinho: ");
        int idZezinho = teclado.nextInt();

        System.out.println("Idade Luluzinha: ");
        int idLuluzinha = teclado.nextInt();

        if ((idMarquinhos < idZezinho) && (idMarquinhos < idLuluzinha)) {
            System.out.println("Marquinhos é o caçula.");
        }
        if ((idZezinho < idMarquinhos) && (idZezinho < idLuluzinha)) {
            System.out.println("Zezinho é o caçula.");
        }
        if ((idLuluzinha < idMarquinhos) && (idLuluzinha < idZezinho)) {
            System.out.println("Luluzinha é o caçula.");
        }

        teclado.close();
    }
}