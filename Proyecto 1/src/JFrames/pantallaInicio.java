package JFrames;


import java.awt.BorderLayout;
import java.util.Set;
import javax.swing.JPanel;
import Clases.Usuario;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import JFrames.panelAbout;

public class pantallaInicio extends javax.swing.JFrame {


    public pantallaInicio(JButton btn_Cancelar, JButton btn_about, JButton btn_login, JPanel panelContenido, JPanel panelPrincipal) throws HeadlessException {
        this.btn_Cancelar = btn_Cancelar;
        this.btn_about = btn_about;
        this.btn_login = btn_login;
        this.panelContenido = panelContenido;
        this.panelPrincipal = panelPrincipal;
    }

    private static pantallaInicio instancia;

    public static pantallaInicio getInstancia() {
        if (instancia == null) {
            instancia = new pantallaInicio();
        }
        return instancia;
    }

    public pantallaInicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 500));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8756795_orig.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("BIBLIOTECA USAC");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("BIBLIOTECA USAC");

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(110, 110, 110))
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenidoLayout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelContenidoLayout.createSequentialGroup()
                    .addGap(221, 221, 221)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(222, Short.MAX_VALUE)))
        );

        panelPrincipal.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 440, 500));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login.setBackground(new java.awt.Color(51, 51, 255));
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 100));

        btn_Cancelar.setBackground(new java.awt.Color(51, 51, 255));
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CancelarMouseEntered(evt);
            }
        });
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 100));

        btn_about.setBackground(new java.awt.Color(51, 51, 255));
        btn_about.setForeground(new java.awt.Color(255, 255, 255));
        btn_about.setText("About");
        btn_about.setToolTipText("");
        btn_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_aboutMouseEntered(evt);
            }
        });
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 160, 100));

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        panelAbout pAbout = new panelAbout();
        pAbout.setSize(440, 500);
        pAbout.setLocation(0, 0);
        panelContenido.removeAll();
        panelContenido.add(pAbout, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btn_aboutActionPerformed

    private void btn_aboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aboutMouseEntered
        btn_about.setBackground(Color.white);
        btn_about.setForeground(Color.blue);
        btn_Cancelar.setBackground(Color.blue);
        btn_Cancelar.setForeground(Color.white);
        btn_login.setBackground(Color.blue);
        btn_login.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aboutMouseEntered

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        fondoPantallaInicio fInicio = new fondoPantallaInicio();
        fInicio.setSize(440, 500);
        fInicio.setLocation(0, 0);

        panelContenido.removeAll();
        panelContenido.add(fInicio, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelarMouseEntered
        btn_Cancelar.setBackground(Color.white);
        btn_Cancelar.setForeground(Color.blue);
        btn_login.setBackground(Color.blue);
        btn_login.setForeground(Color.white);
        btn_about.setBackground(Color.blue);
        btn_about.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CancelarMouseEntered

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        loginUsuario loUsuario = new loginUsuario();
        loUsuario.setSize(461,500);
        loUsuario.setLocation(0,0);

        panelContenido.removeAll();
        panelContenido.add(loUsuario, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
        btn_login.setBackground(Color.white);
        btn_login.setForeground(Color.blue);
        btn_Cancelar.setBackground(Color.blue);
        btn_Cancelar.setForeground(Color.white);
        btn_about.setBackground(Color.blue);
        btn_about.setForeground(Color.white);
    }//GEN-LAST:event_btn_loginMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                pantallaInicio.getInstancia().setVisible(true);
            }
        });
    }

    public void nuevoPanel(JPanel panelActual){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
