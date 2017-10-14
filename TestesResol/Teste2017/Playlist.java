

public class Playlist{
    private String nome;private Map<String, List<Faixas>> musicas;
    
    public List<Faixa> getFaixas(String autor){
        List<Faixas> le = new List<Faixas> ();
        if(!this.musicas.containsKey(autor)) throw new AutorInexistenteExceptin();
        else{
            for(Map.Entry<String,List<Faixa>> l: this.musicas.entrySet()){
                if(l.getKey()==autor){
                    for(List<Faixa> ler: l.values()){
                        for(Faixa f: l){
                            le.add(f.clone());
                        }
                    }
            
            }
                
            }
        }
        return le;
    
        ou
        
        List<Faixa> r = this.musicas.get(autor);
        if(r== null) throw new AUtorInexistenteException();
        return r.stream().map(Faixa :: clone).collect(Collectors.toList());
    }
    
    public double tempoTotal(String autor) throws AutorInexistenteException{
        double tot = 0;
        if(this.musicas.containsKey(autor) != true) throw new AutorInexistenteException();s
        else{
            for(List<Faixas> l: this.musicas.values()){
                for(Faixa f: l){
                    tot+= f.getDuracao();
                }
            }
        }
        
        return tot;
    
    
        ou
        
        List<Faixa> r = this.musicas.get(autor);
        
        if(r == null) throw new AutorInexistenteException();
        else{
            r.stream().mapToDouble(Faixa::getDuracao).sum();
        }
    }
    
    public List<Faixa> todasAsFaixas(){
        List<Faixa> todas = new List<Faixa>();
        
        for(List<Faixa> l: this.musicas.values()){
            for(Faixa f: le){
                todas.add(le.clone());
            }
        }
    }
    
    public Map<Integer,List<Faixa>> faixasPorClass(){
        List<Faixa> faixa = this.todasAsFaixas();
        return faixa.stream().collect(Collectors.groupingBy(Faixa :: getClassificacao));
        
    }
    
    public void play(){
        this.letra.forEach(s->System.audio.toca(s));
        
        for(String s: this.letra){
            System.audio.toca(s);
        }
    }
        
 
}  
       

