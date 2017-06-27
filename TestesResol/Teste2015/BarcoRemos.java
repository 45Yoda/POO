import java.util.ArrayList;
import java.util.TreeSet;
import java.io.Serializable;


public class BarcoRemos extends Barco implements Serializable{
    
    private double largura;
    
    public BarcoRemos(String id,double milhas,String categoria,double autonomia,Pessoa skip, TreeSet<Pessoa> trip,ArrayList<RegistoEtapa> listaReg,double largura){
        super(id,milhas,categoria,autonomia,skip,trip,listaReg);
        this.largura=largura;
    }
    public BarcoRemos(BarcoRemos b){
        super(b);
        this.largura=b.getLargura();
    }

    public double getLargura(){return this.largura;}
    
    
    @Override
    public BarcoRemos clone(){
        return new BarcoRemos(this);
    }
}
