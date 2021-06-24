import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProvaTestCase {
    @Test
    public void testCreateProva() {
        Prova prova1 = new Prova("prova1", SexoParticipantes.MASCULINO.toString(), TipoPontuacao.METROS.toString(), 50, 8);

        assertEquals("prova1", prova1.getNome(), "Valores iguais");
        assertEquals("MASCULINO", prova1.getSexoParticipantes(), "Valores iguais");
        assertEquals("METROS", prova1.getTipoPontuacao(), "Valores iguais");
        assertEquals(50, prova1.getDuracao(), "Valores iguais");
        assertEquals(8, prova1.getMaxParticipantes(), "Valores iguais");
    }

    @Test
    public void testEditProva() {
        Prova prova1 = new Prova("prova1", SexoParticipantes.MASCULINO.toString(), TipoPontuacao.METROS.toString(), 50, 8);
        Prova prova2 = new Prova("prova2", SexoParticipantes.FEMININO.toString(), TipoPontuacao.SEGUNDOS.toString(), 60, 12);

        prova1.setNome("prova2");
        prova1.setSexoParticipantes(SexoParticipantes.FEMININO.toString());
        prova1.setTipoPontuacao(TipoPontuacao.SEGUNDOS.toString());
        prova1.setDuracao(60);
        prova1.setMaxParticipantes(12);

        assertEquals(prova1.getNome(), prova2.getNome(), "Valores iguais");
        assertEquals(prova1.getSexoParticipantes(), prova2.getSexoParticipantes(), "Valores iguais");
        assertEquals(prova1.getTipoPontuacao(), prova2.getTipoPontuacao(), "Valores iguais");
        assertEquals(prova1.getDuracao(), prova2.getDuracao(), "Valores iguais");
        assertEquals(prova1.getMaxParticipantes(), prova2.getMaxParticipantes(), "Valores iguais");
    }
}
