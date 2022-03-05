package JFrames;

import Clases.*;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class prestamoLibros extends javax.swing.JFrame {

    private static prestamoLibros instancia;

    public static prestamoLibros getInstancia() {
        if (instancia == null) {
            instancia = new prestamoLibros();
        }
        return instancia;
    }

    public prestamoLibros() {
        initComponents();
        setLocationRelativeTo(null);
    }

  private void filter(String query) {
         TableRowSorter<TableModel> tr = new TableRowSorter<>(tbl_detalle.getModel());
         tbl_detalle.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(query));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_detalle = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        btn_actualizarTabla = new javax.swing.JButton();
        comboBox_filtrar = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbl_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_detalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_detalle);

        jButton3.setText("Ver préstamos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reporte existencias");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        btn_actualizarTabla.setText("Actualizar tabla");
        btn_actualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarTablaActionPerformed(evt);
            }
        });

        comboBox_filtrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Tesis", "Revista" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autor", "Año Publicación", "ISBN", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Copias", "Disponibles" }));

        jButton6.setText("Filtrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_actualizarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(comboBox_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(comboBox_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_actualizarTabla)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        prestamoLibros.getInstancia().setVisible(false);
        pantallaInicio.getInstancia().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        prestamoLibros.getInstancia().setVisible(false);
        ventanaAdministrador.getInstancia().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_actualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarTablaActionPerformed
        int filas;
        filas = -1;
        Object[][] tablaDetalle = new Object[20][15];
        this.tbl_detalle.setDefaultRenderer(Object.class, new RenderTable());
        for (int i = 0; i <= Libro.getInstancia().contador; i++) {
            filas = filas + 1;
            for (int j = 0; j < 14; j++) {
                tablaDetalle[filas][0] = Libro.getInstancia().isbn[i];
                tablaDetalle[filas][1] = "Libro";
                tablaDetalle[filas][2] = Libro.getInstancia().autor[i];
                tablaDetalle[filas][3] = Libro.getInstancia().añoPublicacion[i];
                tablaDetalle[filas][4] = Libro.getInstancia().titulo[i];
                tablaDetalle[filas][5] = Libro.getInstancia().edicion[i];
                tablaDetalle[filas][11] = Libro.getInstancia().palabrasClave[i];
                tablaDetalle[filas][6] = Libro.getInstancia().descripcion[i];
                tablaDetalle[filas][9] = Libro.getInstancia().temas[i];
                tablaDetalle[filas][12] = Libro.getInstancia().copias[i].toString();
                tablaDetalle[filas][13] = Libro.getInstancia().dispobles[i].toString();
                tablaDetalle[filas][14] = new JButton("Prestar");
            }
        }
        for (int i = 0; i <= Revista.getInstancia().contador; i++) {
            filas = filas + 1;
            for (int j = 0; j < 14; j++) {
                tablaDetalle[filas][0] = Revista.getInstancia().isbn[i];
                tablaDetalle[filas][1] = "Revista";
                tablaDetalle[filas][2] = Revista.getInstancia().autor[i];
                tablaDetalle[filas][3] = Revista.getInstancia().añoPublicacion[i];
                tablaDetalle[filas][4] = Revista.getInstancia().titulo[i];
                tablaDetalle[filas][5] = Revista.getInstancia().edicion[i];
                tablaDetalle[filas][6] = Revista.getInstancia().descripcion[i];
                tablaDetalle[filas][7] = Revista.getInstancia().categoria[i];
                tablaDetalle[filas][8] = Revista.getInstancia().ejemplares[i];
                tablaDetalle[filas][9] = Revista.getInstancia().temas[i];
                tablaDetalle[filas][11] = Revista.getInstancia().palabrasClave[i];
                tablaDetalle[filas][12] = Revista.getInstancia().copias[i];
                tablaDetalle[filas][13] = Revista.getInstancia().dispobles[i];
                tablaDetalle[filas][14] = new JButton("Prestar");
            }
        }
        for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
            filas = filas + 1;
            for (int j = 0; j < 14; j++) {
                tablaDetalle[filas][0] = Tesis.getInstancia().isbn[i];
                tablaDetalle[filas][1] = "Tesis";
                tablaDetalle[filas][2] = Tesis.getInstancia().autor[i];
                tablaDetalle[filas][3] = Tesis.getInstancia().añoPublicacion[i];
                tablaDetalle[filas][4] = Tesis.getInstancia().titulo[i];
                tablaDetalle[filas][11] = Tesis.getInstancia().palabrasClave[i];
                tablaDetalle[filas][10] = Tesis.getInstancia().area[i];
                tablaDetalle[filas][9] = Tesis.getInstancia().temas[i];
                tablaDetalle[filas][6] = Tesis.getInstancia().descripcion[i];
                tablaDetalle[filas][5] = Tesis.getInstancia().edicion[i];
                tablaDetalle[filas][12] = Tesis.getInstancia().copias[i];
                tablaDetalle[filas][13] = Tesis.getInstancia().dispobles[i];
                tablaDetalle[filas][14] = new JButton("Prestar");
            }
        }
        String[] encabezado = {"ISBN/ID", "Tipo","Autor", "Año Publicación", "Título", "Edición", "Descripción", "Categoría", "Ejemplares", "Temas", "Área", "Palabras Clave", "Copias", "Disponibles", "Préstamo"};
        tbl_detalle.setModel(new DefaultTableModel(
                tablaDetalle,
                encabezado
        ));

    }//GEN-LAST:event_btn_actualizarTablaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String tipo;
        tipo = (String) comboBox_filtrar.getSelectedItem();
        int filas;
        filas = -1;
        Object[][] tablaDetalle = new Object[20][15];
        this.tbl_detalle.setDefaultRenderer(Object.class, new RenderTable());
        if (tipo.equals("Libro")) {
            for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                filas = filas + 1;
                for (int j = 0; j < 12; j++) {
                    tablaDetalle[filas][0] = Libro.getInstancia().isbn[i];
                    tablaDetalle[filas][1] = "Libro";
                    tablaDetalle[filas][2] = Libro.getInstancia().autor[i];
                    tablaDetalle[filas][3] = Libro.getInstancia().añoPublicacion[i];
                    tablaDetalle[filas][4] = Libro.getInstancia().titulo[i];
                    tablaDetalle[filas][5] = Libro.getInstancia().edicion[i];
                    tablaDetalle[filas][6] = Libro.getInstancia().palabrasClave[i];
                    tablaDetalle[filas][7] = Libro.getInstancia().descripcion[i];
                    tablaDetalle[filas][8] = Libro.getInstancia().temas[i];
                    tablaDetalle[filas][9] = Libro.getInstancia().copias[i].toString();
                    tablaDetalle[filas][10] = Libro.getInstancia().dispobles[i].toString();
                    tablaDetalle[filas][11] = new JButton("Prestar");
                }
            }
            String[] encabezado = {"ISBN/ID","Tipo", "Autor", "Año Publicación", "Título", "Edición", "Palabras Clave","Descripción", "Temas", "Copias", "Disponibles", "Préstamo"};
            tbl_detalle.setModel(new DefaultTableModel(
                    tablaDetalle,
                    encabezado
            ));
        }
        if (tipo.equals("Revista")) {
            for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                filas = filas + 1;
                for (int j = 0; j < 13; j++) {
                tablaDetalle[filas][0] = Revista.getInstancia().isbn[i];
                tablaDetalle[filas][1] = "Revista";
                tablaDetalle[filas][2] = Revista.getInstancia().autor[i];
                tablaDetalle[filas][3] = Revista.getInstancia().añoPublicacion[i];
                tablaDetalle[filas][4] = Revista.getInstancia().titulo[i];
                tablaDetalle[filas][5] = Revista.getInstancia().edicion[i];
                tablaDetalle[filas][6] = Revista.getInstancia().descripcion[i];
                tablaDetalle[filas][7] = Revista.getInstancia().categoria[i];
                tablaDetalle[filas][8] = Revista.getInstancia().ejemplares[i];
                tablaDetalle[filas][9] = Revista.getInstancia().temas[i];
                tablaDetalle[filas][10] = Revista.getInstancia().palabrasClave[i];
                tablaDetalle[filas][11] = Revista.getInstancia().copias[i];
                tablaDetalle[filas][12] = Revista.getInstancia().dispobles[i];
                tablaDetalle[filas][13] = new JButton("Prestar");
                }
            }
            String[] encabezado = {"ISBN/ID","Tipo","Autor", "Año Publicación", "Título", "Edición", "Descripción", "Categoría", "Ejemplares", "Temas", "Palabras Clave", "Copias", "Disponibles", "Préstamo"};
            tbl_detalle.setModel(new DefaultTableModel(
                    tablaDetalle,
                    encabezado
            ));
        }
        if (tipo.equals("Tesis")) {
            for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                filas = filas + 1;
                for (int j = 0; j < 11; j++) {
                    tablaDetalle[filas][0] = Tesis.getInstancia().isbn[i];
                    tablaDetalle[filas][1] = "Tesis";
                    tablaDetalle[filas][2] = Tesis.getInstancia().autor[i];
                    tablaDetalle[filas][3] = Tesis.getInstancia().añoPublicacion[i];
                    tablaDetalle[filas][4] = Tesis.getInstancia().titulo[i];
                    tablaDetalle[filas][5] = Tesis.getInstancia().palabrasClave[i];
                    tablaDetalle[filas][6] = Tesis.getInstancia().area[i];
                    tablaDetalle[filas][7] = Tesis.getInstancia().temas[i];
                    tablaDetalle[filas][8] = Tesis.getInstancia().descripcion[i];
                    tablaDetalle[filas][9] = Tesis.getInstancia().edicion[i];
                    tablaDetalle[filas][10] = Tesis.getInstancia().copias[i];
                    tablaDetalle[filas][11] = Tesis.getInstancia().dispobles[i];
                    tablaDetalle[filas][12] = new JButton("Prestar");
                }
            }
            String[] encabezado = {"ISBN/ID", "Autor", "Año Publicación", "Título", "Palabras Clave", "Área", "Temas", "Descripción", "Edición", "Copias","Disponibles", "Préstamo"};
            tbl_detalle.setModel(new DefaultTableModel(
                    tablaDetalle,
                    encabezado
            ));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        String query = txt_buscar.getText().toLowerCase();
        filter(query);
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void tbl_detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_detalleMouseClicked
        int column = tbl_detalle.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbl_detalle.getRowHeight();
        int posicion = 0;
        String isbnTabla = "";
        String tipoTabla = "";
        String isbn = "", autor = "", añoPublicacion = "", titulo = "", edicion = "", palabrasClave = "", descripcion = "", temas = "", tamaño = "";
        boolean bibliografiaExistente = false;

        if (row < tbl_detalle.getRowCount() && row >= 0 && column < tbl_detalle.getColumnCount() && column >= 0) {
            Object value = tbl_detalle.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                isbnTabla = (String) (tbl_detalle.getValueAt(row, 0));
                tipoTabla = (String) (tbl_detalle.getValueAt(row, 1));

                if (tipoTabla.equals("Libro")) {
                    for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                        if (Libro.getInstancia().isbn[i].equals(isbnTabla)) {
                            Libro.getInstancia().dispobles[i] = Libro.getInstancia().dispobles[i] - 1;
                            if (Libro.getInstancia().dispobles[i] == -1) {
                                bibliografiaExistente = false;
                            } else {
                                bibliografiaExistente = true;
                            }
                            posicion = i;
                        }
                    }
                    if (bibliografiaExistente == true) {
                        cuentaBibliografia.getInstancia().contador = cuentaBibliografia.getInstancia().contador + 1;
                        cuentaBibliografia.getInstancia().isbn[cuentaBibliografia.getInstancia().contador] = Libro.getInstancia().isbn[posicion];
                        cuentaBibliografia.getInstancia().titulo[cuentaBibliografia.getInstancia().contador] = Libro.getInstancia().titulo[posicion];
                        cuentaBibliografia.getInstancia().tipo[cuentaBibliografia.getInstancia().contador] = "Libro";
                        JOptionPane.showMessageDialog(null, "Préstamo realizado con éxito", "Nuevo préstamo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (bibliografiaExistente == false) {
                        JOptionPane.showMessageDialog(null, "Bibliografía no disponible", "Error", JOptionPane.WARNING_MESSAGE);
                        Libro.getInstancia().dispobles[posicion] = 0;
                    }

                }
                if (tipoTabla.equals("Revista")) {
                    for (int i = 0; i <= Revista.getInstancia().contador; i++) {
                        if (Revista.getInstancia().isbn[i].equals(isbnTabla)) {
                            Revista.getInstancia().dispobles[i] = Revista.getInstancia().dispobles[i] - 1;
                            if (Revista.getInstancia().dispobles[i] == -1) {
                                bibliografiaExistente = false;
                            } else {
                                bibliografiaExistente = true;
                            }
                            posicion = i;
                        }
                    }
                    if (bibliografiaExistente == true) {
                        cuentaBibliografia.getInstancia().contador = cuentaBibliografia.getInstancia().contador + 1;
                        cuentaBibliografia.getInstancia().isbn[cuentaBibliografia.getInstancia().contador] = Revista.getInstancia().isbn[posicion];
                        cuentaBibliografia.getInstancia().titulo[cuentaBibliografia.getInstancia().contador] = Revista.getInstancia().titulo[posicion];
                        cuentaBibliografia.getInstancia().tipo[cuentaBibliografia.getInstancia().contador] = "Revista";
                        JOptionPane.showMessageDialog(null, "Préstamo realizado con éxito", "Nuevo préstamo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (bibliografiaExistente == false) {
                        JOptionPane.showMessageDialog(null, "Bibliografía no disponible", "Error", JOptionPane.WARNING_MESSAGE);
                        Revista.getInstancia().dispobles[posicion] = 0;
                    }
                }
                if (tipoTabla.equals("Tesis")) {
                    for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                        if (Tesis.getInstancia().isbn[i].equals(isbnTabla)) {
                            Tesis.getInstancia().dispobles[i] = Tesis.getInstancia().dispobles[i] - 1;
                            if (Tesis.getInstancia().dispobles[i] == -1) {
                                bibliografiaExistente = false;
                            } else {
                                bibliografiaExistente = true;
                            }
                            posicion = i;
                        }
                    }
                    if (bibliografiaExistente == true) {
                        cuentaBibliografia.getInstancia().contador = cuentaBibliografia.getInstancia().contador + 1;
                        cuentaBibliografia.getInstancia().isbn[cuentaBibliografia.getInstancia().contador] = Tesis.getInstancia().isbn[posicion];
                        cuentaBibliografia.getInstancia().titulo[cuentaBibliografia.getInstancia().contador] = Tesis.getInstancia().titulo[posicion];
                        cuentaBibliografia.getInstancia().tipo[cuentaBibliografia.getInstancia().contador] = "Tesis";
                        JOptionPane.showMessageDialog(null, "Préstamo realizado con éxito", "Nuevo préstamo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (bibliografiaExistente == false) {
                        JOptionPane.showMessageDialog(null, "Bibliografía no disponible", "Error", JOptionPane.WARNING_MESSAGE);
                        Tesis.getInstancia().dispobles[posicion] = 0;
                    }
                }

            }

        }
    }//GEN-LAST:event_tbl_detalleMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        prestamoLibros.getInstancia().setVisible(false);
        verPrestamos.getInstancia().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prestamoLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarTabla;
    private javax.swing.JComboBox<String> comboBox_filtrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_detalle;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
