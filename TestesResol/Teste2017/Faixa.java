
/**
 * Write a description of class Faixa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Faixa{
   
    public Faixa(Faixa f){
        this.nome = f.getNome();
        this.autor = f.getAutor();
        this.duracao = f.getDuracao();
        this.classificacao = f.getClassificacao();
        this.letra = f.getLetra();
        this.numeroVezesTocada = f.getNumeroVezesTocada();
        this.ultimaVez = f.getUltimaVez();
    }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Faixa f = (Faixa) o;
        return f.getNome().equals(nome) && (---)
    }
    
    public compareTo(Faixa f){
        if(this.numeroVezesTocada < f.getNumeroVezesTocada()) return -1;
        else return 1;
    }
    
    public class ComparadorUltimaVezTocada implements Comparator<Faixa>
    {
        public int (Faixa f1, Faixa f2){
            if(f1.getUltimaVez().isBefore(f2.getUltimaVez())) return -1;
            else return 1;
        }
    }
    
}
