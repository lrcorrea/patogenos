package trabalho;

import java.io.*;
//import java.util.Scanner;

public class Lista implements Serializable {
    
    //Scanner scan = new Scanner(System.in);
    private int tamanho;
    private Trabalhador[] t;

    
    
    public Lista(int tamanho){
        this.tamanho=tamanho;
        this.t=new Trabalhador[this.tamanho];
    }

    public void salvarEmArquivo(Trabalhador l){
        try
        {
            System.err.print(l.getNome());
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
    
    public Trabalhador recuperaLista()
    {
        Engenheiro lista = new Engenheiro();
        try
        {
            FileInputStream fis = new FileInputStream("arq.obj");
            ObjectInputStream leitor = new ObjectInputStream(fis);
            lista = (Engenheiro) leitor.readObject();
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
