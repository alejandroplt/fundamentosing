package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class GruposDisponiblesDAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

//    @Override
//    public List listar() {
//        List<GruposDisponibles> lista = new ArrayList<>();
//        String sql = "select * from gupos_disponibles";
//
//        try {
//            con = acceso.Conectar();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                GruposDisponibles c = new GruposDisponibles();
//                c.setId(rs.getInt(1));
//                c.setGrado(rs.getInt(2));
//                c.setGrupo(rs.getInt(3));
//                c.setDocente(rs.getInt(4));
//                lista.add(c);
//            }
//        } catch (Exception e) {
//        }
//        return lista;
//
//    }
    @Override
    public List listar() {
        List<GruposDisponibles> lista = new ArrayList<>();
        String sql = "select gd.id_grpdisponibles,g.numero,gru.letra,d.n_completo from gupos_disponibles as gd natural join grado as g natural join grupo_identificador as gru natural join docente as d";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                GruposDisponibles c = new GruposDisponibles();
                c.setId(rs.getInt(1));
//                c.setGrado(rs.getInt(2));
//                c.setGrupo(rs.getInt(3));
//                c.setDocente(rs.getInt(4));

                c.setNumero(rs.getString(2));
                c.setIdentificador(rs.getString(3));
                c.setNombrecompleto(rs.getString(4));

                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;

    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into gupos_disponibles(id_grado,id_grupo,id_docente)values(?,?,?)";
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

        String sql = "delete from gupos_disponibles where id_grpdisponibles=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
