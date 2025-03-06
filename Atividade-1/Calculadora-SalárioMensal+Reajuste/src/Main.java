import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, percentual, novoSalario;


        System.out.print("Digite o salário atual: ");
        salario = scanner.nextDouble();


        System.out.print("Digite o percentual de reajuste: ");
        percentual = scanner.nextDouble();


        novoSalario = salario + (salario * percentual) / 100;
        
        System.out.printf("O novo salário é: R$ %.2f\n", novoSalario);

        scanner.close();
    }
}
