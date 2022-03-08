
package JFrames;

import JFrames.pantallaInicio;
import Clases.Usuario;
import JFrames.loginUsuario;
import JFrames.bibliotecaVirtual;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class ventanaUsuario extends javax.swing.JFrame {


    public ventanaUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon imagen = new ImageIcon("src/Imagenes/23154.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
        lblFoto.setIcon(icono);
        this.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_bibliotecaVirtual = new javax.swing.JButton();
        btn_prestamoLibro = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_username1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_username2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_username3 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_bibliotecaVirtual.setBackground(new java.awt.Color(51, 51, 255));
        btn_bibliotecaVirtual.setForeground(new java.awt.Color(255, 255, 255));
        btn_bibliotecaVirtual.setText("Biblioteca Virtual");
        btn_bibliotecaVirtual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bibliotecaVirtualMouseEntered(evt);
            }
        });
        btn_bibliotecaVirtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bibliotecaVirtualActionPerformed(evt);
            }
        });

        btn_prestamoLibro.setBackground(new java.awt.Color(51, 51, 255));
        btn_prestamoLibro.setForeground(new java.awt.Color(255, 255, 255));
        btn_prestamoLibro.setText("Préstamo de Libro");
        btn_prestamoLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prestamoLibroMouseEntered(evt);
            }
        });
        btn_prestamoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestamoLibroActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(51, 51, 255));
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("LOGOUT");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        jLabel1.setText("INFORMACIÓN DE USUARIO");

        jLabel2.setText("Usuario:");

        lbl_username.setText(loginUsuario.usuarioLoggeado);

        jLabel3.setText("Nombre:");

        lbl_username1.setText(loginUsuario.nombreLoggeado
        );

        jLabel4.setText("Apellido:");

        lbl_username2.setText(loginUsuario.apellidoLoggeado
        );

        jLabel5.setText("Rol:");

        lbl_username3.setText(loginUsuario.rolLoggeado);

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/23154.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_username1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_username2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_username3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_prestamoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bibliotecaVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_username1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_username2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_username3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_prestamoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_bibliotecaVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jMenu1.setText("Cuenta");

        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        pantallaInicio.getInstancia().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_bibliotecaVirtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bibliotecaVirtualActionPerformed
        this.setVisible(false);
        bibliotecaVirtual.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_bibliotecaVirtualActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.setVisible(false);
        pantallaInicio.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_prestamoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestamoLibroActionPerformed
       this.setVisible(false);
       prestamoLibros.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_prestamoLibroActionPerformed

    private void btn_prestamoLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prestamoLibroMouseEntered
        btn_prestamoLibro.setBackground(Color.white);
        btn_prestamoLibro.setForeground(Color.blue);
        btn_bibliotecaVirtual.setBackground(Color.blue);
        btn_bibliotecaVirtual.setForeground(Color.white);
        btn_logout.setBackground(Color.blue);
        btn_logout.setForeground(Color.white);
    }//GEN-LAST:event_btn_prestamoLibroMouseEntered

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        btn_prestamoLibro.setBackground(Color.blue);
        btn_prestamoLibro.setForeground(Color.white);
        btn_bibliotecaVirtual.setBackground(Color.blue);
        btn_bibliotecaVirtual.setForeground(Color.white);
        btn_logout.setBackground(Color.white);
        btn_logout.setForeground(Color.blue);
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_bibliotecaVirtualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bibliotecaVirtualMouseEntered
        btn_prestamoLibro.setBackground(Color.blue);
        btn_prestamoLibro.setForeground(Color.white);
        btn_bibliotecaVirtual.setBackground(Color.white);
        btn_bibliotecaVirtual.setForeground(Color.blue);
        btn_logout.setBackground(Color.blue);
        btn_logout.setForeground(Color.white);
    }//GEN-LAST:event_btn_bibliotecaVirtualMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bibliotecaVirtual;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_prestamoLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel lbl_username1;
    private javax.swing.JLabel lbl_username2;
    private javax.swing.JLabel lbl_username3;
    // End of variables declaration//GEN-END:variables
}
