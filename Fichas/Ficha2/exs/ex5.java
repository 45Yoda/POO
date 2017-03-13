package Ficha2.exs;
import java.util.Arrays;
import java.util.Scanner;


public class ex5
{
    private static void printarr(int[] arr){
       System.out.println("---ELEMENTOS DO ARRAY ---");
       for (int i = 0; i< arr.length; i++){
           System.out.println("Elemento " + i + "- " + arr[i]);
        }
       System.out.println("---------------------------");
   
    }
    private static int[] arrayConcat(int[] arr1, int[] arr2){
        int alen = arr1.length;
        int blen = arr2.length;
        int [] c = new int[alen+blen];
        System.arraycopy(arr1,0,c,0,alen);
        System.arraycopy(arr2,0,c,alen,blen);
        Arrays.sort(c);
        return c;
    }
    
    public static void main(){
        int [] lista = {12, 2, 45, 66, 8, 23, 99};
        int [] list = {12, 2, 45};
        int[] a = arrayConcat(lista,list);
        printarr(a);
    
    }
}
