package trabalho;
import java.io.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Interface {
    Scanner scan = new Scanner(System.in);
    private ArrayList<String> tabela = new ArrayList();
    private ArrayList<Trabalhador> listaPessoas = new ArrayList<Trabalhador>();
    private Processamento processamento = new Processamento();
    
    public void menu(){
        
        /*LeiaCSV obj = new LeiaCSV();
        tabela = obj.run();
        for (String s : tabela) {
            String[] exploded = s.split(",");
            Double temp = Double.parseDouble(exploded[2]);
            Double chuva = Double.parseDouble(exploded[3]);
            Double mFoliar = Double.parseDouble(exploded[4]);
            int callAlert = processamento.procData(chuva, mFoliar, temp);
            if(callAlert==1){
                String hra = exploded[1];
                String dia = exploded[0];
                System.out.println("dia: "+dia+" - hora: "+hra);
            }
        }*/
        
        
        
        
        
        Lista lista = new Lista();
        Persistencia persistencia = new Persistencia();
        
        //Trabalhador t; String nome; String cpf; int idade; String senha;
        
        /*System.out.println("Digite o nome do trabalhador");
        String nome=scan.nextLine();
        
        System.out.println("Digite o CPF");
        String cpf=scan.nextLine();
        
        System.out.println("Digite a idade");
        int idade=(Integer.parseInt(scan.nextLine()));
        
        System.out.println("Digite a senha");
        String senha=scan.nextLine();
        
        System.out.println("Digite a função do trabalhador que desejas incluir: Engenheiro ou Administrador.");
        String trab=scan.nextLine();*/
        
        //testando somente os engenheiros
        Engenheiro temp = new Engenheiro("Lucas", "123345", 12, "123");
        lista.salvarLista(temp, "eng");
        
        temp = new Engenheiro("Lucas2", "6165", 11, "654");
        lista.salvarLista(temp, "eng");
        
        temp = new Engenheiro("Lucas3", "123345", 14, "648");
        lista.salvarLista(temp, "eng");
        
        temp = new Engenheiro("Lucas4", "123345", 17, "684684");
        lista.salvarLista(temp, "eng");
        
        listaPessoas = lista.getLista();
        
        /*for (Trabalhador s : listaPessoas) {
            System.out.println("Classe: "+s.getNome());
        }*/
        
        
        Login login = new Login("Lucas4", "684684");
        boolean isAuth = login.auth();
        System.out.println("retorno isAuth: "+isAuth);
        //persistencia.salvarEmArquivo(temp);
        
        
        
        
        
        //Lista l = new Lista(50);//apagar essa linha, é so um teste pra recuperar o objeto sem salvar um novo
        /*Trabalhador test = persistencia.recuperaLista();
        System.out.println(test.getNome());
        System.out.println(test.getIdade());
        System.out.println(test.getCpf());
        System.out.println(test.getSenha());*/
    }

}