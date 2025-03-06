import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, resultado1, resultado2, resultado3, resultado4;
        System.out.println("Bem vindo(a) a Calculadora");

        System.out.print("Digite o valor de n1: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite o valor de n2: ");
        n2 = scanner.nextDouble();

        resultado1 = n1 + n2;
        resultado2 = n1 * n2;
        resultado3 = n1 / n2;
        resultado4 = n1 - n2;

        System.out.println("O resultado da Soma deu: " + resultado1);
        System.out.println("O resultado da multiplicaão deu: " + resultado2);
        System.out.println("O resultado da divisão deu: " + resultado3);
        System.out.println("O resultado da subtraão deu: " + resultado4);


        scanner.close();
    }
}