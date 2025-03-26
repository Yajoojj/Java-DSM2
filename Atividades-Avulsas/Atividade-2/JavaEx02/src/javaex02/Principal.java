import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cliente cli = new Cliente();

        System.out.println("Digite o seu nome: ");
        String Nome = teclado.nextLine();

        System.out.println("Digite o seu RG: ");
        String RG = teclado.nextLine();

        System.out.println("Digite o seu Endereço: ");
        String End = teclado.nextLine();

        // Correção: Passar o endereço corretamente para o método
        cli.cadastrarCliente(Nome, End, RG);

        System.out.println("+++++++\n+++++++\n+++++++!");

        cli.listarCliente();

        teclado.close();
    }
}
