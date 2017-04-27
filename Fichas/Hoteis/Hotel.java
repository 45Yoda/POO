package Hoteis;

public abstract class Hotel {
    private String codigo;
    private String nome;
    private String localidade;
    private double precoQuarto;
    private int numeroQuartos;
    
   
    public Hotel() {
        this.codigo = " ";
        this.nome = " ";
        this.localidade = " ";
        this.precoQuarto = 0;
        this.numeroQuartos = 0;
    }

    public Hotel(Hotel c) {
        this.codigo = c.getCodigo();
        this.nome = c.getNome();
        this.localidade = c.getLocalidade();
        this.precoQuarto = c.getPrecoQuarto();
        this.numeroQuartos = c.getNumeroQuartos();
    }

    public Hotel(String codigo, String nome, String localidade, double precoQuarto, int numQuartos) {
        this.codigo = codigo;
        this.nome = nome;
        this.localidade = localidade;
        this.precoQuarto = precoQuarto;
        this.numeroQuartos = numQuartos;
    }
    
    public abstract double precoQuarto();
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroQuartos(int nquartos)
    {
      this.numeroQuartos = nquartos;
    }
    
    public String getLocalidade() {
        return localidade;
    }
    
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    
    public double getPrecoQuarto() {
        return precoQuarto;
    }

    public void setPrecoQuarto(double precoQuarto) {
        this.precoQuarto = precoQuarto;
    }

    public int getNumeroQuartos(){ 
        return this.numeroQuartos; 
    }
    
    public abstract Hotel clone();

    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Hotel o = (Hotel) obj;
        return o.getCodigo().equals(codigo) && o.getNome().equals(nome) && 
                o.getLocalidade().equals(localidade) && o.getPrecoQuarto() == precoQuarto;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel '").append(nome).append("'\n");
        sb.append("(").append(codigo).append(") ").append(localidade);
        sb.append("Preço por quarto: ").append(precoQuarto).append("€");
        return sb.toString();
    }

    public int hashCode() {
        return codigo.hashCode();
    }
}