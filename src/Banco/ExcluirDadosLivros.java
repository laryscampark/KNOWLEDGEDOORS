package Banco;

import Classes.NovoLivro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExcluirDadosLivros {

    public NovoLivro PesquisarExcluirLivro (String Codigolivro) throws SQLException{
    
    NovoLivro OBJE = null;
    Conexão conectar = new Conexão();
    String SQL = "SELECT * FROM NovoLivro WHERE codigolivro = ?";
        
    PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
    ps.setString(1, Codigolivro);
    ResultSet Resultados = ps.executeQuery();
      
    if(Resultados.next()){
        OBJE = new NovoLivro();
        OBJE.setCodigolivro(Resultados.getString("codigolivro"));
        OBJE.setTitulo(Resultados.getString("Titulo"));
        OBJE.setClassificacao(Resultados.getString("Classificacao"));
        OBJE.setAnodeedicao(Resultados.getInt("AnoDeEdicao"));
        OBJE.setLancamento(Resultados.getString("Lancamento"));
        OBJE.setNumeropaginas(Resultados.getInt("NumeroPaginas"));
        OBJE.setStatuslivros(Resultados.getInt("StatusLivros"));
        OBJE.setEditora(Resultados.getInt("Editora"));
        OBJE.setCategoria(Resultados.getInt("Categoria"));
        OBJE.setAutor(Resultados.getInt("Autor"));
    }
    
    return OBJE;
    
    }
  public boolean ConfirmarExcluirLivro (String codigolivro) throws SQLException{
      
      Conexão conectar = new Conexão();
      String SQL = "DELETE FROM NovoLivro WHERE codigolivro = ?";
      PreparedStatement ps = conectar.Getconexão().prepareStatement(SQL);
      
      ps.setString(1, codigolivro);
      int Registros = ps.executeUpdate();
      
      if(Registros > 0){
          return true;
      }else{
          return false;
      }
  }
    
}
