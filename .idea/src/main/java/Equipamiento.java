import java.util.List;

public class Equipamiento {
    private int id;
    private String nombre;
    private int rareza;
    private String tipo;
    private List<Personaje> personajes;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getRareza() { return rareza; }
    public void setRareza(int rareza) { this.rareza = rareza; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public List<Personaje> getPersonajes() { return personajes; }
    public void setPersonajes(List<Personaje> personajes) { this.personajes = personajes; }
}
