

public class DadosC
{
   String UF;
   String chave;
   String cepmin;
   String cepmax;
   String cidade;
   String cidade2;
   String cod_cidade;
   String tipo;
   String sub;
   String cod_mun;
   
public DadosC(String[] dados) 
{
       UF = dados[0];
       chave = dados[1];
       cepmin = dados[2];
       cepmax = dados[3];
       cidade = dados[4];
       cidade2 = dados[5];
       cod_cidade = dados[6];
       tipo = dados[7];
       sub = dados[8];
       cod_mun = dados[9];
}
   
public String print(){
    String msg = "=======================\n"+
                 "UF: "+this.UF+"\n"+
                 "Chave: "+this.chave+"\n"+
                 "CepMin: "+this.cepmin+"\n"+
                 "CepMax: "+this.cepmax+"\n"+
                 "Nome Cidade: "+this.cidade+"\n"+
                 "Nome Cidade Acento: "+this.cidade2+"\n"+
                 "Cod Cidade: "+this.cod_cidade+"\n"+
                 "Tipo Cidade: "+this.tipo+"\n"+
                 "Subordinado a: "+this.sub+"\n"+
                 "IBGE: "+this.cod_mun+"\n"+
                 "=======================\n";  
                 
    return msg;
}
}
