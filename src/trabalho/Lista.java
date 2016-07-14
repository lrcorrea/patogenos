package trabalho;

import java.io.*;
import java.util.ArrayList;
//import java.util.Scanner;

public class Lista implements Serializable {
    private ArrayList<Trabalhador> lista = new ArrayList<Trabalhador>();
    private ArrayList<String> tipos = new ArrayList();
    
    public void salvarLista(Trabalhador l, String tipo){
        this.lista.add(l);
        this.tipos.add(tipo);
    }
    public ArrayList<Trabalhador> getLista(){
        return this.lista;
    }
}
