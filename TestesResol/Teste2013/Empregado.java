
public abstract class Empregado{
    
    private String codigo;
    private String nome;
    private int diasTrabalho;
    private double salDia = 50.00;
    private double salario;
    
    public Empregado(){
        this.codigo = "";
        this.nome = "";
        this.diasTrabalho = 0;
        this.salDia = 0;
        this.salario = 0;
    }
    
    public Empregado(String code, String nome, int dias, double sal,double salario){
        this.codigo = code;
        this.nome = nome;
        this.diasTrabalho = dias;
        this.salDia = sal;
        this.salario = salario;
    }
    
    public Empregado(Empregado e){
        this.codigo = e.getCodigo();
        this.nome = e.getNome();
        this.diasTrabalho = e.getDias();
        this.salDia = e.getSalDia();
        this.salario = e.getSalario();
    }
    
    public String getCodigo(){ return this.codigo; }
    public String getNome(){ return this.nome; }
    public int getDias(){ return this.diasTrabalho; }
    public double getSalDia(){ return this.salDia; }
    public double getSalario(){ return this.salario; }
    
    public void setCodigo(String codigo){ this.codigo = codigo; }
    public void setNome(String nome){ this.nome = nome; }
    public void setDias(int dias){ this.diasTrabalho = dias; }
    public void setSalario (double salario){ this.salario = salario; }
    
    public abstract Empregado clone();
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Código do empregado: ").append(codigo).append("\n");
        sb.append("Nome do empregado: ").append(nome).append("\n");
        sb.append("Dias de trabalho: ").append(diasTrabalho).append("\n");
        sb.append("Salário dia: ").append(salDia).append("\n");
        sb.append("Salário total: ").append(salario).append("\n");
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Empregado e = (Empregado) o;
        return e.getCodigo().equals(codigo)
               && e.getNome().equals(nome)
               && e.getDias() == diasTrabalho
               && e.getSalDia() == salDia
               && e.getSalario() == salario;
    }
    
}
