package Ficha1;

import java.util.Scanner;
import java.time.LocalDate;

public class ex8{
    
    public static int lerNumero(String nome, int min, int max){
        int aux;
        Scanner inp = new Scanner(System.in);
        
        do{
            System.out.print(nome+ " ["+min+ " .. "+max+" ]: ");
            aux = inp.nextInt();
        }while(aux<min || aux>max);
        
        return aux;
    }
    
    public static void main(String[] args){
        int dia, mes, ano, dsemana;
        LocalDate data;
        
        System.out.println("Indique dia mes ano: ");
        dia = lerNumero("dia",1,31);
        mes = lerNumero("mes",1,12);
        ano = lerNumero("ano",1901,2100);
        
        data = LocalDate.of(ano,mes,dia);
        System.out.println("O dia da semana é "+data.getDayOfWeek());
         
    }
}
