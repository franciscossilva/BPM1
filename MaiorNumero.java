import java.util.Scanner;

public class MaiorNumero {
    public static void (String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro:");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro:");
        int numero2= scanner.nextInt();

        if (numero1>numero2) {
            System.out.println(numero1 + "é o maior numero");
        }else if (numero2>numero1) {
            System.out.println(numero2 + "é o maior numero");
        }else {
            System.out.println("Os numeros sao iguais");
        }
        scanner.close();
    }
}




