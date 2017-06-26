package Ficha2;
import java.util.Arrays;
import java.util.Scanner;


public class ex7{
   private static void printarr(String[] arr1, int[] arr2, double[] arr3){
       System.out.println("---ELEMENTOS DO ARRAY ---");
       for (int i = 0; i< arr1.length; i++){
           System.out.println(arr1[i]+ " - " +arr2[i]+ " - " +arr3[i]);
       }
       System.out.println("---------------------------");
   }
   
    private static int[] leVencimentos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza os vencimentos dos funcionários");
        int[] venc = new int[5];
        for (int i=0;i<venc.length;i++){
            venc[i] = sc.nextInt();
        }
        
        return venc;
    }
    
    private static String[] leCargos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza os cargos dos funcionários(Developer, Gestor,Administrador,CEO)");
        String[] cargos = new String[5];
        for (int i=0;i<cargos.length;i++){
            cargos[i] = sc.next();
        }
        
        return cargos;
    }
    
   private static double[] beneficios(String[] arr1, int[] arr2){
        double[] benef= new double[arr1.length];
       for(int i=0;i<arr1.length;i++){
           if (arr1[i].equals("Developer")){benef[i] = arr2[i]+(arr2[i]*0.05);}
           if (arr1[i].equals("Gestor")){benef[i] = arr2[i]+(arr2[i]*0.10);}
           if (arr1[i].equals("Administrador")){benef[i] = arr2[i]+(arr2[i]*0.20);}
           if (arr1[i].equals("CEO")){benef[i] = arr2[i]+(arr2[i]*0.30);}
       }
       
       return benef;
   }
   
     public static void main(){
       String[] x= leCargos();
       int[] y= leVencimentos();
       double[] z =beneficios(x,y);
       printarr(x,y,z);
        
    }
        
}
