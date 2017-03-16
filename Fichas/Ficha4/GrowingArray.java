package Ficha4;
import java.util.Arrays;

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
    
   public void add(Veiculo v){
       if (!contains(v) && this.capacidade_inicial < size){
           elemento[size++]=v.clone();
    }
   }
   
   public void add(int indice,Veiculo v){
       this.size++;
       elemento[this.size]=elemento[indice];
       if(!contains(v) && this.capacidade_inicial < size){
           elemento[indice] = v.clone();
        }
    }
   //set
    public void set(int indice,Veiculo v){
   
   }
   //remove 
   //public Veiculo remove(int indice){
   // }
    
   //remove
   public boolean remove(Veiculo v){
    }
    
   public int size(){
       return this.elemento.length;
    }
    
   public int indexOf(Veiculo v){
       int x = 0;
       for(int i=0;i<elemento.length && x==0;i++){
           if(elemento[i].equals(v)){x=i;}
        }
        
        return x;
    }
   
   public boolean contains(Veiculo v){
       int i;
       boolean r=false;
       for(i=0;i<size && !r;i++){
           if(elemento[i].equals(v)){r=true;}
        }
       
        return r;
    }
    
   public boolean isEmpty(){
       return elemento.equals(null);
    }
    
   private void aumentaArray(int tamanho){
       if(tamanho> 0.8 * this.elemento.length){
           int nova_capacidade = (int)(this.elemento.length * 2);
           this.elemento = Arrays.copyOf(this.elemento,nova_capacidade);
       }
    }
}
