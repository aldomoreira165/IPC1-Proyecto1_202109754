package JFrames;

import Clases.Usuario;
import JFrames.ventanaAdministrador;
import JFrames.crearUsuario;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class mostrarUsuarios extends javax.swing.JFrame {


public static mostrarUsuarios instancia;

    public mostrarUsuarios() {
        initComponents();
        setLocationRelativeTo(null);
    }

public static mostrarUsuarios getInstancia(){
    if (instancia == null) {
        instancia = new mostrarUsuarios();
    }
    return instancia;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Regresar = new javax.swing.JButton();
        btn_verUsuarios = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_Regresar.setBackground(new java.awt.Color(51, 51, 255));
        btn_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        btn_verUsuarios.setBackground(new java.awt.Color(51, 51, 255));
        btn_verUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_verUsuarios.setText("Ver Usarios");
        btn_verUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verUsuariosActionPerformed(evt);
            }
        });

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_verUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_verUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
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

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        ventanaAdministrador.getInstancia().setVisible(true);
        mostrarUsuarios.getInstancia().setVisible(false);
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_verUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verUsuariosActionPerformed
        String[][] tabla  = new String[10][6];
        for (int i = 0; i <= Usuario.getInstancia().contador; i++) {
            for (int j = 0; j < 6; j++) {
                tabla[i][0] = Usuario.getInstancia().id[i];
                tabla[i][1] = Usuario.getInstancia().nombre[i];
                tabla[i][2] = Usuario.getInstancia().apellido[i];
                tabla[i][3] = Usuario.getInstancia().user[i];
                tabla[i][4] = Usuario.getInstancia().rol[i];
                tabla[i][5] = Usuario.getInstancia().password[i];
            }
        }
 
        System.out.println("PRUEBA DE IMPORTACIÓN DE USUARIOS");
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 6; j++) {
                 System.out.print(tabla[i][j] + " "); 
            }
        }
        String[] encabezado = {"ID", "Nombre", "Apellido", "Usuario", "Rol", "Contraseña"};
        tablaUsuarios.setModel(new DefaultTableModel(
            tabla,
            encabezado
        ));

    }//GEN-LAST:event_btn_verUsuariosActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_verUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
