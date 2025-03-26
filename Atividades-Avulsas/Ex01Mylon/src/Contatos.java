
public class Contatos {


    private String Nome;
    private String Endereco;
    private String Telefone;
    private String Cidade;

    public Contatos(String Nome, String Endereco, String Telefone, String Cidade) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Cidade = Cidade;
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
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    public void mensagem(){
        System.out.println("Boa noite, " + this.Nome + ", " + this.Endereco);
        System.out.println("As suas informações: " + this.getTelefone() + ", " + this.getCidade() + ", " + this.getEndereco());
        
}
}