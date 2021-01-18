
package Banco;

import Classes.NovoLivro;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosLivro {

    public boolean Salvar(NovoLivro OBJE) throws SQLException {
    Conexão conectar = new Conexão();
    String SQL = "INSERT INTO NovoLivro VALUES (?,?,?,?,?,?,?,?,?,?)";
    
    PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
    
    ps.setString(1, OBJE.getCodigolivro());
    ps.setString(2, OBJE.getTitulo());
    ps.setString(3, OBJE.getClassificacao());
    ps.setInt(4, OBJE.getAnodeedicao());
    ps.setString(5, OBJE.getLancamento());
    ps.setInt(6, OBJE.getNumeropaginas());
    ps.setInt(7, OBJE.getStatuslivros());
    ps.setInt(8, OBJE.getEditora());
    ps.setInt(9, OBJE.getCategoria());
    ps.setInt(10, OBJE.getAutor());;
    int Registros = ps.executeUpdate();
    
    if(Registros > 0){
       return true;
    }else{
        return false;
    }
    }
      public boolean ALTERAR (NovoLivro OBJE) throws SQLException {
        Conexão conectar = new Conexão();
        String SQL = "UPDATE NovoLivro SET Titulo = ?, Classificacao = ?, Anodeedicao = ?, Lancamento = ?, Numeropaginas = ?, Statuslivros = ?, Editora = ?,"
                +"Categoria = ?, Autor = ? WHERE Codigolivro= ?";
        PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
   
    ps.setString(1, OBJE.getTitulo());
    ps.setString(2, OBJE.getClassificacao());
    ps.setInt(3, OBJE.getAnodeedicao());
    ps.setString(4, OBJE.getLancamento());
    ps.setInt(5, OBJE.getNumeropaginas());
    ps.setInt(6, OBJE.getStatuslivros());
    ps.setInt(7, OBJE.getEditora());
    ps.setInt(8, OBJE.getCategoria());
    ps.setInt(9, OBJE.getAutor());
    ps.setString(10, OBJE.getCodigolivro());

        int Registros = ps.executeUpdate();
        
        if(Registros > 0){
            return true;
        }else{
            return false;
        }
    }
    }
