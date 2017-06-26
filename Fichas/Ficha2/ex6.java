package Ficha2;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class ex6{
   
  private static String[] criaArray(){
       Scanner sc = new Scanner (System.in);
       System.out.println("Introduza uma série de palavras(uma em cada linha) terminada em fim: ");
       int i = 0;
       String[] arr = new String [10];
       while(sc.hasNext()){
           arr[i] = sc.next();
           if (arr[i].equals("fim")){
               break;
           }
           i++;
       }
       return arr;
  }
   
  public static String[] op(String[] arr){
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduza o caracter 's' ou 'r' : ");
      String x = sc.next();
      if (x.equals("s")){
          System.out.println("Introduza a palavra que queira substituir: ");
          String a = sc.next();
          System.out.println("Introduza a palavra pela qual quer substituir:");
          String b = sc.next();
          for (int i=0;i<arr.length;i++){
              if (arr[i].equals(a)) {arr[i]=b; break;}
       }
      }
      if (x.equals("r")){
          System.out.println("Introduza a palavra que quer remover: ");
          String c = sc.next();
          for (int i=0;i<arr.length;i++){
              if (arr[i].equals(c)){
                  for (int l = i;l<arr.length-1;l++){
                      arr[l]=arr[l+1];
                   }
                   break;
              }
          }

              
       }
       
      return arr;
     
   }
    
   private static void printarr(String[] arr){
       System.out.println("---ELEMENTOS DO ARRAY ---");
       for (int i = 0; i< arr.length; i++){
           System.out.println("Elemento " + i + "- " + arr[i]);
        }
        System.out.println("---------------------------");
   }
   
     
   public static void main(){
       String[] arr = criaArray();
       String[] wel = op(arr);
       printarr(wel);
   }
}
