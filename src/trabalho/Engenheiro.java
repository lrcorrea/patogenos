/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.io.Serializable;

/**
 *
 * @author poligno
 */
public class Engenheiro extends Trabalhador implements Serializable {
    private String senha;
    
    
    public Engenheiro(String nome, String cpf, int idade, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.senha = senha;
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
