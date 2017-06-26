package Ficha6;

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;


public class Parque{
    public String nome;
    public Map<String,Lugar> lugares;
    
    public Parque(){
        this.nome = "";
        this.lugares = new TreeMap<>();
    }
    
    public Parque(String nome,Map<String,Lugar> l){
        this.nome = nome;
        this.lugares = new TreeMap<>();
        for(Map.Entry <String,Lugar> p : l.entrySet())
            this.lugares.put(p.getKey(), p.getValue().clone());
    }
    
    public Parque(Parque p){
        this.nome = p.getNome();
        this.lugares = p.getLugares();
    }
    
    public String getNome(){ return this.nome; }
    public Map<String,Lugar> getLugares(){
        Map<String,Lugar> p = new TreeMap<>();
        this.lugares.entrySet().forEach(l->{p.put(l.getKey(),l.getValue().clone());});
        return p;
    }
    
    public Map<String,Lugar> getLugares2(){
        Map<String,Lugar> p = new TreeMap<>();
        Iterator<Map.Entry<String,Lugar>> it = this.lugares.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Lugar> l = it.next();
            p.put(l.getKey(),l.getValue().clone());
        }
        return p;
    }
    
    public List<String> lugOcup(){
        List<String> ocup = new ArrayList<String>();
        this.lugares.entrySet().forEach(l->{ocup.add(l.getKey());});
        return ocup;
    }
    
    public Map<String,Lugar> novolugar(Lugar l){
        this.lugares.put(l.getMat(),l);
        return lugares;
    }
    
    public void remove(String matricula){
        this.lugares.remove(matricula);
    }
    
    public void alteraTempo(String mat, int min){
        this.lugares.get(mat).setMin(min);
    }
    
    public int minTotE(){
        Iterator<Lugar> it = this.lugares.values().iterator();
        int tot = 0;
        while(it.hasNext()){
            Lugar l = it.next();
            tot+=l.getMin();
        }
        
        return tot;
    }
    
    public int minTotI(){
        int tot = 0;
        for(Lugar l: this.lugares.values()){
            tot+= l.getMin();
        }
        
        return tot;
    }
    
    public boolean existeLugar(String matricula){
        return this.lugares.containsKey(matricula);
    }
    
    public List<String> maisTempoE(int x){
        Iterator<Lugar> it = this.lugares.values().iterator();
        List<String> m = new ArrayList<String> ();
        while(it.hasNext()){
            Lugar l = it.next();
            if(l.getMin()>x && l.getPerm()) m.add(l.getMat());
        }
        
        return m;
    }
    
    public List<String> maisTempoI(int x){
        return this.lugares.values().stream().filter(l->l.getMin()>x && l.getPerm())
                   .map(Lugar :: getMat).collect(Collectors.toList());

    }
}
