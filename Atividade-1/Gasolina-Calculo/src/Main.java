import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroLitros, valorPago;

        System.out.print("Digite o número de litros de gasolina: ");
        numeroLitros = scanner.nextDouble();


        valorPago = numeroLitros * 4.39;


        System.out.printf("O valor a ser pago é: R$ %.2f\n", valorPago);

        scanner.close();
    }
}
