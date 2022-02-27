package JFrames;

import Clases.Bibliografia;
import javax.swing.JOptionPane;
import Clases.Bibliografia;

public class modificarBibliografia extends javax.swing.JFrame {

public static modificarBibliografia instancia;

public static modificarBibliografia getInstancia() {
        if (instancia == null) {
            instancia = new modificarBibliografia();
        }
        return instancia;
    }

    public modificarBibliografia() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txt_palabras2 = new javax.swing.JTextField();
        txt_titulo2 = new javax.swing.JTextField();
        txt_descripcion2 = new javax.swing.JTextField();
        txt_año2 = new javax.swing.JTextField();
        txt_autor2 = new javax.swing.JTextField();
        txt_edicion2 = new javax.swing.JTextField();
        txt_temas2 = new javax.swing.JTextField();
        txt_copias2 = new javax.swing.JTextField();
        txt_area2 = new javax.swing.JTextField();
        txt_categoria2 = new javax.swing.JTextField();
        txt_isbn2 = new javax.swing.JTextField();
        comboBox_tipo2 = new javax.swing.JComboBox<>();
        btn_modificar = new javax.swing.JButton();
        btn_cancelar2 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        comboBox_tipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista ", "Tesis", "Libro Digital" }));

        btn_modificar.setText("Modificar");
        btn_modificar.setEnabled(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_cancelar2.setText("Cancelar");
        btn_cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar2ActionPerformed(evt);
            }
        });

        jLabel25.setText("Autor:");

        jLabel26.setText("Año:");

        jLabel27.setText("Título:");

        jLabel28.setText("Descripción:");

        jLabel29.setText("Palabras:");

        jLabel30.setText("Edición:");

        jLabel31.setText("Temas:");

        jLabel32.setText("Copias:");

        jLabel33.setText("Área:");

        jLabel34.setText("Categoría:");

        jLabel35.setText("ISBN:");

        jLabel36.setText("Tipo:");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_autor2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_isbn2)
                            .addComponent(txt_categoria2)
                            .addComponent(txt_area2)
                            .addComponent(txt_copias2)
                            .addComponent(txt_temas2)
                            .addComponent(txt_edicion2)
                            .addComponent(txt_año2)
                            .addComponent(txt_descripcion2)
                            .addComponent(txt_titulo2)
                            .addComponent(txt_palabras2)
                            .addComponent(comboBox_tipo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(btn_cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar)
                            .addComponent(txt_isbn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_año2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_descripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_palabras2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_edicion2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_temas2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_copias2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_area2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_categoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_autor2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox_tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        boolean bibliografiaEncontrada;
        bibliografiaEncontrada = false;
        for (int i = 0; i <= Bibliografia.getInstancia().contador; i++) {
            if (Bibliografia.getInstancia().isbn[i].equals(txt_isbn2.getText())) {             
                    bibliografiaEncontrada = true;
                    Bibliografia.getInstancia().autor[i] = txt_autor2.getText();            
                    Bibliografia.getInstancia().año[i] = txt_año2.getText();            
                    Bibliografia.getInstancia().titulo[i] = txt_titulo2.getText();            
                    Bibliografia.getInstancia().descripcion[i] = txt_descripcion2.getText();            
                    Bibliografia.getInstancia().palabras[i] = txt_palabras2.getText();            
                    Bibliografia.getInstancia().edicion[i] = txt_edicion2.getText();            
                    Bibliografia.getInstancia().temas[i] = txt_temas2.getText();            
                    Bibliografia.getInstancia().copias[i] = txt_copias2.getText();            
                    Bibliografia.getInstancia().area[i] = txt_area2.getText();            
                    Bibliografia.getInstancia().categoria[i] = txt_categoria2.getText();                     
                    Bibliografia.getInstancia().tipo[i] = (String) comboBox_tipo2.getSelectedItem();
            }
        }

        if (txt_isbn2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegúrese de ingresar un ISBN", "ISBN no ingresado", JOptionPane.WARNING_MESSAGE);
        }

        if (bibliografiaEncontrada == true) {
            JOptionPane.showMessageDialog(null, "¡La modificación se realizó con éxito!", "Modificación realizada", JOptionPane.INFORMATION_MESSAGE);
            modificarBibliografia.getInstancia().setVisible(false);
            ventanaAdministrador.getInstancia().setVisible(true);
            btn_modificar.setEnabled(false);
            txt_autor2.setText("");
            txt_año2.setText("");
            txt_titulo2.setText("");
            txt_descripcion2.setText("");
            txt_palabras2.setText("");
            txt_edicion2.setText("");
            txt_temas2.setText("");
            txt_copias2.setText("");
            txt_area2.setText("");
            txt_categoria2.setText("");
            txt_isbn2.setText("");
            comboBox_tipo2.setSelectedItem("Libro");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar2ActionPerformed

        txt_isbn2.setText("");
        txt_autor2.setText("");
        txt_año2.setText("");
        txt_titulo2.setText("");
        txt_descripcion2.setText("");
        txt_palabras2.setText("");
        txt_edicion2.setText("");
        txt_temas2.setText("");
        txt_copias2.setText("");
        txt_area2.setText("");
        txt_categoria2.setText("");
        comboBox_tipo2.setSelectedItem("Libro");
        btn_modificar.setEnabled(false);
        modificarBibliografia.getInstancia().setVisible(false);
        ventanaAdministrador.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_cancelar2ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       boolean bibliografiaEncontrada;
        bibliografiaEncontrada = false;
        for (int i = 0; i <= Bibliografia.getInstancia().contador; i++) {
            if (Bibliografia.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                bibliografiaEncontrada = true;
                btn_modificar.setEnabled(true);
                txt_autor2.setText(Bibliografia.getInstancia().autor[i]);
                txt_año2.setText(Bibliografia.getInstancia().año[i]);
                txt_titulo2.setText(Bibliografia.getInstancia().titulo[i]);
                txt_descripcion2.setText(Bibliografia.getInstancia().descripcion[i]);
                txt_palabras2.setText(Bibliografia.getInstancia().palabras[i]);
                txt_edicion2.setText(Bibliografia.getInstancia().edicion[i]);
                txt_temas2.setText(Bibliografia.getInstancia().temas[i]);
                txt_copias2.setText(Bibliografia.getInstancia().copias[i]);
                txt_area2.setText(Bibliografia.getInstancia().area[i]);
                txt_categoria2.setText(Bibliografia.getInstancia().categoria[i]);
                comboBox_tipo2.setSelectedItem(Bibliografia.getInstancia().tipo[i]);
            } 
        }
        if (bibliografiaEncontrada == true) {
            JOptionPane.showMessageDialog(null, "¡Bibliografia con el ISBN " + txt_isbn2.getText() + " encontrada!", "Bibliografía encontrada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Bibliografía no encontrada. Verifica el ISBN.", "Error", JOptionPane.WARNING_MESSAGE);
            txt_autor2.setText("");
            txt_año2.setText("");
            txt_titulo2.setText("");
            txt_descripcion2.setText("");
            txt_palabras2.setText("");
            txt_edicion2.setText("");
            txt_temas2.setText("");
            txt_copias2.setText("");
            txt_area2.setText("");
            txt_categoria2.setText("");
            comboBox_tipo2.setSelectedItem("Libro");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(modificarBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarBibliografia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar2;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> comboBox_tipo2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_area2;
    private javax.swing.JTextField txt_autor2;
    private javax.swing.JTextField txt_año2;
    private javax.swing.JTextField txt_categoria2;
    private javax.swing.JTextField txt_copias2;
    private javax.swing.JTextField txt_descripcion2;
    private javax.swing.JTextField txt_edicion2;
    private javax.swing.JTextField txt_isbn2;
    private javax.swing.JTextField txt_palabras2;
    private javax.swing.JTextField txt_temas2;
    private javax.swing.JTextField txt_titulo2;
    // End of variables declaration//GEN-END:variables
}