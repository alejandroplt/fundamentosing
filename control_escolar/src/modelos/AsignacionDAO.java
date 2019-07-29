package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class AsignacionDAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into asignacion(id_grpdisponibles,id_estudiante)values(?,?)";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;

    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
