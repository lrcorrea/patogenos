package trabalho;

import java.io.Serializable;

public abstract class Trabalhador implements Serializable {
     protected String nome;
     protected String cpf;
     protected int idade;
     protected String login;
     protected String senha;  
     protected String acesso;  
     protected boolean pulverizado; 
     
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setLogin(String senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPulverizado(boolean pulverizado) {
        this.pulverizado = pulverizado;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getLogin() {
        return login;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getAcesso() {
        return acesso;
    }
    
    public boolean getPulverizado() {
        return pulverizado;
    }
}
