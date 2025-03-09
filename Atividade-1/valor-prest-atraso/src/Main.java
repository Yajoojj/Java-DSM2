import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valor, taxa, valorAtraso;
        int tempo;

        System.out.print("Digite o valor da prestação: ");
        valor = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (%): ");
        taxa = scanner.nextDouble();

        System.out.print("Digite a quantidade de meses em atraso: ");
        tempo = scanner.nextInt();

        valorAtraso = valor + (valor * (taxa / 100) * tempo);

        System.out.println("\nO valor da prestação em atraso é: R$ " + valorAtraso);

        scanner.close();
    }
}
