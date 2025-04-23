import java.util.ArrayList;

public class Wiki{
    public void subirNivelPersonaje(Personaje personaje, int nivelesASubir) {
        if (nivelesASubir > 0) {
            personaje.setNivel(personaje.getNivel() + nivelesASubir);
        }
    }

    public void agregarConoAVia(Via via, Cono cono) {
        if (via.getConos() == null) {
            via.setConos(new ArrayList<>());
        }
        via.getConos().add(cono);
    }
    
}