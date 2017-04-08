package Ficha6;
import java.util.Comparator;

public class ComparadorMinutos implements Comparator<Lugar>{
    public int compare(Lugar l1, Lugar l2){
        if(l1.getMin() == l2.getMin()) return 1;
        else return 0;
    }
}
