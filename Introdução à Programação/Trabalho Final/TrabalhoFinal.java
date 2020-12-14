import java.util.Scanner;

public class PalavraCruzadaMain {

    private static PalavraCruzadaPalavras palavras;
    private static PalavraCruzadaMapa mapa;

    public static void main(String[] args) {
        
        PalavraCruzadaMain.palavras = new PalavraCruzadaPalavras();
        PalavraCruzadaMain.mapa     = new PalavraCruzadaMapa().mapaBusca(PalavraCruzadaMain.palavras.palavrasVetor());

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
                        PalavraCruzadaMain.palavras.palavrasSaidaNaoResolvido();;
                        break;
                    case 4:
                        break;
                }
            } while (menu != 4);

            input.close();
        }

    }
}
class PalavraCruzadaPalavras {
    private final int palavrasQtdLinha = 5;

    private final int palavrasQtdColuna = 2;

    private String[][] palavras;

    PalavraCruzadaPalavras() {
        this.palavras = new String[5][2];
        this.palavrasEntrada();
    }

    String[][] palavrasVetor() {
        return this.palavras;
    }

    private void palavrasEntrada() {
        this.palavras[0][0] = "IFELSE";
        this.palavras[1][0] = "FORA";
        this.palavras[2][0] = "WHILE";
        this.palavras[3][0] = "OBJETO";
        this.palavras[4][0] = "VETOR";
    }

    void palavrasSaidaNaoResolvido() {

        for (int i = 0; i < this.palavras.length; ++i) {
            System.out.println(this.palavras[i][0]);
        }

    }

    void palavrasSaidaResolvido() {

        for (int i = 0; i < this.palavras.length; ++ i) {
            final String achou = this.palavras[i][1];

            if (achou == null) {
                System.out.println("Não achou " + this.palavras[i][0]);
            } else {
                System.out.println(String.valueOf(this.palavras[i][1]) + "-" + this.palavras[i][0]);
            }
        }

    }

}

