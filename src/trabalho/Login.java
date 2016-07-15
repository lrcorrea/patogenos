package trabalho;

import java.util.ArrayList;

public class Login {
    private String login = null;
    private String senha = null;
    Lista lista = new Lista();
    
    public Login(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public boolean auth(ArrayList<Trabalhador> listaPessoas){
        for (Trabalhador s : listaPessoas) {
            if(s.getSenha().equals(this.senha) && s.getLogin().equals(this.login)){
                //this.tipo = s.getAcesso();
                //return s.getAcesso();
                return true;
            }
        }
        //return "";
        return false;
    }
}