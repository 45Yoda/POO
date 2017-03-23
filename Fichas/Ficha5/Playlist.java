package Ficha5;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.Collection;
public class Playlist
{
  private List<Faixa> faixas;
  
  public Playlist(List<Faixa> f){
      this.faixas = f;
    }
    
  public Playlist(){
      this.faixas = new ArrayList<Faixa>();
      for(Faixa f: faixas)
        this.faixas.add(f.clone());
  }
  
  public Playlist (Playlist p){
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
          f= it.next();
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
      this.faixas.add(faixas.size(),f);
  }
  
  public void removeFaixa(Faixa m){
      this.faixas.remove(m);
    }
    
  public void adicionar( List<Faixa> faixas){
     Iterator<Faixa> it = faixas.iterator();
     while ( it.hasNext()){
         Faixa f = it.next();
         if(!this.faixas.contains(f))
            this.faixas.add(f.clone());
        }
    }
  
  public void adicionaF (List<Faixa> faixas){
      faixas.forEach(f->{this.faixas.add(f.clone());});
    }
  
  public int classificacaoSuperiorF(Faixa f){
      return (int) this.faixas.stream()
                   .filter(t->t.getClassificacao()>f.getClassificacao())
                   .count();
  }
  
  public int classificaoSuperior(Faixa f){
      Iterator<Faixa> it = faixas.iterator();
      int l=0;
      while(it.hasNext()){
          Faixa fa= it.next();
          if(f.getClassificacao()> fa.getClassificacao()){
              l+=1;
            }
        }
      return l;
    }
    
  public boolean duracaoSuperior(double d){
    boolean enc = false;
    Iterator <Faixa> it = faixas.iterator();
    while(it.hasNext() && !enc){
        Faixa f = it.next();
        if(f.getDuracao()>d)
            enc=true;
    }
    return enc;
  }
  
  
  public boolean duracaoSuperior2(double d){
      boolean enc = false;
      for(Faixa f: faixas){
          if(f.getDuracao()>d){
              enc = true;
           }
        }
      return enc;
  }
  
  public boolean duracaoSuperiorF(double d){
     return faixas.stream().anyMatch(f->f.getDuracao()>d);
  }
  
  public List<Faixa> getCopiaFaixas(int n){
      List<Faixa> lista = new ArrayList<Faixa>(this.faixas.size());
      
      for(Faixa f: faixas){
          if(f.getClassificacao()!=n){
              
              f.setClassificacao(n);
              lista.add(f.clone());
            }
          else lista.add(f.clone());
      }
      
      return lista;
  }

  public List<Faixa> getCopiaFaixasF(int n){
    return this.faixas.stream().map(f->f.clone()).peek(f->f.setClassificacao(n)).collect(Collectors.toList());
  }
   
  public double duracaoTotal(){
      double d=0;
      for(Faixa f:faixas){
        d+=f.getDuracao();
        }
      return d;
  }
  
  public double duracaoTotalF(){
    return this.faixas.stream().mapToDouble(f->f.getDuracao()).sum();
  }
  /*
  public void removeFaixas(String autor){
    Collection<Faixa> col = faixas.stream().map((Faixa f)->(f.getAutor().equals(autor))).collect(Collectors.toLisr());
    
    faixas.removeAll(col);
    }
  */
    
  public Playlist clone(){
      return new Playlist(this);
  }
}

