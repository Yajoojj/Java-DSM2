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

 
        cli.cadastrarCliente(Nome, End, RG);

        System.out.println("+++++++\n+++++++\n+++++++\n");

        cli.listarCliente();

        teclado.close();
    }
}
