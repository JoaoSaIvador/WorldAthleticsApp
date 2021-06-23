import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Evento {
    private String nome;
    private Data dataInicio;
    private Data dataFim;
    private String local;
    private Pais pais;
    private ArrayList<Prova> listaProvas;
    private Map<String, Float> listaMinimosProvas;
    private Map<Prova, ArrayList<Atleta>> listaAtletasPorProva;
    private Map<Prova, ArrayList<EtapaProva>> listaEtapasPorProva;

    public Evento(String nome, Data dataInicio, Data dataFim, String local, Pais pais) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        this.pais = pais;
        this.listaProvas = new ArrayList<Prova>();
        this.listaMinimosProvas = new HashMap<String, Float>();
        this.listaAtletasPorProva = new HashMap<Prova, ArrayList<Atleta>>();
        this.listaEtapasPorProva = new HashMap<Prova, ArrayList<EtapaProva>>();
    }

    public String getNome() {
        return nome;
    }

    public Data getDataInicio() {
        return dataInicio;
    }

    public Data getDataFim() {
        return dataFim;
    }

    public String getLocal() {
        return local;
    }

    public Pais getPais() {
        return pais;
    }

    public ArrayList<Prova> getListaProvas() {
        return listaProvas;
    }

    public Map<Prova, ArrayList<Atleta>> getListaAtletasPorProva() {
        return listaAtletasPorProva;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void adicionarProva(Prova prova) {
        listaProvas.add(prova);
        listaAtletasPorProva.put(prova, new ArrayList<Atleta>());
        listaEtapasPorProva.put(prova, new ArrayList<EtapaProva>());
    }

    public void removerProva(Prova prova) {
        listaProvas.remove(prova);
        listaMinimosProvas.remove(prova.getNome());
        listaAtletasPorProva.remove(prova);
        listaEtapasPorProva.remove(prova);
    }

    public boolean isProvaAdicionada(Prova prova) {
        return  listaProvas.contains(prova);
    }

    public void inserirMinimos(Map<String, Float> minimos) {
        this.listaMinimosProvas.putAll(minimos);
    }

    public void inserirMinimo(Float minimo, String prova) {
        this.listaMinimosProvas.put(prova, minimo);
    }

    public Float getMinimosProva(String prova) {
        if(this.listaMinimosProvas.containsKey(prova)) {
            return this.listaMinimosProvas.get(prova);
        }
        return null;
    }

    public ArrayList<Atleta> getAtletasProva(Prova prova) {
        return listaAtletasPorProva.get(prova);
    }

    public ArrayList<EtapaProva> getEtapasProvas(Prova prova) {
        return listaEtapasPorProva.get(prova);
    }

    public String toString(){
        return  this.nome;
    }
}
