package Ficha6;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.List;

public class Parque
{
  private String nome;
  private int minutos;
  private Map<String,Lugar> lugares;
  
  public Parque(){
     this.nome = "";
     this.lugares = new TreeMap<>();
   }
   
  public Parque(String n, Map<String,Lugar> p){
      this.nome = n;
      this.lugares=new TreeMap<>();
      for(Map.Entry <String,Lugar> l:p.entrySet())
            this.lugares.put(l.getKey(), l.getValue().clone());
    }
  
  public Parque(Parque p){
      this.nome = p.getNome();
      this.lugares = p.getLugares();
  }

  public String getNome(){return this.nome;}
  public Map<String,Lugar> getLugares(){
      Map<String,Lugar> p = new TreeMap<>();
      this.lugares.entrySet().forEach(f->{p.put(f.getKey(),f.getValue().clone());});
      return p;
  }
  
  public Map<String,Lugar> getLugares2(){
      Map<String,Lugar> p= new TreeMap();
      Iterator<Map.Entry<String,Lugar>> it = this.lugares.entrySet().iterator();
      while(it.hasNext()){
          Map.Entry<String,Lugar> l = it.next();
          p.put(l.getKey(),l.getValue().clone());
        }
      return p;
    }
  
  //novolugar 
  public Map<String,Lugar> novolugar(Lugar l){
    this.lugares.put(l.getMat(),l);
    return lugares;
    }
  //remove
  //public Map<String,Lugar> remove(String matricula){}
  
  
  public void alteraTempo(String m){
      Lugar l = this.lugares.get(m);
      this.lugares.remove(l);
      l.setMin(minutos);
      novolugar(l);
  }
  
  public int quantidadeMinutos(){
      return this.lugares.values().stream().mapToInt(l->l.getMin()).sum();
  }
  
  public void alteraTemp(String m,int min){
      Lugar l = this.lugares.get(m);
      this.lugares.remove(m);
      l.setMin(minutos);
      novolugar(l);
  }
  
  public List<String> matriculaTempo(int x){
      return this.lugares.values().stream()
      .filter(l->l.getMin()>x && l.getPerm())
      .map(Lugar :: getMat)
      .collect(Collectors.toList());
  }
     
}
