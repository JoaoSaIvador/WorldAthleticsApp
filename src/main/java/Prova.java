public class Prova {
    private String nome;
    private String sexoParticipantes;
    private String Tipopontuacao;
    private int duracao;
    private int maxParticipantes;

    public Prova(String nome, String sexoParticipantes, String pontuacao, int duracao,int maxParticipantes) {
        this.nome = nome;
        this.sexoParticipantes = sexoParticipantes;
        this.Tipopontuacao = pontuacao;
        this.duracao = duracao;
        this.maxParticipantes = maxParticipantes;
    }

    public String getNome() {
        return nome;
    }

    public String getSexoParticipantes() {
        return sexoParticipantes;
    }

    public String getTipoPontuacao() {
        return Tipopontuacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexoParticipantes(String sexoParticipantes) {
        this.sexoParticipantes = sexoParticipantes;
    }

    public void setTipoPontuacao(String pontuacao) {
        this.Tipopontuacao = pontuacao;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    public String toString(){
        return  this.nome;
    }
}
