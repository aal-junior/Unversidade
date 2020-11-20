public class Uni5Exe04 {

    public static void main(String[] args) {

        double numerador = 3;
        double denominador = 2;
        double somaTotal = 0;

        for (int contador = 1; contador <= 20; contador++) {
            somaTotal = somaTotal + (numerador / denominador);
            numerador += 2;
            denominador += somaTotal;

        }
        System.out.println("O total é soma: " + somaTotal);
    }
}
