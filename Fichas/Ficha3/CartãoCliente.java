package Ficha3;


/**
 * Write a description of class CartãoCliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CartãoCliente
{
    private int pts;
    private int val;
    private String code;
    private String nome;
    private int valBon;
    
      //Construtores
    
    public CartãoCliente(int pontos, int valor, String codigo, String nome, int valorBonus){
        this.pts=pontos;
        this.val=valor;
        this.code=codigo;
        this.nome=nome;
        this.valBon=valorBonus;
    }
    
    public CartãoCliente(){
        this.pts=0;
        this.val=0;
        this.code="";
        this.nome="";
        this.valBon=0;
    }
    
    public CartãoCliente(CartãoCliente c){
        this.pts = c.getPts();
        this.val = c.getVal();
        this.code = c.getCode();
        this.nome = c.getNome();
        this.valBon = c.getValBon();
    }
    
    
    //gets e sets
    public int getPts(){return pts;}
    public int getVal(){return val;}
    public String getCode(){return code;}
    public String getNome(){return nome;}
    public int getValBon(){return valBon;}
    
    public void setPts(int pts){this.pts=pts;}
    public void setVal(int val){this.val=val;}
    public void setCode(String code){this.code=code;}
    public void setNome(String nome){this.nome=nome;}
    public void setValBon(int valBon){this.valBon=valBon;}
   
    public void descontar(int menu){
        if(menu==1){this.pts -=10;}
        else if(menu==2){this.pts -=20;}

    }
    
    public void descarregarPontos(CartãoCliente cartao){
        pts = cartao.pts;
    }
    
    public void efectuarCompra (double valor){
        val += valor;
    }
}
