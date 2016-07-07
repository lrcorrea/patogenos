package trabalho;

public class ListaPessoa {
    private String nome = null;
    private String acesso = null;
    private String cpf = null;
    private boolean alerta = false;
    private String mensagem = null;
    public ListaPessoa(String nome, String acesso, String cpf, boolean alerta, String mensagem){
        super();
        this.nome = nome;
        this.acesso = acesso;
        this.cpf = cpf;
        this.alerta = alerta;
        this.mensagem = mensagem;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAcesso(String acesso){
        this.acesso = acesso;
    }

    public String getAcesso(){
        return acesso;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public boolean getAlerta(){
        return alerta;
    }
    public void setAlerta(boolean alerta){
        this.alerta = alerta;
    }

    public String getMensagem(){
        return mensagem;
    }
    public void setAlerta(String mensagem){
        this.mensagem = mensagem;
    }

    public String toString(){
        return this.nome + " / " + "Sexo: " + this.acesso + "\n" + "CPF: "+ this.cpf;
    }
}
