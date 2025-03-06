import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, media1, nota4, nota5, nota6, media2;

        System.out.println("Bem vindo(a) a Calculadora de Média");

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        System.out.println("Digite a quinta nota: ");
        nota5 = scanner.nextDouble();

        System.out.println("Digite a sexta nota: ");
        nota6 = scanner.nextDouble();

        media1 = (nota1 + nota2 + nota3) / 3;
        media2 = (nota4 + nota5 + nota6) / 3;

        System.out.println("O resultado da média das primeiras 3 notas é: " + media1);
        System.out.println("O resultado da média das 3 ultimas notas é: " + media2);


        scanner.close();
    }
}