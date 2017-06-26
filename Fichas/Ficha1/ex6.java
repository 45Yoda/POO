package Ficha1;

import java.util.Scanner;

public class ex6{
    
    public static double factorial(int x){
        int i;
        double fact=1;
        
        for(i=x;i>0;i--){
            fact*=i;
        }
        return fact;
    }
    
    public static void main(String[] args){
        
        Scanner inp = new Scanner(System.in);
        int x;
        double fact;
        System.out.println("Insira um número: ");
        
        x = inp.nextInt();
        fact = factorial(x);
        
        System.out.println("O factorial de "+x+ " é: " +fact);
        inp.close();
    
    }
}
