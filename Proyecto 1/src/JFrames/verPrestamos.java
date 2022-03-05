
package JFrames;

import Clases.*;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
public class verPrestamos extends javax.swing.JFrame {

    private static verPrestamos instancia;

    public static verPrestamos getInstancia() {
        if (instancia == null) {
            instancia = new verPrestamos();
        }
        return instancia;
    }

    public verPrestamos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_verPrestamos = new javax.swing.JTable();
        btn_verPrestamos = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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
        jScrollPane1.setViewportView(tbl_verPrestamos);

        btn_verPrestamos.setText("Ver préstamos");
        btn_verPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verPrestamosActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar");
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
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
        for (int i = 0; i <= cuentaBibliografia.getInstancia().contador; i++) {
            noIndice = noIndice + 1;
            for (int j = 0; j < 10; j++) {
                this.tbl_verPrestamos.setDefaultRenderer(Object.class, new RenderTable());
                tablaVerPrestamos[i][0] = noIndice;
                tablaVerPrestamos[i][1] = cuentaBibliografia.getInstancia().isbn[i];
                tablaVerPrestamos[i][2] = cuentaBibliografia.getInstancia().titulo[i];
                tablaVerPrestamos[i][3] = cuentaBibliografia.getInstancia().tipo[i];
                tablaVerPrestamos[i][4] = new JButton("Devolver");
            }
        }
        String[] encabezado = {"No. Índice","ID/ISBN","Título","Tipo","Devolver"};
        tbl_verPrestamos.setModel(new DefaultTableModel(
                tablaVerPrestamos,
                encabezado
        ));
    }//GEN-LAST:event_btn_verPrestamosActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        verPrestamos.getInstancia().setVisible(false);
        prestamoLibros.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

 
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
