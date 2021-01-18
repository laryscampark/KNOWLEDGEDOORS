/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Classes.NovoCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Família
 */
public class ExcluirDados {
    public NovoCliente PesquisarExcluir(String cpf) throws SQLException{
       
    NovoCliente obj = null;    
    Conexão conectar = new Conexão();               
    String SQL = "SELECT * FROM NovoCliente WHERE cpf = ?";        
    
    PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
    ps.setString(1, cpf);
    ResultSet Resultados = ps.executeQuery();
    
    if(Resultados.next()){        
        obj = new NovoCliente();
        obj.setCpf(Resultados.getString("Cpf"));
        obj.setNomecompleto(Resultados.getString("NomeCompleto"));
        obj.setStatus(Resultados.getInt("Status"));
        obj.setEndereco(Resultados.getString("Endereco"));
        obj.setNumero(Resultados.getInt("Numero"));
        obj.setBairro(Resultados.getString("Bairro"));
        obj.setData(Resultados.getString("Data"));
        obj.setCep(Resultados.getString("Cep"));
        obj.setCidade(Resultados.getString("Cidade"));
        obj.setUf(Resultados.getInt("Uf"));
        obj.setTelefone(Resultados.getString("Telefone"));
        obj.setCelular(Resultados.getString("Celular"));
        obj.setEmail(Resultados.getString("Email"));
        //obj.setNomedoCampo(VariavelInstanciada.getTipodeDados(NomedoCampoNoBanco));
        
                
        // acrescentar os outros itens
    }                
    return obj;    
      
}
   
    public boolean Editar(NovoCliente obj) throws SQLException{
    
        Conexão conectar = new Conexão ();
        String SQL = "update NovoCliente set cpf = ?, "
                + "nomecompleto = ? where status = ?,"
                + "endereco = ? where numero = ?,"
                + "bairro = ? where data = ?,"
                + "cep = ? where cidade = ?,"
                + "uf = ? where telefone = ?,"
                + "celular =? where email = ? ";
               
        PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
        ps.setString (1, obj.getCpf());
        ps.setString (2, obj.getNomecompleto());
        ps.setInt    (3, obj.getStatus());
        ps.setString (4, obj.getEndereco());
        ps.setInt    (5, obj.getNumero());
        ps.setString (6, obj.getBairro());
        ps.setString (7, obj.getData());
        ps.setString (8, obj.getCep());
        ps.setString (9, obj.getCidade());
        ps.setInt    (10,obj.getUf());
        ps.setString (11,obj.getTelefone());
        ps.setString (12,obj.getCelular());
        ps.setString(13, obj.getEmail());
        
        int registros = ps.executeUpdate();
        if (registros >0){
            return true;
        }else{
            return false;
        }
}
    public boolean ConfirmarExcluir(String cpf) throws SQLException{
       
    Conexão conectar = new Conexão();               
    String SQL = "DELETE FROM NovoCliente WHERE cpf = ?"; 
    PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
    
    ps.setString(1, cpf);
    int registros = ps.executeUpdate();
    
    if(registros > 0){
    return true;    
    }else{
    return false;    
    }
    
    }
}
