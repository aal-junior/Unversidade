public class Uni5Exe03 {
    public static void main(String[] args) {

        double somaTotal = 0;
        
        for (int contador = 1; contador <= 100; contador++) {
            somaTotal += (1.0/contador);
        }
        System.out.println("Soma: " +somaTotal);

    }
}
