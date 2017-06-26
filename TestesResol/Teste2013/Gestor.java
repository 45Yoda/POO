
public class Gestor extends Empregado{
    
    private int premio;
    

    public Gestor(){
        super();
        this.premio = 0;
    }
    
    public Gestor(String cod, String nome, int dias, double sal,double salario, int premio){
        super(cod,nome,dias,sal,salario);
        this.premio = premio;
    }
    
    public Gestor(Gestor g){
        super(g);
        this.premio = g.getPremio();
    }
    
    public int getPremio(){ return this.premio; }
    
    public void setPremio(int premio) { this.premio = premio; }
    
    
    public void salario(){
         double salario = this.premio * this.getSalDia() * this.getDias();
         setSalario(salario);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Premio: ").append(premio).append("\n");
        return sb.toString();
    }
    
    public Gestor clone(){ return new Gestor(this); }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Gestor g = (Gestor) o;
        return super.equals(g) && this.premio == premio;
    }
}
