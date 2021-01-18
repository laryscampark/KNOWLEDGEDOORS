
package Banco;

import Classes.Devolucao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarDevolucao {

    public Devolucao BUSCAR(String codigoemprestimo) throws SQLException{
       
    Devolucao objEmp = null;    
    Conexão conectar = new Conexão();               
    String SQL = "SELECT * FROM EMPRESTIMO WHERE CODIGOEMPRESTIMO = ?" ;        
    
    PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
    ps.setString(1, codigoemprestimo);
    ResultSet Resultados = ps.executeQuery();
    
    if(Resultados.next()){        
        objEmp = new Devolucao();
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
    
    
    
    
}
