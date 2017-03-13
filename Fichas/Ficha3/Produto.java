package Ficha3;
import java.lang.*;

public class Produto
{
    private String code;
    private String nome;
    private double qtStock;
    private double qtMin;
    private double pCompra;
    private double pVenda;
    
    public Produto(String codigo, String nome, double quantidadeStock, double quantidadeMin, double precocompra, double precovenda){
        this.code = codigo;
        this.nome = nome;
        this.qtStock = quantidadeStock;
        this.qtMin = quantidadeMin;
        this.pCompra = precocompra;
        this.pVenda = precovenda;
    }
    
    public Produto(){
        this.code = "";
        this.nome = "";
        this.qtStock = 0.0;
        this.qtMin = 0.0;
        this.pCompra = 0.0;
        this.pVenda= 0.0;
    }
    
    public Produto(Produto p){
        this.code = p.getCode();
        this.nome = p.getNome();
        this.qtStock = p.getQtStock();
        this.qtMin = p.getQtMin();
        this.pCompra = p.getPCompra();
        this.pVenda = p.getPVenda();
    }
    
    public String getCode(){return code;}
    public String getNome(){return nome;}
    public double getQtStock(){return qtStock;}
    public double getQtMin(){return qtMin;}
    public double getPCompra(){return pCompra;}
    public double getPVenda(){return pVenda;}
    
    public void setCode(String code){this.code=code;}
    public void setNome(String nome){this.nome=nome;}
    public void setQtStock(double qtStock){this.qtStock=qtStock;}
    public void setQtMin(double qtMin){this.qtMin=qtMin;}
    public void setPCompra(double pCompra){this.pCompra=pCompra;}
    public void setPVenda(double pVenda){if(pVenda < this.pCompra){System.out.println("Erro");}
                                         else{this.pVenda=pVenda;}
    }
    
    public void modificaStock(int valor){
        this.qtStock +=valor;
    }
    
    public void alteraCodigo(String codigo){
        if((codigo.length())<8){System.out.println("O código tem de possuir no mínimo 8 caracteres\n");}
        else{ this.code = codigo;}
    }
    
    public void defineMargemLucro(double percentagem){
        pCompra *= percentagem;
    }
    
    public void efectuaCompra(double valor){
        qtStock -= valor;
    }
    
    public double lucroTotal(){
        return qtStock *(pVenda - pCompra);
    }
    
    public double precoTotal(int encomenda){
        return encomenda*pVenda;
    }
    
    public boolean abaixoValor(){
        return qtStock < qtMin;
    }
}
