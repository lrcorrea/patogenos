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
        /*
        //LE A TABELA
        /*LeiaCSV obj = new LeiaCSV();
        tabela = obj.run();
        for (String s : tabela) {
        //QUEBRO A A LINHA DA TABELA QUE É UM ARRAYLIST
        //EXEMPLO: "13/7/2016,2,8,4" 
        //QUEBRO E MANDO OS DADOS PRO METODO QUE PROCESSARÁ OS DADOS
            String[] exploded = s.split(",");
            Double temp = Double.parseDouble(exploded[2]);
            Double chuva = Double.parseDouble(exploded[3]);
            Double mFoliar = Double.parseDouble(exploded[4]);
            int callAlert = processamento.procData(chuva, mFoliar, temp);
            //SE RETORNAR 1 SIGNIFICA Q ATINGIU 100 PTS
            if(callAlert==1){
            //QUEBRO A STRING PRA PEGAR SÓ A DATA E HORA
                String hra = exploded[1];
                String dia = exploded[0];
                System.out.println("dia: "+dia+" - hora: "+hra);
            }
        }*/
        
        
        
        
        //INSTANCIO A CLASSE LISTA
        //Lista lista = new Lista();
        
        
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
        
        //FAÇO TESTE SALVANDO EM UMA VAR TEMPORARIA O OBJETO PRA MANDAR PRA CLASSE QUE VAI SALVAR ESSE OBJETO
        //TEMPORARIO NA LISTA
        
        
        /*Engenheiro temp = new Engenheiro("Lucas", "123345", 12, "123");
        lista.salvarLista(temp, "eng");
        
        temp = new Engenheiro("Lucas2", "6165", 11, "654");
        lista.salvarLista(temp, "eng");
        
        temp = new Engenheiro("Lucas3", "123345", 14, "648");
        lista.salvarLista(temp, "eng");
        
        temp = new Engenheiro("Lucas4", "123345", 17, "684684");
        lista.salvarLista(temp, "eng");
        
        //AQUI EU CARREGO A LISTA ONDE TÁ SALVO OS OBJETOS...
        listaPessoas = lista.getLista();*/
        
        
        //IMPRIMO PARA TESTA A LISTA Q RETORNA
        /*for (Trabalhador s : listaPessoas) {
            //s RECEBE A POSIÇÃO 0 DOS OBJETOS ListaDePessoas
            //COMO SE FOSSE Trabalhador s = new Trabalha...
            //COMO MEUS METODOS ESTAO NESSE OBJETO ELE VAI BUSCAR E IMPRIMIR NO s.getNome mas poderia ser getCpf...
            System.out.println("Classe: "+s.getNome());
        }*/
        
        /*//INSTANCIO E JA SETO A VARIAVEL LOGIN E SENHA
        //Login login = new Login("Lucas4", "684684");
        //MANDO A LISTA COM OS OBJETOS DA LISTA E SE BATER SENHA E LOGIN RETORNA TRUE
        //boolean isAuth = login.auth(listaPessoas);
        //System.out.println("retorno isAuth: "+isAuth);
        
        //INSTANCIO A CLASSE PERSISTENCIA
        Persistencia persistencia = new Persistencia();
        //persistencia.salvarEmArquivo(listaPessoas);
        
        //ListaPessoa é o objeto q ta preparado pra receber o retorno do Persistencia.recuperaLista
        //que é um arraylist do tipo trabalhador
        listaPessoas = persistencia.recuperaLista();
        System.out.println(getClass());
        //Imprimo pra ver se ele trouxe os objetos
        System.out.println(listaPessoas);
        for (Trabalhador s : listaPessoas) {
            //for pra imprimir os objetos trazidos do arquivo "arq.obj"
            System.out.println("Nome: "+s.getNome());
            System.out.println("Idade: "+s.getIdade());
            System.out.println("Cpf: "+s.getCpf());
            System.out.println("Senha: "+s.getSenha());
        }*/
    }
}