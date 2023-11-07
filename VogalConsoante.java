import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charArt(0);

        if (letra)>= "a" && letra <= "z"){
            if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
                System.out.print(letra + " é uma vogal");
            } else {
                System.out.print(letra + " é uma consoante");
            }else{
                System.out.print("letra invalida");
            }
            scanner.close();
        }
    }

