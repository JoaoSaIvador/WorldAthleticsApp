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
    private Map<Prova, ArrayList<Atleta>> topAtletasPorProva;
    private Map<Prova, ArrayList<Inscricao>> inscricoesPorProva;

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
        this.topAtletasPorProva = new HashMap<Prova, ArrayList<Atleta>>();
        this.inscricoesPorProva = new HashMap<Prova, ArrayList<Inscricao>>();
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
        inscricoesPorProva.put(prova, new ArrayList<Inscricao>());
        topAtletasPorProva.put(prova, new ArrayList<Atleta>());
    }

    public void removerProva(Prova prova) {
        listaProvas.remove(prova);
        listaMinimosProvas.remove(prova.getNome());
        listaAtletasPorProva.remove(prova);
        listaEtapasPorProva.remove(prova);
        inscricoesPorProva.remove(prova);
        topAtletasPorProva.remove(prova);
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

    public ArrayList<Atleta> getTopAtletasProva(Prova prova) {
        return topAtletasPorProva.get(prova);
    }

    public void setTopAtletasProva() {
        float melhor = 0;
        float segundo = 0;
        float terceiro = 0;
        Atleta[] atletas = null;

        for(Prova prova : inscricoesPorProva.keySet()) {
            for(Inscricao inscricao : inscricoesPorProva.get(prova)) {
                if (inscricao.getResultado() > melhor) {
                    atletas[0] = inscricao.getAtleta();
                } else if (inscricao.getResultado() > segundo) {
                    atletas[1] = inscricao.getAtleta();
                } else if (inscricao.getResultado() > terceiro) {
                    atletas[2] = inscricao.getAtleta();
                }
            }
            ArrayList<Atleta> melhoresAtletas = new ArrayList<Atleta>();
            for (int i = 0; i < 3; i++) {
                melhoresAtletas.add(atletas[i]);
            }
            topAtletasPorProva.put(prova, melhoresAtletas);
        }
    }

    public void setInscricoesPorProva (Inscricao inscricao) {
        inscricoesPorProva.get(inscricao.getProva()).add(inscricao);
    }

    public String toString(){
        return  this.nome;
    }
}
