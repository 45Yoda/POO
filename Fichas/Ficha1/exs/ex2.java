package exs;
import java.util.Scanner;

public class ex2
{  
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int a,b;
      float media;
      System.out.println("Números: ");
      a = input.nextInt();
      b = input.nextInt();
      media = (a+b)/2;
      if (a<b){
          System.out.println("O maior é: " + (Math.max(a,b))+ " e a sua média é: " +media);
      
      
    }
  }
    
}
