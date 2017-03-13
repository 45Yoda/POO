package exs;
import java.util.Scanner;

public class ex1{
    
    private static String geraSaudacao(String n, int s){
        return "Olá " +n+ " o teu saldo é " +s;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome;
        int saldo;
        
        System.out.println("Nome: ");
        nome = input.nextLine();
        System.out.println("Saldo: ");
        saldo = input.nextInt();
        
        System.out.println(ex1.geraSaudacao(nome,saldo));
        input.close();
    }
    
}
