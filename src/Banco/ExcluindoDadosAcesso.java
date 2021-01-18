package Banco;

import Banco.Conexão;
import Classes.ControleDeAcesso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExcluindoDadosAcesso {
  public ControleDeAcesso PesquisarExcluir (String cpffuncionario) throws SQLException {
  
      ControleDeAcesso OBJ = null;
      Conexão conectar  = new Conexão();
  
      String SQL = "SELECT * FROM ControleDeAcesso WHERE cpffuncionario = ? ";
  
  PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
  ps.setString(1, cpffuncionario);
  ResultSet Resultados = ps.executeQuery();
  if (Resultados.next()){
      OBJ= new ControleDeAcesso();
      OBJ.setCpffuncionario(Resultados.getString("CpfFuncionario"));
      OBJ.setFuncionario(Resultados.getString("Funcionario"));
      OBJ.setEmail(Resultados.getString("Email"));
      OBJ.setStatusfuncionario(Resultados.getInt("StatusFuncionario"));
  }
  return OBJ;
  }
public boolean ConfirmandoExclusao (String cpffuncionario) throws SQLException {
    
    Conexão conectar = new Conexão ();
    String SQL = "DELETE FROM  ControleDeAcesso WHERE cpffuncionario = ?";
    PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
    ps.setString(1,cpffuncionario);
    int registros = ps.executeUpdate();
    if(registros > 0 ){
    return true;    
    }else{
        return false;
    }
}
 
      }
  

       