
public class Usuario {
     //Atributos da classe
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    //Construtor Padrão
    public Usuario(){
    }

    //Construtor especifico (pode ser implementado de acordo com as necessidades da aplicação
    public Usuario( String nome, String email, String login, String senha){
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;

    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public void mensagem(){
        System.out.println("Boa noite, " + this.nome);
        System.out.println("As suas informações: " + this.email);
        System.out.println(this.login);


    }
}
