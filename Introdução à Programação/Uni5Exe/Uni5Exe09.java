import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de alunos");
        int numeroAlunos = teclado.nextInt();
        String nomeAluno;
        String aluno = "";
        int idadeAluno;
        int contaMaiores20 = 0;

        for (int contador = 0; contador < numeroAlunos; contador++) {
            System.out.print("Digite o nome do aluno: ");
            nomeAluno = teclado.next();
            System.out.print("Digite a idade do aluno: ");
            idadeAluno = teclado.nextInt();
            if (idadeAluno == 18) {
                aluno += " " + nomeAluno;
            } else {
                if (idadeAluno > 20) {
                    contaMaiores20++;
                }
            }
        }
        System.out.println("Número de alunos com mais de 20 anos: " + contaMaiores20);
        System.out.println("Nome de alunos com 18 anos:" + aluno);
        teclado.close();
        
    }
}
