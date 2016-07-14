/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Persistencia {
    public void salvarEmArquivo(ArrayList<Trabalhador> l){
        try
        {
            FileOutputStream fos = new FileOutputStream("arq.obj");
            ObjectOutputStream escreve = new ObjectOutputStream(fos);
            escreve.writeObject(l);
            escreve.close();
        }
        catch(IOException e)
        {
            System.out.println("erro de IO");
        }
    }
    
    public ArrayList<Trabalhador> recuperaLista()
    {
        ArrayList<Trabalhador> lista = new ArrayList<Trabalhador>();
        try
        {
            FileInputStream fis = new FileInputStream("arq.obj");
            ObjectInputStream leitor = new ObjectInputStream(fis);
            lista = (ArrayList<Trabalhador>) leitor.readObject();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("arquivo nao encontrado");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("erro de IO");
        }
        catch(IOException e)
        {
            System.out.println("erro de IO");
        }
        return  lista;
    }
}
