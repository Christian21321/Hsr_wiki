import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Arrays;
import java.util.List;



interface RegistroFactory<T extends Registro> {
    T fromResultSet(ResultSet rs) throws SQLException;
    T createEmpty();
}