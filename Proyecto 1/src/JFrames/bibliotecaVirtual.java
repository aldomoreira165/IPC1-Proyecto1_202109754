
package JFrames;

import Clases.LibroDigital;
import Clases.RenderTable;
import Clases.cuentaLibroVIrtual;
import JFrames.verBibliotecaVirtual;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

public class bibliotecaVirtual extends javax.swing.JFrame {

private static bibliotecaVirtual instancia;

public static bibliotecaVirtual getInstancia(){
    if (instancia == null) {
            instancia = new bibliotecaVirtual();
        }
        return instancia;
    }

    public bibliotecaVirtual() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void filter(String query) {
         TableRowSorter<TableModel> tr = new TableRowSorter<>(tbl_mostrarLibrosDigitales.getModel());
         tbl_mostrarLibrosDigitales.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(query));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mostrarLibrosDigitales = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        txt_busqueda = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_verBibliotecaVirtual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tbl_mostrarLibrosDigitales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_mostrarLibrosDigitales.setRowHeight(35);
        tbl_mostrarLibrosDigitales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_mostrarLibrosDigitalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_mostrarLibrosDigitales);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar Tabla");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        txt_busqueda.setPreferredSize(new java.awt.Dimension(121, 32));
        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autor", "Año", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Tamaño" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(121, 32));

        btn_verBibliotecaVirtual.setText("Ver biblioteca virtual");
        btn_verBibliotecaVirtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verBibliotecaVirtualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_verBibliotecaVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(616, 616, 616))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_verBibliotecaVirtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txt_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ventanaUsuario.getInstancia().setVisible(true);
        bibliotecaVirtual.getInstancia().setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bibliotecaVirtual.getInstancia().setVisible(false);
        pantallaInicio.getInstancia().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        Object[][] tablaLibroDigital = new Object[10][10];
        for (int i = 0; i <= LibroDigital.getInstancia().contador; i++) {
            for (int j = 0; j < 10; j++) {
                this.tbl_mostrarLibrosDigitales.setDefaultRenderer(Object.class, new RenderTable());
                tablaLibroDigital[i][0] = LibroDigital.getInstancia().isbn[i];
                tablaLibroDigital[i][1] = LibroDigital.getInstancia().autor[i];
                tablaLibroDigital[i][2] = LibroDigital.getInstancia().añoPublicacion[i];
                tablaLibroDigital[i][3] = LibroDigital.getInstancia().titulo[i];
                tablaLibroDigital[i][4] = LibroDigital.getInstancia().edicion[i];
                tablaLibroDigital[i][5] = LibroDigital.getInstancia().palabrasClave[i];
                tablaLibroDigital[i][6] = LibroDigital.getInstancia().descripcion[i];
                tablaLibroDigital[i][7] = LibroDigital.getInstancia().temas[i];
                tablaLibroDigital[i][8] = LibroDigital.getInstancia().tamaño[i];
                tablaLibroDigital[i][9] = new JButton("Guardar");
            }
        }
        String[] encabezadoLibroDigital = {"ISBN", "Autor", "Año Publicación", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Tamaño", "Guardar"};
        tbl_mostrarLibrosDigitales.setModel(new DefaultTableModel(
                tablaLibroDigital,
                encabezadoLibroDigital
        ));
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyReleased
        String query = txt_busqueda.getText().toLowerCase();
        filter(query);
    }//GEN-LAST:event_txt_busquedaKeyReleased

    private void tbl_mostrarLibrosDigitalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mostrarLibrosDigitalesMouseClicked
        int column = tbl_mostrarLibrosDigitales.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbl_mostrarLibrosDigitales.getRowHeight();
        String isbnTabla = "";
        String isbn = "", autor= "", añoPublicacion= "", titulo= "", edicion= "", palabrasClave= "", descripcion= "", temas= "", tamaño= "";
        boolean libroExistente = false;

        if (row < tbl_mostrarLibrosDigitales.getRowCount() && row >= 0 && column < tbl_mostrarLibrosDigitales.getColumnCount() && column >= 0) {
            Object value = tbl_mostrarLibrosDigitales.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                isbnTabla = (String) (tbl_mostrarLibrosDigitales.getValueAt(row, 0));

                for (int j = 0; j <= cuentaLibroVIrtual.getInstancia().contador; j++) {
                    if (cuentaLibroVIrtual.getInstancia().isbn[j].equals(isbnTabla)) {
                        JOptionPane.showMessageDialog(null, "Ya ha adquirido este libro digital.", "Error", JOptionPane.WARNING_MESSAGE);
                        libroExistente = true;
                    }
                }
                if (libroExistente == false) {
                    for (int i = 0; i <= LibroDigital.getInstancia().contador; i++) {
                        if (LibroDigital.getInstancia().isbn[i].equals(isbnTabla)) {
                            isbn = LibroDigital.getInstancia().isbn[i];
                            autor = LibroDigital.getInstancia().autor[i];
                            añoPublicacion = LibroDigital.getInstancia().añoPublicacion[i];
                            titulo = LibroDigital.getInstancia().titulo[i];
                            edicion = LibroDigital.getInstancia().edicion[i];
                            palabrasClave = LibroDigital.getInstancia().palabrasClave[i];
                            descripcion = LibroDigital.getInstancia().descripcion[i];
                            temas = LibroDigital.getInstancia().temas[i];
                            tamaño = LibroDigital.getInstancia().tamaño[i];
                        }
                    }
                    cuentaLibroVIrtual.getInstancia().contador = cuentaLibroVIrtual.getInstancia().contador + 1;
                    cuentaLibroVIrtual.getInstancia().isbn[cuentaLibroVIrtual.getInstancia().contador] = isbn;
                    cuentaLibroVIrtual.getInstancia().autor[cuentaLibroVIrtual.getInstancia().contador] = autor;
                    cuentaLibroVIrtual.getInstancia().añoPublicacion[cuentaLibroVIrtual.getInstancia().contador] = añoPublicacion;
                    cuentaLibroVIrtual.getInstancia().titulo[cuentaLibroVIrtual.getInstancia().contador] = titulo;
                    cuentaLibroVIrtual.getInstancia().edicion[cuentaLibroVIrtual.getInstancia().contador] = edicion;
                    cuentaLibroVIrtual.getInstancia().palabrasClave[cuentaLibroVIrtual.getInstancia().contador] = palabrasClave;
                    cuentaLibroVIrtual.getInstancia().descripcion[cuentaLibroVIrtual.getInstancia().contador] = descripcion;
                    cuentaLibroVIrtual.getInstancia().temas[cuentaLibroVIrtual.getInstancia().contador] = temas;
                    cuentaLibroVIrtual.getInstancia().tamaño[cuentaLibroVIrtual.getInstancia().contador] = tamaño;
                    JOptionPane.showMessageDialog(null, "Libro digital '" + titulo + "' añadido", "Nuevo libro digital", JOptionPane.INFORMATION_MESSAGE);

                }
                System.out.println("LIBROS DIGITALES ADQUIRIDOS");
                for (int i = 0; i <= cuentaLibroVIrtual.getInstancia().contador; i++) {
                    System.out.println("*******************************************************************");
                    System.out.println(cuentaLibroVIrtual.getInstancia().isbn[i]);
                    System.out.println(cuentaLibroVIrtual.getInstancia().autor[i]);
                    System.out.println(cuentaLibroVIrtual.getInstancia().añoPublicacion[i]);
                    System.out.println(cuentaLibroVIrtual.getInstancia().titulo[i]);
                    System.out.println(cuentaLibroVIrtual.getInstancia().edicion[i]);
                    System.out.println(cuentaLibroVIrtual.getInstancia().palabrasClave[i]);
                    System.out.println(cuentaLibroVIrtual.getInstancia().descripcion[i]);
                    System.out.println(cuentaLibroVIrtual.getInstancia().temas[i]);
                    System.out.println(cuentaLibroVIrtual.getInstancia().tamaño[i]);
                    System.out.println("*******************************************************************");
                }
            }
        }

    }//GEN-LAST:event_tbl_mostrarLibrosDigitalesMouseClicked

    private void btn_verBibliotecaVirtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verBibliotecaVirtualActionPerformed
        verBibliotecaVirtual.getInstancia().setVisible(true);
        bibliotecaVirtual.getInstancia().setVisible(false);
    }//GEN-LAST:event_btn_verBibliotecaVirtualActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bibliotecaVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_verBibliotecaVirtual;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_mostrarLibrosDigitales;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
