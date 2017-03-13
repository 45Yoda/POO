package Ficha4;


public class GrowingArray
{
   private Veiculo[] elemento;
   private int size;
   private static final int capacidade_inicial = 100;
   
   public GrowingArray(){
       this(capacidade_inicial);
    }
    
   public GrowingArray(int capacidade){
       this.elemento = new Veiculo[capacidade];
       this.size = 0;
    }
   
   public Veiculo get(int indice){
       if (indice < this.size)
            return this.elemento[indice].clone();
       else return null;
    }
    
}
