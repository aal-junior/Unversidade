import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;
        int voto;
        
        do {
            System.out.println("Digite o número do candidato");
        voto = teclado.nextInt();

        switch (voto) {
        case 1: candidato1++;   break;
        case 2: candidato2++;   break;
        case 3: candidato3++;   break;
        case 4: candidato4++;   break;
        case 5: votoNulo++;     break;
        case 6: votoBranco++; break;
        case 0: break;
        default: System.out.println("Opção Incorreta");
        break; }
                 
        } while (voto !=0);
        double votosTotal = candidato1+candidato2+candidato3+candidato4+votoNulo+votoBranco;
        System.out.println("====================================================");
        System.out.println("Quantidade de votos para candidato 1: " +candidato1++);
        System.out.println("Quantidade de votos para candidato 2: " +candidato2++);
        System.out.println("Quantidade de votos para candidato 3: " +candidato3++);
        System.out.println("Quantidade de votos para candidato 4: " +candidato4++);
        System.out.println("Quantidade de votos nulos: " +votoNulo++);
        System.out.println("Quantidade de votos em branco: " +votoBranco++);
        System.out.println("====================================================");
        System.out.println("Total de votos em brancos e nulos sobre o total: " +((votoNulo+votoBranco)/votosTotal));
        teclado.close();
    }
}
