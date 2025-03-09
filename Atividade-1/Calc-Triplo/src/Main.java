import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1, numero2, dobro, triplo;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        dobro = numero1 * 2;
        triplo = numero2 * 3;

        System.out.println("\nO dobro do primeiro número (" + numero1 + ") é: " + dobro);
        System.out.println("O triplo do segundo número (" + numero2 + ") é: " + triplo);

        scanner.close();
    }
}
