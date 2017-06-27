
public class questao5{
    
    public double qtsKmsTotal(){
        int tot = 0;
        for(Empregado e: this.empregados.values()){
            if(e instanceof Motorista){
                tot+=e.gtNKms();
            }
        }
        return tot;
    }
}
