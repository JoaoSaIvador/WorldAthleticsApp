import java.util.ArrayList;
import java.util.Objects;

public class Atleta {
    private String nome;
    private SexoParticipantes genero;
    private Data dataNascimento;
    private Pais pais;
    private long contacto;
    private long nInscricoes;
    private ArrayList<Inscricao> listaInscricoes;

    public Atleta(String nome, SexoParticipantes genero, Data dataNascimento, Pais pais, long contacto) {
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.pais = pais;
        this.contacto = contacto;
        this.nInscricoes = 0;
        this.listaInscricoes = new ArrayList<>();
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

    public ArrayList<Inscricao> getListaInscricoes() {
        return listaInscricoes;
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

    public void inscrever(Inscricao inscricao){
        listaInscricoes.add(inscricao);
        nInscricoes++;
    }

    public void desinscrever(Inscricao inscricao){
        listaInscricoes.remove(inscricao);
        nInscricoes--;
    }

    public boolean existe(Atleta atleta){
        return equals(atleta);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return o instanceof Atleta && (Objects.equals(contacto, atleta.contacto) && Objects.equals(nome, atleta.nome) && Objects.equals(genero, atleta.genero) && Data.datasIguais(dataNascimento, atleta.dataNascimento) && Objects.equals(pais, atleta.pais));
    }

    public boolean isIncrito(Inscricao inscricao){
        ArrayList<Inscricao> inscricoes = this.getListaInscricoes();
        for (Inscricao incricaoAtleta: inscricoes){
            if(incricaoAtleta.equals(inscricao)){
                return true;
            }
        }
        return false;
    }

}
