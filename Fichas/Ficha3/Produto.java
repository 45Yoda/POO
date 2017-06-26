package Ficha3;


public class Produto{
    private String code;
    private String nome;
    private double qtStock;
    private double qtMin;
    private double precoC;
    private double precoV;
    
    public Produto(){
        this.code = "";
        this.nome = "";
        this.qtStock = 0;
        this.qtMin = 0;
        this.precoC = 0;
        this.precoV = 0;
    }
    
    public Produto(String code, String nome, double qtS, double qtM, double pC, double pV){
        this.code = code;
        this.nome = nome;
        this.qtStock = qtS;
        this.qtMin = qtM;
        this.precoC = pC;
        this.precoV = pV;
    }
    
    public Produto (Produto p){
        this.code = p.getCode();
        this.nome = p.getNome();
        this.qtStock = p.getStock();
        this.qtMin = p.getMin();
        this.precoC = p.getPrecoC();
        this.precoV = p.getPrecoV();
    }
    
    public String getCode(){return this.code;}
    public String getNome(){return this.nome;}
    public double getStock(){return this.qtStock;}
    public double getMin(){return this.qtMin;}
    public double getPrecoC(){return this.precoC;}
    public double getPrecoV(){return this.precoV;}
    
    public void setCode(String code){this.code = code;}
    public void setNome(String nome){this.nome = nome;}
    public void setStock(double stock){this.qtStock = stock;}
    public void setMin(double min){this.qtMin = min;}
    public void setPrecoC(double precoC){this.precoC = precoC;}
    public void setPrecoV(double precoV){this.precoV = precoV;}
    
    public void modificaStock(int valor){
        this.qtStock += valor;
    }
    
    public void alteraCodigo(String codigo){
        if(codigo.length >=8) this.code = codigo;
    }
    
    public void defineMargemLucro(double percentagem){
        this.precoC *= percentagem;
    }
    
    public void efectuaCompra(double valor){
        this.qtStock -= valor;
    }
    
    public double lucroTotal(){
        return this.qtStock (this.precoV - this.precoC);
    }
    
    public double precoTotal(int encomenda){
        return this.precoV * encomenda;
    }

    public boolean abaixoValor(){
        return (this.qtStock < this.qtMin);
    }

}

