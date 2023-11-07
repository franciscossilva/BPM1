import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância total percorrida em quilômetros: ");
        int distanciaTotal = scanner.nextInt();

        System.out.print("Digite o total de combustível consumido em litros: ");
        double combustivelConsumido = scanner.nextDouble();

        double consumoMedio = distanciaTotal / combustivelConsumido;

        System.out.printf("O consumo médio do automóvel é %.3f quilômetros por litro.\n", consumoMedio);

        scanner.close();
    }
}