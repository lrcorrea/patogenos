package trabalho;

import java.io.Serializable;

public class Engenheiro extends Trabalhador implements Serializable {
    private Alerta alerta;
    
    
    public Engenheiro(String nome, String cpf, int idade,String login,String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.login = login;
        this.senha = senha;
        this.acesso = "Engenheiro";
    }
    public Engenheiro(){}

    @Override
    public String getSenha() {
        return senha;
    }
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
