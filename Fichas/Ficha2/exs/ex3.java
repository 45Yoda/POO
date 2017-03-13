package Ficha2.exs;
import java.util.Arrays;
import java.util.Scanner;


public class ex3
{
   private static int [] lerArrayInt(int n){
        Scanner sc = new Scanner (System.in);
        int[] arr;
        arr = new int [n];
        int val = 0;
        int tmp;
        for(int i =0; i<= n-1; i++){
            val = sc.nextInt();
            arr[i] = val;
            for (int j =i;j>0;j--){
                if (arr[j] > arr[j-1]){
                tmp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= tmp;
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
    x = lerArrayInt(10);
    printarr(x);
   } 
}
