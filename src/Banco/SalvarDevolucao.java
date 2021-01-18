/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Classes.Devolucao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalvarDevolucao {

    public boolean SalvDev(Devolucao objDev) throws SQLException{
        Conexão conectar = new Conexão();
        String SQL = "INSERT INTO DEVOLUCAO VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";     
        PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
        
        ps.setString(1, objDev.getCodigoemprestimo());
        ps.setString(2, objDev.getCodigolivro());
        ps.setString(3, objDev.getTitulo());
        ps.setString(4, objDev.getClassificacao());
        ps.setString(5, objDev.getCpffuncionario());
        ps.setString(6, objDev.getFuncionario());
        ps.setString(7, objDev.getCpf());
        ps.setString(8, objDev.getNomecompleto());
        ps.setInt(9, objDev.getStatusemprestimo());
        ps.setString(10, objDev.getDataemprestimo());
        ps.setString(11, objDev.getDatadadevolucao());
        ps.setString(12, objDev.getTalvezdevolucao());
        ps.setString(13, objDev.getVencimento());
        ps.setInt(14, objDev.getStatusdevolucao());
           
        int Registros = ps.executeUpdate();
        

        if(Registros > 0){
            return true;
        }else{
            return false;
        }
    }
}
    
    

