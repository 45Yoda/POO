import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.io.Serializable;
import java.io.IOException;
import java.io.PrintWriter;

public class VOR implements Serializable{
    
    private Map<String,Equipa> equipas;
    
    public VOR(){
        this.equipas = null;
    }
    
    public VOR(Map<String,Equipa> e){
        this.equipas = new HashMap<String,Equipa>();
        setEquipas(e);
    }
    
    public VOR(VOR v){
        this.equipas = v.getEquipas();
    }
    
    public Map<String,Equipa> getEquipas(){
        HashMap<String,Equipa> aux = new HashMap<String,Equipa>();
        for(Equipa e: equipas.values()){
            aux.put(e.getNome(),e.clone());
        }
        return aux;
    }
    
    public Map<String,Equipa> getEquipas2(){
        return this.equipas.entrySet().stream()
            .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    }
    
    public void setEquipas(Map<String,Equipa> eq){
        this.equipas = eq.entrySet().stream()
                       .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    }
    
    public Barco getBarco(String idEquipa, String idBarco) throws InvalidBoatException{
        if(equipas.containsKey(idEquipa)){
            for(Equipa e: equipas.values()){
                if(e.getNome().equals(idEquipa)){
                    if(e.getBarcos().containsKey(idBarco)){
                        for(Barco b: e.getBarcos().values()){
                            if(b.getId().equals(idBarco)){
                                return b;
                            }
                        }
                    }throw new InvalidBoatException(idBarco);
                }
            }
        }return null;
    }
        
    public ArrayList<Barco> getBarcos(String idEquipa,double milhas){
        ArrayList<Barco> bar = new ArrayList<Barco>();
        if(equipas.containsKey(idEquipa)){
            for(Equipa e: equipas.values()){
                if(e.getNome().equals(idEquipa)){
                    for(Barco b: e.getBarcos().values()){
                        if(b.getMilhas()>milhas){
                            bar.add(b);
                        }
                    }
                    return bar;
                }
            }
        }return bar;
    }
    
    public void removeBarco(String idEquipa, String idBarco) throws InvalidBoatException{
        if(equipas.containsKey(idEquipa)){
            for(Equipa e: equipas.values()){
                if(e.getNome().equals(idEquipa)){
                    if(e.getBarcos().containsKey(idBarco)){
                        for(Barco b: e.getBarcos().values()){
                            if(b.getId().equals(idBarco)){
                                equipas.remove(b);
                            }
                        }
                    }throw new InvalidBoatException(idBarco);
                }
            }
        }         
    }

    public void gravaFicheiroTextoSeguraveis(String fich) throws IOException{
        PrintWriter x = new PrintWriter(fich);
        for(Equipa e: equipas.values()){
            for(Barco b: e.getBarcos().values()){
                if(b instanceof BarcoCatamaran || b instanceof BarcoHibrido){
                    x.println(b);
                }
            }
        }
    }    
}
