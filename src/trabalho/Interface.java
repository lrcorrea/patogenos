package trabalho;
import java.io.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Interface {
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    private ArrayList<String> tabela = new ArrayList();
    private ArrayList<Trabalhador> listaPessoas = new ArrayList<Trabalhador>();
    private Processamento processamento = new Processamento();
    private Persistencia persistencia = new Persistencia();
    public LeiaCSV obj = new LeiaCSV();
    private Lista lista = new Lista();
    private Alerta alerta = new Alerta();
    
    
    public void menu(){

        //RECUPERA O OBJETO SALVO
        listaPessoas = persistencia.recuperaLista();
        lista.salvarLista(listaPessoas, "objeto");
        //apagar
        System.out.println(listaPessoas
        for (Trabalhador s : listaPessoas) {
            //s RECEBE A POSIÇÃO 0 DOS OBJETOS ListaDePessoas
            //COMO SE FOSSE Trabalhador s = new Trabalha...
            //COMO MEUS METODOS ESTAO NESSE OBJETO ELE VAI BUSCAR E IMPRIMIR NO s.getNome mas poderia ser getCpf...
            System.out.println("login: "+s.getLogin());
            System.out.println("senha: "+s.getSenha());
            System.out.println("TIpo: "+s.getAcesso());
            System.out.println("*********");
        }//fim apagar

        int om=1;
        while(om!=0){
            System.out.println("********************");
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Logar");
            System.out.println("2 - Registrar produtor");
            System.out.println("3 - Imprimir lista de produtores");
            System.out.println("0 - Encerrar/Cancelar");
            
            om=scan2.nextInt();
            
            switch(om){
                
                case 1:{
                    boolean isAuth=false;
                    while(isAuth==false){
                        System.out.println("Login:");
                        String nome = scan.nextLine();
                        System.out.println("Senha:");
                        String senha = scan.nextLine();
                        Login login = new Login(nome, senha);
                        isAuth = login.auth(listaPessoas);
                        if (isAuth == false) {
                            System.err.println("Usuário ou senha incorreto! Tente novamente");
                        }
                    }
                    this.produtorMenu();
                    //tipoUsuario = login.getTipo();
                    /*if(isAuth == "Produtor"){
                        this.produtorMenu();
                    }else if(isAuth == "Engenheiro"){
                        this.engMenu();
                    }else if(isAuth == "Administrador"){
                        this.admMenu();
                    }*/
                    
                    
                    break;
                }
            
                case 2:{
                    System.out.println("Digite o Nome");
                    String nome=scan.nextLine();
        
                    System.out.println("Digite o CPF");
                    String cpf=scan.nextLine();
        
                    System.out.println("Digite a idade");
                    int idade=(Integer.parseInt(scan.nextLine()));
                    
                    System.out.println("Digite o login");
                    String login=scan.nextLine();
                    
                    System.out.println("Digite a senha");
                    String senha=scan.nextLine();
                    
                    System.out.println("Digite a função do trabalhador que desejas incluir: Engenheiro ou Administrador.");
                    System.out.println("1 - Engenheiro");
                    System.out.println("2 - Administrador");
                    System.out.println("3 - Produtor");
                    int trab=scan.nextInt();
                    if(trab==1){
                        Trabalhador temp = new Engenheiro(nome, cpf, idade, login, senha);
                        lista.salvarLista(temp);
                    }else if(trab==2){
                        Trabalhador temp = new Administrador(nome, cpf, idade,login,senha);
                        lista.salvarLista(temp);
                    }else if(trab==3){
                        Produtor temp = new Produtor(nome, cpf, idade, login, senha);
                        lista.salvarLista(temp);
                    }
                    System.out.println("Cadastrado com sucesso!");
                    break;
                }
            
                case 3:{
                    

                    break;
                }
                
            }
            
            System.out.println("Deseja mais alguma coisa? Se sim tecle a opção correspondente.");
        }

        System.out.println("Espere um minuto! Salvando dados!");
        //SALVANDO LISTA EM ARQUIVO
        listaPessoas = lista.getLista();
        persistencia.salvarEmArquivo(listaPessoas);
        System.out.println("Pronto!");
    }
    
    public void produtorMenu(){
        int opc=0;
        while(opc <= 0){
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Ler dados da Tabela");
            System.out.println("0 - Encerrar/Cancelar");
            opc = scan.nextInt();
        }
        switch(opc){
            case 1:{
                this.imprimirTabela();
            }
        }
    }
    
    public void engMenu(){
        int opc=0;
        while(opc <= 0){
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Ler dados da Tabela");
            System.out.println("0 - Encerrar/Cancelar");
            opc = scan.nextInt();
        }
        switch(opc){
            case 1:{
                this.imprimirTabela();
            }
        }
    }
    
    public void admMenu(){
        int opc=0;
        while(opc <= 0){
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Ler dados da Tabela");
            System.out.println("0 - Encerrar/Cancelar");
            opc = scan.nextInt();
        }
        switch(opc){
            case 1:{
                this.imprimirTabela();
            }
        }
    }
    
     public void imprimirTabela(){
         tabela = obj.run();
         for (String s : tabela) {
            //QUEBRO A A LINHA DA TABELA QUE É UM ARRAYLIST
            //EXEMPLO: "13/7/2016,2,8,4" 
            //QUEBRO E MANDO OS DADOS PRO METODO QUE PROCESSARÁ OS DADOS
            String[] exploded = s.split(",");
            Double temp = Double.parseDouble(exploded[2]);
            Double chuva = Double.parseDouble(exploded[3]);
            Double mFoliar = Double.parseDouble(exploded[4]);
            System.out.println("Temperatura"+temp);
            System.out.println("Chuva"+chuva);
            System.out.println("M. Foliar"+mFoliar+"\n");
            
            int callAlert = processamento.procData(chuva, mFoliar, temp);
            //SE RETORNAR 1 SIGNIFICA Q ATINGIU 100 PTS
            if(callAlert==1){
            //QUEBRO A STRING PRA PEGAR SÓ A DATA E HORA
                String hra = exploded[1];
                String dia = exploded[0];
                alerta.printAlerta(dia, hra);
            }
        }
    }

    public void printMenuLogin(){
    }
}
