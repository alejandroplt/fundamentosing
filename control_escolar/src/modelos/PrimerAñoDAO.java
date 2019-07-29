package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PrimerAñoDAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<PrimerAño> lista = new ArrayList<>();
        String sql = "select * from primeraño";
//        String sql = "select e.id_estudiante,e.matricula,e.n_completo,CURP,e.f_nacimiento,e.sexo,e.grp_sanguineo,g.numero,p.np_completo from "
//                + "estudiante as e natural join padre as p natural join grado as g";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PrimerAño c = new PrimerAño();
                c.setId(rs.getInt(1));
                c.setGrado(rs.getString(2));
                c.setGrupo(rs.getInt(3));
                c.setNombrealumno(rs.getInt(4));
                c.setDocente(rs.getInt(5));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into primeraño(grado,id_grupo,id_estudiante,id_docente)values(?,?,?,?)";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
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
        String sql = "delete from primeraño where id_primeraño=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

}
