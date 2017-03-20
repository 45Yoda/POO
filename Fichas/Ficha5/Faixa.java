package Ficha5;

public class Faixa
{
 private String autor;
 private String nome;
 private double duracao;
 private int classificacao;
 
 
 public Faixa(String aut, String name, double dur,int classif){
     this.autor = aut;
     this.nome = name;
     this.duracao = dur;
     this.classificacao = classif;
 }
 
 public Faixa(){
    this.nome = "";
    this.autor = "";
    this.duracao = 0;
    this.classificacao = 0;
    }
    
 public Faixa(Faixa f){
    this.nome = f.getNome();
    this.autor= f.getAutor();
    this.duracao = f.getDuracao();
    this.classificacao = f.getClassificacao();
    }
  
 public String getNome(){return this.nome;}
 public String getAutor(){return this.autor;}
 public double getDuracao(){return this.duracao;}
 public int getClassificacao(){return this.classificacao;}
 
 public void setNome(String nome){this.nome=nome;}
 public void setAutor(String autor){this.autor=autor;}
 public void setDuracao(double duracao){this.duracao=duracao;}
 public void setClassificacao(int classificacao){this.classificacao=classificacao;}

 public boolean equals(Object o){
     if(this==o) return true;
     if(o==null || o.getClass()!= this.getClass()) return false;
     else{
         Faixa f = (Faixa) o;
         return (f.getNome().equals(nome) && f.getAutor().equals(autor) &&
                 f.getDuracao() == duracao && f.getClassificacao() == classificacao);
     }
 }
 
 public Faixa clone(){
     return new Faixa(this);
    }
 
 public String toString(){
     return nome+"( "+autor+"): "+classificacao+ "* ["+duracao+"m]";
    }
}
