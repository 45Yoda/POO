package Ficha3;

public class Veiculo{

    private static int reserva = 10;
    private String matricula;
    private double kmsTotal;
    private double kmsParcial;
    private double consumoMedio;
    private int capacidade;
    private int conteudo;
    
    public Veiculo(String m,double kmt, double kmp, double cm, int cap, int cont){
        this.matricula = m;
        this.kmsTotal = kmt;
        this.kmsParcial = kmp;
        this.consumoMedio = cm;
        this.capacidade = cap;
        this.conteudo = cont;
    }
    
    public Veiculo(){
        this.matricula = null;
        this.kmsTotal = 0;
        this.kmsParcial = 0;
        this.consumoMedio = 0;
        this.capacidade = 0;
        this.conteudo = 0;
    }
    
    public Veiculo (Veiculo v){
        this.matricula = v.getMat();
        this.kmsTotal = v.getKMT();
        this.kmsParcial = v.getKMP();
        this.consumoMedio = v.getCM();
        this.capacidade = v.getCap();
        this.conteudo = v.getCont();
    }
    
    public String getMat(){ return matricula;}
    public double getKMT(){ return kmsTotal;}
    public double getKMP(){ return kmsParcial;}
    public double getCM(){return consumoMedio;}
    public int getCap(){ return capacidade;}
    public int getCont(){ return conteudo;}
    
        
    public void setMat(String matricula){this.matricula=matricula;}
    public void setKMT(double kmsTotal){this.kmsTotal=kmsTotal;}
    public void setKMP(double kmsParcial){this.kmsParcial=kmsParcial;}
    public void setCM(double consumoMedio){this.consumoMedio=consumoMedio;}
    public void setCap(int capacidade){this.capacidade=capacidade;}
    public void setCont(int conteudo){this.conteudo=conteudo;}
    
    public void abastecer(int litros){
        if(conteudo + litros >= capacidade) this.conteudo = capacidade;
        else this.conteudo += litros;
    }
    
    public void resetKms(){
        kmsParcial = 0;
        consumoMedio = 0;
    }
    
    public double autonomia(){
        return ((conteudo*100)/kmsTotal);
    }
    
    public void registarViagem(int kms, double consumo){
        kmsTotal += kms;
        this.consumoMedio = consumo*100/kms;
        this.conteudo -= consumoMedio;
    }
    
    public boolean naReserva(){
        return (conteudo<reserva);
    }
    
    public double totalCombustivel(double custoLitro){
        return kmsParcial * consumoMedio * custoLitro;
    }
    
    public double custoMedioKm(double custoLitro){
        return (consumoMedio * 100)/custoLitro;
    }
    
    public Veiculo clone(){
        return new Veiculo(this);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A matrícula é: ").append(matricula).append("\n");
        sb.append("Os kms totais são: ").append(kmsTotal).append("\n");
        sb.append("Os kms parciais são: ").append(kmsParcial).append("\n");
        sb.append("O consumo médio é: ").append(consumoMedio).append("\n");
        sb.append("A capacidade é: ").append(capacidade).append("\n");
        sb.append("O conteudo é: ").append(conteudo).append("\n");
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || this.getClass() != o.getClass()) return false;
        Veiculo v = (Veiculo) o;
        return v.getMat().equals(matricula) &&
               v.getKMT() == kmsTotal &&
               v.getKMP() == kmsParcial && 
               v.getCM() == consumoMedio &&
               v.getCap() == capacidade &&
               v.getCont() == conteudo;
    }
    
    
}


