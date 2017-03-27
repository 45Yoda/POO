package Ficha6;


public class Lugar
{
    private String matricula;
    private String nome;
    private int minutos;
    private boolean permanente;
    
    public Lugar (String mat, String name, int min, boolean perm){
        this.matricula = mat;
        this.nome = name;
        this.minutos = min;
        this.permanente = perm;
        
    }
    
    public  Lugar(){
        this.matricula = "";
        this.nome = "";
        this.minutos = 0;
        this.permanente = false;
    
    }
    
    public Lugar(Lugar l){
        this.matricula = l.getMat();
        this.nome = l.getNome();
        this.minutos = l.getMin();
        this.permanente = l.getPerm();                                           
    }
    
    public String getMat(){return this.matricula;}
    public String getNome(){return this.nome;}
    public int getMin(){return this.minutos;}
    public boolean getPerm(){return this.permanente;}
    
    public void setMat(String matricula){this.matricula=matricula;}
    public void setNome(String nome){this.nome=nome;}
    public void setMin(int minutos){this.minutos=minutos;}
    public void setPerm(boolean permanente){this.permanente=permanente;}
    
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || o.getClass() != this.getClass()) return false;
        else{
            Lugar l = (Lugar) o;
            return (l.getMat().equals(matricula) &&
                    l.getNome().equals(nome) &&
                    l.getMin()==minutos &&
                    l.getPerm()==permanente);
        }
    }
    
    
    public Lugar clone(){
        return new Lugar(this);
    }
    
    
    


}
