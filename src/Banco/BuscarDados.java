package Banco;

import Classes.NovoCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarDados {

    public NovoCliente BUSCAR(String cpf) throws SQLException{
       
    NovoCliente obj = null;    
    Conexão conectar = new Conexão();               
    String SQL = "SELECT * FROM NovoCliente WHERE cpf = ?" ;        
    
    PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
    ps.setString(1, cpf);
    ResultSet Resultados = ps.executeQuery();
    
    if(Resultados.next()){        
        obj = new NovoCliente();
        obj.setCpf(Resultados.getString("Cpf"));
        obj.setNomecompleto(Resultados.getString("NomeCompleto"));
        //obj.setNomedoCampo(VariavelInstanciada.getTipodeDados(NomedoCampoNoBanco));
        
                
        // acrescentar os outros itens
    }                
    return obj;    
      
}    
}