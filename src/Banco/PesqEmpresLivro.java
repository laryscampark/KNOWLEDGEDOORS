/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;


import Classes.Emprestimo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PesqEmpresLivro {
       
         public Emprestimo Pesquisar (String Codigoemprestimo) throws SQLException{
    Emprestimo objEmp = null;
    Conexão conectar = new Conexão();
    String SQL = "SELECT * FROM EMPRESTIMO WHERE CODIGOEMPRESTIMO = ?";
        
    PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
    ps.setString(1, Codigoemprestimo);
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
    }
    return objEmp;   
    }
    
} 
    
    
    
       

