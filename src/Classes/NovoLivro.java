package Classes;
public class NovoLivro {
    
  private String codigolivro;
  private String titulo;
  private String classificacao;
  private int anodeedicao;
  private String lancamento;
  private int numeropaginas;
  private int statuslivros; 
  private int editora;
  private int categoria;
  private int autor;

    public NovoLivro() {
    }

    public NovoLivro(String codigolivro, String titulo, String classificacao, int anodeedicao, String lancamento, int numeropaginas, int statuslivros, int editora, int categoria, int autor) {
        this.codigolivro = codigolivro;
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.anodeedicao = anodeedicao;
        this.lancamento = lancamento;
        this.numeropaginas = numeropaginas;
        this.statuslivros = statuslivros;
        this.editora = editora;
        this.categoria = categoria;
        this.autor = autor;
    }

    /**
     * @return the codigolivro
     */
    public String getCodigolivro() {
        return codigolivro;
    }

    /**
     * @param codigolivro the codigolivro to set
     */
    public void setCodigolivro(String codigolivro) {
        this.codigolivro = codigolivro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the classificacao
     */
    public String getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @return the anodeedicao
     */
    public int getAnodeedicao() {
        return anodeedicao;
    }

    /**
     * @param anodeedicao the anodeedicao to set
     */
    public void setAnodeedicao(int anodeedicao) {
        this.anodeedicao = anodeedicao;
    }

    /**
     * @return the lancamento
     */
    public String getLancamento() {
        return lancamento;
    }

    /**
     * @param lancamento the lancamento to set
     */
    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    /**
     * @return the numeropaginas
     */
    public int getNumeropaginas() {
        return numeropaginas;
    }

    /**
     * @param numeropaginas the numeropaginas to set
     */
    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    /**
     * @return the statuslivros
     */
    public int getStatuslivros() {
        return statuslivros;
    }

    /**
     * @param statuslivros the statuslivros to set
     */
    public void setStatuslivros(int statuslivros) {
        this.statuslivros = statuslivros;
    }

    /**
     * @return the editora
     */
    public int getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(int editora) {
        this.editora = editora;
    }

    /**
     * @return the categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the autor
     */
    public int getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(int autor) {
        this.autor = autor;
    }
    
}
