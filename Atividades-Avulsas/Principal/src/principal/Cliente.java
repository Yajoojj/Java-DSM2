
public class Cliente {
    private String Nome;
    private String Endereco;
    private String RG;

    public Cliente() {
    }

    public Cliente(String Nome, String Endereco, String RG) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.RG = RG;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    public void cadastrarCliente(String nome, String End, String rg) {

        setNome(nome);
        setEndereco(End);
        setRG(rg);
        
    }
    public void listarCliente() {
        System.out.println("\n--- Dados do Cliente ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("RG: " + getRG());
    }


}