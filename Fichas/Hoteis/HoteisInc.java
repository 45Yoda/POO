package Hoteis;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import static java.util.stream.Collectors.toMap;


public class HoteisInc
{
    private String nome;
    
    private Map<String,Hotel> hoteis;
    
    
    public HoteisInc(){
        this.nome=" ";
        this.hoteis= new HashMap<>();
    }
    
    public HoteisInc(HoteisInc c){
        this.nome = c.getNome();
        this.hoteis = c.getHoteis();
    }
    
    public HoteisInc(String nome, Map<String,Hotel> hoteis){
        this.nome = nome;
        this.hoteis = new HashMap<String,Hotel>();
        setHoteis(hoteis);
    }
    
    public String getNome(){
        return nome;
    }
    
    private Map<String,Hotel> getHoteis(){
        return this.hoteis.entrySet()
                          .stream()
                          .collect(toMap(e->e.getKey(),e->e.getValue().clone()));    
    }
    
    private void setHoteis(Map<String,Hotel> hoteis){
        this.hoteis = hoteis.entrySet()
                            .stream()
                            .collect(toMap(e->e.getKey(),e->e.getValue().clone()));
    
    }
    
    public boolean existeHotel(String cod){
        return this.hoteis.containsKey(cod);    
    }
   
    public int quantos(){
        return this.hoteis.size();
    }
    
    public int quantos(String loc){
        return (int) this.hoteis.values().stream().filter(h->h.getLocalidade().equals(loc)).count();
    }
    
    
    public int quantosT(String tipo){
        int total = 0;
        
        for(Hotel h: this.hoteis.values()){
            if (h.getClass().getSimpleName().equals(tipo))
            total++;
        }
        
        return total;
     }
    
    public Hotel getHotel(String cod){
        return this.hoteis.get(cod);
    }
    
    public void adiciona(Hotel h) {
        this.hoteis.put(h.getCodigo(),h);
    }
    
    public long total100(){
        long total = 0;
        for (Hotel h: this.hoteis.values()){
            total += h.getPrecoQuarto()*h.getNumeroQuartos();
        }
        return total;
    }
    
    public HoteisInc clone(){
        return new HoteisInc(this);
    }
    
    public List<Hotel> getHoteis2(){
        return new ArrayList<Hotel>(this.hoteis.values());
    }
    
    public void adiciona(Set<Hotel> hs){
        for (Hotel h: hs){
            this.hoteis.put(h.getCodigo(),h);
        }
    }
    
    public void mudaPara(String epoca){
        for (Hotel h: this.hoteis.values()){
            if (h.getClass().getSimpleName().equals("HotelStandard")){
                if(epoca.equals("true")){
                    ((HotelStandard) h).setEpocaAlta(true);
                }
                else ((HotelStandard) h).setEpocaAlta(false);
            }
        }
    }
    
     public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        HoteisInc hi = (HoteisInc) obj;
        return hi.getNome().equals(nome) && 
               hi.getHoteis().equals(hoteis);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder(nome);
        sb.append("(");
        sb.append(hoteis.toString());
        sb.append(")");
        return sb.toString();
    }
}