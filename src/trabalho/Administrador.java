/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.logging.Logger;

public class Administrador extends Trabalhador {
    
    public Administrador(String nome, String cpf, int idade,String login,String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.login=login;
        this.senha=senha;
        this.acesso = "Administrador";
    }
    
    public Administrador(){}

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String getSenha() {
        return senha;
    }
    
    
    
}
