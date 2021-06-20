import java.util.ArrayList;

public class Evento {
    private String nome;
    private Data dataInicio;
    private Data dataFim;
    private String local;
    private String país;
    private ArrayList<Prova> listaProvas;

    public Evento() {
        this.listaProvas = new ArrayList<>();
    }

    public Evento(String nome, Data dataInicio, Data dataFim, String local, String país) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
        this.país = país;
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

    public String getPaís() {
        return país;
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

    public void setPaís(String país) {
        this.país = país;
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
}
