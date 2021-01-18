package Classes;
public class ControleDeAcesso {
private String cpffuncionario;
private String funcionario;
private String email;
private int statusfuncionario;


    public ControleDeAcesso() {
    }

    public ControleDeAcesso(String cpffuncionario, String funcionario, String email, int statusfuncionario) {
        this.cpffuncionario = cpffuncionario;
        this.funcionario = funcionario;
        this.email = email;
        this.statusfuncionario = statusfuncionario;
        
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the statusfuncionario
     */
    public int getStatusfuncionario() {
        return statusfuncionario;
    }

    /**
     * @param statusfuncionario the statusfuncionario to set
     */
    public void setStatusfuncionario(int statusfuncionario) {
        this.statusfuncionario = statusfuncionario;
    }

    /**
     * @return the login
     */
    
}
