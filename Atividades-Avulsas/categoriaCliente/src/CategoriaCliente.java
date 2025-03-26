import javax.swing.JOptionPane;

public class CategoriaCliente{
    private String nome;
    private double numeroConta;
    private double saldoMedio;
 
    public CategoriaCliente() {
    }
 
    public CategoriaCliente(String nome, double numeroConta, double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public double getNumeroConta() {
        return numeroConta;
    }
 
    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }
 
    public double getSaldoMedio() {
        return saldoMedio;
    }
 
    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    public void verificarSaldo(){

        if(getSaldoMedio() < 1000){
            JOptionPane.showMessageDialog(null, "Cliente Comum");
        }
        else if (getSaldoMedio () >= 1000 && getSaldoMedio() < 2500){
            JOptionPane.showMessageDialog(null, "Cliente Prata");
        }
         else {
            JOptionPane.showMessageDialog(null, getSaldoMedio());
        }
        
    }
}