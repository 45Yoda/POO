package St;

public class exame{
   
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("O email é: ").append(email).append("\n");
        sb.append("O nome é : ").append(nome).append("\n");
        sb.append("O nif é : ").append(nif).append("\n");
        for(Viagem v: this.viagens){
            sb.append("A sua viagem: ").append(v.toString());
        }
        for(Map.Entry<String,Cliente> c : this.clientes.entrySet()   ){
            sb.append(c.getKey()).append("-");
            sb.append(c.getValue().toString()).append("\n");
        }
        
        
        
        
        
         for(Map.Entry<String,Set<Cliente>> entry : this.clientes.entrySet()){
            sb.append(entry.getKey());
            Set<Cliente> e = new Set<Cliente>();
            e = entry.getValue();
            for(Cliente cli : e){
                sb.append(cli.toString());
            }
        }
        
        
        return sb.toString();
    }
    
    
    public void insereVeiculo(Veiculo v) throws VeiculoExisteException{
        if(this.veiculos.containsValue(v)) throw new VeiculoExisteException("Já existe");
        else this.veiculos.put(v.getMatricula(),v.clone());
    }
    
    
    public List<Viagem> getViagensByDate(String cliente){
        
    }
    
    
    public class Comparador implements Serializable{
    
        public int compare(LocalDateTime t1, LocalDateTime t2){
            if(t1.isBefore(t2)) return -1;
            else return 1;
        }
    }
    
    
    
    /** Pergunta 6
     * Na classe UMer era necessário uma variavel assim
     * 
     * private List<Factura> historico;
     * 
     * para consultar faziamos dado um codigo (String codFactura);
     *
     * for(Factura f : this.historico)
     *      if(f.getCodigo().equals(codFactura)) return f;
     *      
     *ou
     *
     *private Map<String,Factura> hist; (string é o codigoDa Factura);
     *
     *return this.hist.get(codFactura);
     * 
     */
    
    /**
     * Pergunta 7
     * ver como usar o PrintWriter em https://stackoverflow.com/questions/25298582/how-to-use-printwriter-to-create-and-write-to-a-file
     */
    
    public void facturasDoMes(int mes,String ficheiro) throws IOException{
        PrintWriter pw = new PrintWriter("ficheiro");
        for(Factura f : this.historico){
            if(f.getMes().equals(mes)) //considerando que getMes existe dentro da classe Factura
                pw.print(f.toString());
        }
        
        pw.close();
       
    }
    
    /**
     * Pergunta 8
     */
    
    /** (a)
     * As mudancas feitas era na classe FacturaInternacional que ficaria assim
     * public class FacturaInternacional extends Factura
     */
    
    public double PrecoSemImpostos(){
        //vai buscar o preco a classe Factura(este tem imposto incluido)
        double preco = super.getPreco();
        //descobres o valor do imposto sobre o preço
        double imp = preco *0.13;
        //tiras ao valor do preco o imposto para saberes quanto foi sem Impostos
        return preco - imp;
    }
    
    public double valorImposto(){
        double preco = super.getPreco();
        double imp = preco*0.13;
        return imp;
    }
     
    
    /**
     * (b)
     */
    
    public double montanteImposto(){
        double valor;
        
        for(Factura f: this.historico){
            //ver se a factura é uma factura internacional
            if(f instanceof FacturaInternacional){
                valor += f.getPreco()
                
                //valor += f.valorImposto()
            }
        }
    }
   
    
    /**
     * Parte 3
     * 
     */
    
    /**Pergunta 9*/
    
    
    public class VeiculoEletrico extends Veiculo{
        
        private int numBaterias;
        private double capacidade;      
    
        public double getAutonom(){
            double aut = super.getAutonomia();
            return aut + (aut*0.40);
        }
        
        public double getFiab(){
            double fi = super.getFiabilidade();
            return fi + (fi / (2/3));
        }
    }
    
    
    public class BicicletaTandem extends Veiculo{
    
        private String material;
        private String marca;
        
        
        public double getAutonom(){
            double aut = super.getAutonomia();
            return aut + (aut*0.25);
        }
        
        public double getFiab(){
            double fi = super.getFiabilidade();
            return fi;
        }
                    
    }
    
    /** Pergunta 10 */
    public void gravaEcologicos(String ficheiro) throws IOException{
        //olhando para a api ObjectOutputStream
        
        //Abrir o ficheiro para escrita em binário (quando pede em ficheiro de texto é com o PrintWriter)
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(ficheiro));
        //vamos percorrer apenas os Veiculos do Map<String,Veiculo> da classe UMer
        for(Veiculo v: this.veiculos.values()){
            //vemos se o veiculo é do tipo eletrico ou bicicletatandem
            if(v instanceof VeiculoEletrico || v instanceof BicicletaTandem){
                //verificamos se a autonomia é maior atraves do metodo definido na ultima alinea
                if(v.getAutonom() > 50)
                    //escrevemos no ficheiro o veiculo
                    os.writeObject(v);
            }
        }
        
        //no fim temos de fazer flush e fechar o ObjectOutputStream
        
        os.flush();
        os.close();
    }
    
    
    /** Pergunta 11 */
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        VeiculoEletrico ve = (VeiculoEletrico) o;
        return super.equals(ve) 
            && ve.getNBaterias() == numBaterias 
            && ve.getCapacidade() == capacidade;
    }
    
    
    
    
    
    }
    
}
