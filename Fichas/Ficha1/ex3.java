package Ficha1;

import java.util.Scanner;

public class ex3{
    
    public static void main(String[] args){
        
        Scanner inp = new Scanner(System.in);
        int x,i;
        int s = 0;
    
        System.out.println("Insira os números");
    
        for(i =0;i<10;i++){
            x = inp.nextInt();
            if(x>5) s++;
        }
        
        System.out.println("Inseriu: " +s+ " números maiores que 5");
        inp.close();
    }
}
