/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Banco.Conexão;
import Classes.Emprestimo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Família
 */
public class SalvarEmprestimo {
    public boolean SalvarEmp(Emprestimo objEmp) throws SQLException{
        Conexão conectar = new Conexão();
        String SQL = "INSERT INTO EMPRESTIMO VALUES(?,?,?,?,?,?,?,?,?,?,?)";     
        PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
        
        ps.setString(1, objEmp.getCodigoemprestimo());
        ps.setString(2, objEmp.getCodigolivro());
        ps.setString(3, objEmp.getTitulo());
        ps.setString(4, objEmp.getClassificacao());
        ps.setString(5, objEmp.getCpffuncionario());
        ps.setString(6, objEmp.getFuncionario());
        ps.setString(7, objEmp.getCpf());
        ps.setString(8, objEmp.getNomecompleto());
        ps.setInt(9, objEmp.getStatusemprestimo());
        ps.setString(10, objEmp.getDataemprestimo());
        ps.setString(11, objEmp.getDatadadevolucao());
           
        int Registros = ps.executeUpdate();
        

        if(Registros > 0){
            return true;
        }else{
            return false;
        }
        }
    
      
    public Emprestimo BUSCAR (String codigoemprestimo) throws SQLException {
        Emprestimo objEmp = null;
        Conexão conectar = new Conexão();
        String SQL = "SELECT * FROM EMPRESTIMO WHERE CODIGOEMPRESTIMO = ?";
        PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
        ps.setString(1, codigoemprestimo);
    ResultSet Resultados = ps.executeQuery();
    
    if(Resultados.next()){        
        objEmp = new Emprestimo();
        objEmp.setCodigoemprestimo(Resultados.getString("CODIGOEMPRESTIMO"));
        objEmp.setCodigolivro(Resultados.getString("CODIGOLIVRO"));
        objEmp.setTitulo(Resultados.getString("TITULO"));
        objEmp.setClassificacao(Resultados.getString("CLASSIFICACAO"));
        objEmp.setCpffuncionario(Resultados.getString("CPFFUNCIONARIO"));
        objEmp.setFuncionario(Resultados.getString("FUNCIONARIO"));
        objEmp.setCpf(Resultados.getString("CPF"));
        objEmp.setNomecompleto(Resultados.getString("NOMECOMPLETO"));
        objEmp.setStatusemprestimo(Resultados.getInt("STATUSEMPRESTIMO"));
        objEmp.setDataemprestimo(Resultados.getString("DATAEMPRESTIMO"));
        objEmp.setDatadadevolucao(Resultados.getString("DATADEDEVOLUCAO"));
        
        //obj.setNomedoCampo(VariavelInstanciada.getTipodeDados(NomedoCampoNoBanco));
        
                
        // acrescentar os outros itens
    }                
    return objEmp;    
      
}    
    
    public boolean ALTERAR(Emprestimo objEmp) throws SQLException {
        Conexão conectar = new Conexão();
        String SQL = "UPDATE EMPRESTIMO SET CODIGOLIVRO = ?, TITULO = ?, CLASSIFICACAO = ?, CPFFUNCIONARIO = ?, FUNCIONARIO = ?, CPF = ?,"
                + " NOMECOMPLETO = ?,"
                + "STATUSEMPRESTIMO = ?, DATAEMPRESTIMO = ?, DATADEDEVOLUCAO = ? WHERE CODIGOEMPRESTIMO= ?";
        PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);

       
        ps.setString(1, objEmp.getCodigolivro());
        ps.setString(2, objEmp.getTitulo());
        ps.setString(3, objEmp.getClassificacao());
        ps.setString(4, objEmp.getCpffuncionario());
        ps.setString(5, objEmp.getFuncionario());
        ps.setString(6, objEmp.getCpf());
        ps.setString(7, objEmp.getNomecompleto());
        ps.setInt(8, objEmp.getStatusemprestimo());
        ps.setString(9, objEmp.getDataemprestimo());
        ps.setString(10, objEmp.getDatadadevolucao());
        ps.setString(11, objEmp.getCodigoemprestimo());
        
        int Registros = ps.executeUpdate();
        
        if(Registros > 0){
            return true;
        }else{
            return false;
        }
    }
    
}
