package Ficha3;


/**
 * Write a description of class Complexo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Complexo{
    private double a;
    private double b;

    public Complexo(){
        this.a = 0;
        this.b = 0;
    }
    
    public Complexo(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public Complexo(Complexo c){
        this.a = c.getA();
        this.b = c.getB();
      
    }
    
    
    public double getA(){
        return this.a;
    }
    
    public double getB(){
        return this.b;
    }
    
    public void setA(double a){
        this.a = a;
    }
    
    public void setB(double b){
        this.b = b;
    }
    
    public Complexo conjugado(){
        //a+bi = a-bi
        double a = this.getA();
        double b = this.getB();
    
        return new Complexo(a,-b);
    }
    
    public Complexo soma(Complexo comp){
        
        double a = this.getA();
        double b = this.getB();
        
        double na = a+comp.getA();
        double nb = b+comp.getB();
        
        return new Complexo(na,nb);
    }
    
    public Complexo produto(Complexo comp){
        
        double a = this.getA();
        double b = this.getB();
    
        
        double na = this.a * a - this.b * b;
        double nb = this.b * a + this.a * b;
        
        return new Complexo(na,nb);
    }
    
    public Complexo reciproco(){
        double a = this.a;
        double b = this.b;
        
        double na = a/(a*a+b*b);
        double nb = b/(a*a+b*b);
        
        return new Complexo (na,-nb);
    }
    
    public Complexo clone(){
        return new Complexo(this);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(a).append("\n");
        sb.append(b).append("\n");
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Complexo c = (Complexo) o;
        return c.getA() == a && c.getB() == b;
    }
}