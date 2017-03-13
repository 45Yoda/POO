package Ficha2.exs;

import java.util.Scanner;

public class ex6a
{
  public static String[] criarArray () {
      int t=0;
    String[] arr = {"A","tua","prima","no","fim"};
    Scanner sc=new Scanner (System.in);
    System.out.println("Intruduza 's' ou 'r'");
    char a=sc.next().charAt(0);
    if (a=='s') {
        System.out.println("Introduza a palavra a substituir:");
        String b = sc.next();
        
        System.out.println("Introduza a palavra pela qual quer substituir:");
        String c = sc.next();
        for (int i=0;i<arr.length;i++)
            if (arr[i].equals(b)) arr[i]=c;
    }
    else 
    {
        System.out.println("Introduza a palavra a eliminar:");
        String d = sc.next();
        for(int i=0;i<arr.length;i++)
        if (arr[i].equals(d)) {
        for (int l=i;l<arr.length-1;l++) {
            arr[l]=arr[l+1];
            
        }
        t++;
        i-=1;
    }
    }
    for(int i=0;i<arr.length-t;i++)
    System.out.println(arr[i]);
return arr;
}
}
