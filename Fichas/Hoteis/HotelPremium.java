package Hoteis;

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
   
  public HotelPremium(String codigo, String nome, String localidade, double precoQuarto, double taxa, int nquartos){
      super(codigo, nome, localidade, precoQuarto, nquartos);
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
  
  public boolean equals(Object obj){
      if(obj == this){
          return true;
      }
      if(obj == null || obj.getClass() != this.getClass()) {
          return false;
      }
      HotelPremium o = (HotelPremium) obj;
      return super.equals(o) && o.getTaxa() == taxa;
  }
  
  public String toString(){
      StringBuilder sb = new StringBuilder();
      sb.append(super.toString()).append("\n");
      sb.append("Taxa: ").append(taxa).append("%");
      return sb.toString();
  }
  
  public void setPontosEuro(int pontos){
      this.pontos = pontos;
  }
  
  public int getPontosEuro(){
      return this.pontos;
  }
}
