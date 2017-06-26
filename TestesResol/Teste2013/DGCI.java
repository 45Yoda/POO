
import java.util.Map;

public class DGCI{
    
    private Map<String,Contribuinte> utentes;
    
    public void regista(Contribuinte c) throws ContribuinteJaExiste{
        
        if(this.utentes.containsKey(c.getNif())){ throw new ContribuinteJaExiste("Contribuinte já existe");}
        
        else{ this.utentes.put(c.getNif(),c);}
    }
}
