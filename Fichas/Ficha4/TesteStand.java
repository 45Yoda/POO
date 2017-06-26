package Ficha4;


/**
 * Classe de teste das classes Stand e Veículo.
 * 
 * Neste exercício faça:
 * 
 * 1a) forneça o código necessário (nas classes Stand e TesteStand) para que 
 *    código funcione correctamente
 * 1b) compile, execute e coloque mais testes no método main
 * 
 * 2) Crie, no método main, um sistema de menus, por forma a que seja
 *    o utilizador a inserir os dados que pretende testar.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesteStand {

  public static void main(String[] args) {
    Veiculo v1, v2, v3, v4, v5;
    Veiculo d1, d2, d3, d4, d5;
    Stand veiculos_utilitarios;
    Stand veiculos_desportivos;
    
    //chamar os construtores (completar!)
    v1 = new Veiculo("01-01-AA",55,34,56,30,6);
    v2 = new Veiculo("05-05-ZZ",54,54,87,65,4);
    v3 = new Veiculo("54-76-SD",64,35,10,35,15);
    v4 = new Veiculo("32-43-GF",67,64,65,20,10);
    v5 = new Veiculo("04-43-JH",78,54,76,30,30);
    
    d1 = new Veiculo("47-55-YT",235,54,77,30,29);
    d2 = new Veiculo("37-25-JH",434,345,45,40,26);
    d3 = new Veiculo("55-85-KF",64,45,75,50,30);
    d4 = new Veiculo("38-84-WB",46,43,24,32,5);
    d5 = new Veiculo("93-56-LG",654,654,55,50,20);
    
    veiculos_utilitarios = new Stand("Garagem Veiculos Baratos", 10);
    
    veiculos_utilitarios.insereVeiculo(v1);
    veiculos_utilitarios.insereVeiculo(v2);
    veiculos_utilitarios.insereVeiculo(v3);
    veiculos_utilitarios.insereVeiculo(v4);
    veiculos_utilitarios.insereVeiculo(v5);
    
    veiculos_desportivos = new Stand("Garagem Auto Luxo", 10);
    
    veiculos_desportivos.insereVeiculo(d1);
    veiculos_desportivos.insereVeiculo(d2);
    veiculos_desportivos.insereVeiculo(d3);
    veiculos_desportivos.insereVeiculo(d4);
    veiculos_desportivos.insereVeiculo(d5);

    
    System.out.println("Informações do Stand " + veiculos_utilitarios.getNomeStand());
    System.out.println("--------------------------");
    System.out.println("Número de veículos: " + veiculos_utilitarios.getNVeiculos());
    System.out.println("Veículos: ");
    System.out.println(veiculos_utilitarios.toString());
    
    System.out.println("Informações do Stand " + veiculos_desportivos.getNomeStand());
    System.out.println("--------------------------");
    System.out.println("Número de veículos: " + veiculos_desportivos.getNVeiculos());
    System.out.println("Veículos: ");
    System.out.println(veiculos_desportivos.toString());

    
    //o v1 está no stand?
    
    System.out.println("v1 está no stand? " + veiculos_utilitarios.existeVeiculo(v1));
    
    System.out.print("Veículo com mais kms: ");
    Veiculo vx = veiculos_utilitarios.veiculoComMaisKms();
    System.out.println(vx.toString());
    
    
    //....
    // mais operações
      
    
    
  }    
    
    
}
