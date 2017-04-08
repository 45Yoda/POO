package Ficha6;
import java.util.Comparator;

public class ComparadorMatricula implements Comparator<Lugar>
{
   public int compare(Lugar l1,Lugar l2){
       return l1.getMat().compareTo(l2.getMat());
    }
}