package Ficha7;


/**
 * Abstract class Hotel - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Hotel{
    private String codigo;
    private String nome;
    private String localidade;
    private double precoQuarto;
    private int numeroQuartos;
    
    public Hotel(){
        this.codigo = "";
        this.nome = "";
        this.localidade = "";
        this.precoQuarto = 0;
        this.numeroQuartos = 0;
    }
    
    public Hotel(String code, String nome, String loc, double preQuart, int numQuart){
        this.codigo = code;
        this.nome = nome;
        this.localidade = loc;
        this.precoQuarto = preQuart;
        this.numeroQuartos = numQuart;
    }
    
    public Hotel(Hotel h){
        this.codigo = h.getCodigo();
        this.nome = h.getNome();
        this.localidade = h.getLocalidade();
        this.precoQuarto = h.getPrecoQuarto();
        this.numeroQuartos = h.getNumeroQuartos();
    }
    
    public String getCodigo(){ return this.codigo; }
    public String getNome(){ return this.nome; }
    public String getLocalidade(){ return this.localidade; }
    public double getPrecoQuarto(){ return this.precoQuarto; }
    public int getNumeroQuartos(){ return this.numeroQuartos; }
    
    public void setCodigo(String codigo){ this.codigo = codigo; }
    public void setNome(String nome){ this.nome = nome; }
    public void setLocalidade(String localidade){ this.localidade = localidade; }
    public void setPrecoQuarto(double precoQuarto){ this.precoQuarto = precoQuarto; }
    public void setNumeroQuarto(int numeroQuartos){ this.numeroQuartos = numeroQuartos; }
    
    public abstract Hotel clone();
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Hotel h = (Hotel) o;
        return h.getCodigo().equals(codigo)
            && h.getNome().equals(nome)
            && h.getLocalidade().equals(localidade)
            && h.getPrecoQuarto() == precoQuarto
            && h.getNumeroQuartos() == numeroQuartos;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel : ").append(nome).append("\n");
        sb.append("(").append(codigo).append(")").append(localidade).append("\n");
        sb.append("Preço por quarto: ").append(precoQuarto).append("€").append("\n");
        sb.append("Total de quartos: ").append(numeroQuartos).append("\n");
        return sb.toString();
    }
    
    public int hashCode(){
        return codigo.hashCode();
    }
}
