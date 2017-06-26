
public class Normal extends Empregado{
    
    public Normal(){
        super();
    }
    
    public Normal(String cod, String nome, int dias, double sal,double salario){
        super(cod,nome,dias,sal,salario);
    }
    
    public Normal(Normal n){
        super(n);
    }
    
    public void salario(){
         double salario = this.getSalDia() * this.getDias();
         setSalario(salario);
    }
   
    public Normal clone(){ return new Normal(); }
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString(); 
    }
}
