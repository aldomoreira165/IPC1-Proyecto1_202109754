package JFrames;

import Clases.*;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class prestamoLibros extends javax.swing.JFrame {

    public int fila1 = 0;
    public int columna1 = 0;
    public Object[][] tablaLibros;

    private static String[][] bibliotecaUsuario = new String[10][10];
    private static prestamoLibros instancia;

    public static prestamoLibros getInstancia() {
        if (instancia == null) {
            instancia = new prestamoLibros();
        }
        return instancia;
    }

    public prestamoLibros() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void filter(String query) {
        TableRowSorter<TableModel> tr = new TableRowSorter<>(tbl_detalle.getModel());
        tbl_detalle.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_detalle = new javax.swing.JTable();
        btn_verPrestamos = new javax.swing.JButton();
        btn_reporteExistencias = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        btn_actualizarTabla = new javax.swing.JButton();
        comboBox_filtrar = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_logout.setBackground(new java.awt.Color(51, 51, 255));
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Logout");
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

        btn_regresar.setBackground(new java.awt.Color(51, 51, 255));
        btn_regresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_regresar.setText("Regresar");
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_regresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_regresarMouseExited(evt);
            }
        });
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        tbl_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_detalle.setRowHeight(35);
        tbl_detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_detalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_detalle);

        btn_verPrestamos.setBackground(new java.awt.Color(51, 51, 255));
        btn_verPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        btn_verPrestamos.setText("Ver préstamos");
        btn_verPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_verPrestamosMouseEntered(evt);
            }
        });
        btn_verPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verPrestamosActionPerformed(evt);
            }
        });

        btn_reporteExistencias.setBackground(new java.awt.Color(51, 51, 255));
        btn_reporteExistencias.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporteExistencias.setText("Reporte existencias");
        btn_reporteExistencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reporteExistenciasMouseEntered(evt);
            }
        });
        btn_reporteExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteExistenciasActionPerformed(evt);
            }
        });

        txt_buscar.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        btn_actualizarTabla.setBackground(new java.awt.Color(51, 51, 255));
        btn_actualizarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizarTabla.setText("Actualizar tabla");
        btn_actualizarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_actualizarTablaMouseEntered(evt);
            }
        });
        btn_actualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarTablaActionPerformed(evt);
            }
        });

        comboBox_filtrar.setBackground(new java.awt.Color(204, 204, 204));
        comboBox_filtrar.setForeground(new java.awt.Color(255, 255, 255));
        comboBox_filtrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Tesis", "Revista" }));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autor", "Año Publicación", "ISBN", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Copias", "Disponibles" }));

        btnFiltrar.setBackground(new java.awt.Color(51, 51, 255));
        btnFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFiltrarMouseEntered(evt);
            }
        });
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_actualizarTabla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)
                                .addComponent(comboBox_filtrar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_regresar)
                            .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFiltrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_reporteExistencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_verPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_verPrestamos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reporteExistencias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizarTabla)
                    .addComponent(comboBox_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
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

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        prestamoLibros.getInstancia().setVisible(false);
        pantallaInicio.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        prestamoLibros.getInstancia().setVisible(false);
        loginUsuario.ventanaUsuarioActual.setVisible(true);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_reporteExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteExistenciasActionPerformed
        String reporte = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>Reporte de existencia</title>\n"
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
                + "<h1>REPORTE DE BIBLIOGRAFÍA EXISTENTE</h1>"
                + "    <div id=\"main-container\">\n"
                + "        <table>\n"
                + "            <tr>\n"
                + "                <th>ISBN/ID</th>\n"
                + "                <th>Tipo</th>\n"
                + "                <th>Autor</th>\n"
                + "                <th>Año Publicación</th>\n"
                + "                <th>Título</th>\n"
                + "                <th>Edición</th>\n"
                + "                <th>Palabras Clave</th>\n"
                + "                <th>Descripción</th>\n"
                + "                <th>Categoría</th>\n"
                + "                <th>Ejemplares</th>\n"
                + "                <th>Temas</th>\n"
                + "                <th>Área</th>\n"
                + "                <th>Palabras clave</th>\n"
                + "                <th>Disponibles</th>\n"
                + "            </tr>\n";
        for (int i = 0; i < prestamoLibros.getInstancia().fila1; i++) {
            reporte += "<tr>";
            if (prestamoLibros.getInstancia().tablaLibros[i][0] != null) {
                for (int j = 0; j < prestamoLibros.getInstancia().columna1; j++) {
                    if (prestamoLibros.getInstancia().tablaLibros[i][j] == null) {
                        prestamoLibros.getInstancia().tablaLibros[i][j] = reporte += "<td>" + "-" + "</td>";
                    } else {
                        reporte += "<td>" + prestamoLibros.getInstancia().tablaLibros[i][j] + "</td>";
                    }
                }
            } else {
                reporte += "</tr>";
            }

        }
        reporte += "        </table>\n"
                + "    </div>\n"
                + "</body>\n"
                + "</html>";
        File reporteExistenciaLibros = new File("reportes\\reporteExistenciaLibros_usuarios.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(reporteExistenciaLibros));
            bw.write(reporte);
            bw.close();
            JOptionPane.showMessageDialog(null, "Reporte de existencia de libros realizado correctamente", "Reporte ", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_reporteExistenciasActionPerformed

    private void btn_actualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarTablaActionPerformed
        int filas;
        filas = -1;
        Object[][] tablaDetalle = new Object[6][15];
        this.tbl_detalle.setDefaultRenderer(Object.class, new RenderTable());
        for (int i = 0; i <= Libro.getInstancia().contador; i++) {
            filas = filas + 1;
            for (int j = 0; j < 14; j++) {
                tablaDetalle[filas][0] = Libro.getInstancia().isbn[i];
                tablaDetalle[filas][1] = "Libro";
                tablaDetalle[filas][2] = Libro.getInstancia().autor[i];
                tablaDetalle[filas][3] = Libro.getInstancia().añoPublicacion[i];
                tablaDetalle[filas][4] = Libro.getInstancia().titulo[i];
                tablaDetalle[filas][5] = Libro.getInstancia().edicion[i];
                tablaDetalle[filas][11] = Libro.getInstancia().palabrasClave[i];
                tablaDetalle[filas][6] = Libro.getInstancia().descripcion[i];
                tablaDetalle[filas][9] = Libro.getInstancia().temas[i];
                tablaDetalle[filas][12] = Libro.getInstancia().copias[i].toString();
                tablaDetalle[filas][13] = Libro.getInstancia().dispobles[i].toString();
                tablaDetalle[filas][14] = new JButton("Prestar");
            }
        }
        for (int i = 0; i <= Revista.getInstancia().contador; i++) {
            filas = filas + 1;
            for (int j = 0; j < 14; j++) {
                tablaDetalle[filas][0] = Revista.getInstancia().isbn[i];
                tablaDetalle[filas][1] = "Revista";
                tablaDetalle[filas][2] = Revista.getInstancia().autor[i];
                tablaDetalle[filas][3] = Revista.getInstancia().añoPublicacion[i];
                tablaDetalle[filas][4] = Revista.getInstancia().titulo[i];
                tablaDetalle[filas][5] = Revista.getInstancia().edicion[i];
                tablaDetalle[filas][6] = Revista.getInstancia().descripcion[i];
                tablaDetalle[filas][7] = Revista.getInstancia().categoria[i];
                tablaDetalle[filas][8] = Revista.getInstancia().ejemplares[i];
                tablaDetalle[filas][9] = Revista.getInstancia().temas[i];
                tablaDetalle[filas][11] = Revista.getInstancia().palabrasClave[i];
                tablaDetalle[filas][12] = Revista.getInstancia().copias[i];
                tablaDetalle[filas][13] = Revista.getInstancia().dispobles[i];
                tablaDetalle[filas][14] = new JButton("Prestar");
            }
        }
        for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
            filas = filas + 1;
            for (int j = 0; j < 14; j++) {
                tablaDetalle[filas][0] = Tesis.getInstancia().isbn[i];
                tablaDetalle[filas][1] = "Tesis";
                tablaDetalle[filas][2] = Tesis.getInstancia().autor[i];
                tablaDetalle[filas][3] = Tesis.getInstancia().añoPublicacion[i];
                tablaDetalle[filas][4] = Tesis.getInstancia().titulo[i];
                tablaDetalle[filas][11] = Tesis.getInstancia().palabrasClave[i];
                tablaDetalle[filas][10] = Tesis.getInstancia().area[i];
                tablaDetalle[filas][9] = Tesis.getInstancia().temas[i];
                tablaDetalle[filas][6] = Tesis.getInstancia().descripcion[i];
                tablaDetalle[filas][5] = Tesis.getInstancia().edicion[i];
                tablaDetalle[filas][12] = Tesis.getInstancia().copias[i];
                tablaDetalle[filas][13] = Tesis.getInstancia().dispobles[i];
                tablaDetalle[filas][14] = new JButton("Prestar");
            }
        }
        String[] encabezado = {"ISBN/ID", "Tipo", "Autor", "Año Publicación", "Título", "Edición", "Descripción", "Categoría", "Ejemplares", "Temas", "Área", "Palabras Clave", "Copias", "Disponibles", "Préstamo"};
        tbl_detalle.setModel(new DefaultTableModel(
                tablaDetalle,
                encabezado
        ));

        tablaLibros = new Object[tbl_detalle.getRowCount()][tbl_detalle.getColumnCount()];
        fila1 = tbl_detalle.getRowCount();
        columna1 = tbl_detalle.getColumnCount() - 1;

        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < columna1; j++) {
                if (tbl_detalle.getValueAt(i, j) != null) {
                    tablaLibros[i][j] = tbl_detalle.getValueAt(i, j);
                }
            }

        }

        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < columna1; j++) {
                if (tbl_detalle.getValueAt(i, j) != null) {
                    System.out.println(tablaLibros[i][j]);
                }
            }
        }

    }//GEN-LAST:event_btn_actualizarTablaActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        String tipo;
        tipo = (String) comboBox_filtrar.getSelectedItem();
        int filas;
        filas = -1;
        Object[][] tablaDetalle = new Object[20][15];
        this.tbl_detalle.setDefaultRenderer(Object.class, new RenderTable());
        if (tipo.equals("Libro")) {
            for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                filas = filas + 1;
                for (int j = 0; j < 12; j++) {
                    tablaDetalle[filas][0] = Libro.getInstancia().isbn[i];
                    tablaDetalle[filas][1] = "Libro";
                    tablaDetalle[filas][2] = Libro.getInstancia().autor[i];
                    tablaDetalle[filas][3] = Libro.getInstancia().añoPublicacion[i];
                    tablaDetalle[filas][4] = Libro.getInstancia().titulo[i];
                    tablaDetalle[filas][5] = Libro.getInstancia().edicion[i];
                    tablaDetalle[filas][6] = Libro.getInstancia().palabrasClave[i];
                    tablaDetalle[filas][7] = Libro.getInstancia().descripcion[i];
                    tablaDetalle[filas][8] = Libro.getInstancia().temas[i];
                    tablaDetalle[filas][9] = Libro.getInstancia().copias[i].toString();
                    tablaDetalle[filas][10] = Libro.getInstancia().dispobles[i].toString();
                    tablaDetalle[filas][11] = new JButton("Prestar");
                }
            }
            String[] encabezado = {"ISBN/ID", "Tipo", "Autor", "Año Publicación", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Copias", "Disponibles", "Préstamo"};
            tbl_detalle.setModel(new DefaultTableModel(
                    tablaDetalle,
                    encabezado
            ));
        }
        if (tipo.equals("Revista")) {
            for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                filas = filas + 1;
                for (int j = 0; j < 13; j++) {
                    tablaDetalle[filas][0] = Revista.getInstancia().isbn[i];
                    tablaDetalle[filas][1] = "Revista";
                    tablaDetalle[filas][2] = Revista.getInstancia().autor[i];
                    tablaDetalle[filas][3] = Revista.getInstancia().añoPublicacion[i];
                    tablaDetalle[filas][4] = Revista.getInstancia().titulo[i];
                    tablaDetalle[filas][5] = Revista.getInstancia().edicion[i];
                    tablaDetalle[filas][6] = Revista.getInstancia().descripcion[i];
                    tablaDetalle[filas][7] = Revista.getInstancia().categoria[i];
                    tablaDetalle[filas][8] = Revista.getInstancia().ejemplares[i];
                    tablaDetalle[filas][9] = Revista.getInstancia().temas[i];
                    tablaDetalle[filas][10] = Revista.getInstancia().palabrasClave[i];
                    tablaDetalle[filas][11] = Revista.getInstancia().copias[i];
                    tablaDetalle[filas][12] = Revista.getInstancia().dispobles[i];
                    tablaDetalle[filas][13] = new JButton("Prestar");
                }
            }
            String[] encabezado = {"ISBN/ID", "Tipo", "Autor", "Año Publicación", "Título", "Edición", "Descripción", "Categoría", "Ejemplares", "Temas", "Palabras Clave", "Copias", "Disponibles", "Préstamo"};
            tbl_detalle.setModel(new DefaultTableModel(
                    tablaDetalle,
                    encabezado
            ));
        }
        if (tipo.equals("Tesis")) {
            for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                filas = filas + 1;
                for (int j = 0; j < 11; j++) {
                    tablaDetalle[filas][0] = Tesis.getInstancia().isbn[i];
                    tablaDetalle[filas][1] = "Tesis";
                    tablaDetalle[filas][2] = Tesis.getInstancia().autor[i];
                    tablaDetalle[filas][3] = Tesis.getInstancia().añoPublicacion[i];
                    tablaDetalle[filas][4] = Tesis.getInstancia().titulo[i];
                    tablaDetalle[filas][5] = Tesis.getInstancia().palabrasClave[i];
                    tablaDetalle[filas][6] = Tesis.getInstancia().area[i];
                    tablaDetalle[filas][7] = Tesis.getInstancia().temas[i];
                    tablaDetalle[filas][8] = Tesis.getInstancia().descripcion[i];
                    tablaDetalle[filas][9] = Tesis.getInstancia().edicion[i];
                    tablaDetalle[filas][10] = Tesis.getInstancia().copias[i];
                    tablaDetalle[filas][11] = Tesis.getInstancia().dispobles[i];
                    tablaDetalle[filas][12] = new JButton("Prestar");
                }
            }
            String[] encabezado = {"ISBN/ID", "Autor", "Año Publicación", "Título", "Palabras Clave", "Área", "Temas", "Descripción", "Edición", "Copias", "Disponibles", "Préstamo"};
            tbl_detalle.setModel(new DefaultTableModel(
                    tablaDetalle,
                    encabezado
            ));
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        String query = txt_buscar.getText().toLowerCase();
        filter(query);
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void tbl_detalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_detalleMouseClicked
        int column = tbl_detalle.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbl_detalle.getRowHeight();
        int posicion = 0;
        String isbnTabla = "";
        String tipoTabla = "";
        String isbn = "", autor = "", añoPublicacion = "", titulo = "", edicion = "", palabrasClave = "", descripcion = "", temas = "", tamaño = "";
        boolean bibliografiaExistente = false;

        if (row < tbl_detalle.getRowCount() && row >= 0 && column < tbl_detalle.getColumnCount() && column >= 0) {
            Object value = tbl_detalle.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                isbnTabla = (String) (tbl_detalle.getValueAt(row, 0));
                tipoTabla = (String) (tbl_detalle.getValueAt(row, 1));

                if (tipoTabla.equals("Libro")) {
                    for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                        if (Libro.getInstancia().isbn[i].equals(isbnTabla)) {
                            Libro.getInstancia().dispobles[i] = Libro.getInstancia().dispobles[i] - 1;
                            if (Libro.getInstancia().dispobles[i] == -1) {
                                bibliografiaExistente = false;
                            } else {
                                bibliografiaExistente = true;
                            }
                            posicion = i;
                        }
                    }
                    if (bibliografiaExistente == true) {
                        cuentaBibliografia.contador = cuentaBibliografia.contador + 1;
                        cuentaBibliografia.nombreActual[cuentaBibliografia.contador] = loginUsuario.nombreLoggeado;
                        cuentaBibliografia.apellidoActual[cuentaBibliografia.contador] = loginUsuario.apellidoLoggeado;
                        cuentaBibliografia.rolActual[cuentaBibliografia.contador] = loginUsuario.rolLoggeado;
                        cuentaBibliografia.usuarioActual[cuentaBibliografia.contador] = loginUsuario.usuarioLoggeado;
                        cuentaBibliografia.idUsuarioActual[cuentaBibliografia.contador] = loginUsuario.idLoggeado;
                        cuentaBibliografia.isbn[cuentaBibliografia.contador] = Libro.getInstancia().isbn[posicion];
                        cuentaBibliografia.titulo[cuentaBibliografia.contador] = Libro.getInstancia().titulo[posicion];
                        cuentaBibliografia.tipo[cuentaBibliografia.contador] = "Libro";
                        JOptionPane.showMessageDialog(null, "Préstamo realizado con éxito", "Nuevo préstamo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (bibliografiaExistente == false) {
                        JOptionPane.showMessageDialog(null, "Bibliografía no disponible", "Error", JOptionPane.WARNING_MESSAGE);
                        Libro.getInstancia().dispobles[posicion] = 0;
                    }

                }
                if (tipoTabla.equals("Revista")) {
                    for (int i = 0; i <= Revista.getInstancia().contador; i++) {
                        if (Revista.getInstancia().isbn[i].equals(isbnTabla)) {
                            Revista.getInstancia().dispobles[i] = Revista.getInstancia().dispobles[i] - 1;
                            if (Revista.getInstancia().dispobles[i] == -1) {
                                bibliografiaExistente = false;
                            } else {
                                bibliografiaExistente = true;
                            }
                            posicion = i;
                        }
                    }
                    if (bibliografiaExistente == true) {
                        cuentaBibliografia.contador = cuentaBibliografia.contador + 1;
                        cuentaBibliografia.nombreActual[cuentaBibliografia.contador] = loginUsuario.nombreLoggeado;
                        cuentaBibliografia.apellidoActual[cuentaBibliografia.contador] = loginUsuario.apellidoLoggeado;
                        cuentaBibliografia.rolActual[cuentaBibliografia.contador] = loginUsuario.rolLoggeado;
                        cuentaBibliografia.usuarioActual[cuentaBibliografia.contador] = loginUsuario.usuarioLoggeado;
                        cuentaBibliografia.idUsuarioActual[cuentaBibliografia.contador] = loginUsuario.idLoggeado;
                        cuentaBibliografia.isbn[cuentaBibliografia.contador] = Revista.getInstancia().isbn[posicion];
                        cuentaBibliografia.titulo[cuentaBibliografia.contador] = Revista.getInstancia().titulo[posicion];
                        cuentaBibliografia.tipo[cuentaBibliografia.contador] = "Revista";
                        JOptionPane.showMessageDialog(null, "Préstamo realizado con éxito", "Nuevo préstamo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (bibliografiaExistente == false) {
                        JOptionPane.showMessageDialog(null, "Bibliografía no disponible", "Error", JOptionPane.WARNING_MESSAGE);
                        Revista.getInstancia().dispobles[posicion] = 0;
                    }
                }
                if (tipoTabla.equals("Tesis")) {
                    for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                        if (Tesis.getInstancia().isbn[i].equals(isbnTabla)) {
                            Tesis.getInstancia().dispobles[i] = Tesis.getInstancia().dispobles[i] - 1;
                            if (Tesis.getInstancia().dispobles[i] == -1) {
                                bibliografiaExistente = false;
                            } else {
                                bibliografiaExistente = true;
                            }
                            posicion = i;
                        }
                    }
                    if (bibliografiaExistente == true) {
                        cuentaBibliografia.contador = cuentaBibliografia.contador + 1;
                        cuentaBibliografia.nombreActual[cuentaBibliografia.contador] = loginUsuario.nombreLoggeado;
                        cuentaBibliografia.apellidoActual[cuentaBibliografia.contador] = loginUsuario.apellidoLoggeado;
                        cuentaBibliografia.rolActual[cuentaBibliografia.contador] = loginUsuario.rolLoggeado;
                        cuentaBibliografia.usuarioActual[cuentaBibliografia.contador] = loginUsuario.usuarioLoggeado;
                        cuentaBibliografia.idUsuarioActual[cuentaBibliografia.contador] = loginUsuario.idLoggeado;
                        cuentaBibliografia.isbn[cuentaBibliografia.contador] = Tesis.getInstancia().isbn[posicion];
                        cuentaBibliografia.titulo[cuentaBibliografia.contador] = Tesis.getInstancia().titulo[posicion];
                        cuentaBibliografia.tipo[cuentaBibliografia.contador] = "Tesis";
                        JOptionPane.showMessageDialog(null, "Préstamo realizado con éxito", "Nuevo préstamo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (bibliografiaExistente == false) {
                        JOptionPane.showMessageDialog(null, "Bibliografía no disponible", "Error", JOptionPane.WARNING_MESSAGE);
                        Tesis.getInstancia().dispobles[posicion] = 0;
                    }
                }

            }

        }
    }//GEN-LAST:event_tbl_detalleMouseClicked

    private void btn_verPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verPrestamosActionPerformed
        prestamoLibros.getInstancia().setVisible(false);
        verPrestamos vePrestamos = new verPrestamos();
        verPrestamos.prestamosActuales = vePrestamos;
        verPrestamos.prestamosActuales.setVisible(true);
    }//GEN-LAST:event_btn_verPrestamosActionPerformed

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        btn_regresar.setBackground(Color.blue);
        btn_regresar.setForeground(Color.white);
        btn_actualizarTabla.setBackground(Color.blue);
        btn_actualizarTabla.setForeground(Color.white);
        btn_logout.setBackground(Color.white);
        btn_logout.setForeground(Color.blue);
        btn_verPrestamos.setBackground(Color.blue);
        btn_verPrestamos.setForeground(Color.white);
        btn_reporteExistencias.setBackground(Color.blue);
        btn_reporteExistencias.setForeground(Color.white);
        btnFiltrar.setBackground(Color.blue);
        btnFiltrar.setForeground(Color.white);
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_regresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarMouseExited

    private void btn_regresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseEntered
        btn_regresar.setBackground(Color.white);
        btn_regresar.setForeground(Color.blue);
        btn_actualizarTabla.setBackground(Color.blue);
        btn_actualizarTabla.setForeground(Color.white);
        btn_logout.setBackground(Color.blue);
        btn_logout.setForeground(Color.white);
        btn_verPrestamos.setBackground(Color.blue);
        btn_verPrestamos.setForeground(Color.white);
        btn_reporteExistencias.setBackground(Color.blue);
        btn_reporteExistencias.setForeground(Color.white);
        btnFiltrar.setBackground(Color.blue);
        btnFiltrar.setForeground(Color.white);
    }//GEN-LAST:event_btn_regresarMouseEntered

    private void btn_actualizarTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarTablaMouseEntered
        btn_regresar.setBackground(Color.blue);
        btn_regresar.setForeground(Color.white);
        btn_actualizarTabla.setBackground(Color.white);
        btn_actualizarTabla.setForeground(Color.blue);
        btn_logout.setBackground(Color.blue);
        btn_logout.setForeground(Color.white);
        btn_verPrestamos.setBackground(Color.blue);
        btn_verPrestamos.setForeground(Color.white);
        btn_reporteExistencias.setBackground(Color.blue);
        btn_reporteExistencias.setForeground(Color.white);
        btnFiltrar.setBackground(Color.blue);
        btnFiltrar.setForeground(Color.white);
    }//GEN-LAST:event_btn_actualizarTablaMouseEntered

    private void btn_verPrestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verPrestamosMouseEntered
        btn_regresar.setBackground(Color.blue);
        btn_regresar.setForeground(Color.white);
        btn_actualizarTabla.setBackground(Color.blue);
        btn_actualizarTabla.setForeground(Color.white);
        btn_logout.setBackground(Color.blue);
        btn_logout.setForeground(Color.white);
        btn_verPrestamos.setBackground(Color.white);
        btn_verPrestamos.setForeground(Color.blue);
        btn_reporteExistencias.setBackground(Color.blue);
        btn_reporteExistencias.setForeground(Color.white);
        btnFiltrar.setBackground(Color.blue);
        btnFiltrar.setForeground(Color.white);
    }//GEN-LAST:event_btn_verPrestamosMouseEntered

    private void btn_reporteExistenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporteExistenciasMouseEntered
        btn_regresar.setBackground(Color.blue);
        btn_regresar.setForeground(Color.white);
        btn_actualizarTabla.setBackground(Color.blue);
        btn_actualizarTabla.setForeground(Color.white);
        btn_logout.setBackground(Color.blue);
        btn_logout.setForeground(Color.white);
        btn_verPrestamos.setBackground(Color.blue);
        btn_verPrestamos.setForeground(Color.white);
        btn_reporteExistencias.setBackground(Color.white);
        btn_reporteExistencias.setForeground(Color.blue);
        btnFiltrar.setBackground(Color.blue);
        btnFiltrar.setForeground(Color.white);
    }//GEN-LAST:event_btn_reporteExistenciasMouseEntered

    private void btnFiltrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarMouseEntered
        btn_regresar.setBackground(Color.blue);
        btn_regresar.setForeground(Color.white);
        btn_actualizarTabla.setBackground(Color.blue);
        btn_actualizarTabla.setForeground(Color.white);
        btn_logout.setBackground(Color.blue);
        btn_logout.setForeground(Color.white);
        btn_verPrestamos.setBackground(Color.blue);
        btn_verPrestamos.setForeground(Color.white);
        btn_reporteExistencias.setBackground(Color.blue);
        btn_reporteExistencias.setForeground(Color.white);
        btnFiltrar.setBackground(Color.white);
        btnFiltrar.setForeground(Color.blue);
    }//GEN-LAST:event_btnFiltrarMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prestamoLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btn_actualizarTabla;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_reporteExistencias;
    private javax.swing.JButton btn_verPrestamos;
    private javax.swing.JComboBox<String> comboBox_filtrar;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_detalle;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
