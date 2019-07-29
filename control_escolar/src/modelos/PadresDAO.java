package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class PadresDAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Padres> lista = new ArrayList<>();
        String sql = "select * from padre";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Padres c = new Padres();
                c.setId(rs.getInt(1));
                c.setNombrecompleto(rs.getString(2));
                c.setOcupacion(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setTelefonocel(rs.getString(5));
                c.setTelefonocasa(rs.getString(6));
                c.setCorreo(rs.getString(7));

                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;

    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into padre(np_completo,ocupacion,direccion,telefonocel,telefonocasa,correo)values(?,?,?,?,?,?)";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update padre set np_completo=?,ocupacion=?, direccion=?, telefonocel=?, telefonocasa=?,correo=? where id_padre=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;

    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from padre where id_padre=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public boolean es_padre_Tutor_de_alumno(int id_Padre) {
        //PreparedStatement ps;
        //ResultSet rs;  
        boolean existe = false;
        String sql = ("SELECT * FROM estudiante WHERE  id_padre=?");
        try {
            // 
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_Padre);
            rs = ps.executeQuery();
            /////
            // ps  = getConexion().prepareStatement(sql);
            // ps.setInt(1, Integer.parseInt(idUs));   
            //Ejecutarla y obtiene en rs el resultado   
            //rs  = ps.executeQuery();
            if (rs.next()) {
                //existe 
                existe = true;
            } else {
                //no existe
                existe = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return existe;
    }
}
