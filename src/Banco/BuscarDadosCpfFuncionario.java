package Banco;

import Classes.ControleDeAcesso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarDadosCpfFuncionario {

    public ControleDeAcesso BUSCAROSDADOS(String cpffuncionario) throws SQLException {
    
        ControleDeAcesso OBJ = null;
        Conexão conectar = new Conexão();
        String SQL = "SELECT * FROM ControleDeAcesso WHERE cpffuncionario = ?";
        
        PreparedStatement ps = conectar.Getconexão().prepareStatement (SQL);
        ps.setString(1, cpffuncionario);
        ResultSet Resultados = ps.executeQuery();
        
        if(Resultados.next()){
            OBJ = new ControleDeAcesso();
            OBJ.setCpffuncionario(Resultados.getString("CpfFuncionario"));
            OBJ.setFuncionario(Resultados.getString("Funcionario"));
        }
        
        return OBJ;
    }
}
