import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class Via implements Registro {
    int id; String nombre;
    Via() {}
    Via(int id, String nombre) { this.id = id; this.nombre = nombre; }
    public Object getValue(String c) {
        if ("id".equals(c)) return id;
        if ("nombre".equals(c)) return nombre;
        return null;
    }
    public void setValue(String c, Object v) {
        if ("nombre".equals(c)) nombre = v.toString();
    }
    public String toString() { return nombre; }
}
class ViaFactory implements RegistroFactory<Via> {
    public Via fromResultSet(ResultSet rs) throws SQLException {
        return new Via(rs.getInt("id"), rs.getString("nombre"));
    }
    public Via createEmpty() { return new Via(0, ""); }
}


