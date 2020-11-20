import java.util.Scanner;

public class Uni4Exe16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int idade1H = teclado.nextInt();
        System.out.print("Digite a idade do segundo homem: ");
        int idade2H = teclado.nextInt();
        System.out.print("Digite a idade da primeira mulher: ");
        int idade1M = teclado.nextInt();
        System.out.print("Digite a idade da segunda mulher: ");
        int idade2M = teclado.nextInt();
        int HomemVelho;
        int HomemNovo;
        int MulherVelha;
        int MulherNova;

        if (idade1H < idade2H) {
            HomemVelho = idade2H;
            HomemNovo = idade1H;
        } else {
            HomemVelho = idade1H;
            HomemNovo = idade2H;
        }
        if (idade1M < idade2M) {
            MulherVelha = idade2M;
            MulherNova = idade1M;
        } else {
            MulherVelha = idade1M;
            MulherNova = idade2M;
        }
        int resultadoSoma = HomemVelho + MulherNova;
        int resultadoProduto = HomemNovo * MulherVelha;

        System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + resultadoSoma);
        System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + resultadoProduto);
    teclado.close();
    }
}