public class Atleta {
    private String mome;
    private SexoParticipantes genero;
    private Data dataNascimento;
    private Pais pais;
    private long contacto;
    private long nInscricoes;

    public Atleta(String mome, SexoParticipantes genero, Data dataNascimento, Pais pais, long contacto) {
        this.mome = mome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.pais = pais;
        this.contacto = contacto;
        nInscricoes = 0;
    }

    public String getMome() {
        return mome;
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
}
