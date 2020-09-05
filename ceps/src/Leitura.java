import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitura {
    ArrayList<DadosC> objCid = new ArrayList();
    ArrayList<DadosL> objLog = new ArrayList();
    String arquivoCid = "../Files/cepcid-demo.csv";
    String arquivoLog = "../Files/ceplog-demo.csv";

    public void printLog(){
        
         for(int i=0; i<objCid.size();i++){
            System.out.println(objLog.get(i).print());
        }
    }
    
    public void leLog() {

        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";
        
        try {

            br = new BufferedReader(new FileReader(arquivoLog));
            linha = br.readLine();
            while(linha!=null){
              String[] dados = linha.split(csvDivisor);
              System.out.println("CEP: "+dados[0]+"\n"+"Lados: "+dados[9]);
              objLog.add(new DadosL(dados));
              linha = br.readLine();
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
    }
    
    public void printCid(){
        
        for(int i=0; i<objCid.size();i++){
            System.out.println(objCid.get(i).print());
        }
        
    }
    
    public void leCid() {
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";
        
        try {

            br = new BufferedReader(new FileReader(arquivoCid));
            
            linha = br.readLine();
            while(linha!=null){
              String[] dados = linha.split(csvDivisor);
              System.out.println("UF: "+dados[0]+"\n"+"IBGE: "+dados[9]);
              objCid.add(new DadosC(dados));
              linha = br.readLine();
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
    }   
}
