package interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.ControlCorreo;
import modelos.Docentes;
import modelos.conexion;

public class GruposDocentesFrom extends javax.swing.JInternalFrame {

    Docentes docente = new Docentes();
    DefaultTableModel modelo = new DefaultTableModel();
    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public GruposDocentesFrom() {
        initComponents();
    }

    public int IDDocente_actual() {
        return docente.getId();
    }

    public boolean da_clases_a_primero(int id_docente) {
        boolean existe = false;
        String sql = ("SELECT * FROM  primeraño WHERE  id_docente=?");
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_docente);
            rs = ps.executeQuery();
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

    public boolean da_clases_a_segundo(int id_docente) {
        boolean existe = false;
        String sql = ("SELECT * FROM  segundoaño WHERE  id_docente=?");
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_docente);
            rs = ps.executeQuery();
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

    public boolean da_clases_a_tercero(int id_docente) {
        boolean existe = false;
        String sql = ("SELECT * FROM  terceraño WHERE  id_docente=?");
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_docente);
            rs = ps.executeQuery();
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

    void listar() {

        if (da_clases_a_primero(IDDocente_actual()) == true) {
//            

        }
        if (da_clases_a_segundo(IDDocente_actual()) == true) {

        }
        if (da_clases_a_tercero(IDDocente_actual()) == true) {

        }

//        List<PrimerAño> lista = dao.listar();
//        modelo = (DefaultTableModel) tabla.getModel();
//        Object[] ob = new Object[5];
//        for (int i = 0; i < lista.size(); i++) {
//            ob[0] = lista.get(i).getId(); 
//            ob[1] = lista.get(i).getGrado();
//            ob[2] = lista.get(i).getGrupo(); 
//            ob[3] = lista.get(i).getNombrealumno();
//            ob[4] = lista.get(i).getDocente();
//            modelo.addRow(ob);
//        }
//        tabla.setModel(modelo);
//    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        grado = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("GRUPO ASIGNADO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Martinez Ruiz Diego"},
                {"2", "Perez Perez Maria"}
            },
            new String [] {
                "ID", "NOMBRE DEL ALUMNO"
            }
        ));
        tabla.setToolTipText("");
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        grado.setText("GRADO ASIGNADO");

        jTextField1.setEditable(false);
        jTextField1.setText("1°");

        jLabel2.setText("GRUPOASIGNADO");

        jTextField2.setEditable(false);
        jTextField2.setText("A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(grado)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(grado)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel grado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
