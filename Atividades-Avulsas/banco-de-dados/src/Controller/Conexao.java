package Controller;
 
import java.sql.*;
import javax.swing.JOptionPane;
 
public class Conexao {
 
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://127.0.0.1/banco";
    final private String usuario = "root";
    final private String senha = "";
 
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
 
    public boolean conecta() {
        boolean result = true;
 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com a fonte de dados: " + Fonte);
            result = false;
        }
        return result;
    }
 
    public void desconecta() {
        try {
            conexao.close();
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possível fechar o banco de dados: " + fecha);
        }
    }
 
    public void executeSQL(String sql) {
        conecta();
        try {
            statement = conexao.createStatement();
            statement.execute(sql);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Erro ao executar SQL: " + sqle.getMessage());
        }
    }
 
    public ResultSet RetornarResultset(String sql) {
        ResultSet resultSet = null;
        conecta();
        try {
            statement = conexao.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar resultset: " + e.getMessage());
        }
        return resultSet;
    }
}
    

