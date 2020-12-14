public class PalavraCruzadaMapa {
    private final short mapaQtdLinha = 12;
    private final short mapaQtdColuna = 7;
    private char[][] mapa;

    public PalavraCruzadaMapa() {
        this.mapa = new char[12][7];
        this.mapaEntrada();
    }

    private void mapaLinha() {
        for (short c = 1; c < 6; ++c) {
            System.out.print("----");
        }
        System.out.print("-");
        System.out.println();
    }

    public void mapaSaidaNaoResolvido() {
        this.mapaLinha();
        for (short l = 1; l < 11; ++l) {
            for (short c = 1; c < 6; ++c) {
                System.out.print("| " + this.mapa[l][c] + " ");
            }
            System.out.println("|");
            this.mapaLinha();
        }
    }

    private boolean palavraBusca(final short palavraAtual, final String[][] palavras, short caracterAtual, short lAtual,
            final int lInc, short cAtual, final int cInc) {
        while (caracterAtual < palavras[palavraAtual][0].length()) {
            lAtual += (short) lInc;
            cAtual += (short) cInc;
            if (lAtual == 0 || lAtual == 12 || cAtual == 0 || cAtual == 7) {
                return false;
            }
            if (palavras[palavraAtual][0].charAt(caracterAtual) != this.mapa[lAtual][cAtual]) {
                return false;
            }
            ++caracterAtual;
        }
        return true;
    }

    private String palavrasBuscaMapa(final short palavraAtual, final String[][] palavras) {
        char caracter = ' ';
        String achou = "";
        for (short l = 1; l < 11; ++l) {
            for (short c = 1; c < 6; ++c) {
                short caracterAtual = 0;
                achou = "[" + (l - 1) + "," + (c - 1) + "]";
                if (this.mapa[l][c] == palavras[palavraAtual][0].charAt(caracterAtual)) {
                    ++caracterAtual;
                    caracter = palavras[palavraAtual][0].charAt(caracterAtual);
                    if (caracter == this.mapa[l - 1][c]
                            && this.palavraBusca(palavraAtual, palavras, caracterAtual, l, -1, c, 0)) {
                        return achou;
                    }
                    if (caracter == this.mapa[l][c + 1]
                            && this.palavraBusca(palavraAtual, palavras, caracterAtual, l, 0, c, 1)) {
                        return achou;
                    }
                    if (caracter == this.mapa[l + 1][c]
                            && this.palavraBusca(palavraAtual, palavras, caracterAtual, l, 1, c, 0)) {
                        return achou;
                    }
                    if (caracter == this.mapa[l][c - 1]
                            && this.palavraBusca(palavraAtual, palavras, caracterAtual, l, 0, c, -1)) {
                        return achou;
                    }
                }
            }
        }
        return achou = "";
    }

    public void mapaBusca(final String[][] palavras) {
        for (short palavraAtual = 0; palavraAtual < palavras.length; ++palavraAtual) {
            final String achou = this.palavrasBuscaMapa(palavraAtual, palavras);
            if (!achou.contentEquals("")) {
                palavras[palavraAtual][1] = achou;
            }
        }
    }

    private void mapaEntrada() {
        this.mapa[1][1] = 'C';
        this.mapa[1][2] = 'C';
        this.mapa[1][3] = 'Q';
        this.mapa[1][4] = 'W';
        this.mapa[1][5] = 'E';
        this.mapa[2][1] = 'I';
        this.mapa[2][2] = 'X';
        this.mapa[2][3] = 'F';
        this.mapa[2][4] = 'O';
        this.mapa[2][5] = 'R';
        this.mapa[3][1] = 'F';
        this.mapa[3][2] = 'F';
        this.mapa[3][3] = 'R';
        this.mapa[3][4] = 'G';
        this.mapa[3][5] = 'F';
        this.mapa[4][1] = 'E';
        this.mapa[4][2] = 'L';
        this.mapa[4][3] = 'I';
        this.mapa[4][4] = 'H';
        this.mapa[4][5] = 'W';
        this.mapa[5][1] = 'L';
        this.mapa[5][2] = 'S';
        this.mapa[5][3] = 'F';
        this.mapa[5][4] = 'O';
        this.mapa[5][5] = 'U';
        this.mapa[6][1] = 'S';
        this.mapa[6][2] = 'D';
        this.mapa[6][3] = 'G';
        this.mapa[6][4] = 'T';
        this.mapa[6][5] = 'S';
        this.mapa[7][1] = 'E';
        this.mapa[7][2] = 'J';
        this.mapa[7][3] = 'H';
        this.mapa[7][4] = 'E';
        this.mapa[7][5] = 'T';
        this.mapa[8][1] = 'I';
        this.mapa[8][2] = 'I';
        this.mapa[8][3] = 'I';
        this.mapa[8][4] = 'J';
        this.mapa[8][5] = 'M';
        this.mapa[9][1] = 'X';
        this.mapa[9][2] = 'C';
        this.mapa[9][3] = 'K';
        this.mapa[9][4] = 'B';
        this.mapa[9][5] = 'G';
        this.mapa[10][1] = 'V';
        this.mapa[10][2] = 'E';
        this.mapa[10][3] = 'T';
        this.mapa[10][4] = 'O';
        this.mapa[10][5] = 'R';
    }
}
