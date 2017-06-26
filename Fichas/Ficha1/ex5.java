package Ficha1;

import java.util.Scanner;

public class ex5{
    
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int x,soma = 0,maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        System.out.println("Insira os valores terminando em zero");
        do{
            x = inp.nextInt();
            soma+=x;
            if(maior<x) maior = x;
            if(menor>x && x!=0) menor = x;
        }while(x!=0);
        
        System.out.println("A soma dos números introduzidos é: " +soma+ " o maior é: " +maior+ " o menor é: " +menor);
        inp.close();
    }
}
