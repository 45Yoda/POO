package exs;
import java.util.Scanner;

public class ex3{
  
    public static void main(String[] args){
        int c=0,i,n;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza 10 números: ");
        
        for(i=0;i<10;i++){
            n = input.nextInt();
            if(n>5){c++;}
        }
        System.out.println("Introduziu " +c+ " números maiores que 5");
    
        input.close();
    }
}
