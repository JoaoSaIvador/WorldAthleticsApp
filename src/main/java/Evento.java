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

    public Evento(String nome, Data dataInicio, Data dataFim, String local, Pais pais) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        this.pais = pais;
        this.listaProvas = new ArrayList<>();
        this.listaMinimosProvas = new HashMap<>();
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

    public String getPais() {
        return pais.toString();
    }

    public ArrayList<Prova> getListaProvas() {
        return listaProvas;
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
        this.listaProvas.add(prova);
    }

    public void removerProva(Prova prova) {
        this.listaProvas.remove(prova);
    }

    public boolean isProvaAdicionada(Prova prova) {
        return  listaProvas.contains(prova);
    }

    public void inserirMinimos(Map<String, Float> minimos) {
        this.listaMinimosProvas.putAll(minimos);
    }

    public Float getMinimosProva(String prova) {
        if(this.listaMinimosProvas.containsKey(prova)) {
            return this.listaMinimosProvas.get(prova);
        }
        return null;
    }

    public String toString(){
        return  this.nome;
    }
}
