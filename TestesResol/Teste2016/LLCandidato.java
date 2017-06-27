
public class LLCandidato{
    
    private int count;
    private Nodo cabeca;
    
    public LLCandidato(){
        this.count = 0;
        this.cabeca = null;
    }
    
    public int size(){
        return this.count;
    }
    
    public void add(Candidato c){
        if(cabeca != null){
            Nodo temp = new Nodo(c);
            Nodo atual = cabeca;
            
            while(atual.getNext() != null){
                atual = atual.getNext();
            }
            atual.setNext(temp);
            this.count++;
        }
        else{
            cabeca = new Nodo(c);
            this.count++;
        }
    }
    
    public Candidato get(int i) throws CandidatoException{
        Nodo atual = null;
        if(cabeca != null){
            atual = cabeca;
            int j;
            for(j=0;j<i;j++){
                if(atual.getNext() == null){
                    throw new CandidatoException();
                }
                atual = atual.getNext();
            }
            return atual.getCandidato();
        }
        return null;
    }
    
    public Nodo getCab(){ return this.cabeca; }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        LLCandidato l = (LLCandidato) o;
        return l.size() == count 
            && l.getCab().equals(cabeca); 
    }
    
}
