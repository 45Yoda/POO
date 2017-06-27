import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.io.Serializable;

public class Equipa implements Serializable{
    
    private String nome;
    private Map<String,Barco> barcos;
    
    public Equipa(){
        this.nome = "";
        this.barcos = new HashMap<>();
    }
    
    public Equipa(String nome, Map<String,Barco> barc){
        this.nome = nome;
        this.barcos = new HashMap<String,Barco>();
        setBarcos(barc);
    }
    
    public Equipa(Equipa e){
        this.nome = e.getNome();
        this.barcos = e.getBarcos();
    }
    
    public String getNome(){ return this.nome; }
    public Map<String,Barco> getBarcos() {
        return this.barcos.entrySet().stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
    }
    
    public void setNome(String nome){ this.nome = nome; }
    public void setBarcos(Map<String,Barco> barc){
        this.barcos = barc.entrySet().stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
    }
    
    public double totalEmProva(String idBarco){
        double res = 0;
        if(barcos.containsKey(idBarco)){
            for(Barco b: barcos.values()){
                if(b.getId().equals(idBarco)){
                    for(RegistoEtapa r: b.getListaReg()){
                        res += r.dif();
                    }
                    return res;
                }
            }
        }
        return res;
    }
    
    public double registoMaisLongo(){
        double max = 0;
        for(Barco b: barcos.values()){
            if(this.totalEmProva(b.getId()) >max){
                max = this.totalEmProva(b.getId());
            }
        }
        return max;
    }
    
    public TreeSet<Barco> getBarcosOrdBySeguro(){
        TreeSet<Barco> barcosSeguro = new TreeSet<Barco>(new SalarioComparator ());
        for(Barco b: barcos.values()){
            if(b instanceof BarcoCatamaran || b instanceof BarcoHibrido){
                barcosSeguro.add(b);
            }
        }
        return barcosSeguro;
    }
    
    
    public Equipa clone(){ return new Equipa(this); }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Equipa e = (Equipa) o;
        return e.getNome().equals(nome)
            && e.getBarcos().equals(barcos);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da equipa: ").append(nome).append("\n");
        sb.append("Barcos: ");
        for(Map.Entry<String,Barco> b: this.barcos.entrySet()){
            sb.append(b.getKey()).append("-").append(b.getValue().toString()).append("\n");
        }
        return sb.toString();
    }
}
