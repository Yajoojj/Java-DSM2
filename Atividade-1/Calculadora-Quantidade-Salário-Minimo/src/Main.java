import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo, salarioFuncionario, quantidadeSalarios;

        System.out.println("Bem-vindo(a) ao Calculador de Salários!");


        System.out.println("Digite o valor do salário mínimo (em reais): ");
         salarioMinimo = scanner.nextDouble();


        System.out.println("Digite o valor do salário do funcionário (em reais): ");
        salarioFuncionario = scanner.nextDouble();


         quantidadeSalarios = salarioFuncionario / salarioMinimo;


        System.out.println("O funcionário recebe " + quantidadeSalarios + " salários mínimos.");

        scanner.close();
    }
}