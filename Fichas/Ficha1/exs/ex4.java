package exs;
import java.util.Scanner;
import java.lang.Math;

public class ex4{
  
    public static void main(String[] args){
        int x,i,n;
        double s;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos números vai introduzir?: ");
        n = input.nextInt();
        System.out.println("Introduza os : " + n+ " números");
        
        for (i=0; i<n ; i++){
             x = input.nextInt();
             s = Math.sqrt(x);
             System.out.println("A raiz quadrado desse número é: " +s);
             
        }
        input.close();
    }
}