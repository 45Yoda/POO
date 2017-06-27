import java.io.Serializable;


public class Pessoa implements Serializable{
    
    private String nome;
    private int numero;
    
    public Pessoa(){
        this.nome = "";
        this.numero = 0;
    }
    
    public Pessoa(String n, int num){
        this.nome = n;
        this.numero = num;
    }
    
    public Pessoa(Pessoa p){
        this.nome = p.getNome();
        this.numero = p.getNumero();
    }
    
    public String getNome(){ return this.nome; }
    public int getNumero(){ return this.numero; }
    
    public void setNome(String n){ this.nome = n; }
    public void setNumero(int n){ this.numero = n; }
    
    public Pessoa clone(){ return new Pessoa(this); }
}
