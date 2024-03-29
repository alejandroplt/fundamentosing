package interfaces;

import com.placeholder.PlaceHolder;
import modelos.Alumnos;
import modelos.AlumnosDAO;
import modelos.conexion;
import static java.lang.Integer.parseInt;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Date;
import java.util.List;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.CLOSED_OPTION;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class AlumnoForm extends javax.swing.JInternalFrame {

    AlumnosDAO dao = new AlumnosDAO();
    Alumnos v = new Alumnos();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;

    public AlumnoForm() {
        initComponents();
        listar();
        mostrargrado();
        mostrarpadre();
        btnNuevo.setEnabled(false);
        combo_IDAlumno.setVisible(false);
        combo_idGrado.setVisible(false);
        // holders();
        //Permite centrar el Header(titulos) de la tabla.
        TableCellRenderer rendererFromHeader = tabla.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(CENTER);

    }

//    void holders() {
//        PlaceHolder holder;
//        holder = new PlaceHolder(txtNombreCompleto, "Ingrese nombre iniciando por apellido");
//        holder = new PlaceHolder(txtCurp, "Ingrese CURP utilizando mayúsculas");
//    }
    void listar() {
        List<Alumnos> lista = dao.listar();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombrecom();
            ob[2] = lista.get(i).getCurp();
            ob[3] = lista.get(i).getFechanaci();
            ob[4] = lista.get(i).getSexo();
            ob[5] = lista.get(i).getGrpsangre();
            ob[6] = lista.get(i).getIdgrado();
//            ob[6] = lista.get(i).getNumero();
//            ob[8] = lista.get(i).getIdpadre();
            ob[7] = lista.get(i).getNombreCompleto();
            modelo.addRow(ob);
        }
        tabla.setModel(modelo);
    }

    void mostrargrado() {
        String sql = " select * from grado";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ComboGrado.addItem(rs.getString("numero"));
                combo_idGrado.addItem(rs.getString("id_grado"));

            }
        } catch (SQLException ex) {

        }
    }

    void mostrarpadre() {
        String sql = " select * from padre";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ComboPadre.addItem(rs.getString("np_completo"));
                combo_IDAlumno.addItem(rs.getString("id_padre"));
            }
        } catch (SQLException ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ComboSexo = new javax.swing.JComboBox<>();
        txtNombreCompleto = new javax.swing.JTextField();
        ComboGrado = new javax.swing.JComboBox<>();
        ComboSangre = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ComboPadre = new javax.swing.JComboBox<>();
        CalendarFecha = new com.toedter.calendar.JDateChooser();
        btnNuevo = new javax.swing.JButton();
        combo_idGrado = new javax.swing.JComboBox<>();
        combo_IDAlumno = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setTitle("MODULO ALUMNO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE COMPLETO");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CURP");

        txtCurp.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.png"))); // NOI18N
        btnActualizar.setText("MODIFICAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FECHA DE NACIMIENTO");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/28-2-210.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SEXO");

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TIPO DE SANGRE");

        jLabel8.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("GRADO");

        ComboSexo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Masculino", "Femenino" }));

        txtNombreCompleto.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        ComboGrado.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ComboGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        ComboGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboGradoActionPerformed(evt);
            }
        });

        ComboSangre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ComboSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "O +", "O -", "A +", "A -", "B +", "B -", "AB +", "AB -" }));

        jLabel9.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PADRE O TUTOR");

        ComboPadre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ComboPadre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        ComboPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPadreActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        combo_idGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_grado" }));

        combo_IDAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_alumno" }));
        combo_IDAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_IDAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCurp, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(txtNombreCompleto)
                                    .addComponent(CalendarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combo_idGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(combo_IDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboSangre, 0, 242, Short.MAX_VALUE)
                            .addComponent(ComboGrado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboPadre, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addGap(73, 73, 73)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(ComboSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CalendarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(ComboPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_idGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo_IDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)
                            .addComponent(btnNuevo))
                        .addGap(15, 15, 15))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE COMPLETO", "CURP", "FECHA DE NACIMIENTO", "SEXO", "TIPO DE SANGRE", "GRADO", "PADRE O TUTOR"
            }
        ));
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla.setSelectionBackground(new java.awt.Color(153, 0, 153));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(170);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(250);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        btnAgregar.setEnabled(false);
        btnNuevo.setEnabled(true);
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "Se debe seleccionar una fila");
        } else {
            id = parseInt(tabla.getValueAt(fila, 0).toString());
            String nomcom = tabla.getValueAt(fila, 1).toString();
            String curp = tabla.getValueAt(fila, 2).toString();
            Date date;
            try {
                date = new SimpleDateFormat("yyy-MM-dd").parse(tabla.getValueAt(fila, 3).toString());
                CalendarFecha.setDate(date);
            } catch (ParseException ex) {
                getLogger(UsuariosForm.class.getName()).log(SEVERE, null, ex);
            }
            ComboSexo.setSelectedItem(tabla.getValueAt(fila, 4));
            ComboSangre.setSelectedItem(tabla.getValueAt(fila, 5));
            ComboGrado.setSelectedItem(tabla.getValueAt(fila, 6));
            ComboPadre.setSelectedItem(tabla.getValueAt(fila, 7));

            txtNombreCompleto.setText(nomcom);
            txtCurp.setText(curp);

        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarcampos();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        limpiarcampos();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        limpiarcampos();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void ComboGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboGradoActionPerformed
        int cmbgrado = ComboGrado.getSelectedIndex();
        combo_idGrado.setSelectedIndex(cmbgrado);
    }//GEN-LAST:event_ComboGradoActionPerformed

    private void ComboPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPadreActionPerformed
        int combopadre = ComboPadre.getSelectedIndex();
        combo_IDAlumno.setSelectedIndex(combopadre);
    }//GEN-LAST:event_ComboPadreActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarcampos();
        btnAgregar.setEnabled(true);
        btnNuevo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void combo_IDAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_IDAlumnoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_combo_IDAlumnoActionPerformed

    void agregar() {
        if (txtNombreCompleto.getText().equals("") & txtCurp.getText().equals("")) {
            showMessageDialog(this, "Se deben llenar todos los campos");
        } else {
            int año = CalendarFecha.getCalendar().get(YEAR);
            int dia = CalendarFecha.getCalendar().get(DAY_OF_MONTH);
            int mes = CalendarFecha.getCalendar().get(MONTH);

            String nombrec = txtNombreCompleto.getText();
            String curp = txtCurp.getText();
            String fecha = año + "-" + mes + "-" + dia;
            String combsex = ComboSexo.getSelectedItem().toString();
            String comsangre = ComboSangre.getSelectedItem().toString();
            int combgrado = Integer.parseInt(combo_idGrado.getSelectedItem().toString());
            int combpadre = Integer.parseInt(combo_IDAlumno.getSelectedItem().toString());

//            int combgrado = ComboGrado.getSelectedIndex();
//            int combpadre = ComboPadre.getSelectedIndex();
            Object[] ob = new Object[7];
            ob[0] = nombrec;
            ob[1] = curp;
            ob[2] = fecha;
            ob[3] = combsex;
            ob[4] = comsangre;
            ob[5] = combgrado;
            ob[6] = combpadre;
            dao.add(ob);
            showMessageDialog(this, "Usuario registrado exitosamente");

        }
    }

    void limpiarcampos() {
        txtNombreCompleto.setText("");
        txtCurp.setText("");
        CalendarFecha.setCalendar(null);
        ComboSexo.setSelectedItem("SELECCIONE");
        ComboSangre.setSelectedItem("SELECCIONE");
        ComboGrado.setSelectedItem("SELECCIONE");
        ComboPadre.setSelectedItem("SELECCIONE");
        combo_idGrado.setSelectedIndex(0);
        combo_IDAlumno.setSelectedIndex(0);

    }

    void actualizar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "Se debe seleccionar una fila");

        } else {
            String nombrec = txtNombreCompleto.getText();
            String curp = txtCurp.getText();
            SimpleDateFormat dateFormato = new SimpleDateFormat("yyy-MM-dd");
            String date = dateFormato.format(CalendarFecha.getDate());
            String combsex = ComboSexo.getSelectedItem().toString();
            String grpsangre = ComboSangre.getSelectedItem().toString();
            int idgrado = ComboGrado.getSelectedIndex();
            int idpadre = ComboPadre.getSelectedIndex();
//            String idgrado = ComboGrado.getSelectedItem().toString();
//            String idpadre = ComboPadre.getSelectedItem().toString();

            Object[] obj = new Object[8];
            obj[0] = nombrec;
            obj[1] = curp;
            obj[2] = date;
            obj[3] = combsex;
            obj[4] = grpsangre;
            obj[5] = idgrado;
            obj[6] = idpadre;
            obj[7] = id;
            dao.actualizar(obj);
            btnAgregar.setEnabled(true);
        }
    }

    void eliminar() {

        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "Se debe seleccionar una fila");

        } else {
            int msj = showConfirmDialog(this, "  ¿Esta seguro que desea eliminar el registro?  ");
            //JOptionPane.showMessageDialog(this, "Registro eliminado");
            if (msj == YES_OPTION) {
                dao.eliminar(id);
                showMessageDialog(this, "Registro eliminado");
                btnAgregar.setEnabled(true);
            }
            if (msj == NO_OPTION) {

            }
            if (msj == CLOSED_OPTION) {

            }
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CalendarFecha;
    private javax.swing.JComboBox<String> ComboGrado;
    private javax.swing.JComboBox<String> ComboPadre;
    private javax.swing.JComboBox<String> ComboSangre;
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> combo_IDAlumno;
    private javax.swing.JComboBox<String> combo_idGrado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtNombreCompleto;
    // End of variables declaration//GEN-END:variables
}
