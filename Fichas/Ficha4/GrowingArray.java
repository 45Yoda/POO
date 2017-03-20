package Ficha4;
import java.util.Arrays;

public class GrowingArray
{
   private Veiculo[] carros;
   private int size;
   private static final int capacidade_inicial = 100;
   
   public GrowingArray(){
       this(capacidade_inicial);
    }
    
   public GrowingArray(int capacidade){
       this.carros = new Veiculo[capacidade];
       this.size = 0;
    }
   
   public Veiculo get(int indice){
       if (indice < this.size)
            return this.carros[indice].clone();
       else return null;
    }
    
   public int getSize(){return this.size;}
    
   public void add(Veiculo v){
       if (!contains(v) && this.capacidade_inicial < size){
           carros[size++]=v.clone();
    }
   }
   
   public void add(int indice,Veiculo v){
       this.size++;
       carros[this.size]=carros[indice];
       if(!contains(v) && this.capacidade_inicial < size){
           carros[indice] = v.clone();
        }
    }
   //set
    public void set(int indice,Veiculo v){
        carros[indice]=v.clone();
   }
   //remove 
   public Veiculo remove(int indice){
       Veiculo t;
       t=carros[indice];
       carros[indice]=carros[size-1];
       carros[size-1]=t;
       size--;
       
       return t;
   }
    
   //remove
   public boolean remove(Veiculo v){
       int i;
       Veiculo t;
       boolean r = false;
       if(!contains(v)){return r;}
       for(i=0;i<size && !r;i++){
           if(carros[i].equals(v)){t=carros[size-1];
                                   carros[size-1]=carros[i];
                                   carros[i]=t;
                                   size--;
                                   r=true;
                                }
       }
       
        return r;
    }
    
   public int size(){
       return this.carros.length;
    }
    
    //ta mal
   public int indexOf(Veiculo v){
       int x = 0;
       for(int i=0;i<carros.length && x==0;i++){
           if(carros[i].equals(v)){x=i;}
        }
        
        return x;
    }
   
    //ta mal
   public boolean contains(Veiculo v){
       int i;
       boolean r=false;
       for(i=0;i<size && !r;i++){
           if(carros[i].equals(v)){r=true;}
        }
       
        return r;
    }
    
   public boolean isEmpty(){
       return carros.equals(null);
    }
    
   private void aumentaArray(int tamanho){
       if(tamanho> 0.8 * this.carros.length){
           int nova_capacidade = (int)(this.carros.length * 2);
           this.carros = Arrays.copyOf(this.carros,nova_capacidade);
       }
    }
    
   //equals
   public boolean equals(Object o){
       if(this==o)return true;
       if(o==null || this.getClass() != o.getClass()) return false;
       else{
           GrowingArray s = (GrowingArray) o;
           return s.getSize()==size;
        }
    }
           
    
   //toString
   public String toString(){
       int i;
       StringBuilder s = new StringBuilder();
       s.append("Size : ").append(size);
       for(i=0;i<size;i++){
            s.append("Carro: ").append(carros[i]);
        }
        
       return s.toString();
    }
    
  
}
