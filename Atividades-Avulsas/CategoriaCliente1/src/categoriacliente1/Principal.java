
package categoriacliente1;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Isira o seu nome");
        double numeroConta = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu Saldo: "));
        double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu Saldo Médio: "));
    CategoriaCliente1 cli = new CategoriaCliente1(nome, numeroConta, saldoMedio);
    cli.verificarSaldo();
}
}