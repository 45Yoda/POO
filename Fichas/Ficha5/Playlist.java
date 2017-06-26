package Ficha5;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.Collection;

public class Playlist{
    
    private List<Faixa> faixas;
    
    public Playlist(){
        this.faixas = new ArrayList<Faixa>();
        for(Faixa f: faixas)
            this.faixas.add(f.clone());
    }
    
    public Playlist(List<Faixa> f){
        this.faixas = f;
    }
    
    public Playlist(Playlist p){
        this(p.getFaixas());
    }
    
    public List<Faixa> getFaixas(){
        List<Faixa> aux = new ArrayList<Faixa>();
        for(Faixa f: this.faixas)
            aux.add(f.clone());
        
        return aux;
    }
    
    public List<Faixa> getFaixas2(){
        List<Faixa> aux = new ArrayList<Faixa>(this.faixas.size());
        Iterator<Faixa> it = this.faixas.iterator();
        while(it.hasNext()){
            Faixa f;
            f = it.next();
            aux.add(f.clone());
        }
        
        return aux;
    }
    
    public List<Faixa> getFaixas3(){
        List<Faixa> exp = new ArrayList<Faixa>(this.faixas.size());
        faixas.forEach(f->exp.add(f.clone()));
        return exp;
    }
    
    public List<Faixa> getFaixas4(){
        return faixas.stream().map(f->f.clone()).collect(Collectors.toList());
    }
    
    public List<Faixa> getFaixas5(){
        return faixas.stream().map(Faixa::clone).collect(Collectors.toList());
    }
    
    public void setFaixas(List<Faixa> faixas){
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
            this.faixas.add(f.clone());
        }
    }
    
    public void adicionarF(List<Faixa> faixas){
        faixas.forEach(f->{this.faixas.add(f.clone());});
    }
    
    public int classificacaoSuperior(Faixa f){
        int t = 0;
        Iterator<Faixa> it = this.faixas.iterator();
        while(it.hasNext()){
            Faixa fa = it.next();
            if(fa.getClassif()>f.getClassif()) t++;
        }
        return t;
    }
    
    public int classificacaoSuperiorF(Faixa f){
        return (int) this.faixas.stream()
                     .filter(t->t.getClassif()>f.getClassif())
                     .count();
    }
    
    public boolean duracaoSuperior(double d){
        boolean t = false;
        Iterator<Faixa> it = this.faixas.iterator();
        while(it.hasNext()){
            Faixa fa = it.next();
            if(fa.getDuracao()>d) t = true;
        }
        return t;
        
    }
    
    public boolean duracaoSuperiorF(double d){
        return this.faixas.stream().anyMatch(f->f.getDuracao()>d);
    }
    
    public List<Faixa> getCopiaFaixas(int n){
        List<Faixa> lista = new ArrayList<Faixa>(this.faixas.size());
        Iterator<Faixa> it = this.faixas.iterator();
        while(it.hasNext()){
            Faixa f = it.next();
            f.setClassif(n);
            lista.add(f.clone());
        }
        return lista;
    }
    
    public List<Faixa> getCopiaFaixasF(int n){
        List<Faixa> lista = new ArrayList<Faixa>(this.faixas.size());
        lista = this.faixas.stream().map(f->f.clone()).collect(Collectors.toList());
        lista.forEach(f->f.setClassif(n));
        return lista;
    }
    
    public double duracaoTotal(){
        Iterator<Faixa> it = this.faixas.iterator();
        double t = 0;
        while(it.hasNext()){
            Faixa f = it.next();
            t+=f.getDuracao();
        }
        return t;
    }
    
    public double duracaoTotalF(){
        double d=0;
        for(Faixa f: this.faixas){
            d+=f.getDuracao();
        }
        return d;
    }
    
    public void removeFaixas(String autor){
        Iterator<Faixa> it = this.faixas.iterator();
        while(it.hasNext()){
            Faixa f = it.next();
            if(f.getAutor().equals(autor)) it.remove();
        }
    }
    
    public void removeFaixasF(String autor){
        this.faixas.stream().filter(f->!(f.getAutor().equals(autor)));
    }
    
    public Playlist clone(){
        return new Playlist(this);
    }
}
