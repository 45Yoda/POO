import java.util.TreeSet;
import java.util.ArrayList;
import java.io.Serializable;
public class BarcoCatamaran extends Barco implements Serializable{
    
    private double areaVela;
    private double seguro;
    
    public BarcoCatamaran(String id,double milhas,String categoria,double autonomia,Pessoa skip,TreeSet<Pessoa> trip,ArrayList<RegistoEtapa> listaReg,double areaVela,double seguro){
        super(id,milhas,categoria,autonomia,skip,trip,listaReg);
        this.areaVela=areaVela;
        this.seguro=seguro;
    }
    public BarcoCatamaran(BarcoCatamaran b){
        super(b);
        this.areaVela=b.getAreaVela();
        this.seguro=b.getSeguro();
    }
    
    public double getAreaVela(){return this.areaVela;}
    public double getSeguro(){
        return getMilhas()*0.02;
    }
    
    @Override
    public BarcoCatamaran clone(){
        return new BarcoCatamaran(this);
    }
}

