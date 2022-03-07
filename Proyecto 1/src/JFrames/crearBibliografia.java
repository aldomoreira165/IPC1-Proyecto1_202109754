package JFrames;

import java.awt.Color;

public class crearBibliografia extends javax.swing.JFrame {

public static crearBibliografia instancia;

public static crearBibliografia getInstancia() {
        if (instancia == null) {
            instancia = new crearBibliografia();
        }
        return instancia;
    }

    public crearBibliografia() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_cargaIndividual = new javax.swing.JButton();
        btn_cargaMasiva = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_cargaIndividual.setBackground(new java.awt.Color(51, 51, 255));
        btn_cargaIndividual.setForeground(new java.awt.Color(255, 255, 255));
        btn_cargaIndividual.setText("Carga Individual");
        btn_cargaIndividual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cargaIndividualMouseEntered(evt);
            }
        });
        btn_cargaIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargaIndividualActionPerformed(evt);
            }
        });

        btn_cargaMasiva.setBackground(new java.awt.Color(51, 51, 255));
        btn_cargaMasiva.setForeground(new java.awt.Color(255, 255, 255));
        btn_cargaMasiva.setText("Carga Masiva");
        btn_cargaMasiva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cargaMasivaMouseEntered(evt);
            }
        });
        btn_cargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargaMasivaActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(51, 51, 255));
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btn_cargaIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_cargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_salir)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_salir)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cargaIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargaIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargaIndividualActionPerformed
        crearBibliografia.getInstancia().setVisible(false);
        cargaIndividual.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_cargaIndividualActionPerformed

    private void btn_cargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargaMasivaActionPerformed
        crearBibliografia.getInstancia().setVisible(false);
        cargaMasiva.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_cargaMasivaActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        crearBibliografia.getInstancia().setVisible(false);
        ventanaAdministrador.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        btn_salir.setBackground(Color.white);
        btn_salir.setForeground(Color.blue);
        btn_cargaIndividual.setBackground(Color.blue);
        btn_cargaIndividual.setForeground(Color.white);
        btn_cargaMasiva.setBackground(Color.blue);
        btn_cargaMasiva.setForeground(Color.white);
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_cargaIndividualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cargaIndividualMouseEntered
        btn_salir.setBackground(Color.blue);
        btn_salir.setForeground(Color.white);
        btn_cargaIndividual.setBackground(Color.white);
        btn_cargaIndividual.setForeground(Color.blue);
        btn_cargaMasiva.setBackground(Color.blue);
        btn_cargaMasiva.setForeground(Color.white);
    }//GEN-LAST:event_btn_cargaIndividualMouseEntered

    private void btn_cargaMasivaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cargaMasivaMouseEntered
        btn_salir.setBackground(Color.blue);
        btn_salir.setForeground(Color.white);
        btn_cargaIndividual.setBackground(Color.blue);
        btn_cargaIndividual.setForeground(Color.white);
        btn_cargaMasiva.setBackground(Color.white);
        btn_cargaMasiva.setForeground(Color.blue);
    }//GEN-LAST:event_btn_cargaMasivaMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crearBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearBibliografia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargaIndividual;
    private javax.swing.JButton btn_cargaMasiva;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
