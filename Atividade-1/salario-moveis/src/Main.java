import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeMovéisVendidos;

        System.out.print("Digite a quantidade de móveis vendidos: ");
        quantidadeMovéisVendidos = scanner.nextInt();

        double salarioTotal = 1000 + (quantidadeMovéisVendidos * 50);

        System.out.println("\nO salário total do funcionário é: R$ " + salarioTotal);

        scanner.close();
    }
}
