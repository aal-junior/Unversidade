class PalavraCruzadaPalavras {

    private final short palavrasQtdLinha = 5;
    private final short palavrasQtdColuna = 10;
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

        for (int i = 0; i < this.palavras.length; i++) {
            System.out.println(this.palavras[i][0]);
        }

    }

    void palavrasSaidaResolvido() {

        for (int i = 0; i < this.palavras.length; i++) {
            final String achou = this.palavras[i][1];

            if (achou == null) {
                System.out.println("Não achou " + this.palavras[i][0]);
            } else {
                System.out.println("Achou" + this.palavras[i][0]);
            }
        }

    }

}
