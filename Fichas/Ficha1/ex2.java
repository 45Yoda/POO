package Ficha1;

import java.util.Scanner;

public class ex2{
    
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int x,y;
        float med;
    
        System.out.println("Insira dois números: ");
        x = inp.nextInt();
        y = inp.nextInt();
        
        med = (x+y)/2;
        if(x<y){
            System.out.println("Os números por ordem decrescente são: " + y + " " + x + " e a sua média é: " + med);
        }
        else{
            System.out.println("Os números por ordem decrescente são: " + x + " " + y + " e a sua média é: " + med); 
    
        }
    }
}
