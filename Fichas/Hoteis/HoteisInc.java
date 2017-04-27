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
    
    public HoteisInc(String nome,Map<String,Hotel> htls){
        this.hoteis = new HashMap<>();
        
        for(Hotel h: htls.values())
            this.hoteis.put(h.getCodigo(),h.clone());
        
        //return this.hoteis= htls.entrySet()/*set<MapEntry<k,v>>*/.stream()
        //.collect(Collectors.toMap(e->e.getKey(),e->e.getValue().clone()));
                           
    }
        
    public String getNome(){
        return this.nome;
    }
    
    public int quantos(){
        return this.hoteis.size();
   }
    
    public int quantosT(String loc){
        /*
        return (int) this.hoteis.values()
                                .stream()
                                .filter(h->h.getLocalidade().equals(loc))
                                .count();
        `*/
        
        int t=0;
        for(Hotel h:this.hoteis.values())
            if (h.getLocalidade().equals(loc))
            t++;
        
            return  t;
    }
    
    
    public Map<String,Hotel> getHoteis(){
        return this.hoteis.entrySet()
                          .stream()
                          .collect(toMap(e->e.getKey(), e->e.getValue().clone()));
    }
    
    public void adiciona(Hotel h) {
        this.hoteis.put(h.getCodigo(),h);
    }
    
    /*public HoteisInc2(String nome,Map<String,Hotel> htls){
        this.hoteis= htls.entrySet().stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue().clone()));
                         //set<MapEntry<k,v>>   
    }*/
    
    
    public void adiciona(Set<Hotel> hs){
        for( Hotel h: hs){
            this.hoteis.put(h.getCodigo(),h);
        }
    }
    
    public void mudaPara(String epoca){
        for(Hotel h: this.hoteis.values()){
            if (h.getClass().getSimpleName().equals("HotelStandard")){
                if(epoca.equals("true")){
                    ((HotelStandard) h).setEpocaAlta(true);
                }
                else ((HotelStandard) h).setEpocaAlta(false);
            }
        }
    }
    
     public HoteisInc clone() {
        return new HoteisInc(this);
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