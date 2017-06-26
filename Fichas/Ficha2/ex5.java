package Ficha2;

import java.util.Arrays;
import java.util.Scanner;


public class ex5{
    
     private static void printarr(int[] arr){
       System.out.println("---ELEMENTOS DO ARRAY ---");
       for (int i = 0; i< arr.length; i++){
           System.out.println("Elemento " + i + "- " + arr[i]);
        }
       System.out.println("---------------------------");
   
    }
    
    private static int[] arrayConcat(int[] arr1, int[] arr2){
        int i,j = 0;
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] conc = new int[l1+l2];
        System.arraycopy(arr1,0,conc,0,l1);
        System.arraycopy(arr2,0,conc,l1,l2);
        Arrays.sort(conc);
        return conc;
    }
    
    
    public static void main(){
        int [] lista = {12, 2, 45, 66, 8, 23, 99};
        int [] list = {12, 2, 45};
        int[] a = arrayConcat(lista,list);
        printarr(a);
    
    }
}
