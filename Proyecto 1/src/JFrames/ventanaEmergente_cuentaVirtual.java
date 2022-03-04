package JFrames;

import JFrames.verBibliotecaVirtual;
import javax.swing.table.DefaultTableModel;

public class ventanaEmergente_cuentaVirtual extends javax.swing.JFrame {

private static ventanaEmergente_cuentaVirtual instancia;

public String[][] Datos;
public String []encabezado;

 public void DatosTabla(String[][] Datos, String[] encabezado) {
        this.Datos = Datos;
        this.encabezado = encabezado;
    }

    public static ventanaEmergente_cuentaVirtual getInstancia() {
        if (instancia == null) {
            instancia = new ventanaEmergente_cuentaVirtual();
        }
        return instancia;
    }

    public ventanaEmergente_cuentaVirtual() {
        initComponents();
        setLocationRelativeTo(null);
        tablaDetalle.setModel(new DefaultTableModel(
                Datos,
                encabezado
        ));
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaEmergente_cuentaV = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        btn_cerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventanaEmergente_cuentaV.setBackground(new java.awt.Color(204, 204, 204));

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDetalle);

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        jButton1.setText("Cargar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaEmergente_cuentaVLayout = new javax.swing.GroupLayout(ventanaEmergente_cuentaV);
        ventanaEmergente_cuentaV.setLayout(ventanaEmergente_cuentaVLayout);
        ventanaEmergente_cuentaVLayout.setHorizontalGroup(
            ventanaEmergente_cuentaVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaEmergente_cuentaVLayout.createSequentialGroup()
                .addComponent(btn_cerrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ventanaEmergente_cuentaVLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ventanaEmergente_cuentaVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        ventanaEmergente_cuentaVLayout.setVerticalGroup(
            ventanaEmergente_cuentaVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEmergente_cuentaVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_cerrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaEmergente_cuentaV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaEmergente_cuentaV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        ventanaEmergente_cuentaVirtual.getInstancia().setVisible(false);
        verBibliotecaVirtual.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tablaDetalle.setModel(new DefaultTableModel(
                Datos,
                encabezado
        ));
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaEmergente_cuentaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaEmergente_cuentaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaEmergente_cuentaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaEmergente_cuentaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaEmergente_cuentaVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JPanel ventanaEmergente_cuentaV;
    // End of variables declaration//GEN-END:variables
}
