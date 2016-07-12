package trabalho;

import java.io.Serializable;

public abstract class Trabalhador implements Serializable {
     protected String nome;
     protected String cpf;
     protected int idade;
     protected String senha;   

    public void setNome(String nome) {
        this.nome = nome;
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
    
    public String getNome() {
        return nome;
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
     
     
}
