import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        char letra = teclado.next().charAt(0);

        if (letra == 'A') {
            System.out.println("Vogal");
        } else if (letra == 'E') {
            System.out.println("Vogal");
        } else if (letra == 'I') {
            System.out.println("Vogal");
        } else if (letra == 'O') {
            System.out.println("Vogal");
        } else if (letra == 'U') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
        teclado.close();
        }
        
    }
    