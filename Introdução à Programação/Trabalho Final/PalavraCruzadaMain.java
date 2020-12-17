import java.util.Scanner;

public class PalavraCruzadaMain {

    private static PalavraCruzadaPalavras palavras;
    private static PalavraCruzadaMapa mapa;

    public static void main(String[] args) {

        PalavraCruzadaMain.mapa = new PalavraCruzadaMapa().mapaBusca(PalavraCruzadaMain.palavras.palavrasVetor());
        
        PalavraCruzadaMain.palavras = new PalavraCruzadaPalavras();
        
        Scanner input = new Scanner(System.in);

        int menu;
        
        System.out.println("__________ Menu: Palavra Cruzada __________");
        System.out.println("1. listar NÃO resolvido: palavras");
        System.out.println("2. listar NÃO resolvido: mapa");
        System.out.println("3. listar RESOLVIDOS: palavras");
        System.out.println("4. sair");
        System.out.print(" __ opção: ");
        menu = input.nextInt();
        if ((menu <= 0) || (menu >= 5)) {
            System.out.println("Opção errada!");
        } else {

            do {
                switch (menu) {

                    case 1:
                        PalavraCruzadaMain.palavras.palavrasSaidaNaoResolvido();
                        break;
                    case 2:
                        PalavraCruzadaMain.mapa.mapaSaidaNaoResolvido();
                        break;
                    case 3:
                        PalavraCruzadaMain.palavras.palavrasSaidaNaoResolvido();
                        break;
                    case 4:
                        break;
                }
            } while (menu != 4);

            input.close();
        }

    }
}
