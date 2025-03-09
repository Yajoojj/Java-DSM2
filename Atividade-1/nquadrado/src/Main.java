import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero, quadrado;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        quadrado = numero * numero;

        System.out.println("\nO quadrado do número " + numero + " é: " + quadrado);

        scanner.close();
    }
}
