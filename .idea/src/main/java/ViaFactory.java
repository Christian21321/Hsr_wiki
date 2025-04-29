import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Arrays;
import java.util.List;

class ViaFactory implements RegistroFactory<Via> {
    public Via fromResultSet(ResultSet rs) throws SQLException {
        return new Via(rs.getInt("id"), rs.getString("nombre"));
    }
    public Via createEmpty() { return new Via(0, ""); }
}