public class MaterialEnemigo extends Enemigo {
    private int id;
    private String nombre;
    private int rareza;
    private Enemigo enemigo;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getRareza() { return rareza; }
    public void setRareza(int rareza) { this.rareza = rareza; }

    public Enemigo getEnemigo() { return enemigo; }
    public void setEnemigo(Enemigo enemigo) { this.enemigo = enemigo; }
}
