package trabalho;

import java.io.*;
import java.util.ArrayList;
//import java.util.Scanner;

public class Lista implements Serializable {
    private ArrayList<Trabalhador> lista = new ArrayList<Trabalhador>();
    private ArrayList<String> tipos = new ArrayList();
    
    public void salvarLista(Trabalhador l){
        this.lista.add(l);
    }
    public void salvarLista(ArrayList<Trabalhador> l, String type){
        for (Trabalhador trabalhador : l) {
            this.lista.add(trabalhador);
        }
    }
    public ArrayList<Trabalhador> getLista(){
        return this.lista;
    }
}
