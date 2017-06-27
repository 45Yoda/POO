Parte 1

public boolean equals(Object o){
    if(this == o) return true;
    if(o == null || this.getClass() != o.getClass()) return false;
    FichaReg fr = (FichaReg) o;
    return fr.getEstufa().equals(estufa)
        && fr.getTemp() == temp
        && fr.getHumidade() == humidade;
}

public class RegistoEstufas{
    private TreeMap<Tempo,FichaReg> registos;

    public RegistoEstufas(){registos = new TreeMap<Tempo,FichaReg>();}
    public RegistoEstufas(TreeMap<Tempo,FichaReg>regs){}
    public RegistoEstufas(RegistoEstufas reg){}

    public int nRegistos(int hora, int minuto){
        int total = 0;
        for(Map.Entry<Tempo,FichaReg> reg: this.registos){
            Tempo t = reg.getKey();
            int horas = t.getHora();
            int mins = t.getMin();
            if(hora == horas && min == mins) total++;
        }
        return total;
    }

    public void addFicha(FichaReg r){
        GregorianCalendar tempo = new GregorianCalendar();
        Tempo t = new Tempo(tempo.get(Calendar.HOUR_OF_DAY),
                            tempo.get(Calendar.MINUTE),tempo.get(Calendar.SECOND));
        this.registos.put(t,r);
    }

    public ArrayList<FichaReg> registosHora(int h){
        ArrayList<FichaReg> reg = new ArrayList<FichaReg>();
        for(Map.Entry<Tempo,FichaReg> f : this.registos.entrySet()){
            if(f.getKey().getHora() == h) reg.add(f.getValue());
        }
    }

    public ArrayList<Double> humidadeEst(String estufa){
        ArrayList<Double> humids = new ArrayList<Double>();
        for(FichaReg f: this.registos.values()){
            if(f.getEstufa().equals(estufa)) humids.add(f.getHumidade());
        }
        return humids;
    }

    public boolean ultrapassouEst(double temp){
        for(FichaReg f: this.registos.values()){
            if(f.getTemp() == temp) return true;
        }
        return false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Tempo t: registos.keySet()){
            sb.append("Horas: ").append(t.toString()).append("\n");
            sb.append(registos.get(t).toString()).append("\n");
        }
        return sb.toString();
    }

    public TreeMap<Tempo,FichaReg> getRegistos(){
        TreeMap<Tempo,FichaReg> a = new TreeMap<Tempo,FichaReg>();
        a = this.registos.stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue().clone()));
        return a;
    }
}

Parte 2

public abstract class Estufa{
    private String cod;
    private double area;
    private double tempMin;
    private double tempMax;

    public Estufa(Estufa est){
        cod = est.getCodigo();
        area = est.getArea();
        tempMin=est.getTempMin();
        tempMax = est.getTempMax();
    }
}

public class EstufaDeFlores{
    private static VALOR_AREA = 0.0;
    public static void setValorArea(double val){VALOR_AREA = val;}
    private String nome;
    private ArrayList<String> cores = new ArrayList<String>();

    public EstufaDeFlores(EstufaDeFlores estF){
        super((Estufa)estF);
        nome = estF.getNome();
        cores = estF.getCores().clone();
    }

    public double valorTotal(){ return this.getArea() * VALOR_AREA; }
}

public double areaTotal(){
    double area = 0.0;
    for(Estufa est: infoEstufas.values())
        area += est.getArea();
    return are;
}

public TreeSet<String> emRisco(int hora){
    TreeSet<String> codigos = new TreeSet<String>();
    TreeMap<Tempo,FichaReg> regs = regEstufas.getRegistos();
    TreeSet<FichaReg> regsDaHora = new TreeSet<FichaReg>();
    for(Tempo t: regs.keySet())
        if(t.gteHora() == h) regsDaHora.add(regs.get(t));
    Estufa estf = null;
    double tempReg = 0.0;
    for(FichaReg f: regsDaHora){
        tempReg = f.getTemp();
        estf = infoEstufas.get(f.getCodigo());
        if(estf.getTempMax() >= tempReg || estf.getTempMin() <= tempReg)
            codigos.add(estf.getCodigo);
    }
    return codigos;
}

public double perdaActualFlores(int hora){
    double prej = 0.0;
    Estufa estf = null;
    TreeSet<String> codigos = this.emRisco(hora);
    for(String codEst : codigos){
        estf = infoEstufas.get(codEst);
        if(estf.getClass().getSimpleName().equals("EstufaDeFlores"))
            prej += estf.valorTotal();
    }
    return prej;
}
