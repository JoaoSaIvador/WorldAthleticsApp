import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EventTestCase {
    @Test
    public void testCreateEvent() {
        var evento = new Evento("evento1", Data.parse("20/12/2020"), Data.parse("20/12/2021"), "local1", Pais.PORTUGAL);

    }

    @Test
    public void testCreateAtleta(){
        var atleta = new Atleta("atleta1", SexoParticipantes.MASCULINO, Data.parse("20/06/2020"), Pais.ESTADOS_UNIDOS, 123456789);
    }

    @Test
    public void testDontAllowDuplicatedAtletas(){
        var atleta1 = new Atleta("atleta1", SexoParticipantes.MASCULINO, Data.parse("20/06/2020"), Pais.ESTADOS_UNIDOS, 123456789);
        var atleta2 = new Atleta("atleta1", SexoParticipantes.MASCULINO, Data.parse("20/06/2020"), Pais.ESTADOS_UNIDOS, 123456789);

        assertEquals(atleta1, atleta2, "Valores diferentes");
        var atleta3 = new Atleta("atleta3", SexoParticipantes.MASCULINO, Data.parse("20/06/2020"), Pais.ESTADOS_UNIDOS, 123456789);

        assertNotEquals(atleta2, atleta3, "Valores iguais");
    }

    @Test
    public void testEditAtleta(){
        var atleta1 = new Atleta("atleta1", SexoParticipantes.MASCULINO, Data.parse("20/06/2020"), Pais.ESTADOS_UNIDOS, 123456789);
        var atleta2 = new Atleta("atleta2", SexoParticipantes.MASCULINO, Data.parse("20/06/2020"), Pais.ESTADOS_UNIDOS, 123456789);

        atleta1.setNome("atleta2");

        assertNotEquals(atleta1,atleta2, "Valores iguais");
    }

    @Test
    public void testInscreverAtleta(){
        var atleta1 = new Atleta("atleta1", SexoParticipantes.MASCULINO, Data.parse("20/06/2020"), Pais.ESTADOS_UNIDOS, 123456789);
        var prova = new Prova("ProvaTeste",SexoParticipantes.MASCULINO.toString(), TipoPontuacao.METROS.toString());
        var evento = new Evento("EventoTeste", Data.parse("20/12/2020"), Data.parse("20/12/2021"), "local1", Pais.PORTUGAL);
        evento.adicionarProva(prova);
        atleta1.inscrever(new Inscricao(prova,evento,atleta1));

        assertNotNull(atleta1.getListaInscricoes());
    }

    @Test
    public void testInscreverAtletaEmVariasProvas(){
        var atleta1 = new Atleta("atleta1", SexoParticipantes.MASCULINO, Data.parse("20/06/2020"), Pais.ESTADOS_UNIDOS, 123456789);
        var prova = new Prova("ProvaTeste",SexoParticipantes.MASCULINO.toString(), TipoPontuacao.METROS.toString());
        var evento1 = new Evento("EventoTeste", Data.parse("20/12/2020"), Data.parse("20/12/2021"), "local1", Pais.PORTUGAL);
        var evento2 = new Evento("EventoTeste", Data.parse("20/12/2020"), Data.parse("20/12/2021"), "local1", Pais.PORTUGAL);

        var inscricao1 = new Inscricao(prova,evento1,atleta1);
        var inscricao2 = new Inscricao(prova,evento1,atleta1);
        var inscricao3 = new Inscricao(prova,evento2,atleta1);

        assertEquals(inscricao1,inscricao2, "Inscrições iguais");
        assertNotEquals(inscricao1,inscricao3, "Inscrições diferentes");
    }

    @Test
    public void testCancelarInscricao(){
        var atleta1 = new Atleta("atleta1", SexoParticipantes.MASCULINO, Data.parse("20/06/2020"), Pais.ESTADOS_UNIDOS, 123456789);
        var prova = new Prova("ProvaTeste",SexoParticipantes.MASCULINO.toString(), TipoPontuacao.METROS.toString());
        var evento1 = new Evento("EventoTeste", Data.parse("20/12/2020"), Data.parse("20/12/2021"), "local1", Pais.PORTUGAL);

        var inscricao1 = new Inscricao(prova,evento1,atleta1);

        atleta1.inscrever(inscricao1);
        assertNotNull(atleta1.getListaInscricoes(), "Não há inscrições");

        atleta1.desinscrever(inscricao1);
        assertTrue(atleta1.getListaInscricoes().isEmpty(), "Existem inscrições");
    }
}


