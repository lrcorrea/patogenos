package trabalho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeiaCSV {

    public ArrayList<String> run() {
    //public String[] run() {

        String arquivoCSV = "C:/Users/Lucas/Documents/NetBeansProjects/trabalho/src/trabalho/arq/tabela.csv";
        BufferedReader br = null;
        String linha = "";
        ArrayList<String> tabela = new ArrayList();
        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {
                if(linha != ",,,," && linha.length()>5){
                    tabela.add(linha);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return tabela;
    }
}