package exs;
import java.util.Scanner;
import java.lang.Math;

public class ex6
{
    
  private static int factorial(int x){
      int i, fact=1;
      for (i = 1; i <= x; i++){
          fact = fact*i;
      }
      
      return fact;
  }
  
  public static void main(String[] args){
      int x;
      double fact;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Introduza um número: ");
      x = input.nextInt();

      fact = factorial (x);
      System.out.println("O fatorial do número: " +x+ " é: " +fact);
      
  }
}
