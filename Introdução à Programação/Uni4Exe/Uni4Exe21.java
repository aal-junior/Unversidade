import java.util.Scanner;

public class Uni4Exe21 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a massa em KG");
        double Massa = teclado.nextDouble();
        System.out.println("Digite a altura em M");
        double Altura = teclado.nextDouble();
        double resultado = ((Massa/(Altura*Altura)));

        if ((resultado >=0) && (resultado< 18.5)) {
            System.out.println("Resultado: Magreza - " +resultado);
        } else {
            if ((resultado >= 18.5) && (resultado < 24.9)) {
                System.out.println("Resultado: Saudável - " +resultado);
            } else {
                if ((resultado >= 25) && (resultado < 29.9)) {
                    System.out.println("Resultado: Sobrepeso - " +resultado);
                } else {
                    if ((resultado >= 30) && (resultado < 34.9)) {
                        System.out.println("Resultado: Obesidade grau I - " +resultado);
                    } else {
                        if ((resultado >= 35) && (resultado < 39.9)) {
                            System.out.println("Resultado: Obesidade grau II (Severa) - " +resultado);
                        } else {
                            if ((resultado >= 40) && (resultado < 50.0)) {
                                System.out.println("Obesidade grau III (Mórbida) - " +resultado);
                            } else {
                                if ((resultado >= 50) && (resultado < 50.0)) {
                                    System.out.println("Obesidade grau III (Mórbida) - " +resultado);
                                }
                                else {System.out.println("Valor Inválido");}
                                teclado.close();
                            }
                        }
                    }
                }
            }
        }
    }
}
