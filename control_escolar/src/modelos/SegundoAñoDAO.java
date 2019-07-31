package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SegundoAñoDAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<SegundoAño> lista = new ArrayList<>();
        String sql = "select pa.id_segundoaño,gra.numero,g.letra,e.n_completo,d.n_completo from "
        + "segundoaño as pa INNER join grupo_identificador as g ON pa.id_grupo=g.id_grupo INNER join estudiante as e "
        + "ON pa.id_estudiante=e.id_estudiante INNER join docente as d ON pa.id_docente=d.id_docente INNER join grado as gra "
          + "ON e.id_grado=gra.id_grado";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                SegundoAño c = new SegundoAño();
                c.setId(rs.getInt(1));
                c.setGrado(rs.getString(2));
                c.setGrupo(rs.getString(3));
                c.setNombrealumno(rs.getString(4));
                c.setDocente(rs.getString(5));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into segundoaño(id_grupo,id_estudiante,id_docente)values(?,?,?)";
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
        String sql = "delete from segundoaño where id_segundoaño=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

}
