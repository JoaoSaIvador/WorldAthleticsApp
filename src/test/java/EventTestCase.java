import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EventTestCase {
    @Test
    public void testCreateEvent() {
        var evento = new Evento("evento1", Data.parse("20/12/2020"), Data.parse("20/12/2021"), "local1", Pais.PORTUGAL);

    }
}


