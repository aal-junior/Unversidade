import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o lado 1");
        double lado1 = teclado.nextDouble();
        System.out.println("Escreva o lado 2");
        double lado2 = teclado.nextDouble();
        System.out.println("Escreva o lado 3");
        double lado3 = teclado.nextDouble();

        if ((lado1 <= 0) || (lado2 <= 0) || (lado3 <= 0)) {
            System.out.println("Impossível calcular com qualquer lado igual ou menor a 0");
        } else {
            if ((lado1 == lado2) && (lado2 == lado3)) {
                System.out.println("O triângulo é equilátero");
            } else {
                if ((lado1 == lado2) && (lado2 != lado3)) {
                    System.out.println("O triângulo é isóceles");
                } else {
                    if ((lado1 != lado2) && (lado2 == lado3)) {
                        System.out.println("O triângulo é isóceles");
                    } else {
                        System.out.println("O triângulo é escaleno");
                    }
                    teclado.close();
                }
            }
        }

    }
}