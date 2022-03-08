
package JFrames;

import Clases.LibroDigital;
import Clases.RenderTable;
import Clases.cuentaLibroVIrtual;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class verBibliotecaVirtual extends javax.swing.JFrame {

    private static verBibliotecaVirtual instancia;

    public static verBibliotecaVirtual getInstancia() {
        if (instancia == null) {
            instancia = new verBibliotecaVirtual();
        }
        return instancia;
    }

    public verBibliotecaVirtual() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_verBibliotecaVirtual = new javax.swing.JTable();
        btn_actualizar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_verBibliotecaVirtual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_verBibliotecaVirtual.setRowHeight(35);
        tbl_verBibliotecaVirtual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_verBibliotecaVirtualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_verBibliotecaVirtual);

        btn_actualizar.setBackground(new java.awt.Color(51, 51, 255));
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar Tabla");
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseEntered(evt);
            }
        });
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_regresar.setBackground(new java.awt.Color(51, 51, 255));
        btn_regresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_regresar.setText("Regresar");
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_regresarMouseEntered(evt);
            }
        });
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_actualizar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_regresar)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btn_actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        JButton btn1 = new JButton("Ver atributos");
        btn1.setName("v");
        JButton btn2 = new JButton("Eliminar");
        btn2.setName("e");

        Object[][] tabla_verBibliotecaVirtual = new Object[5][4];
        for (int i = 0; i <= cuentaLibroVIrtual.contador; i++) {
            if (cuentaLibroVIrtual.idUsuarioActual[i].equals(loginUsuario.idLoggeado)) {
                for (int j = 0; j < 4; j++) {
                    this.tbl_verBibliotecaVirtual.setDefaultRenderer(Object.class, new RenderTable());
                    tabla_verBibliotecaVirtual[i][0] = cuentaLibroVIrtual.isbn[i];
                    tabla_verBibliotecaVirtual[i][1] = cuentaLibroVIrtual.titulo[i];
                    tabla_verBibliotecaVirtual[i][2] = btn1;
                    tabla_verBibliotecaVirtual[i][3] = btn2;
                }
            }
        }
        String[] encabezado_verBibliotecaVirtual = {"ID", "Libro", "Ver", "Eliminar"};
        tbl_verBibliotecaVirtual.setModel(new DefaultTableModel(
                tabla_verBibliotecaVirtual,
                encabezado_verBibliotecaVirtual
        ));
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        verBibliotecaVirtual.getInstancia().setVisible(false);
        bibliotecaVirtual.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void tbl_verBibliotecaVirtualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_verBibliotecaVirtualMouseClicked
        int column = tbl_verBibliotecaVirtual.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbl_verBibliotecaVirtual.getRowHeight();
        String isbnTabla = "";
        isbnTabla = (String) (tbl_verBibliotecaVirtual.getValueAt(row, 0));

        if (row < tbl_verBibliotecaVirtual.getRowCount() && row >= 0 && column < tbl_verBibliotecaVirtual.getColumnCount() && column >= 0) {
            Object value = tbl_verBibliotecaVirtual.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                if (boton.getName().equals("v")) {
                    System.out.println(row);
                    ventanaEmergente_cuentaVirtual.getInstancia().setVisible(true);
                    String[][] tablaDetalle = new String[1][10];
                    tablaDetalle[0][0] = cuentaLibroVIrtual.isbn[row];
                    tablaDetalle[0][1] = cuentaLibroVIrtual.autor[row];
                    tablaDetalle[0][2] = cuentaLibroVIrtual.añoPublicacion[row];
                    tablaDetalle[0][3] = cuentaLibroVIrtual.titulo[row];
                    tablaDetalle[0][4] = cuentaLibroVIrtual.edicion[row];
                    tablaDetalle[0][5] = cuentaLibroVIrtual.palabrasClave[row];
                    tablaDetalle[0][6] = cuentaLibroVIrtual.descripcion[row];
                    tablaDetalle[0][7] = cuentaLibroVIrtual.temas[row];
                    tablaDetalle[0][8] = cuentaLibroVIrtual.tamaño[row];
                    String[] encabezadoDetalle = {"ISBN", "Autor", "Año Publicación", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Tamaño"};
                    ventanaEmergente_cuentaVirtual.getInstancia().DatosTabla(tablaDetalle, encabezadoDetalle);
                }
                if (boton.getName().equals("e")) {
                    System.out.println(row);
                    System.out.println(isbnTabla);
                    for (int i = 0; i <= cuentaLibroVIrtual.contador; i++) {
                        if (cuentaLibroVIrtual.isbn[i].equals(isbnTabla)) {
                            cuentaLibroVIrtual.contador = (cuentaLibroVIrtual.contador) - 1;
                            for (int j = row; j <= cuentaLibroVIrtual.contador; j++) {
                                cuentaLibroVIrtual.isbn[j] = cuentaLibroVIrtual.isbn[j + 1];
                                cuentaLibroVIrtual.autor[j] = cuentaLibroVIrtual.autor[j + 1];
                                cuentaLibroVIrtual.añoPublicacion[j] = cuentaLibroVIrtual.añoPublicacion[j + 1];
                                cuentaLibroVIrtual.titulo[j] = cuentaLibroVIrtual.titulo[j + 1];
                                cuentaLibroVIrtual.palabrasClave[j] = cuentaLibroVIrtual.palabrasClave[j + 1];
                                cuentaLibroVIrtual.edicion[j] = cuentaLibroVIrtual.edicion[j + 1];
                                cuentaLibroVIrtual.descripcion[j] = cuentaLibroVIrtual.descripcion[j + 1];
                                cuentaLibroVIrtual.temas[j] = cuentaLibroVIrtual.temas[j + 1];
                                cuentaLibroVIrtual.tamaño[j] = cuentaLibroVIrtual.tamaño[j + 1];
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "¡El libro digital fue eliminado con éxito!", "Libro digital eliminado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_tbl_verBibliotecaVirtualMouseClicked

    private void btn_regresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseEntered
        btn_actualizar.setBackground(Color.blue);
        btn_actualizar.setForeground(Color.white);
        btn_regresar.setBackground(Color.white);
        btn_regresar.setForeground(Color.blue);
    }//GEN-LAST:event_btn_regresarMouseEntered

    private void btn_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseEntered
        btn_actualizar.setBackground(Color.white);
        btn_actualizar.setForeground(Color.blue);
        btn_regresar.setBackground(Color.blue);
        btn_regresar.setForeground(Color.white);
    }//GEN-LAST:event_btn_actualizarMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verBibliotecaVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_verBibliotecaVirtual;
    // End of variables declaration//GEN-END:variables
}
