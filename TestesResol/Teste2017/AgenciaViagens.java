
/**
 * Write a description of class AgenciaViagens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgenciaViagens{
    
    private Map<String,Hotel> hoteis;
    private Map<String,List<Int>> hoteisNif;
    
    public void gravaFichTxt(String tipoHotel, String nomeFicheiro) throws IOException{
        PrintWriter pw = new PrintWriter(nomeFicheiro);
        for(Hotel h: this.hoteis.values()){
            if(h instanceof tipoHotel){
                if(!this.hoteisNif.get(h.getCodigo()).isEmpty())
                    pw.print(h);
            }
        }
        pw.flush();
        pw.close();
        
    }
    
    public static AgenciaViagens abrirFicheiro(String nomeFicheiro){
        FileInputStream in = new FileInputStream(nomeFicheiro);
        
        ObjectInputStream objIn = new ObjectInputStream(in);
        
        try {AgenciaViagens agencia = (AgenciaViagens) objIn.readObject();}
        catch(ClassNotFoundException e){ return new AgenciaViagens();}
        catch(IOException e){ return new AgenciaViagens();}
        
        objIn.close();
        
        return agencia;
    
    }
  
    public class AgenciaViagens implements Serializable{}
    public class Hotel implements Serializable{}
}
