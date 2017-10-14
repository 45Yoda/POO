package Estudo;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Iterator;

public class Playlist{
    ArrayList<Faixa> faixas;
    
    public Playlist(){
        this.faixas = null;
    }
    
    public Playlist(ArrayList<Faixa> f){
        this.faixas = new ArrayList<Faixa> ();
        for(Faixa faix: f){
            this.faixas.add(faix);
        }
    }
    
    public Playlist(Playlist p){
        this.faixas = p.getFaixas();
    }
    
    public ArrayList<Faixa> getFaixas(){
        ArrayList<Faixa> aux = new ArrayList<Faixa>();
        for(Faixa f: this.faixas){
            aux.add(f.clone());
        }
        
        return aux;
    }
    
    public void setFaixas(ArrayList<Faixa> faixas){
        for(Faixa f: this.faixas)
            faixas.add(f.clone());
    }
    
    public int numFaixas(){
        return this.faixas.size();
    }
    
    public void addFaixa(Faixa f){
        this.faixas.add(f.clone());
    }
    
    public void removeFaixa(Faixa m){
        this.faixas.remove(m);
    }
    
    public void adicionar(List<Faixa> faixas){
        Iterator<Faixa> it = faixas.iterator();
        
        while(it.hasNext()){
            Faixa f = it.next();
            this.faixas.add(f);
        }
    }
    
    public void adicionarF(List<Faixa> faixas){
        faixas.forEach(f->{this.faixas.add(f.clone());});
    }
}
