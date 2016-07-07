package trabalho;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Interface {
    private ArrayList<String> tabela = new ArrayList();
    private Processamento processamento = new Processamento();
    public void menu(){
        
        LeiaCSV obj = new LeiaCSV();
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
        }
        
        ListaPessoa test = new ListaPessoa("Lucas", "administrador", "998877665544", false, "");
    }
}
