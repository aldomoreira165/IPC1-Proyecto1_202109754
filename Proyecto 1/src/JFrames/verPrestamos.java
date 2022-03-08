
package JFrames;

import Clases.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class verPrestamos extends javax.swing.JFrame {

    public verPrestamos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static verPrestamos prestamosActuales;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_verPrestamos = new javax.swing.JTable();
        btn_verPrestamos = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_verPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_verPrestamos.setRowHeight(35);
        tbl_verPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_verPrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_verPrestamos);

        btn_verPrestamos.setBackground(new java.awt.Color(51, 51, 255));
        btn_verPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        btn_verPrestamos.setText("Ver préstamos");
        btn_verPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_verPrestamosMouseEntered(evt);
            }
        });
        btn_verPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verPrestamosActionPerformed(evt);
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
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_verPrestamos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_regresar)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btn_verPrestamos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
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

    private void btn_verPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verPrestamosActionPerformed
        int noIndice;
        noIndice = 0;
        Object[][] tablaVerPrestamos = new Object[10][5];
        for (int i = 0; i <= cuentaBibliografia.contador; i++) {
            if (cuentaBibliografia.idUsuarioActual[i].equals(loginUsuario.idLoggeado)) {
                for (int j = 0; j < 10; j++) {
                    this.tbl_verPrestamos.setDefaultRenderer(Object.class, new RenderTable());
                    tablaVerPrestamos[i][0] = noIndice;
                    tablaVerPrestamos[i][1] = cuentaBibliografia.isbn[i];
                    tablaVerPrestamos[i][2] = cuentaBibliografia.titulo[i];
                    tablaVerPrestamos[i][3] = cuentaBibliografia.tipo[i];
                    tablaVerPrestamos[i][4] = new JButton("Devolver");
                }
            }
            noIndice = noIndice + 1;
        }
        String[] encabezado = {"No. Índice", "ID/ISBN", "Título", "Tipo", "Devolver"};
        tbl_verPrestamos.setModel(new DefaultTableModel(
                tablaVerPrestamos,
                encabezado
        ));
    }//GEN-LAST:event_btn_verPrestamosActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        verPrestamos.prestamosActuales.setVisible(false);
        prestamoLibros.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void tbl_verPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_verPrestamosMouseClicked
        int column = tbl_verPrestamos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbl_verPrestamos.getRowHeight();
        String isbnTabla = "";
        String tipoTabla = "";

        if (row < tbl_verPrestamos.getRowCount() && row >= 0 && column < tbl_verPrestamos.getColumnCount() && column >= 0) {
            Object value = tbl_verPrestamos.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                isbnTabla = (String) (tbl_verPrestamos.getValueAt(row, 1));
                tipoTabla = (String) (tbl_verPrestamos.getValueAt(row, 3));

                if (tipoTabla.equals("Libro")) {
                    for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                        if (Libro.getInstancia().isbn[i].equals(isbnTabla)) {
                            Libro.getInstancia().dispobles[i] = Libro.getInstancia().dispobles[i] + 1;
                            cuentaBibliografia.contador = ((cuentaBibliografia.contador) - 1);
                            for (int j = row; j <= cuentaBibliografia.contador; j++) {
                                cuentaBibliografia.isbn[j] = cuentaBibliografia.isbn[j + 1];
                                cuentaBibliografia.titulo[j] = cuentaBibliografia.titulo[j + 1];
                                cuentaBibliografia.tipo[j] = cuentaBibliografia.tipo[j + 1];
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Devolución realizada con éxito", "Nueva devolución", JOptionPane.INFORMATION_MESSAGE);
                }
                if (tipoTabla.equals("Revista")) {
                    for (int i = 0; i <= Revista.getInstancia().contador; i++) {
                        if (Revista.getInstancia().isbn[i].equals(isbnTabla)) {
                            cuentaBibliografia.contador = cuentaBibliografia.contador - 1;
                            Revista.getInstancia().dispobles[i] = Revista.getInstancia().dispobles[i] + 1;
                            for (int j = row; j <= cuentaBibliografia.contador; j++) {
                                cuentaBibliografia.contador = cuentaBibliografia.contador - 1;
                                cuentaBibliografia.idUsuarioActual[j] = cuentaBibliografia.idUsuarioActual[j + 1];
                                cuentaBibliografia.isbn[j] = cuentaBibliografia.isbn[j + 1];
                                cuentaBibliografia.titulo[j] = cuentaBibliografia.titulo[j + 1];
                                cuentaBibliografia.tipo[j] = cuentaBibliografia.tipo[j + 1];
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Devolución realizada con éxito", "Nueva devolución", JOptionPane.INFORMATION_MESSAGE);
                }
                if (tipoTabla.equals("Tesis")) {
                    for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                        if (Tesis.getInstancia().isbn[i].equals(isbnTabla)) {
                            Tesis.getInstancia().dispobles[i] = Tesis.getInstancia().dispobles[i] + 1;
                            cuentaBibliografia.contador = cuentaBibliografia.contador - 1;
                            for (int j = row; j <= cuentaBibliografia.contador; j++) {
                                cuentaBibliografia.isbn[j] = cuentaBibliografia.isbn[j + 1];
                                cuentaBibliografia.titulo[j] = cuentaBibliografia.titulo[j + 1];
                                cuentaBibliografia.tipo[j] = cuentaBibliografia.tipo[j + 1];
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Devolución realizada con éxito", "Nueva devolución", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_tbl_verPrestamosMouseClicked

    private void btn_regresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseEntered
        btn_regresar.setBackground(Color.white);
        btn_regresar.setForeground(Color.blue);
        btn_verPrestamos.setBackground(Color.blue);
        btn_verPrestamos.setForeground(Color.white);
    }//GEN-LAST:event_btn_regresarMouseEntered

    private void btn_verPrestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verPrestamosMouseEntered
        btn_regresar.setBackground(Color.blue);
        btn_regresar.setForeground(Color.white);
        btn_verPrestamos.setBackground(Color.blue);
        btn_verPrestamos.setForeground(Color.white);
    }//GEN-LAST:event_btn_verPrestamosMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verPrestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_verPrestamos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_verPrestamos;
    // End of variables declaration//GEN-END:variables
}
