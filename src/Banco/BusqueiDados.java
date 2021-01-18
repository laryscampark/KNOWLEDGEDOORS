package Banco;

import Banco.Conexão;
import Classes.ControleDeAcesso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BusqueiDados {

public ControleDeAcesso BUSCAR (String cpffuncionario) throws SQLException {
       ControleDeAcesso obj = null;
       Conexão conectar = new Conexão();
       String SQL = "SELECT * FROM ControleDeAcesso WHERE cpffuncionario = ?";
       PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
       ps.setString(1, cpffuncionario);
       ResultSet Resultados = ps.executeQuery();
       
       if(Resultados.next()){
           obj = new ControleDeAcesso();
           obj.setCpffuncionario(Resultados.getString("CpfFuncionario"));
           obj.setFuncionario(Resultados.getString("Funcionario"));
           
       }
    return obj;
}

}

