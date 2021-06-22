public class Atleta {
    private String nome;
    private SexoParticipantes genero;
    private Data dataNascimento;
    private Pais pais;
    private long contacto;
    private long nInscricoes;

    public Atleta(String nome, SexoParticipantes genero, Data dataNascimento, Pais pais, long contacto) {
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.pais = pais;
        this.contacto = contacto;
        nInscricoes = 0;
    }

    public String getNome() {
        return nome;
    }

    public SexoParticipantes getGenero() {
        return genero;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public Pais getPais() {
        return pais;
    }

    public long getContacto() {
        return contacto;
    }

    public long getnInscricoes() {
        return nInscricoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(SexoParticipantes genero) {
        this.genero = genero;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setContacto(long contacto) {
        this.contacto = contacto;
    }
}
