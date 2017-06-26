package Ficha1;

import java.util.Scanner;
import java.time.LocalDateTime;

public class ex7{

    private static int factorial(int x){
      int i, fact=1;
      for (i = 1; i <= x; i++){
          fact = fact*i;
      }
      
      return fact;
    }
    
    public static void main(String[] args){
        long x,y,z;
        x = System.currentTimeMillis();
        LocalDateTime antes = LocalDateTime.now();
        System.out.println("Hora antes do ciclo: " +antes);
        factorial(1000000);
        y = System.currentTimeMillis();
        LocalDateTime depois = LocalDateTime.now();
        System.out.println("Hora depois do ciclo: " +depois);
        z = y-x;
        System.out.println("Total de milisegundos que o ciclo demorou: "+z);
    }
}
