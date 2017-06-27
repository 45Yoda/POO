import java.util.Set;
import java.util.TreeSet; 
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.io.Serializable;

public abstract class Barco implements Serializable{
    
    private String id;
    private double milhas;
    private String categoria;
    private double autonomia;
    private Pessoa skipper;
    private Set<Pessoa> tripulantes;
    private ArrayList<RegistoEtapa> listaReg;
    
    public Barco(){
        this.id = "";
        this.milhas = 0;
        this.categoria = "";
        this.autonomia = 0;
        this.skipper = null;
        this.tripulantes = new TreeSet<>();
    }
    
    public Barco(String id, double milhas, String categoria, double autonomia, Pessoa skipper, TreeSet<Pessoa> trip, ArrayList<RegistoEtapa> lr){
        this.id = id;
        this.milhas = milhas;
        this.categoria = categoria;
        this.autonomia = autonomia;
        this.skipper = skipper;
        this.tripulantes = new TreeSet<Pessoa>();
        setTripulantes(trip);
        this.listaReg = lr;
    }
    
    public Barco (Barco b){
        this.id = b.getId();
        this.milhas = b.getMilhas();
        this.categoria = b.getCategoria();
        this.autonomia = b.getAutonomia();
        this.skipper = b.getSkipper();
        this.tripulantes = b.getTripulantes();
        this.listaReg = b.getListaReg();
    }
    
    public String getId(){ return this.id; }
    public double getMilhas(){ return this.milhas; }
    public String getCategoria(){ return this.categoria; }
    public double getAutonomia(){ return this.autonomia; }
    public Pessoa getSkipper() { return this.skipper; }
    public Set<Pessoa> getTripulantes(){
        return this.tripulantes.stream().collect(Collectors.toSet());
    }
    public ArrayList<RegistoEtapa> getListaReg(){ return this.listaReg; }
    
    
    public void setTripulantes(Set<Pessoa> trip){
        this.tripulantes = trip.stream().collect(Collectors.toSet());
    }
    
    public boolean equals(Object o){
        if(o==this) return true;
        if(o==null || this.getClass() != o.getClass()) return false;
        Barco b = (Barco) o;
        return b.getId().equals(id)
            && b.getMilhas() == milhas
            && b.getCategoria().equals(categoria)
            && b.getAutonomia() == autonomia
            && b.getSkipper().equals(skipper)
            && b.getTripulantes().equals(tripulantes);
    }
}
