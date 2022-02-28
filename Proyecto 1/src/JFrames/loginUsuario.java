package JFrames;

import Clases.Usuario;
import Clases.Administrador;
import javax.swing.JOptionPane;
import JFrames.pantallaInicio;
import JFrames.crearUsuario;
import JFrames.ventanaUsuario;
import java.util.HashSet;
import java.util.Set;

public class loginUsuario extends javax.swing.JPanel {

private static loginUsuario instancia;

    public static loginUsuario getInstancia() {
        if (instancia == null) {
            instancia = new loginUsuario();
        }
        return instancia;
    }

    String usuarioLoggeado = "";
    String nombreLoggeado = "";
    String apellidoLoggeado = "";
    String rolLoggeado = "";

    public loginUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Cancelar = new javax.swing.JButton();
        btn_Ingresar = new javax.swing.JButton();
        txt_Password = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 204));
        setRequestFocusEnabled(false);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        btn_Cancelar.setText("Borrar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Ingresar.setLabel("Ingresar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });

        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_Password)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed

        txt_Password.setText("");
        txt_Usuario.setText("");
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        Usuario.getInstancia().usuarioConInstanciado = false;
        String usuario = txt_Usuario.getText();
        String password = txt_Password.getText();
        int op = 0;
        int posicion = 0;
        if (!usuario.equals(Administrador.getInstancia().user)) {
            for (int i = 0; i <= Usuario.getInstancia().contador; i++) {
                if (Usuario.getInstancia().user[i].equals(usuario) & Usuario.getInstancia().password[i].equals(password)) {
                    op = 1;
                    posicion = i;
                }
                if (Usuario.getInstancia().user[i].equals(usuario) & !Usuario.getInstancia().password[i].equals(password)) {
                    op = 2;
                }
            }
            if (op == 1) {
                loginUsuario.getInstancia().usuarioLoggeado = Usuario.getInstancia().user[posicion];
                loginUsuario.getInstancia().nombreLoggeado = Usuario.getInstancia().nombre[posicion];
                loginUsuario.getInstancia().apellidoLoggeado = Usuario.getInstancia().apellido[posicion];
                loginUsuario.getInstancia().rolLoggeado = Usuario.getInstancia().rol[posicion];
                Usuario.getInstancia().usuarioConInstanciado = true;
                ventanaUsuario.getInstancia().setVisible(true);
                pantallaInicio.getInstancia().setVisible(false);
            }
            if (op == 2) {
                JOptionPane.showMessageDialog(null, "El usuario y contraseña no coinciden. Por favor verifique las credenciales.", "Error de credenciales", JOptionPane.WARNING_MESSAGE);
            }
            if (op == 0) {
                JOptionPane.showMessageDialog(null, "El usuario no existe. Ponerse en contacto con el administrador para solicitar un registro", "Usuario no creado", JOptionPane.WARNING_MESSAGE);
            }

            if (Usuario.getInstancia().contador == -1) {
                     JOptionPane.showMessageDialog(null, "Aún no hay cuentas de usuario creadas", "Error", JOptionPane.WARNING_MESSAGE);
                }
        } 

        else if (usuario.equals(Administrador.getInstancia().user) & password.equals(Administrador.getInstancia().password)) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + Administrador.getInstancia().user, "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
            pantallaInicio.getInstancia().setVisible(false);
            ventanaAdministrador.getInstancia().setVisible(true);
        } 
        
        else {
             JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error de credenciales", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
