import java.util.Scanner;
public class Principal {
    
Scanner teclado = new Scanner (System.in);
        Cliente cli = new Cliente();

        System.out.println("Digite o seu nome: ");
        String Nome = teclado.nextLine();

        System.out.println("Digite o seu RG: ");
        String RG = teclado.nextLine();

        System.out.println("Digite o seu Endereço: ");
        String End = teclado.nextLine();

        cli.cadastrarCliente(Nome, RG, RG);
        
        System.out.println("+++++++\n+++++++\n+++++++!");
        
        cli.listarCliente();

        teclado.close();
 
   
    public static void main(String[] args) {
      
    }
    
}
