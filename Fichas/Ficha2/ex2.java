package Ficha2;

import java.util.Scanner;

public class ex2{
    
    private static int[] lerArrayInt(int n){
        Scanner sc = new Scanner (System.in);
        int[] arr;
        arr = new int [n];
        int val = 0;
        System.out.println("Insira valores: ");
        for(int i = 0; i<= n-1;i++){
            val = sc.nextInt();
            arr[i] = val;
        }
        
        return arr;
    }
    
    private static int minPos(int[] arr){
        int i,min=Integer.MAX_VALUE,pos = 0;
        for(i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                pos = i;
            }
        }
        System.out.println("O minimo do array: " +min+ " na posição: " +pos);
        return pos;
    }
    
     private static void printarr(int[] arr){
         System.out.println("---ELEMENTOS DO ARRAY ---");
         for (int i = 0; i< arr.length; i++){
             System.out.println("Elemento " + i + "- " + arr[i]);
         }
         System.out.println("---------------------------");
    }
    
    public static void main(){
        int [] x;
        int y;
        x = lerArrayInt(10);
        printarr(x);
        y = minPos(x);
    }
    
}
