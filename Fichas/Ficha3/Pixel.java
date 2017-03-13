package Ficha3;
import java.util.Scanner;

public class Pixel
{
  private double x,y;
  private int c;
  
  public Pixel (double x, double y, int c) { this.x= x; this.y = y;this.c = c;}
  public Pixel () { x=0; y = 0; c = 0;}
  public Pixel (Pixel p){
      x = p.getX();
      y = p.getY();
      c = p.getC();
  }
  
  public double getX(){ return x;}
  public double getY(){ return y;}
  public int getC(){return c;}
  
  public void setX(double x){this.x = x;}
  public void setY(double y){this.y = y;}
  public void setC(int c){this.c = c;}
  public void desloca(double x, double y){
      this.x += x;
      this.y += y;
  }
  
  public void deslCima(double val){this.desloca(0.0,val);}
  public void deslBaixo(double val){this.desloca(0.0,-val);}
  public void deslDir(double val){this.desloca(val,0.0);}
  public void deslEsq(double val){this.desloca(-val,0.0);}
      
  public void mudarCor(int cor){this.c = cor;}
  
  public String nomeCor(){
      String corString;
      int cores = this.c;
      switch(cores){
          case 0: corString="Preto";
                  break;
          case 1: corString="Azul Marinho";
                  break;
          case 2: corString="Verde escuro";
                  break;
          case 3: corString="Azul petróleo";
                  break;
          case 4: corString="Castanho";
                  break;
          case 5: corString="Púrpura";
                  break;
          case 6: corString="Verde Oliva";
                  break;
          case 7: corString="Cinza Claro";
                  break;
          case 8: corString="Cinza Escuro";
                  break;
          case 9: corString="Azul";
                  break;
          case 10: corString="Verde";
                   break;
          case 11: corString="Azul turquesa";
                   break;
          case 12: corString="Vermelho";
                   break;
          case 13: corString="Fúscia";
                   break;
          case 14: corString="Amarelo";
                   break;
          case 15: corString="Branco";
                   break;
          default: corString="Invalid color";
                   break;
        }
        return corString;
    }
}
