public class Prova {
    private String nome;
    private String sexoParticipantes;
    private String Tipopontuacao;

    public Prova(String nome, String sexoParticipantes, String pontuacao) {
        this.nome = nome;
        this.sexoParticipantes = sexoParticipantes;
        this.Tipopontuacao = pontuacao;
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

    public String toString(){
        return  this.nome;
    }
}
