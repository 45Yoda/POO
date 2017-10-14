package Ficha7;

public class HotelStandard extends Hotel implements CartaoPontos{
    
    private boolean epocaAlta;
    private int pontos;
    
    public HotelStandard(){
        super();
        epocaAlta = false;
    }
    
    public HotelStandard(String codigo, String nome, String localidade, double precoQuarto, int nquartos, boolean epocaAlta){
        super(codigo,nome,localidade,precoQuarto,nquartos);
        this.epocaAlta = epocaAlta;
    }
    
    public HotelStandard(HotelStandard hs){
        super(hs);
        this.epocaAlta = hs.getEpocaAlta();
    }
    
   
    public double precoQuarto(){
        return super.getPrecoQuarto() + (epocaAlta?20:0);
    }
    
    public boolean getEpocaAlta(){
        return this.epocaAlta;
    }
    
    public void setEpocaAlta(boolean epocaAlta){
        this.epocaAlta = epocaAlta;
    }
    
    public HotelStandard clone(){
        return new HotelStandard(this);
    }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        HotelStandard hs = (HotelStandard) o;
        return super.equals(hs) && hs.getEpocaAlta() == epocaAlta;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Preço final: ").append(precoQuarto()).append("€");
        return sb.toString();
    }
    
    public void setPontosEuro(int pontos){
        this.pontos = pontos;
    }
    
    public int getPontosEuro(){
        return this.pontos;
    }
}
