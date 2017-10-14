

public class Exame2012{
    
    
    //Exercicio 1
    public boolean activa(){
        GregorianCalendar hoje = new GregorianCalendar();
        
        return (hoje.after(this.inicio)) && (hoje.before(this.fim) && !terminada;
    }
    
    
    //Exercicio 2
    
    // (a)
    public void addTarefa(Tarefa t){
        this.tarefas.add(t.clone());
    }
    
    // (b)
    public Iterator<Tarefa> tarefasActivas(Comparator<Tarefa> ct){
        TreeSet<Tarefa> aux = new TreeSet<Tarefa> (ct);
        Iterator it = it.aux;
        
        for(Tarefa t:this.tarefas){
            if(t.ativa()){
                aux.add(t);
            }
        }
        
        return it;
    }
    
    //(c)
    public class ComparadorTarefas implements Comparator<Tarefa>{
        
        
        public int compare(Tarefa t1, Tarefa t2){
            float prior1 = t1.getPrioridade();
            float prior2 = t2.getPrioridade();
            
            if(prior1 < prior2) return 1;
            if(prior1 > prior2) return -1;
            if(prior1 == prior2){
                GregorianCalendar f1 = t1.getFim();
                GregorianCalendar f2 = t2.getFim();
                if(f1 < f2) return 1;
                else return -1;
                
            }
            return null;
        }
    }
    
    // (d)
    public Set<Tarefa> tarefasEntreDatas(GregorianCalendar di, GregorianCalendar df){
        TreeSet<Tarefa> tar = new TreeSet<Tarefa>;
        for(Tarefa t: this.tarefas){
            if(t.getInicio().after(di) && t.getFim().before(df)
                tar.add(t.clone());
        }
        return tar;
    }
    
    public class Van extends Veiculo implements Contratavel{
        private double carga;
        private double custo;
        
        public Van(){
            super();
            this.carga = 0;
            this.custo = 0;
        }
        
        public Van(Veiculo v, double c, double cust){
            super(v);
            this.carga = c;
            this.custo = cust;
        }
        
        public Van(Van v){
            super(v);
            this.carga = v.getCarga();
            this.custo = v.getCusto();
        }
        
    }
    
    public class Camioneta extends Veiculo implements Contratavel{
        private String nome;
        private double peso;
        private double factor; 
        
        public Camioneta(){
            super();
            this.nome = "";
            this.peso = 0;
            this.factor = 0;
        }
        
        public Camioneta(Veiculo v, String nome, double p, double f){
            super(v);
            this.nome = nome;
            this.peso = p;
            this.factor = f;
        }
        
        public Camioneta(Camioneta c){
            super(c);
            this.nome = c.getNome();
            this.peso = c.getPeso();
            this.factor = c.getFactor();
        }
    
    }
    
    
    public double valorTodosContratos(){
        double tot;
        
        for(Contratavel c : this.veiculos.values().getServicosContratados()){
            tot += this.veiculos.values().custoPorContrato(c);
        }
        
        return tot;
           
    }
    
    public Map<String,ArrayList<Veiculo>> veiculosPorCliente(){
        
        return this.veiculos.values().stream().map(Veiculo :: clone)
               .collect(Collectors.groupingBy(Veiculo :: getCliente));
    }
    
    public Map<String,ArrayList<Veiculo>> veiculosPorCliente(){
        TreeMap<String,ArrayList<Veiculo>> res = new TreeMap<String,ArrayList<Veiculo>>
    
        for(Veiculo v: this.veiculos.values())
            for(Contratavel c: v.getServicosContratados()){
                String nomeCliente = c.getCliente();
                if(res.containsKey(nomeCliente))
                    (res.get(nomeCliente)).add(v.clone());
                    
                else{
                    ArrayList<Veiculo> novo = new ArrayList<Veiculo>();
                    novo.add(v.clone());
                    res.put(nomeCliente,novo);
                }
            }
        return res;
    }
    
    
    public String veiculoComMaisKms(){
        double max = 0;
        String mat = "";
        
        for(Veiculo v : this.veiculos.values()){
            for(Contratavel c : v.getServicosContratados()){
                if(max < c.getDist()){
                    max = c.getDist();
                    mat = v.getMat();
                }
            }
        }
        return mat;
    }
    
    public boolean existeServicoComDistanciaMaiorQue(double dist){
        for(Veiculo v: this.veiculos.values()){
            for(Contratavel c: v.getServicosContratados()){
                if(dist > c.getDist()){
                    return true;
                }
            }
        }
        
        return false;
    }
}