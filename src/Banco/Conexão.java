
package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexão {
    
    private static Connection conexao;
    
            public Conexão(){
    try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String Url = "jdbc:derby://localhost:1527/ProjetoFinal";
        String Usuário = "DeusETop";
        String Senha = "Deus";
        conexao = DriverManager.getConnection(Url, Usuário, Senha);
    }catch (Exception ErroConexao){
        JOptionPane.showMessageDialog(null, "Falha na conexão!" + ErroConexao);
    }
            }
            Connection Getconexão(){
                return conexao;
    }            
            }

