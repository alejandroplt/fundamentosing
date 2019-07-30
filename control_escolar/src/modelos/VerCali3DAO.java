package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VerCali3DAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<VerCali3> lista = new ArrayList<>();
        String sql = "select * from guardarcalificaciones3";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                VerCali3 c = new VerCali3();
                c.setId(rs.getInt(1));
                c.setMaterias(rs.getString(2));
                c.setPeriodouno(rs.getString(3));
                c.setPeriododos(rs.getString(4));
                c.setPeriodotres(rs.getString(5));
                c.setPediodocuatro(rs.getString(6));
                c.setPeriodocinco(rs.getString(7));
                c.setPromediofinal(rs.getString(8));
                c.setAlumno(rs.getString(9));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;

    }

    @Override
    public int add(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
