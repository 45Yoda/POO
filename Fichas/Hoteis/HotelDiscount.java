package Hoteis;

public class HotelDiscount extends Hotel
{
    private int ocupacao;
    
    public HotelDiscount(){
     super();
     this.ocupacao=0;
    }
    
    public HotelDiscount(HotelDiscount c){
        super(c);
        this.ocupacao = c.getOcupacao();
    }
    
    public HotelDiscount(String codigo, String nome, String localidade, double precoQuarto, int nquartos, int ocupacao){
        super(codigo, nome, localidade, precoQuarto, nquartos);
        this.ocupacao = ocupacao;
    }
    
    public double precoQuarto(){
        return (super.getPrecoQuarto() * (100-this.ocupacao))/100;
    }

    public int getOcupacao(){
        return this.ocupacao;
    }
    
    public void setOcupacao(int ocupacao){
        this.ocupacao = ocupacao;
    }
    
    public HotelDiscount clone(){
        return new HotelDiscount(this);
    }
    
    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }
        
        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }
        HotelDiscount o = (HotelDiscount) obj;
        return super.equals(o) && o.getOcupacao() == ocupacao;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Ocupação: ").append(this.ocupacao).append("%");
        return sb.toString();
    }
}