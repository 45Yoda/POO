package Ficha5;

public class Faixa{
    private String autor;
    private String nome;
    private double duracao;
    private int classificacao;
    
    public Faixa(){
        this.autor = "";
        this.nome = "";
        this.duracao = 0;
        this.classificacao = 0;
    }
    
    public Faixa(String autor,String nome, double duracao,int classificacao){
        this.autor = autor;
        this.nome = nome;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }
    
    public Faixa(Faixa f){
        this.autor = f.getAutor();
        this.nome = f.getNome();
        this.duracao = f.getDuracao();
        this.classificacao = f.getClassif();
    }
    
    public String getAutor(){ return this.autor; }
    public String getNome(){ return this.nome; }
    public double getDuracao(){ return this.duracao; }
    public int getClassif(){ return this.classificacao;}
    
    public void setAutor(String autor){this.autor = autor;}
    public void setNome(String nome){this.nome = nome;}
    public void setDuracao(double duracao){this.duracao = duracao;}
    public void setClassif(int classificacao){this.classificacao = classificacao;}
    
    public Faixa clone(){
        return new Faixa(this);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do autor: ").append(autor).append("\n");
        sb.append("Nome da faixa: ").append(nome).append("\n");
        sb.append("Duração da faixa: ").append(duracao).append("\n");
        sb.append("Classificação da faixa: ").append(classificacao).append("\n");
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Faixa f = (Faixa) o;
        return f.getAutor().equals(autor) &&
               f.getNome().equals(nome) &&
               f.getDuracao() == (duracao) &&
               f.getClassif() == (classificacao);
        
    }
}
