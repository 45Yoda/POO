package Hoteis;

import java.util.Comparator;
import java.io.Serializable;

public class ComparadorNome implements Comparator<Hotel>, Serializable{

     public int compare(Hotel h1, Hotel h2){
         return h1.getNome().compareTo(h2.getNome());
     }
}