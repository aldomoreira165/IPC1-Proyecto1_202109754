package JFrames;

import Clases.Usuario;
import JFrames.eliminarUsuario;
import java.awt.Color;
import javax.swing.JOptionPane;

public class eliminarUsuario extends javax.swing.JFrame {

    private static eliminarUsuario instancia;
    Boolean estado;

    public static eliminarUsuario getInstancia() {
        if (instancia == null) {
            instancia = new eliminarUsuario();
        }
        return instancia;
    }

    public eliminarUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        txt_rol = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JPasswordField();
        txt_confirmarContraseña = new javax.swing.JPasswordField();
        btn_buscar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_nombre.setEnabled(false);

        txt_apellido.setEnabled(false);

        txt_user.setEnabled(false);

        txt_rol.setEnabled(false);

        txt_contraseña.setEnabled(false);

        txt_confirmarContraseña.setEnabled(false);

        btn_buscar.setBackground(new java.awt.Color(51, 51, 255));
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscarMouseExited(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(51, 51, 255));
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseEntered(evt);
            }
        });
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Usuario:");

        jLabel5.setText("Rol:");

        jLabel6.setText("Contraseña:");

        jLabel7.setText("Confirmar contraseña:");

        btn_eliminar.setBackground(new java.awt.Color(51, 51, 255));
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseEntered(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_rol, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txt_id)
                    .addComponent(txt_contraseña)
                    .addComponent(txt_confirmarContraseña))
                .addGap(43, 43, 43)
                .addComponent(btn_buscar)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_confirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_eliminar))
                .addContainerGap(45, Short.MAX_VALUE))
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

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        eliminarUsuario.getInstancia().setVisible(false);
        ventanaAdministrador.getInstancia().setVisible(true);
        btn_eliminar.setEnabled(false);
        txt_id.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_user.setText("");
        txt_rol.setText("");
        txt_contraseña.setText("");
        txt_confirmarContraseña.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        boolean usuarioEncontrado;
        usuarioEncontrado = false;
        for (int i = 0; i <= Usuario.getInstancia().contador; i++) {
            if (Usuario.getInstancia().id[i].equals(txt_id.getText())) {
                usuarioEncontrado = true;
                btn_eliminar.setEnabled(true);
                txt_id.setText(Usuario.getInstancia().id[i]);
                txt_nombre.setText(Usuario.getInstancia().nombre[i]);
                txt_apellido.setText(Usuario.getInstancia().apellido[i]);
                txt_user.setText(Usuario.getInstancia().user[i]);
                txt_rol.setText(Usuario.getInstancia().rol[i]);
                txt_contraseña.setText(Usuario.getInstancia().password[i]);
                txt_confirmarContraseña.setText(Usuario.getInstancia().password[i]);
            }
        }
        if (usuarioEncontrado == true) {
            JOptionPane.showMessageDialog(null, "¡Usuario con el id " + txt_id.getText() + " encontrado!", "Usuario encontrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado. Verifica el ID.", "Error", JOptionPane.WARNING_MESSAGE);
            txt_nombre.setText("");
            txt_apellido.setText("");
            txt_user.setText("");
            txt_rol.setText("");
            txt_contraseña.setText("");
            txt_confirmarContraseña.setText("");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        boolean usuarioEncontrado;
        usuarioEncontrado = false;
        for (int i = 0; i <= Usuario.getInstancia().contador; i++) {
            if (Usuario.getInstancia().id[i].equals(txt_id.getText())) {
                usuarioEncontrado = true;
                Usuario.getInstancia().contador = (Usuario.getInstancia().contador) - 1;
                txt_id.setText("");
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_user.setText("");
                txt_rol.setText("");
                txt_contraseña.setText("");
                txt_confirmarContraseña.setText("");
                for (int j = i; j <= Usuario.getInstancia().contador; j++) {
                    Usuario.getInstancia().nombre[j] = Usuario.getInstancia().nombre[j + 1];
                    Usuario.getInstancia().apellido[j] = Usuario.getInstancia().apellido[j + 1];
                    Usuario.getInstancia().user[j] = Usuario.getInstancia().user[j + 1];
                    Usuario.getInstancia().rol[j] = Usuario.getInstancia().rol[j + 1];
                    Usuario.getInstancia().password[j] = Usuario.getInstancia().password[j + 1];
                    Usuario.getInstancia().id[j] = Usuario.getInstancia().id[j + 1];
                }
            }
        }
        if (usuarioEncontrado == true) {
            JOptionPane.showMessageDialog(null, "¡El usuario fue eliminado con éxito!", "Usuario eliminado", JOptionPane.INFORMATION_MESSAGE);
            modificarUsuario.getInstancia().setVisible(false);
            ventanaAdministrador.getInstancia().setVisible(true);
            btn_eliminar.setEnabled(false);
            txt_id.setText("");
            txt_nombre.setText("");
            txt_apellido.setText("");
            txt_user.setText("");
            txt_rol.setText("");
            txt_contraseña.setText("");
            txt_confirmarContraseña.setText("");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseEntered
        btn_eliminar.setBackground(Color.white);
        btn_eliminar.setForeground(Color.blue);
        btn_buscar.setBackground(Color.blue);
        btn_buscar.setForeground(Color.white);
        btn_cancelar.setBackground(Color.blue);
        btn_cancelar.setForeground(Color.white);
    }//GEN-LAST:event_btn_eliminarMouseEntered

    private void btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseEntered
        btn_eliminar.setBackground(Color.blue);
        btn_eliminar.setForeground(Color.white);
        btn_buscar.setBackground(Color.blue);
        btn_buscar.setForeground(Color.white);
        btn_cancelar.setBackground(Color.white);
        btn_cancelar.setForeground(Color.blue);
    }//GEN-LAST:event_btn_cancelarMouseEntered

    private void btn_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseExited
        btn_eliminar.setBackground(Color.blue);
        btn_eliminar.setForeground(Color.white);
        btn_buscar.setBackground(Color.white);
        btn_buscar.setForeground(Color.blue);
        btn_cancelar.setBackground(Color.blue);
        btn_cancelar.setForeground(Color.white);
    }//GEN-LAST:event_btn_buscarMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JPasswordField txt_confirmarContraseña;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rol;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
