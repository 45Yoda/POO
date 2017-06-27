
/**
 * Write a description of interface IParque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IParque{
    public void entra(String cartao, String matricula) throws SemPermissaoException;
    public void sai(String matricula) throws VeiculoNaoExisteException;
    public boolean noParque(String matricula);
    public boolean equals(Object o);
    
}
