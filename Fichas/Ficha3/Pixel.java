package Ficha3;

import java.util.Scanner;

public class Pixel{
    private double x, y;
    private int cor;
    
    public Pixel(){
        this.x = 0;
        this.y = 0;
        this.cor = 0;
    }
    
    public Pixel(double x, double y, int cor){
        this.x = x;
        this.y = y;
        this.cor = cor;
    }
    
    public Pixel(Pixel p){
        this.x = p.getX();
        this.y = p.getY();
        this.cor = p.getCor();
    }
    
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public int getCor(){
        return this.cor;
    }
    
    public void setX(double x){ 
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public void setCor(int cor){
        this.cor = cor;
    }
    
    public void desloca (double x, double y){
        this.x += x;
        this.y += y;
    }
    
    public void mudarCor(int cor){
        if(cor>=0 && cor<=15) this.cor = cor;
    }
    
    public String nomeCor(){
        String corString = null;
        int cores = this.cor;
        switch(cores){
            case 0: corString = "Preto";
                    break;
            case 1: corString = "Azul-Marinho";
                    break;
            case 2: corString = "Verde Escuro";
                    break;
            case 3: corString = "Azul Petróleo";
                    break;
            case 4: corString = "Castanho";
                    break;
            case 5: corString = "Púrpura";
                    break;
            case 6: corString = "Verde Oliva";
                    break;
            case 7: corString = "Cinza claro";
                    break;
            case 8: corString = "Cinza escuro";
                    break;
            case 9: corString = "Azul";
                    break;
            case 10: corString = "Verde";
                    break;
            case 11: corString = "Azul turquesa";
                    break;
            case 12: corString = "Vermelho";
                    break;
            case 13: corString = "Fúcsia";
                    break;
            case 14: corString = "Amarelo";
                    break;
            case 15: corString = "Branco";
                    break;
        
        }
        return corString;
    }
                
    public Pixel clone(){
        return new Pixel(this);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Coordenada x: ").append(x).append("\n");
        sb.append("Coordenada y: ").append(y).append("\n");
        sb.append("Cor : ").append(cor).append("\n");
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || this.getClass()!=o.getClass()) return false;
        Pixel pix = (Pixel) o;
        return pix.getX() == x && pix.getY() == y && pix.getCor() == cor;
    }
}
