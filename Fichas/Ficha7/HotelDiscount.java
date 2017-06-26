package Ficha7;


public class HotelDiscount extends Hotel{
    
    private int ocupacao;
    
    public HotelDiscount(){
        super();
        this.ocupacao = 0;
    }
    
    public HotelDiscount(String codigo, String nome, String localidade, double precoQuarto, int nquartos, int ocup){
        super(codigo,nome,localidade,precoQuarto,nquartos);
        this.ocupacao = ocup;
    }
    
    public HotelDiscount(HotelDiscount hd){
        super(hd);
        this.ocupacao = hd.getOcupacao();
    }
    
    public double precoQuarto(){
        return (super.getPrecoQuarto() * (100-this.ocupacao)) / 100;
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
    
    public boolean equals(Object o){
        if(this==o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        HotelDiscount hd = (HotelDiscount) o;
        return super.equals(hd) && hd.getOcupacao() == ocupacao;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Ocupação: ").append(ocupacao).append("%");
        return sb.toString();
    }
}
