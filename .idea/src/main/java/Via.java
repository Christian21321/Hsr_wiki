import java.util.List;

public class Via {
    private int id;
    private String nombre;
    private List<Cono> conos;
    private List<MaterialVia> materiales;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Cono> getConos() { return conos; }
    public void setConos(List<Cono> conos) { this.conos = conos; }

    public List<MaterialVia> getMateriales() { return materiales; }
    public void setMateriales(List<MaterialVia> materiales) { this.materiales = materiales; }
}
