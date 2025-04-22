import java.util.List;

public class Personaje {
    private int id;
    private String nombre;
    private int rareza;
    private int nivel;
    private Elemento elemento;
    private Via via;
    private Cono cono;
    private MaterialVia materialVia;
    private MaterialXP materialXP;
    private MaterialEnemigo materialEnemigo;
    private List<Equipamiento> equipamiento;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getRareza() { return rareza; }
    public void setRareza(int rareza) { this.rareza = rareza; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public Elemento getElemento() { return elemento; }
    public void setElemento(Elemento elemento) { this.elemento = elemento; }

    public Via getVia() { return via; }
    public void setVia(Via via) { this.via = via; }

    public Cono getCono() { return cono; }
    public void setCono(Cono cono) { this.cono = cono; }

    public MaterialVia getMaterialVia() { return materialVia; }
    public void setMaterialVia(MaterialVia materialVia) { this.materialVia = materialVia; }

    public MaterialXP getMaterialXP() { return materialXP; }
    public void setMaterialXP(MaterialXP materialXP) { this.materialXP = materialXP; }

    public MaterialEnemigo getMaterialEnemigo() { return materialEnemigo; }
    public void setMaterialEnemigo(MaterialEnemigo materialEnemigo) { this.materialEnemigo = materialEnemigo; }

    public List<Equipamiento> getEquipamiento() { return equipamiento; }
    public void setEquipamiento(List<Equipamiento> equipamiento) { this.equipamiento = equipamiento; }
}
