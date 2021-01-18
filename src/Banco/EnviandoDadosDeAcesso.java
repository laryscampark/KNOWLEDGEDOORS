package Banco;

import Banco.Conexão;
import Classes.ControleDeAcesso;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnviandoDadosDeAcesso {
 public boolean Salvar(ControleDeAcesso OBJ) throws SQLException{
 Conexão conectar = new Conexão ();
 
 String SQL = "INSERT INTO ControleDeAcesso VALUES (?,?,?,?)";
 
 PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
 
 ps.setString(1, OBJ.getCpffuncionario());
 ps.setString(2, OBJ.getFuncionario());
 ps.setString(3, OBJ.getEmail());
 ps.setInt(4, OBJ.getStatusfuncionario());
 
 int Registros = ps.executeUpdate();
 
 if (Registros > 0){
     return true;
 }else{
     return false;
 }
 } 

    public boolean Modificar (ControleDeAcesso OBJ) throws SQLException {
        Conexão conectar = new Conexão();
        String SQL = "UPDATE ControleDeAcesso SET Funcionario = ?, Email = ?, Statusfuncionario = ? WHERE Cpffuncionario = ?";
        PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
   
        ps.setString(1, OBJ.getFuncionario());
        ps.setString(2, OBJ.getEmail());
        ps.setInt(3, OBJ.getStatusfuncionario());
        ps.setString(4, OBJ.getCpffuncionario());

        int Registros = ps.executeUpdate();
        
        if(Registros > 0){
            return true;
        }else{
            return false;
        }
    }

}
