package Ficha6;

public class Lugar{
    
    //Matricula do veiculo alocado
    private String matricula;
    //Nome do proprietario 
    private String nome;
    //Tempo atribuido ao lugar, em minutos
    private int minutos;
    //Indica se o lugar é permanente ou de aluguer
    private boolean permanente;
    
    public Lugar (){
        this.matricula = "";
        this.nome = "";
        this.minutos = 0;
        this.permanente = false;
    }
    
    public Lugar (String mat, String nome, int min, boolean perm){
        this.matricula = mat;
        this.nome = nome;
        this.minutos = min;
        this.permanente = perm;
    }
    
    public Lugar(Lugar l){
        this.matricula = l.getMat();
        this.nome = l.getNome();
        this.minutos = l.getMin();
        this.permanente = l.getPerm();
    }
    
    public String getMat(){ return this.matricula; }
    public String getNome(){ return this.nome; }
    public int getMin(){ return this.minutos; }
    public boolean getPerm(){ return this.permanente;}
    
    public void setMat(String mat){ this.matricula = mat; }
    public void setNome(String nome){ this.nome = nome; }
    public void setMin(int min){ this.minutos = min; }
    public void setPerm(boolean perm){ this.permanente = perm; }
    
    public Lugar clone(){ return new Lugar(this); }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Matricula da viatura: ").append(matricula).append("\n");
        sb.append("Nome do condutor: ").append(nome).append("\n");
        sb.append("Tempo atribuido em minutos: ").append(minutos).append("\n");
        sb.append("O lugar é permanente? : ").append(permanente).append("\n");
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if(this==o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Lugar l = (Lugar) o;
        return l.getMat().equals(matricula) &&
               l.getNome().equals(nome) &&
               l.getMin() == minutos &&
               l.getPerm() == permanente;
    }
}
