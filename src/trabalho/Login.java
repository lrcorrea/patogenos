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
            System.out.println("teste senha: "+s.getSenha()+" == "+this.senha);
            if(s.getSenha() == this.senha && s.getNome() == this.login){
                return true;
            }
        }
        return false;
    }
}
