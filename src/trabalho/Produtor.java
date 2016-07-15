package trabalho;

public class Produtor extends Trabalhador{
    private Alerta alerta;
    private String senha;
    private boolean hasAlert;
    
    public Produtor(String nome, String cpf, int idade,String login, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.senha = login;
        this.senha = senha;
        this.acesso = "Produtor";
    }
    public Produtor(){}

    public boolean getHasAlert() {
        return hasAlert;
    }
    public void setHasAlert(boolean alert) {
        this.hasAlert = alert;
    }
    
    @Override
    public String getSenha() {
        return senha;
    }
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
