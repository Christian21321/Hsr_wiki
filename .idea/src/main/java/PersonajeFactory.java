import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Arrays;
import java.util.List;

class PersonajeFactory implements RegistroFactory<Personaje> {
    public Personaje fromResultSet(ResultSet rs) throws SQLException {
        return new Personaje(
            rs.getInt("id"), rs.getString("nombre"),
            rs.getInt("rareza"), rs.getInt("nivel")
        );
    }
    public Personaje createEmpty() {
        return new Personaje(0, "", 0, 0);
    }
}