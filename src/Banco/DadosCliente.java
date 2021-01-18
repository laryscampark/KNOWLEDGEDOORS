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

public class DadosCliente {

    public boolean Salvar(NovoCliente obj)throws SQLException {
        
       Conexão conectar = new Conexão();
       String SQL ="INSERT INTO NovoCliente VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
       // Sintax ???? = corresponde as informação que serao enviadas
       PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);

        ps.setString(1, obj.getCpf());
        ps.setString(2, obj.getNomecompleto());
        ps.setInt   (3, obj.getStatus());
        ps.setString(4, obj.getEndereco());
        ps.setInt   (5, obj.getNumero());
        ps.setString(6, obj.getBairro());
        ps.setString(7, obj.getData());
        ps.setString(8, obj.getCep());
        ps.setString(9, obj.getCidade());
        ps.setInt   (10,obj.getUf());
        ps.setString(11,obj.getTelefone());
        ps.setString(12,obj.getCelular());
        ps.setString(13,obj.getEmail());
        
       int Registros = ps.executeUpdate();
        
        if(Registros > 0){
            return true;
        }else{
            return false;
       }
    }
      
    public NovoCliente BUSCAR(String cpf) throws SQLException {
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
        //obj.setNomedoCampo(VariavelInstanciada.getTipodeDados(NomedoCampoNoBanco));
        
                
        // acrescentar os outros itens
    }                
    return obj;    
      
}    
    
    public boolean ALTERAR(NovoCliente obj) throws SQLException {
        Conexão conectar = new Conexão();
        String SQL = "UPDATE NovoCliente SET Nomecompleto = ?, Status = ?, Endereco = ?, Numero = ?, Bairro = ?, Data = ?, Cep = ?,"
                + "Cidade = ?, Uf = ?, Telefone = ?, Celular = ?, Email =? WHERE Cpf= ?";
        PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);

       
        ps.setString(1, obj.getNomecompleto());
        ps.setInt   (2, obj.getStatus());
        ps.setString(3, obj.getEndereco());
        ps.setInt   (4, obj.getNumero());
        ps.setString(5, obj.getBairro());
        ps.setString(6, obj.getData());
        ps.setString(7, obj.getCep());
        ps.setString(8, obj.getCidade());
        ps.setInt   (9,obj.getUf());
        ps.setString(10,obj.getTelefone());
        ps.setString(11,obj.getCelular());
        ps.setString(12,obj.getEmail());
         ps.setString(13, obj.getCpf());

        int Registros = ps.executeUpdate();
        
        if(Registros > 0){
            return true;
        }else{
            return false;
        }
    }
    
}

