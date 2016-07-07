package trabalho;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Interface {
    private ArrayList<String> tabela = new ArrayList();
    private Processamento processamento = new Processamento();
    private String[] infBack = null;
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
                System.out.println("Chama alerta, passou de 100 pontos");
                String hra = exploded[1];
                String dia = exploded[0];
                System.out.println("dia: "+dia+" - hora: "+hra);
            }
        }
    }
}
