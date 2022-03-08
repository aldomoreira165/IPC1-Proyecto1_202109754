package JFrames;

import JFrames.crearUsuario;
import JFrames.mostrarUsuarios;
import JFrames.modificarUsuario;
import JFrames.eliminarUsuario;
import JFrames.crearBibliografia;
import JFrames.eliminarBibliografia;
import JFrames.mostrarBibliografia;
import Clases.cuentaBibliografia;
import Clases.Usuario;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class ventanaAdministrador extends javax.swing.JFrame {

    crearUsuario[] crearUsuarios = new crearUsuario[10];
    private static ventanaAdministrador instancia;

    public static ventanaAdministrador getInstancia() {
        if (instancia == null) {
            instancia = new ventanaAdministrador();
        }
        return instancia;
    }

    public ventanaAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_modificarUsuario = new javax.swing.JButton();
        btn_crearUsuario = new javax.swing.JButton();
        btn_eliminarUsuario = new javax.swing.JButton();
        btn_mostrarUsuario = new javax.swing.JButton();
        btn_crearB = new javax.swing.JButton();
        btn_modificarB = new javax.swing.JButton();
        btn_eliminarB = new javax.swing.JButton();
        btn_mostrarB = new javax.swing.JButton();
        btn_reporteU = new javax.swing.JButton();
        btn_reporteL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        barraMenu = new javax.swing.JMenu();
        btn_cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_modificarUsuario.setBackground(new java.awt.Color(51, 51, 255));
        btn_modificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificarUsuario.setText("Modificar");
        btn_modificarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modificarUsuarioMouseEntered(evt);
            }
        });
        btn_modificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarUsuarioActionPerformed(evt);
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

        btn_eliminarUsuario.setBackground(new java.awt.Color(51, 51, 255));
        btn_eliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarUsuario.setText("Eliminar");
        btn_eliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarUsuarioMouseEntered(evt);
            }
        });
        btn_eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarUsuarioActionPerformed(evt);
            }
        });

        btn_mostrarUsuario.setBackground(new java.awt.Color(51, 51, 255));
        btn_mostrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrarUsuario.setText("Mostrar");
        btn_mostrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_mostrarUsuarioMouseEntered(evt);
            }
        });
        btn_mostrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarUsuarioActionPerformed(evt);
            }
        });

        btn_crearB.setBackground(new java.awt.Color(51, 51, 255));
        btn_crearB.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearB.setText("Crear");
        btn_crearB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_crearBMouseEntered(evt);
            }
        });
        btn_crearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearBActionPerformed(evt);
            }
        });

        btn_modificarB.setBackground(new java.awt.Color(51, 51, 255));
        btn_modificarB.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificarB.setText("Modificar");
        btn_modificarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modificarBMouseEntered(evt);
            }
        });
        btn_modificarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarBActionPerformed(evt);
            }
        });

        btn_eliminarB.setBackground(new java.awt.Color(51, 51, 255));
        btn_eliminarB.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarB.setText("Eliminar");
        btn_eliminarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarBMouseEntered(evt);
            }
        });
        btn_eliminarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarBActionPerformed(evt);
            }
        });

        btn_mostrarB.setBackground(new java.awt.Color(51, 51, 255));
        btn_mostrarB.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrarB.setText("Mostrar");
        btn_mostrarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_mostrarBMouseEntered(evt);
            }
        });
        btn_mostrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarBActionPerformed(evt);
            }
        });

        btn_reporteU.setBackground(new java.awt.Color(51, 51, 255));
        btn_reporteU.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporteU.setText("Reporte Usuarios");
        btn_reporteU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reporteUMouseEntered(evt);
            }
        });
        btn_reporteU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteUActionPerformed(evt);
            }
        });

        btn_reporteL.setBackground(new java.awt.Color(51, 51, 255));
        btn_reporteL.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporteL.setText("Reporte Libros");
        btn_reporteL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reporteLMouseEntered(evt);
            }
        });
        btn_reporteL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteLActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuarios");

        jLabel2.setText("Bibliografías");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_reporteU, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_reporteL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_crearB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_modificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_mostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_modificarB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_eliminarB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_mostrarB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(258, 258, 258))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crearB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificarB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminarB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mostrarB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reporteU, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reporteL, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        barraMenu.setText("Cuenta");

        btn_cerrarSesion.setText("Cerrar Sesión");
        btn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarSesionActionPerformed(evt);
            }
        });
        barraMenu.add(btn_cerrarSesion);

        jMenuBar1.add(barraMenu);

        setJMenuBar(jMenuBar1);

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

    private void btn_crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearUsuarioActionPerformed
        crearUsuario.getInstancia().setVisible(true);
        ventanaAdministrador.getInstancia().setVisible(false);
    }//GEN-LAST:event_btn_crearUsuarioActionPerformed

    private void btn_mostrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarUsuarioActionPerformed
        mostrarUsuarios.getInstancia().setVisible(true);
        ventanaAdministrador.getInstancia().setVisible(false);
    }//GEN-LAST:event_btn_mostrarUsuarioActionPerformed

    private void btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarSesionActionPerformed
        ventanaAdministrador.getInstancia().setVisible(false);
        pantallaInicio.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_cerrarSesionActionPerformed

    private void btn_modificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarUsuarioActionPerformed
        ventanaAdministrador.getInstancia().setVisible(false);
        modificarUsuario.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_modificarUsuarioActionPerformed

    private void btn_eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarUsuarioActionPerformed
        ventanaAdministrador.getInstancia().setVisible(false);
        eliminarUsuario.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_eliminarUsuarioActionPerformed

    private void btn_crearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearBActionPerformed
        ventanaAdministrador.getInstancia().setVisible(false);
        crearBibliografia.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_crearBActionPerformed

    private void btn_modificarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarBActionPerformed
        ventanaAdministrador.getInstancia().setVisible(false);
        modificarBibliografia.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_modificarBActionPerformed

    private void btn_eliminarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarBActionPerformed
        ventanaAdministrador.getInstancia().setVisible(false);
        eliminarBibliografia.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_eliminarBActionPerformed

    private void btn_mostrarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarBActionPerformed
        ventanaAdministrador.getInstancia().setVisible(false);
        mostrarBibliografia.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_mostrarBActionPerformed

    private void btn_reporteLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteLActionPerformed
        String reporte = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>Reporte de libros prestados</title>\n"
                + " <style>\n"
                + "        h1, h2{\n"
                + "        color: white;\n"
                + "        text-align: center;\n"
                + "        padding: 5px;\n"
                + "        margin: 5px;\n"
                + "    }\n"
                + "    body{\n"
                + "        background-color: #242a63;\n"
                + "        font-family: Arial;\n"
                + "    }\n"
                + "    \n"
                + "    #main-container{\n"
                + "        margin: 80px auto;\n"
                + "        width: 600px;\n"
                + "    }\n"
                + "    \n"
                + "    table{\n"
                + "        background-color: white;\n"
                + "        text-align: left;\n"
                + "        border-collapse: collapse;\n"
                + "        width: 100%;\n"
                + "    }\n"
                + "    \n"
                + "    th, td{\n"
                + "        padding: 20px;\n"
                + "    }\n"
                + "    \n"
                + "    thead{\n"
                + "        background-color: #246355;\n"
                + "        border-bottom: solid 5px #0F362D;\n"
                + "        color: white;\n"
                + "    }\n"
                + "    \n"
                + "    tr:nth-child(even){\n"
                + "        background-color: #ddd;\n"
                + "    }\n"
                + "    \n"
                + "    tr:hover td{\n"
                + "        background-color: #369681;\n"
                + "        color: white;\n"
                + "    }\n"
                + "    </style>"
                + "</head>\n"
                + "<body>\n"
                + "<h1>REPORTE DE BIBLIOGRAFÍA PRESTADA</h1>"
                + "    <div id=\"main-container\">\n"
                + "        <table>\n"
                + "            <tr>\n"
                + "                <th>ISBN/ID Bibliografía</th>\n"
                + "                <th>Título Bibliografía</th>\n"
                + "                <th>Tipo Bibliografía</th>\n"
                + "            </tr>\n";
        for (int i = 0; i <= cuentaBibliografia.contador; i++) {
            reporte += "<tr>";
            if (cuentaBibliografia.isbn[i] != null) {
                reporte += "<td>" + cuentaBibliografia.isbn[i] + "</td>";
            }
            if (cuentaBibliografia.titulo[i] != null) {
                reporte += "<td>" + cuentaBibliografia.titulo[i] + "</td>";
            }
            if (cuentaBibliografia.tipo[i] != null) {
                reporte += "<td>" + cuentaBibliografia.tipo[i] + "</td>";
            }
            reporte += "</tr>";
        }
        reporte += "        </table>\n"
                + "    </div>\n"
                + "</body>\n"
                + "</html>";
        File reportePrestamos = new File("reportes\\reportePrestamos.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(reportePrestamos));
            bw.write(reporte);
            bw.close();
            JOptionPane.showMessageDialog(null, "Reporte de libros prestados realizado correctamente", "Reporte ", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_reporteLActionPerformed

    private void btn_crearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearUsuarioMouseEntered
        btn_crearUsuario.setBackground(Color.white);
        btn_crearUsuario.setForeground(Color.blue);
        btn_modificarUsuario.setBackground(Color.blue);
        btn_modificarUsuario.setForeground(Color.white);
        btn_eliminarUsuario.setBackground(Color.blue);
        btn_eliminarUsuario.setForeground(Color.white);
        btn_mostrarUsuario.setBackground(Color.blue);
        btn_mostrarUsuario.setForeground(Color.white);
        btn_crearB.setBackground(Color.blue);
        btn_crearB.setForeground(Color.white);
        btn_modificarB.setBackground(Color.blue);
        btn_modificarB.setForeground(Color.white);
        btn_eliminarB.setBackground(Color.blue);
        btn_eliminarB.setForeground(Color.white);
        btn_mostrarB.setBackground(Color.blue);
        btn_mostrarB.setForeground(Color.white);
        btn_reporteU.setBackground(Color.blue);
        btn_reporteU.setForeground(Color.white);
        btn_reporteL.setBackground(Color.blue);
        btn_reporteL.setForeground(Color.white);
    }//GEN-LAST:event_btn_crearUsuarioMouseEntered

    private void btn_modificarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarUsuarioMouseClicked

    private void btn_modificarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarUsuarioMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_modificarUsuario.setBackground(Color.white);
        btn_modificarUsuario.setForeground(Color.blue);
        btn_eliminarUsuario.setBackground(Color.blue);
        btn_eliminarUsuario.setForeground(Color.white);
        btn_mostrarUsuario.setBackground(Color.blue);
        btn_mostrarUsuario.setForeground(Color.white);
        btn_crearB.setBackground(Color.blue);
        btn_crearB.setForeground(Color.white);
        btn_modificarB.setBackground(Color.blue);
        btn_modificarB.setForeground(Color.white);
        btn_eliminarB.setBackground(Color.blue);
        btn_eliminarB.setForeground(Color.white);
        btn_mostrarB.setBackground(Color.blue);
        btn_mostrarB.setForeground(Color.white);
        btn_reporteU.setBackground(Color.blue);
        btn_reporteU.setForeground(Color.white);
        btn_reporteL.setBackground(Color.blue);
        btn_reporteL.setForeground(Color.white);
    }//GEN-LAST:event_btn_modificarUsuarioMouseEntered

    private void btn_eliminarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarUsuarioMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_modificarUsuario.setBackground(Color.blue);
        btn_modificarUsuario.setForeground(Color.white);
        btn_eliminarUsuario.setBackground(Color.white);
        btn_eliminarUsuario.setForeground(Color.blue);
        btn_mostrarUsuario.setBackground(Color.blue);
        btn_mostrarUsuario.setForeground(Color.white);
        btn_crearB.setBackground(Color.blue);
        btn_crearB.setForeground(Color.white);
        btn_modificarB.setBackground(Color.blue);
        btn_modificarB.setForeground(Color.white);
        btn_eliminarB.setBackground(Color.blue);
        btn_eliminarB.setForeground(Color.white);
        btn_mostrarB.setBackground(Color.blue);
        btn_mostrarB.setForeground(Color.white);
        btn_reporteU.setBackground(Color.blue);
        btn_reporteU.setForeground(Color.white);
        btn_reporteL.setBackground(Color.blue);
        btn_reporteL.setForeground(Color.white);
    }//GEN-LAST:event_btn_eliminarUsuarioMouseEntered

    private void btn_mostrarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mostrarUsuarioMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_modificarUsuario.setBackground(Color.blue);
        btn_modificarUsuario.setForeground(Color.white);
        btn_eliminarUsuario.setBackground(Color.blue);
        btn_eliminarUsuario.setForeground(Color.white);
        btn_mostrarUsuario.setBackground(Color.white);
        btn_mostrarUsuario.setForeground(Color.blue);
        btn_crearB.setBackground(Color.blue);
        btn_crearB.setForeground(Color.white);
        btn_modificarB.setBackground(Color.blue);
        btn_modificarB.setForeground(Color.white);
        btn_eliminarB.setBackground(Color.blue);
        btn_eliminarB.setForeground(Color.white);
        btn_mostrarB.setBackground(Color.blue);
        btn_mostrarB.setForeground(Color.white);
        btn_reporteU.setBackground(Color.blue);
        btn_reporteU.setForeground(Color.white);
        btn_reporteL.setBackground(Color.blue);
        btn_reporteL.setForeground(Color.white);
    }//GEN-LAST:event_btn_mostrarUsuarioMouseEntered

    private void btn_crearBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearBMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_modificarUsuario.setBackground(Color.blue);
        btn_modificarUsuario.setForeground(Color.white);
        btn_eliminarUsuario.setBackground(Color.blue);
        btn_eliminarUsuario.setForeground(Color.white);
        btn_mostrarUsuario.setBackground(Color.blue);
        btn_mostrarUsuario.setForeground(Color.white);
        btn_crearB.setBackground(Color.white);
        btn_crearB.setForeground(Color.blue);
        btn_modificarB.setBackground(Color.blue);
        btn_modificarB.setForeground(Color.white);
        btn_eliminarB.setBackground(Color.blue);
        btn_eliminarB.setForeground(Color.white);
        btn_mostrarB.setBackground(Color.blue);
        btn_mostrarB.setForeground(Color.white);
        btn_reporteU.setBackground(Color.blue);
        btn_reporteU.setForeground(Color.white);
        btn_reporteL.setBackground(Color.blue);
        btn_reporteL.setForeground(Color.white);
    }//GEN-LAST:event_btn_crearBMouseEntered

    private void btn_modificarBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarBMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_modificarUsuario.setBackground(Color.blue);
        btn_modificarUsuario.setForeground(Color.white);
        btn_eliminarUsuario.setBackground(Color.blue);
        btn_eliminarUsuario.setForeground(Color.white);
        btn_mostrarUsuario.setBackground(Color.blue);
        btn_mostrarUsuario.setForeground(Color.white);
        btn_crearB.setBackground(Color.blue);
        btn_crearB.setForeground(Color.white);
        btn_modificarB.setBackground(Color.white);
        btn_modificarB.setForeground(Color.blue);
        btn_eliminarB.setBackground(Color.blue);
        btn_eliminarB.setForeground(Color.white);
        btn_mostrarB.setBackground(Color.blue);
        btn_mostrarB.setForeground(Color.white);
        btn_reporteU.setBackground(Color.blue);
        btn_reporteU.setForeground(Color.white);
        btn_reporteL.setBackground(Color.blue);
        btn_reporteL.setForeground(Color.white);
    }//GEN-LAST:event_btn_modificarBMouseEntered

    private void btn_eliminarBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarBMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_modificarUsuario.setBackground(Color.blue);
        btn_modificarUsuario.setForeground(Color.white);
        btn_eliminarUsuario.setBackground(Color.blue);
        btn_eliminarUsuario.setForeground(Color.white);
        btn_mostrarUsuario.setBackground(Color.blue);
        btn_mostrarUsuario.setForeground(Color.white);
        btn_crearB.setBackground(Color.blue);
        btn_crearB.setForeground(Color.white);
        btn_modificarB.setBackground(Color.blue);
        btn_modificarB.setForeground(Color.white);
        btn_eliminarB.setBackground(Color.white);
        btn_eliminarB.setForeground(Color.blue);
        btn_mostrarB.setBackground(Color.blue);
        btn_mostrarB.setForeground(Color.white);
        btn_reporteU.setBackground(Color.blue);
        btn_reporteU.setForeground(Color.white);
        btn_reporteL.setBackground(Color.blue);
        btn_reporteL.setForeground(Color.white);
    }//GEN-LAST:event_btn_eliminarBMouseEntered

    private void btn_mostrarBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mostrarBMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_modificarUsuario.setBackground(Color.blue);
        btn_modificarUsuario.setForeground(Color.white);
        btn_eliminarUsuario.setBackground(Color.blue);
        btn_eliminarUsuario.setForeground(Color.white);
        btn_mostrarUsuario.setBackground(Color.blue);
        btn_mostrarUsuario.setForeground(Color.white);
        btn_crearB.setBackground(Color.blue);
        btn_crearB.setForeground(Color.white);
        btn_modificarB.setBackground(Color.blue);
        btn_modificarB.setForeground(Color.white);
        btn_eliminarB.setBackground(Color.blue);
        btn_eliminarB.setForeground(Color.white);
        btn_mostrarB.setBackground(Color.white);
        btn_mostrarB.setForeground(Color.blue);
        btn_reporteU.setBackground(Color.blue);
        btn_reporteU.setForeground(Color.white);
        btn_reporteL.setBackground(Color.blue);
        btn_reporteL.setForeground(Color.white);
    }//GEN-LAST:event_btn_mostrarBMouseEntered

    private void btn_reporteUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporteUMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_modificarUsuario.setBackground(Color.blue);
        btn_modificarUsuario.setForeground(Color.white);
        btn_eliminarUsuario.setBackground(Color.blue);
        btn_eliminarUsuario.setForeground(Color.white);
        btn_mostrarUsuario.setBackground(Color.blue);
        btn_mostrarUsuario.setForeground(Color.white);
        btn_crearB.setBackground(Color.blue);
        btn_crearB.setForeground(Color.white);
        btn_modificarB.setBackground(Color.blue);
        btn_modificarB.setForeground(Color.white);
        btn_eliminarB.setBackground(Color.blue);
        btn_eliminarB.setForeground(Color.white);
        btn_mostrarB.setBackground(Color.blue);
        btn_mostrarB.setForeground(Color.white);
        btn_reporteU.setBackground(Color.white);
        btn_reporteU.setForeground(Color.blue);
        btn_reporteL.setBackground(Color.blue);
        btn_reporteL.setForeground(Color.white);
    }//GEN-LAST:event_btn_reporteUMouseEntered

    private void btn_reporteLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporteLMouseEntered
        btn_crearUsuario.setBackground(Color.blue);
        btn_crearUsuario.setForeground(Color.white);
        btn_modificarUsuario.setBackground(Color.blue);
        btn_modificarUsuario.setForeground(Color.white);
        btn_eliminarUsuario.setBackground(Color.blue);
        btn_eliminarUsuario.setForeground(Color.white);
        btn_mostrarUsuario.setBackground(Color.blue);
        btn_mostrarUsuario.setForeground(Color.white);
        btn_crearB.setBackground(Color.blue);
        btn_crearB.setForeground(Color.white);
        btn_modificarB.setBackground(Color.blue);
        btn_modificarB.setForeground(Color.white);
        btn_eliminarB.setBackground(Color.blue);
        btn_eliminarB.setForeground(Color.white);
        btn_mostrarB.setBackground(Color.blue);
        btn_mostrarB.setForeground(Color.white);
        btn_reporteU.setBackground(Color.blue);
        btn_reporteU.setForeground(Color.white);
        btn_reporteL.setBackground(Color.white);
        btn_reporteL.setForeground(Color.blue);
    }//GEN-LAST:event_btn_reporteLMouseEntered

    private void btn_reporteUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteUActionPerformed
        String reporte = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>Reporte de existencialibros</title>\n"
                + " <style>\n"
                + "        h1, h2{\n"
                + "        color: white;\n"
                + "        text-align: center;\n"
                + "        padding: 5px;\n"
                + "        margin: 5px;\n"
                + "    }\n"
                + "    body{\n"
                + "        background-color: #242a63;\n"
                + "        font-family: Arial;\n"
                + "    }\n"
                + "    \n"
                + "    #main-container{\n"
                + "        margin: 80px auto;\n"
                + "        width: 600px;\n"
                + "    }\n"
                + "    \n"
                + "    table{\n"
                + "        background-color: white;\n"
                + "        text-align: left;\n"
                + "        border-collapse: collapse;\n"
                + "        width: 100%;\n"
                + "    }\n"
                + "    \n"
                + "    th, td{\n"
                + "        padding: 20px;\n"
                + "    }\n"
                + "    \n"
                + "    thead{\n"
                + "        background-color: #246355;\n"
                + "        border-bottom: solid 5px #0F362D;\n"
                + "        color: white;\n"
                + "    }\n"
                + "    \n"
                + "    tr:nth-child(even){\n"
                + "        background-color: #ddd;\n"
                + "    }\n"
                + "    \n"
                + "    tr:hover td{\n"
                + "        background-color: #369681;\n"
                + "        color: white;\n"
                + "    }\n"
                + "    </style>"
                + "</head>\n"
                + "<body>\n"
                + "<h1>REPORTE DE LIBROS PRESTADOS</h1>"
                + "    <div id=\"main-container\">\n"
                + "        <table>\n"
                + "            <tr>\n"
                + "                <th>ID usuario</th>\n"
                + "                <th>Nombre usuario</th>\n"
                + "                <th>Apellido usuario</th>\n"
                + "                <th>Usuario usuario</th>\n"
                + "                <th>Rol usuario</th>\n"
                + "                <th>ISBN Bibliografía</th>\n"
                + "                <th>Tipo Bibliografía</th>\n"
                + "                <th>Título Bibliografía</th>\n"
                + "            </tr>\n";
        for (int i = 0; i < cuentaBibliografia.contador; i++) {
            reporte += "<tr>";
            if (cuentaBibliografia.idUsuarioActual[i] == null) {
                reporte += "<td>" + "-" + "</td>";
            } else {
                reporte += "<td>" + cuentaBibliografia.idUsuarioActual[i] + "</td>";
            }
            if (cuentaBibliografia.nombreActual[i] == null) {
                reporte += "<td>" + "-" + "</td>";
            } else {
                reporte += "<td>" + cuentaBibliografia.nombreActual[i] + "</td>";
            }
            if (cuentaBibliografia.apellidoActual[i] == null) {
                reporte += "<td>" + "-" + "</td>";
            } else {
                reporte += "<td>" + cuentaBibliografia.apellidoActual[i] + "</td>";
            }
            if (cuentaBibliografia.usuarioActual[i] == null) {
                reporte += "<td>" + "-" + "</td>";
            } else {
                reporte += "<td>" + cuentaBibliografia.usuarioActual[i] + "</td>";
            }
            if (cuentaBibliografia.rolActual[i] == null) {
                reporte += "<td>" + "-" + "</td>";
            } else {
                reporte += "<td>" + cuentaBibliografia.rolActual[i] + "</td>";
            }
            if (cuentaBibliografia.isbn[i] == null) {
                reporte += "<td>" + "-" + "</td>";
            } else {
                reporte += "<td>" + cuentaBibliografia.isbn[i] + "</td>";
            }
            if (cuentaBibliografia.tipo[i] == null) {
                reporte += "<td>" + "-" + "</td>";
            } else {
                reporte += "<td>" + cuentaBibliografia.tipo[i] + "</td>";
            }
            if (cuentaBibliografia.titulo[i] == null) {
                reporte += "<td>" + "-" + "</td>";
            } else {
                reporte += "<td>" + cuentaBibliografia.titulo[i] + "</td>";
            }
            reporte += "</tr>";
        }
        reporte += "        </table>\n"
                + "    </div>\n"
                + "</body>\n"
                + "</html>";
        File reportePrestamosUsuarios = new File("reportes\\reporteUsuarios_prestamos.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(reportePrestamosUsuarios));
            bw.write(reporte);
            bw.close();
            JOptionPane.showMessageDialog(null, "Reporte de préstamos por usuario realizado correctamente", "Reporte ", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reporteUActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu barraMenu;
    private javax.swing.JMenuItem btn_cerrarSesion;
    private javax.swing.JButton btn_crearB;
    private javax.swing.JButton btn_crearUsuario;
    private javax.swing.JButton btn_eliminarB;
    private javax.swing.JButton btn_eliminarUsuario;
    private javax.swing.JButton btn_modificarB;
    private javax.swing.JButton btn_modificarUsuario;
    private javax.swing.JButton btn_mostrarB;
    private javax.swing.JButton btn_mostrarUsuario;
    private javax.swing.JButton btn_reporteL;
    private javax.swing.JButton btn_reporteU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
