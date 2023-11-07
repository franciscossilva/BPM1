import java.util.Scanner;

public class Desafio2Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;

        do {
            System.out.print("Digite um valor inteiro : ");
            int n = sc.nextInt();

            if (n < 0 || n >= 13) {
                System.out.println("o Numero deve estar no intervalo entre 0 e 12.");
            } else {
                long fatorial = calcularFatorial(n);
                System.out.println(n + "! = " + fatorial);
            }

            System.out.print("Deseja calcular novamente? (S/N): ");
            opcao = sc.next().charAt(0);
        } while (opcao == 's' || opcao == 'n');

        sc.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}