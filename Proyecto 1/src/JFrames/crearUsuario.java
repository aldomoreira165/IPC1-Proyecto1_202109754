package JFrames;


import javax.swing.JPasswordField;
import java.awt.event.*;
import Clases.Usuario;
import JFrames.ventanaAdministrador;
import javax.swing.JOptionPane;
import Clases.Usuario;
import java.awt.Color;

public class crearUsuario extends javax.swing.JFrame {

private static crearUsuario instancia;

public static crearUsuario getInstancia(){
    if(instancia == null){
       instancia = new crearUsuario();
    }
    return instancia;
}

    public crearUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCrearUsuario = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_confirmarPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_crearUsuario = new javax.swing.JButton();
        txt_rol = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));

        txt_nombre.setText("Aldo");

        txt_id.setText("1");
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_apellido.setText("Moreira");

        txt_usuario.setText("aldomoreira165");

        txt_password.setText("contraseña");
        txt_password.setToolTipText("");

        txt_confirmarPassword.setText("contraseña");
        txt_confirmarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_confirmarPasswordActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Usuario");

        jLabel5.setText("Rol");

        jLabel6.setText("Contraseña");

        jLabel7.setText("Confirmar contraseña");

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

        btn_crearUsuario.setBackground(new java.awt.Color(51, 51, 255));
        btn_crearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearUsuario.setText("Crear");
        btn_crearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_crearUsuarioMouseEntered(evt);
            }
        });
        btn_crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearUsuarioActionPerformed(evt);
            }
        });

        txt_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Profesor" }));

        javax.swing.GroupLayout panelCrearUsuarioLayout = new javax.swing.GroupLayout(panelCrearUsuario);
        panelCrearUsuario.setLayout(panelCrearUsuarioLayout);
        panelCrearUsuarioLayout.setHorizontalGroup(
            panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearUsuarioLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearUsuarioLayout.createSequentialGroup()
                        .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(txt_password)
                            .addComponent(txt_confirmarPassword)
                            .addComponent(txt_rol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(btn_crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );
        panelCrearUsuarioLayout.setVerticalGroup(
            panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearUsuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearUsuarioLayout.createSequentialGroup()
                        .addComponent(txt_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_confirmarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPasswordField getTxt_confirmarPassword() {
        return txt_confirmarPassword;
    }

    public void setTxt_confirmarPassword(JPasswordField txt_confirmarPassword) {
        this.txt_confirmarPassword = txt_confirmarPassword;
    }

    public JPasswordField getTxt_password() {
        return txt_password;
    }

    public void setTxt_password(JPasswordField txt_password) {
        this.txt_password = txt_password;
    }

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        crearUsuario.getInstancia().setVisible(false);
        ventanaAdministrador.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_confirmarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_confirmarPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confirmarPasswordActionPerformed

    private void btn_crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearUsuarioActionPerformed

        int idExistente = 0;
        String idPrevio = txt_id.getText();

        for (int i = 0; i <= Usuario.getInstancia().contador; i++) {
            if (Usuario.getInstancia().id[i].equals(idPrevio)) {
                idExistente = 1;
            }
        }


        if (idExistente == 0) {

            if (txt_confirmarPassword.getText().equals(txt_password.getText())) {
                JOptionPane.showMessageDialog(null, "Nuevo usuario: " + txt_usuario.getText(), "Usuario creado con éxito", JOptionPane.INFORMATION_MESSAGE);

                Usuario.getInstancia().contador = Usuario.getInstancia().contador + 1;
                Usuario.getInstancia().id[Usuario.getInstancia().contador] = txt_id.getText();
                Usuario.getInstancia().nombre[Usuario.getInstancia().contador] = txt_nombre.getText();
                Usuario.getInstancia().apellido[Usuario.getInstancia().contador] = txt_apellido.getText();
                Usuario.getInstancia().user[Usuario.getInstancia().contador] = txt_usuario.getText();
                Usuario.getInstancia().rol[Usuario.getInstancia().contador] = (String)txt_rol.getSelectedItem();
                Usuario.getInstancia().password[Usuario.getInstancia().contador] = txt_password.getText();

                txt_id.setText("");
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_usuario.setText("");
                txt_password.setText("");
                txt_confirmarPassword.setText("");
                txt_rol.setSelectedItem("Estudiante");

                crearUsuario.getInstancia().setVisible(false);
                ventanaAdministrador.getInstancia().setVisible(true);

                System.out.println(Usuario.getInstancia().contador);
                for (int i = 0; i <= Usuario.getInstancia().contador; i++) {
                    System.out.println(Usuario.getInstancia().id[i]);
                    System.out.println(Usuario.getInstancia().nombre[i]);
                    System.out.println(Usuario.getInstancia().apellido[i]);
                    System.out.println(Usuario.getInstancia().user[i]);
                    System.out.println( Usuario.getInstancia().rol[i]);
                    System.out.println(Usuario.getInstancia().password[i]);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden."
                        + " Por favor verifique las credenciales.", "Error de credenciales", JOptionPane.WARNING_MESSAGE);
            }
        }

        if (idExistente == 1) {
             JOptionPane.showMessageDialog(null, "Ya existe un usuario con este ID", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_crearUsuarioActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_crearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearUsuarioMouseEntered
        btn_crearUsuario.setBackground(Color.white);
        btn_crearUsuario.setForeground(Color.blue);
        btn_cancelar.setBackground(Color.blue);
        btn_cancelar.setForeground(Color.white);
    }//GEN-LAST:event_btn_crearUsuarioMouseEntered

    private void btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_cancelar.setBackground(Color.white);
        btn_cancelar.setForeground(Color.blue);
    }//GEN-LAST:event_btn_cancelarMouseEntered

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_crearUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelCrearUsuario;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JPasswordField txt_confirmarPassword;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JComboBox<String> txt_rol;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
