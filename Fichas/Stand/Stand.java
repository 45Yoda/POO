package Stand;



/**
 * Classe que representa um Stand de automóveis
 * 
 * @author anr
 * @version 2014.03.16  
 * @version 2017.03.03
 */

public class Stand {
  //variáveis de instância
  private String nomeStand;
  private Veiculo[] carros;
  private int nveiculos;   //número veículos no stand
  
  //capacidade do stand (em número de veículos)
  private int capacidade;
  
  //capacidade inicial do Stand: valor por omissão
  public static final int capacidade_inicial = 10;
  
  //construtores
  public Stand() {
    this.nomeStand = new String();
    this.carros = new Veiculo[capacidade_inicial];
    this.capacidade = capacidade_inicial;
    this.nveiculos = 0;
  }
  
  public Stand(String nome, int capacidade) {
    this.nomeStand = nome;
    this.carros = new Veiculo[capacidade];
    this.capacidade = capacidade;
    this.nveiculos = 0;
  }
  
  public Stand(Stand umStand) {
    this.nomeStand  = umStand.getNomeStand();
    this.carros     = umStand.getCarros();
    this.capacidade = umStand.getCapacidade();
    this.nveiculos  = umStand.getNVeiculos();
  }
  
  //métodos de instância
  
  //gets e sets: fazer!
  public String getNomeStand(){return this.nomeStand;}
  public Veiculo[] getCarros(){
      Veiculo [] aux = new Veiculo [carros.length];
      for(int i=0;i<carros.length;i++)
        if(i<nveiculos)
            aux[i]=carros[i].clone();
        else
            aux[i]=carros[i];
       
      return aux;
  }
                                
 
  public int getCapacidade(){return this.capacidade;}
  public int getNVeiculos(){return this.nveiculos;}
  
  public void setNomeStand(String nomeStand){ this.nomeStand = nomeStand;}
  public void setCarros(Veiculo[] carros){this.carros = carros;}
  public void setCapacidade(int capacidade){this.capacidade = capacidade;}
  public void setNVeiculos(int nveiculos){this.nveiculos = nveiculos;}
  //outros métodos
  
  /**
   * Método que insere um veículo no stand
   * 
   */
  
   public void insereVeiculo(Veiculo v) {
       if(!existeVeiculo(v) && nveiculos < carros.length) {carros[nveiculos++]=v.clone();}
  
  }
   
   
   /**
    * Método que verifica se um determinado veículo está no
    * stand.
    */
    public boolean existeVeiculo(Veiculo v) {
        int i;
        boolean r = false;
        for(i=0;i<nveiculos && !r;i++){
            if(carros[i].equals(v)){r=true;}
        }
        return r;
    }
    
    
    /**
     * Método que verifica se um veículo, cuja matrícula é conhecida, 
     * está no stand.
     */
    public boolean existeVeiculoPorMatricula(String matricula) {
        int i;
        boolean r = false;
        for(i=0;i<nveiculos;i++){
            if(carros[i].getMat().equals(matricula)){r=true;}
        }
        
        return r;
    }
    
    
    /** 
     * Método que devolve o veículo com mais kms.
     * 
     */
    
    public Veiculo veiculoComMaisKms() {
        int i,a=0;
        double m=0;
        for(i=0;i<nveiculos;i++){
            if(carros[i].getKMT()>m){
                a=i;
                m=carros[i].getKMT();
            }
        }
        
        return carros[a];
    }
    
    /**
     * Método que devolve o veículo mais gastador (em termos de
     * combustível).
     */
    public Veiculo veiculoMaisGastador() {
        int i,a=0;
        double m=0;
        for(i=0;i<nveiculos;i++){
            if(carros[i].getCM()>m){
                a=i;
                m=carros[i].getCM();
            }
        }
        return carros[a];
    }
    
    /**
     * Método que determina o número de kms de todos os veículos
     * da garagem.
     * 
     */
    public double totalKmsTodosVeiculos() {
        int i;
        double m=0;
        for(i=0;i<nveiculos;i++){
            m+=carros[i].getKMT();
        }
        
        return m;
    }
    
    
    /**
     * equals
     * 
     */
    public boolean equals(Object o) {
        if(this==o)return true;
        if(o==null || this.getClass() != o.getClass()) return false;
        else{
            Stand s = (Stand) o;
            return  
      s.getNomeStand().equals(nomeStand) &&
                   s.getCarros().equals(carros) &&
                   s.getCapacidade()==capacidade &&
                   s.getNVeiculos()==nveiculos;
         }
         
    }
    
    /**
     * toString
     */

    public String toString() {
        int i;
        StringBuilder s = new StringBuilder();
        s.append("NomeStand: ").append(nomeStand);
        s.append("Número de veiculos: ").append(nveiculos);
        s.append("Capacidade: ").append(capacidade);
        
        for(i=0;i<nveiculos;i++){
            s.append("Carro: ").append(carros[i]);
        }
        
        return s.toString();
    }
        
    /**
     * clone
     */
    public Stand clone() {return new Stand(this);}
    
}
   