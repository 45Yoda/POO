import java.util.TreeSet;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListaEleitoral{
    
    private String partidoPolitico;
    private TreeSet<Candidato> eleitos;
    private ArrayList<Candidato> porEleger;
    
    public ListaEleitoral(String partido, ArrayList<Candidato> candidatos){
        this.partidoPolitico = partido;
        this.porEleger = new ArrayList<Candidato> ();
        for(Candidato c: candidatos){
            this.porEleger.add(c.clone());
        }
    }
    
    public Candidato aEleger() throws NoMoreCandidatosException{
        Candidato c = this.porEleger.get(0);
        if(c!=null){
            return c.clone();
        }else throw new NoMoreCandidatosException();
    }
    
    public void elege() throws NoMoreCandidatosException{
        Candidato c = this.porEleger.get(0);
        if(c!=null){
            this.eleitos.add(c);
        }
        else throw new NoMoreCandidatosException();
    }
    
    public void elege(int n) throws NotEnoughCandidatosException{
        if(this.porEleger.size() >= n){
            while(n!=0){
                Candidato c = this.porEleger.get(0);
                this.eleitos.add(c.clone());
                n--;
            }
        }
        else throw new NotEnoughCandidatosException();
    }
    
    public ArrayList<Candidato> candidatos(){
        ArrayList<Candidato> cand = new ArrayList<Candidato>();
        for(Candidato c : this.porEleger){
            cand.add(c.clone());
        }
        for(Candidato c : this.eleitos){
            cand.add(c.clone());
        }
        return cand;
    }
    
    public TreeSet<Candidato> eleitos(){
        TreeSet<Candidato> el = new TreeSet<Candidato>();
        for(Candidato c: this.eleitos){
            el.add(c.clone());
        }
        return el;
    }
    
    public TreeSet<Candidato> candidatosOrd(){
        TreeSet<Candidato> el = new TreeSet<Candidato>(new IdadeNomeComparator());
        for(Candidato c : this.eleitos){
            el.add(c.clone());
        }
        return el;
    } 
}
