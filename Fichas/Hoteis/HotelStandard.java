package Hoteis;
public class HotelStandard extends Hotel implements CartaoPontos{

    private boolean epocaAlta;
    private int pontos;
    
    public HotelStandard() {
        super();
        epocaAlta = false;
    }

    public HotelStandard(HotelStandard c) {
        super(c);
        this.epocaAlta = c.getEpocaAlta();
    }
    
   
    public HotelStandard(String codigo, String nome, String localidade
                        , double precoQuarto, boolean epocaAlta, int nquartos) {
        super(codigo, nome, localidade, precoQuarto, nquartos);
        this.epocaAlta = epocaAlta;
    }
    
    public double precoQuarto() {
        return super.getPrecoQuarto() + (epocaAlta?20:0);
    }
    
    public boolean getEpocaAlta() {
        return epocaAlta;
    }

    public void setEpocaAlta(boolean epocaAlta) {
        this.epocaAlta = epocaAlta;
    }
    
    public HotelStandard clone() {
        return new HotelStandard(this);
    }

    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        HotelStandard o = (HotelStandard) obj;
        return super.equals(o) && o.getEpocaAlta() == epocaAlta;
    }

    public String toString() {
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