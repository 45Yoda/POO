package Ficha6;
import java.util.TreeSet;
import java.util.Set;
import java.util.Map;

public class ParqueTree{
    private Map<String,Lugar> lugares;
    
    public Set<Lugar> lugaresOrdenadosPorTempo(){
        Set<Lugar> t = new TreeSet <>(new ComparadorMinutos());
        for(Lugar l: this.lugares.values())
            t.add(l.clone());
        return t;
    }

    public Set<Lugar> lugaresOrdenadosPorMat(){
        Set<Lugar> t = new TreeSet <>(new ComparadorMatricula());
        for(Lugar l: this.lugares.values())
            t.add(l.clone());
        return t;
    }
}