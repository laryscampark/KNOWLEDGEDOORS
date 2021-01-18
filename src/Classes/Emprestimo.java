package Classes;
public class Emprestimo {
    
private String codigoemprestimo;
private String codigolivro;
private String titulo;
private String classificacao;
private String cpffuncionario;
private String funcionario;
private String cpf;
private String nomecompleto;
private int statusemprestimo;
private String dataemprestimo;
private String datadadevolucao;

    public Emprestimo() {
    }

    public Emprestimo(String codigoemprestimo, String codigolivro, String titulo, String classificacao, String cpffuncionario, String funcionario, String cpf, String nomecompleto, int statusemprestimo, String dataemprestimo, String datadadevolucao) {
        this.codigoemprestimo = codigoemprestimo;
        this.codigolivro = codigolivro;
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.cpffuncionario = cpffuncionario;
        this.funcionario = funcionario;
        this.cpf = cpf;
        this.nomecompleto = nomecompleto;
        this.statusemprestimo = statusemprestimo;
        this.dataemprestimo = dataemprestimo;
        this.datadadevolucao = datadadevolucao;
    }

    /**
     * @return the codigoemprestimo
     */
    public String getCodigoemprestimo() {
        return codigoemprestimo;
    }

    /**
     * @param codigoemprestimo the codigoemprestimo to set
     */
    public void setCodigoemprestimo(String codigoemprestimo) {
        this.codigoemprestimo = codigoemprestimo;
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
     * @return the cpffuncionario
     */
    public String getCpffuncionario() {
        return cpffuncionario;
    }

    /**
     * @param cpffuncionario the cpffuncionario to set
     */
    public void setCpffuncionario(String cpffuncionario) {
        this.cpffuncionario = cpffuncionario;
    }

    /**
     * @return the funcionario
     */
    public String getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nomecompleto
     */
    public String getNomecompleto() {
        return nomecompleto;
    }

    /**
     * @param nomecompleto the nomecompleto to set
     */
    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    /**
     * @return the statusemprestimo
     */
    public int getStatusemprestimo() {
        return statusemprestimo;
    }

    /**
     * @param statusemprestimo the statusemprestimo to set
     */
    public void setStatusemprestimo(int statusemprestimo) {
        this.statusemprestimo = statusemprestimo;
    }

    /**
     * @return the dataemprestimo
     */
    public String getDataemprestimo() {
        return dataemprestimo;
    }

    /**
     * @param dataemprestimo the dataemprestimo to set
     */
    public void setDataemprestimo(String dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }

    /**
     * @return the datadadevolucao
     */
    public String getDatadadevolucao() {
        return datadadevolucao;
    }

    /**
     * @param datadadevolucao the datadadevolucao to set
     */
    public void setDatadadevolucao(String datadadevolucao) {
        this.datadadevolucao = datadadevolucao;
    }
    
}
