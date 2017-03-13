package exs;
import java.util.Scanner;
import java.time.LocalDate;

public class ex8
{
  private static int lerNumero(String nome, int min, int max){
      int aux;
      Scanner input = new Scanner(System.in);
      do{
          System.out.print(nome+ " ["+min+" .. "+max+" ]: ");
          aux = input.nextInt();
        }while(aux<min || aux>max);
        return aux;
  }
    
  public static void main(String[] args){
     int dia,mes,ano,dsemana;
     LocalDate data;
     
     System.out.println("Indique dia mes ano: ");
     dia = lerNumero("dia",1,31);
     mes = lerNumero("mes",1,12);
     ano = lerNumero("ano",1901,2100);
     
     data = LocalDate.of(ano,mes,dia);
     System.out.println("O dia da semana é "+data.getDayOfWeek());
  }
}
