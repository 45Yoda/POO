package Ficha7;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;
import static java.util.stream.Collectors.toMap;
import java.io.Serializable;
import java.io.*;


public class HoteisInc implements Serializable{
    
    private Map<String,Hotel> hoteis;
    
    public HoteisInc(){
        this.hoteis = new HashMap<>();
    }
    
    public HoteisInc(Map<String,Hotel> hoteis){
        this.hoteis = new HashMap<String,Hotel>();
        setHoteis(hoteis);
    }
    
    public HoteisInc(HoteisInc hi){
        this.hoteis = hi.getHoteis();
    }
    
    private Map<String,Hotel> getHoteis(){
        return this.hoteis.entrySet().stream()
               .collect(toMap(e->e.getKey(),e->e.getValue().clone()));
    }
    
    private void setHoteis(Map<String,Hotel> hoteis){
        this.hoteis = hoteis.entrySet().stream()
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
            if(h.getClass().getSimpleName().equals(tipo)) total++;
        }
        
        return total;
    }
    
    public Hotel getHotel(String cod) throws HotelNaoExisteException{
        try{
            return hoteis.get(cod).clone();
        }
        catch(NullPointerException e){
            throw new HotelNaoExisteException("Hotel " +cod+ " não existe!");
        }
    }
    
    public void adiciona(Hotel h) throws HotelExisteException{
        if(this.hoteis.containsKey(h.getCodigo()))
            throw new HotelExisteException(h.getCodigo());
        else{
            this.hoteis.put(h.getCodigo(),h);
        }
    }
    
    public long total100(){
        long total = 0;
        for(Hotel h: this.hoteis.values()){
            total += h.getPrecoQuarto()*h.getNumeroQuartos();
        }
        return total;
    }
    
    public List<Hotel> getHoteis2(){
        return new ArrayList<Hotel>(this.hoteis.values());
    }
    
    public void adiciona(Set<Hotel> hs){
        for(Hotel h: hs){
            this.hoteis.put(h.getCodigo(),h);
        }
    }
    
    public void mudaPara(String epoca){
        for(Hotel h: this.hoteis.values()){
            if(h.getClass().getSimpleName().equals("HotelStandard")){
                if(epoca.equals("true")){
                    ((HotelStandard) h).setEpocaAlta(true);
                }
                else((HotelStandard) h).setEpocaAlta(false);
            }
        }
    }
    
    public boolean equals(Object o){
        if(o == this) return true;
        if(o==null || this.getClass() != o.getClass()) return false;
        HoteisInc hi = (HoteisInc) o;
        return hi.getHoteis().equals(hoteis);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(hoteis.toString()).append(")");
        return sb.toString();
    }
    
    public HoteisInc clone(){ return new HoteisInc(this); }
    
    public List<CartaoPontos> daoPontos(){
        ArrayList<CartaoPontos> l = new ArrayList<CartaoPontos>();
        for(Hotel h: this.hoteis.values()){
            if((h instanceof HotelStandard) || (h instanceof HotelPremium)){
                CartaoPontos cp = (CartaoPontos) h;
                l.add(cp);
            }
        }
        return l;
    }
    
    public TreeSet<Hotel> ordenarHoteis(){
        TreeSet<Hotel> t = new TreeSet<Hotel>();
        hoteis.values().forEach(h->{t.add(h.clone());});
        
        return t;
    }
    
    public TreeSet<Hotel> ordenarHoteis(Comparator<Hotel> c){
        TreeSet<Hotel> t = new TreeSet<Hotel>(c);
        hoteis.values().forEach(h->{t.add(h.clone());});
        return t;
    }
    
    public void gravaFich(String fich) throws IOException{
        ObjectOutputStream ass = new ObjectOutputStream(new FileOutputStream (fich));
        ass.writeObject(this);
        ass.flush();
        ass.close();
    }
    
    public void guardaFichTxt(String fich) throws IOException{
        PrintWriter pw = new PrintWriter(fich);
        pw.print(this);
        pw.flush();
        pw.close();
    }
}
