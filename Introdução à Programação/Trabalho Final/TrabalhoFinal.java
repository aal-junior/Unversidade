import java.util.Scanner;

public class PalavrasCruzadasMain {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.println("__________ Menu: Palavra Cruzada __________");
        System.out.println("1. listar NÃO resolvido: palavras");
        System.out.println("2. listar NÃO resolvido: mapa");
        System.out.println("3. listar RESOLVIDOS: palavras");
        System.out.println("4. sair");
        System.out.print(" __ opção: ");
        menu = input.nextInt();
        if ((menu <=0) || (menu>=5) {
            System.out.println("Opção errada!");
        } else {
        do {
        switch(menu) {
       
            case 1:
            // chamar o método palavrasSaidaNaoResolvido da classe PalavraCruzadaPalavras;
            break;
            case 2:
            //chamar o método mapaSaidaNaoResolvido da classe PalavraCruzadaMapa;
            break;
            case 3:
            //chamar o método palavrasSaidaResolvido da classe PalavraCruzadaPalavras;
            break;
            case 4: 
            //sair
            break;
            }
        } while (menu !=4);
    }
}

    static private PalavraCruzadasPalavras palavra(String[] args) {
        palavrasSaidaNaoResolvida();
        palavrasSaidaResolvida();
    }

    static private PalavrasCruzadasMapa mapa(String[] args) {
        mapaSaidaNaoResolvido();
        mapaBusca();
    }
}

public class PalavrasCruzadasPalavra {
    private final palavrasQtdLinha(short[] palavras) {
    }

    private final palavrasQtdColuna(short[] palavras) {
    }
}

public class PalavrasCruzadasMapa {
}
