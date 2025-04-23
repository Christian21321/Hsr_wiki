import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class WikiTest {

    @Test
    public void testSubirNivelPersonaje() {
        Personaje personaje = new Personaje();
        personaje.setNivel(10);

        Wiki service = new Wiki();
        service.subirNivelPersonaje(personaje, 5);

        assertEquals(15, personaje.getNivel());
    }

    @Test
    public void testAgregarConoAVia() {
        Via via = new Via();
        Cono cono = new Cono();
        cono.setNombre("Cono de la Eternidad");

        Wiki service = new Wiki();
        service.agregarConoAVia(via, cono);

        List<Cono> conos = via.getConos();
        assertNotNull(conos);
        assertEquals(1, conos.size());
        assertEquals("Cono de la Eternidad", conos.get(0).getNombre());
    }
}