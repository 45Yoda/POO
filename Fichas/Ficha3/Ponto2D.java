package Ficha3;
import static java.lang.Math.abs;

public class Ponto2D{
    private double x,y;
    
    public Ponto2D(double cx, double cy) { x =cx; y=cy;}
    public Ponto2D(){this(0.0,0.0);}
    public Ponto2D(Ponto2D p) {x=p.getX(); y=p.getY();}
    
    public double getX() {return x;}
    public double getY() {return y;}

    public void incCoord(double dx, double dy){
        x += dx; y += dy;
    }
    
    public void decCoord(double dx, double dy){
        x -= dx; y -= dy;
    }
    
    public void somaPonto(Ponto2D p){
        x += p.getX(); y += p.getY();
    }
    
    public Ponto2D somaPonto(double dx, double dy){
        return new Ponto2D(x+dx, y+dy);
    }
    
    public boolean simetrico(){
        return abs(x) == abs(y);
    }
    
    public boolean coordPos(){
        return x>0 && y>0;
    }
    
    public boolean igual(Ponto2D p){
        if (p!=null)
            return (x==p.getX() && y==p.getY());
        else
            return false;
    }
    
    public boolean igual1(Ponto2D p){
        return (p==null) ? false : x == p.getX() && y == p.getY();
    }
    
    public String toString(){
        return new String("Pt2D = " + x + ", " + y);
    }
    
    public Ponto2D clone(){
        return new Ponto2D(this);
    }
}
    
