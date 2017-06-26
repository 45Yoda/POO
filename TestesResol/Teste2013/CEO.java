

public class CEO extends Empregado{
    
    public CEO(){
        super();
    }
    
    public CEO(String cod, String n, int dias, double sal, double salario){
        super(cod,n,dias,sal,salario);
    }
    
    public CEO(CEO c){
        super(c);
    }
    
    public double salario(){
        return 3 * this.getSalDia() * this.getDias();
    }
    
    public CEO clone() { return new CEO(this); }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || this.getClass() != o.getClass()) return false;
        CEO c = (CEO) o;
        return super.equals(c);
    }
}

