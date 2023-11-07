import java.util.Scanner;

public class VerificaçãoPN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O numero é positivo");
        } else if (numero < 0) {
            System.out.println("O numero é negativo");
        } else
            System.out.println("o numero é zero");
    }
    scanner.closer();
}
}