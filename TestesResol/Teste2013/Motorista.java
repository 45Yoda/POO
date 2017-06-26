
public class Motorista extends Empregado{
    
    private static double valKm = 10;
    private double kmPercorridos;
    
    public Motorista(){
        super();
    }
    
    public Motorista(String cod, String n, int dias, double sal,double salario, double kmPer){
        super(cod,n,dias,sal,salario);
        this.kmPercorridos = kmPer;
    }
    
    public Motorista(Motorista motorista){
        super(motorista);
        this.kmPercorridos = motorista.getKmPercorridos();
    }
    
    
    public double getKmPercorridos(){
        return this.kmPercorridos;
    }
    
    public void salario(){
        double salario = this.valKm * this.getKmPercorridos() + (this.getSalDia() * this.getDias());
        setSalario(salario);
    }
    
    public Motorista clone() { return new Motorista(this); }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Kms Percorridos: ").append(kmPercorridos).append("\n");
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if( o == null || this.getClass() != o.getClass()) return false;
        Motorista m = (Motorista) o;
        return super.equals(m) && m.getKmPercorridos() == kmPercorridos;
    }
}
