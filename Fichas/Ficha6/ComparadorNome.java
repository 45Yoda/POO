package Ficha6;
import java.util.Comparator;

public class ComparadorNome implements Comparator<Lugar>
{
   public int compare(Lugar l1,Lugar l2){
       return l1.getNome().compareTo(l2.getNome());
    }
}