
public class Contribuinte{
    
    private String nif;
    private String nome;
    private String morada;
    
    public Contribuinte(){
        this.nif = "";
        this.nome = "";
        this.morada = "";
    }
    
    public Contribuinte(String n, String nome, String mor){
        this.nif = n;
        this.nome = n;
        this.morada = mor;
    }
    
    public Contribuinte(Contribuinte cn){
        this.nif = cn.getNif();
        this.nome = cn.getNome();
        this.morada = cn.getMorada();
    }
    
    public String getNif(){
        return this.nif;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getMorada(){
        return this.morada;
    }
}
