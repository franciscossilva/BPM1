import java.util.Scanner;

public class VerificarNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota entre 0 a 10: ");
        double nota  = scanner.nextDouble();

        if (nota>8) {
            System.out.print("Aprovado ");
        }else if (nota >=6){
            System.out.print("Recuperação");
        }else {
            System.out.print("Reprovado");
        }
        scanner.close();
        }
    }