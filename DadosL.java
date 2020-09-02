

public class DadosL
{
   String CEP;
   String chave;
   String UF;
   String tipo;
   String titulo;
   String prep;
   String nome;
   String bairro;
   String bairro2;
   String liminPar;
   String liminfimpa;
   String limsuppar;
   String limsupimpa;
   String flag;
   String lados;
   
public DadosL(String[] dados) 
{
        CEP = dados[0];
        chave= dados[1];
        UF= dados[2];
        tipo= dados[3];
        titulo= dados[4];
        prep= dados[5];
        nome= dados[6];
        bairro= dados[7];
        bairro2= dados[8];
        liminPar= dados[9];
        liminfimpa = dados[10];
        limsuppar= dados[11];
        limsupimpa= dados[12];
        flag= dados[13];
        lados= dados[14];
}
   
public String print(){
    String msg = "========="+this.nome+"========\n"+
                 "CEP: "+this.CEP+"\n"+
                 "Chave: "+this.chave+"\n"+
                 "UF: "+this.UF+"\n"+
                 "Tipo: "+this.tipo+"\n"+
                 "Titulo: "+this.titulo+"\n"+
                 "Preposição: "+this.prep+"\n"+
                 "Bairro1: "+this.bairro+"\n"+
                 "Bairro2: "+this.bairro2+"\n"+
                 "LiminPar: "+this.liminPar+"\n"+
                 "Limin Fim Par: "+this.liminfimpa+"\n"+
                 "Limsuppar: "+this.limsuppar+"\n"+
                 "Supimpa: "+this.limsupimpa+"\n"+
                 "Flag: "+this.flag+"\n"+
                 "Lados: "+this.lados+"\n"+
                 
                 "=======================\n";  
                 
    return msg;
}
}
