import java.util.Comparator;
import java.io.Serializable;

public class ComparadorSalario implements Comparator<Empregado>, Serializable{
    
    public int compare(Empregado e1, Empregado e2){
        if(e1.getSalario() == e2.getSalario()) return e1.getNome().compareTo(e2.getNome());
        else if(e1.getSalario() >= e2.getSalario()) return 1;
        else return -1;
    }
}
