package Hoteis;

import java.util.Comparator;
import java.io.Serializable;

public class ComparadorTamanho implements Comparator<Hotel>, Serializable {
    
    public int compare(Hotel h1, Hotel h2){
        if(h1.getNumeroQuartos() == h2.getNumeroQuartos()) return h1.getNome().compareTo(h2.getNome()); // caso o tamanho igual compara pelo nome;
        else if(h1.getNumeroQuartos() > h2.getNumeroQuartos()) return -1;
        else return 1;
    }
    
    
}
