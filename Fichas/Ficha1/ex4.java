package Ficha1;

import java.util.Scanner;

public class ex4{
    
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n,i,x;
        
        System.out.println("Quantos números vai inserir?");
        n = inp.nextInt();
        
        for(i=0;i<n;i++){
            System.out.println("Valor: ");
            x = inp.nextInt();
            System.out.println("A sua raiz quadrada é: " + Math.sqrt(x));
        }
        inp.close();
    }
}
