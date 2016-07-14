package trabalho;

import java.util.ArrayList;

public class Login {
    private String login = null;
    private String senha = null;
    private ArrayList<Trabalhador> listaPessoas = new ArrayList<Trabalhador>();
    Lista lista = new Lista();
    
    public Login(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public boolean auth(){
        System.out.println("entra no auth");
        listaPessoas = lista.getLista();
        System.err.println("pega lista "+ listaPessoas);
        for (Trabalhador s : listaPessoas) {
            System.out.println("teste senha: "+s.getSenha()+" == "+this.senha);
            if(s.getSenha() == this.senha){
                System.out.println("Senha bate");
                return true;
            }
        }
        return false;
    }
}
