import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EventoTestCase {
    @Test
    public void testCreateEvento(){
        Evento evento = new Evento("evento1", Data.parse("20/12/2021"), Data.parse("10/3/2022"), "local1", Pais.PORTUGAL);

        assertEquals("evento1", evento.getNome(), "Valores iguais");
        assertEquals(Data.parse("20/12/2021"), evento.getDataInicio(), "Valores iguais");
        assertEquals(Data.parse("10/3/2022"), evento.getDataFim(), "Valores iguais");
        assertEquals("local1", evento.getLocal(), "Valores iguais");
        assertEquals(Pais.PORTUGAL, evento.getPais(), "Valores iguais");
    }

    @Test
    public void testEditEvento() {
        Evento evento1 = new Evento("evento1", Data.parse("20/12/2021"), Data.parse("10/3/2022"), "local1", Pais.PORTUGAL);
        Evento evento2 = new Evento("evento2", Data.parse("19/12/2021"), Data.parse("9/3/2022"), "local2", Pais.ALEMANHA);

        evento1.setNome("evento2");
        evento1.setDataInicio(Data.parse("19/12/2021"));
        evento1.setDataFim(Data.parse("9/3/2022"));
        evento1.setLocal("local2");
        evento1.setPais(Pais.ALEMANHA);

        assertEquals(evento1.getNome(), evento2.getNome(), "Valores iguais");
        assertEquals(evento1.getDataInicio(), evento2.getDataInicio(), "Valores iguais");
        assertEquals(evento1.getDataFim(), evento2.getDataFim(), "Valores iguais");
        assertEquals(evento1.getLocal(), evento2.getLocal(), "Valores iguais");
        assertEquals(evento1.getPais(), evento2.getPais(), "Valores iguais");
    }

    @Test
    public void testAddProvaToEvento() {
        Evento evento1 = new Evento("evento1", Data.parse("20/12/2021"), Data.parse("10/3/2022"), "local1", Pais.PORTUGAL);
        Prova prova1 = new Prova("prova1", SexoParticipantes.MASCULINO.toString(), TipoPontuacao.METROS.toString(), 50, 8);
        Prova prova2 = new Prova("prova2", SexoParticipantes.MASCULINO.toString(), TipoPontuacao.METROS.toString(), 50, 8);

        evento1.adicionarProva(prova1);

        assertTrue(evento1.isProvaAdicionada(prova1), "Contém prova");
        assertFalse(evento1.isProvaAdicionada(prova2), "Não contém prova");
    }

    @Test
    public void testRemoveProvaFromEvento() {
        Evento evento1 = new Evento("evento1", Data.parse("20/12/2021"), Data.parse("10/3/2022"), "local1", Pais.PORTUGAL);
        Prova prova1 = new Prova("prova1", SexoParticipantes.MASCULINO.toString(), TipoPontuacao.METROS.toString(), 50, 8);
        Prova prova2 = new Prova("prova2", SexoParticipantes.MASCULINO.toString(), TipoPontuacao.METROS.toString(), 50, 8);

        evento1.adicionarProva(prova1);
        evento1.adicionarProva(prova2);
        evento1.removerProva(prova1);

        assertFalse(evento1.isProvaAdicionada(prova1), "Não contém prova");
        assertTrue(evento1.isProvaAdicionada(prova2), "Contém prova");
    }

}
