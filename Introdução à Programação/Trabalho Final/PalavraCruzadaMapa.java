public class PalavraCruzadaMapa {
    private final short mapaQtdLinha = 10;
    private final short mapaQtdColuna = 5;
    private char[][] mapa;

    public PalavraCruzadaMapa() {
        this.mapa = new char[10][5];
        this.mapaEntrada();
    }

    
    private void mapaLinha() {
        int i;
        for (i = 0; i < 5; ++i) {
            System.out.print("----");
        }
        System.out.println("-");
    }

    public void mapaSaidaNaoResolvido() {
        this.mapaLinha();
        int j;
        int i;
        for (j = 0; j < 10; j++) {
            for (i = 0; i < 5; i++) {
                System.out.print(" | " + this.mapa[j][i] + " ");
            }
            System.out.println("|");
            this.mapaLinha();
        }
    }
    public void mapaBusca(String[][] palavras) {

    }
    private void mapaEntrada() {
        this.mapa[0][0] = 'C';
        this.mapa[0][1] = 'C';
        this.mapa[0][2] = 'Q';
        this.mapa[0][3] = 'W';
        this.mapa[0][4] = 'E';
        this.mapa[1][0] = 'I';
        this.mapa[1][1] = 'X';
        this.mapa[1][2] = 'F';
        this.mapa[1][3] = 'O';
        this.mapa[1][4] = 'R';
        this.mapa[2][0] = 'F';
        this.mapa[2][1] = 'F';
        this.mapa[2][2] = 'R';
        this.mapa[2][3] = 'G';
        this.mapa[2][4] = 'F';
        this.mapa[3][0] = 'E';
        this.mapa[3][1] = 'L';
        this.mapa[3][2] = 'I';
        this.mapa[3][3] = 'H';
        this.mapa[3][4] = 'W';
        this.mapa[4][0] = 'L';
        this.mapa[4][1] = 'S';
        this.mapa[4][2] = 'F';
        this.mapa[4][3] = 'O';
        this.mapa[5][4] = 'U';
        this.mapa[5][0] = 'S';
        this.mapa[5][1] = 'D';
        this.mapa[5][2] = 'G';
        this.mapa[5][3] = 'T';
        this.mapa[5][4] = 'S';
        this.mapa[6][0] = 'E';
        this.mapa[6][1] = 'J';
        this.mapa[6][2] = 'H';
        this.mapa[6][3] = 'E';
        this.mapa[6][4] = 'T';
        this.mapa[7][0] = 'I';
        this.mapa[7][1] = 'I';
        this.mapa[7][2] = 'I';
        this.mapa[7][3] = 'J';
        this.mapa[7][4] = 'M';
        this.mapa[8][0] = 'X';
        this.mapa[8][1] = 'C';
        this.mapa[8][2] = 'K';
        this.mapa[8][3] = 'B';
        this.mapa[8][4] = 'G';
        this.mapa[9][0] = 'V';
        this.mapa[9][1] = 'E';
        this.mapa[9][2] = 'T';
        this.mapa[9][3] = 'O';
        this.mapa[9][4] = 'R';
    }
}
