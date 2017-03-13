package Ficha3;


public class ComplexoTest
{
    public void main(String args[]){
        Complexo c1 = new Complexo (10.3,20.4);
        Complexo c2 = new Complexo (15.2,15.1);
        
        Complexo a = c1.conjugado();
        System.out.println("Conjugado c1: " +a.getA()+ " "+ a.getB());
    }
}
