public class EtapaProva {
    private String nomeProva;
    private String sexoParticipantes;
    private int diaAno;
    private int diaComp;
    private String hora;
    private String ronda;
    private float minimos;

    public EtapaProva(String nome, String sexoParticipantes, String pontuacao, int diaAno, int diaComp, String hora, String ronda, float minimos) {
        this.nomeProva = nome;
        this.sexoParticipantes = sexoParticipantes;
        this.diaAno = diaAno;
        this.diaComp = diaComp;
        this.hora = hora;
        this.ronda = ronda;
        this.minimos = minimos;
    }

    public int getDiaAno() {
        return diaAno;
    }

    public int getDiaComp() {
        return diaComp;
    }

    public String getHora() {
        return hora;
    }

    public String getRonda() {
        return ronda;
    }

    public float getMinimos() {
        return minimos;
    }
}
