import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, resultado ;

        System.out.println("Bem vindo(a) a Calculadora de Idade em dias");

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

       resultado = idade * 365;

       System.out.println("Você viveu por: " + resultado + " dias");




        scanner.close();
    }
}
