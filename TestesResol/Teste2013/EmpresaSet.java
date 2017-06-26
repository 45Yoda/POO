import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class EmpresaSet extends Empregado{
    
    private TreeSet<Empregado> empregados;
    
    
    public boolean existeEmpregado(String cod){
        boolean r = false;
        for(Empregado e: this.empregados){
            if(e.getCodigo().equals(cod)) r = true;
        }
        
        return r;
    }
    
    public Empregado getEmpregado(String cod){
        Empregado f = null;
        for(Empregado e : this.empregados){
            if(e.getCodigo().equals(cod)) f = e;
        }
        
        return f;
    }
    
    public void addEmpregado(Empregado e){
        if(!this.empregados.contains(e)){
            this.empregados.add(e);
        }
    }
    
    public Iterator<Empregado> listaPorOrdemDecrescenteSalario(ComparadorSalario h){
        Iterator<Empregado> it = this.empregados.iterator();
        TreeSet<Empregado> emp = new TreeSet<Empregado>(h);
        List<Empregado> empregado = new ArrayList<Empregado>();
        
        while(it.hasNext()){
            Empregado e = it.next();
            emp.add(e);
        } 
        
        empregado = emp.stream().collect(Collectors.toList());
        
        Iterator<Empregado> itr = empregado.iterator();
        
        return itr;
    }
    
    
    public EmpresaSet clone(){ return new EmpresaSet(); }
} 
