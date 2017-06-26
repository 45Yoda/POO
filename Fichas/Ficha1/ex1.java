package Ficha1;

import java.util.Scanner;

public class ex1{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome;
        int saldo;
        
        System.out.println("Insira o seu nome");
        nome = input.nextLine();
        System.out.println("Insira o saldo");
        saldo = input.nextInt();
        
        System.out.println(""+nome+" o seu saldo é: "+saldo);
        input.close();
        
    }


} 
  