package Ficha7;


public class HotelPremium extends Hotel implements CartaoPontos{
    
    private double taxa;
    private int pontos;
    
    public HotelPremium(){
        super();
        taxa = 1;
    }
    
    public HotelPremium(HotelPremium c){
        super(c);
        this.taxa = c.getTaxa();
    }
    
    public HotelPremium(String codigo, String nome, String localidade, double precoQuarto, int nquartos, double taxa){
        super(codigo,nome,localidade,precoQuarto,nquartos);
        this.taxa = taxa;
    }
    
    public double precoQuarto(){
        return super.getPrecoQuarto()*taxa;
    }
    
    public double getTaxa(){
        return taxa;
    }
    
    public void setTaxa(double taxa){
        this.taxa = taxa;
    }
    
    public HotelPremium clone(){
        return new HotelPremium(this);
    }
    
    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        HotelPremium hp = (HotelPremium) o;
        return super.equals(hp) && hp.getTaxa() == taxa;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Taxa: ").append(taxa).append("%").append("\n");
        return sb.toString();
    }
    
    public void setPontosEuro(int pontos){
        this.pontos = pontos;
    }
    
    public int getPontosEuro(){
        return this.pontos;
    }
}
