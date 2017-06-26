package Ficha2;

import java.util.Scanner;

public class ex3{
    
   private static int [] lerArrayInt(int n){
        Scanner sc = new Scanner (System.in);
        int[] arr;
        arr = new int [n];
        int temp;
        int val = 0;
        int tmp;
        for(int i =0; i<= n-1; i++){
            val = sc.nextInt();
            arr[i] = val;
            for(int j = i; j>0;j--){
                if(arr[j] > arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }   
        
        return arr; 
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
    System.out.println("Insira valores: ");
    x = lerArrayInt(10);
    printarr(x);
   } 
}