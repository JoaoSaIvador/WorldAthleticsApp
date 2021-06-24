import java.util.Objects;

public class Inscricao {
    private Prova prova;
    private Evento evento;
    private Atleta atleta;
    private float resultado;

    public Inscricao(Prova prova, Evento evento, Atleta atleta) {
        this.prova = prova;
        this.evento = evento;
        this.atleta = atleta;
        this.resultado = 0;
    }

    public Prova getProva() {
        return prova;
    }

    public Evento getEvento() {
        return evento;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float getResultado() {
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inscricao inscricao = (Inscricao) o;
        return Float.compare(inscricao.resultado, resultado) == 0 && Objects.equals(prova, inscricao.prova) && Objects.equals(evento, inscricao.evento) && Objects.equals(atleta, inscricao.atleta);
    }
}
