

public class Uni5Exe11 {
    public static void main(String[] args) {

        int biscoitos = 0;
        int biscoitosQuebrados = 0;
        int somaBiscoitosQuebrados = 0;

        for (int contador = 1; contador < 16; contador++) {
            biscoitos += 1;
            if (biscoitos == 1) {
                biscoitosQuebrados = 1;
                somaBiscoitosQuebrados += biscoitosQuebrados;
            } else {
                if (biscoitos == 2) {
                    biscoitosQuebrados = 3;
                    somaBiscoitosQuebrados += biscoitosQuebrados;
                } else {
                    biscoitosQuebrados *= 3;
                    somaBiscoitosQuebrados += biscoitosQuebrados;
                }

            }
            System.out.println(biscoitosQuebrados + " biscoitos a cada hora");
        }
        System.out.println("Total biscoitos quebrados: " + somaBiscoitosQuebrados);
        
    }

}
