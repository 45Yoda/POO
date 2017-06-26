package Ficha2;


/**
 * Write a description of class ex4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ex4{
    
    private static void printarr(int[] arr){
       System.out.println("---ELEMENTOS DO ARRAY ---");
       for (int i = 0; i< arr.length; i++){
           System.out.println("Elemento " + i + "- " + arr[i]);
        }
       System.out.println("---------------------------");
    }
   
    private static int[] subArray(int[] arr,int i,int f){
        int[] sub = new int [f-i+1];
        int c=0;
        for(;i<=f;i++){
            sub[c] = arr[i];
            c++;
        }
        return sub;
    }
    
    public static void main(){
       int [] lista = {12, 2, 45, 66, 8, 23, 99};
       int [] a = subArray(lista,2,5);
       printarr(a);
    }
}

