package JFrames;

import Clases.Bibliografia;
import Clases.Libro;
import Clases.LibroDigital;
import Clases.Revista;
import Clases.Tesis;
import JFrames.crearUsuario;
import JFrames.modificarUsuario;
import JFrames.ventanaAdministrador;
import javax.swing.JOptionPane;

public class eliminarBibliografia extends javax.swing.JFrame {

    private static eliminarBibliografia instancia;

    public static eliminarBibliografia getInstancia() {
        if (instancia == null) {
            instancia = new eliminarBibliografia();
        }
        return instancia;
    }

    public eliminarBibliografia() {
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
        btn_eliminar = new javax.swing.JButton();
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
        txt_disponible = new javax.swing.JTextField();
        txt_ejemplares = new javax.swing.JTextField();
        txt_tamaño = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        txt_palabras2.setEnabled(false);

        txt_titulo2.setEnabled(false);

        txt_descripcion2.setEnabled(false);

        txt_año2.setEnabled(false);

        txt_autor2.setEnabled(false);

        txt_edicion2.setEnabled(false);

        txt_temas2.setEnabled(false);

        txt_copias2.setEnabled(false);

        txt_area2.setEnabled(false);

        txt_categoria2.setEnabled(false);

        comboBox_tipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Tesis", "Libro Digital" }));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
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

        txt_disponible.setEnabled(false);

        txt_ejemplares.setEnabled(false);

        txt_tamaño.setEnabled(false);

        jLabel37.setText("Disponible:");

        jLabel38.setText("Ejemplares:");

        jLabel39.setText("Tamaño:");

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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ejemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(btn_cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(comboBox_tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar)
                            .addComponent(txt_isbn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(txt_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ejemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        if (comboBox_tipo2.getSelectedItem().equals("Libro")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                if (Libro.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    Libro.getInstancia().contador = Libro.getInstancia().contador - 1;
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
                    for (int j = i; j <= Libro.getInstancia().contador; j++) {
                        Libro.getInstancia().autor[j] = Libro.getInstancia().autor[j + 1];
                        Libro.getInstancia().isbn[j] = Libro.getInstancia().isbn[j + 1];
                        Libro.getInstancia().añoPublicacion[j] = Libro.getInstancia().añoPublicacion[j + 1];
                        Libro.getInstancia().titulo[j] = Libro.getInstancia().titulo[j + 1];
                        Libro.getInstancia().edicion[j] = Libro.getInstancia().edicion[j + 1];
                        Libro.getInstancia().palabrasClave[j] = Libro.getInstancia().palabrasClave[j + 1];
                        Libro.getInstancia().descripcion[j] = Libro.getInstancia().descripcion[j + 1];
                        Libro.getInstancia().temas[j] = Libro.getInstancia().temas[j + 1];
                        Libro.getInstancia().copias[j] = Libro.getInstancia().copias[j + 1];
                        Libro.getInstancia().dispobles[j] = Libro.getInstancia().dispobles[j + 1];
                    }
                }
            }
            if (bibliografiaEncontrada == true) {
                JOptionPane.showMessageDialog(null, "¡El libro fue eliminado con éxito!", "Libro eliminado", JOptionPane.INFORMATION_MESSAGE);
                eliminarBibliografia.getInstancia().setVisible(false);
                ventanaAdministrador.getInstancia().setVisible(true);
                btn_eliminar.setEnabled(false);
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
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Revista")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Revista.getInstancia().contador; i++) {
                if (Revista.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    Revista.getInstancia().contador = Revista.getInstancia().contador - 1;
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
                    for (int j = i; j <= Revista.getInstancia().contador; j++) {
                        Revista.getInstancia().autor[j] = Revista.getInstancia().autor[j + 1];
                        Revista.getInstancia().añoPublicacion[j] = Revista.getInstancia().añoPublicacion[j + 1];
                        Revista.getInstancia().titulo[j] = Revista.getInstancia().titulo[j + 1];
                        Revista.getInstancia().edicion[j] = Revista.getInstancia().edicion[j + 1];
                        Revista.getInstancia().descripcion[j] = Revista.getInstancia().descripcion[j + 1];
                        Revista.getInstancia().categoria[j] = Revista.getInstancia().categoria[j + 1];
                        Revista.getInstancia().ejemplares[j] = Revista.getInstancia().ejemplares[j + 1];
                        Revista.getInstancia().temas[j] = Revista.getInstancia().temas[j + 1];
                        Revista.getInstancia().palabrasClave[j] = Revista.getInstancia().palabrasClave[j + 1];
                        Revista.getInstancia().copias[j] = Revista.getInstancia().copias[j + 1];
                        Revista.getInstancia().dispobles[j] = Revista.getInstancia().dispobles[j + 1];
                        Revista.getInstancia().isbn[j] = Revista.getInstancia().isbn[j + 1];
                    }
                }
            }
            if (bibliografiaEncontrada == true) {
                JOptionPane.showMessageDialog(null, "¡La revista fue eliminada con éxito!", "Revista eliminada", JOptionPane.INFORMATION_MESSAGE);
                eliminarBibliografia.getInstancia().setVisible(false);
                ventanaAdministrador.getInstancia().setVisible(true);
                btn_eliminar.setEnabled(false);
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
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Tesis")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                if (Tesis.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    Tesis.getInstancia().contador = Tesis.getInstancia().contador - 1;
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
                    for (int j = i; j <= Tesis.getInstancia().contador; j++) {
                        Tesis.getInstancia().autor[j] = Tesis.getInstancia().autor[j + 1];
                        Tesis.getInstancia().isbn[j] = Tesis.getInstancia().isbn[j + 1];
                        Tesis.getInstancia().añoPublicacion[j] = Tesis.getInstancia().añoPublicacion[j + 1];
                        Tesis.getInstancia().titulo[j] = Tesis.getInstancia().titulo[j + 1];
                        Tesis.getInstancia().palabrasClave[j] = Tesis.getInstancia().palabrasClave[j + 1];
                        Tesis.getInstancia().area[j] = Tesis.getInstancia().area[j + 1];
                        Tesis.getInstancia().temas[j] = Tesis.getInstancia().temas[j + 1];
                        Tesis.getInstancia().descripcion[j] = Tesis.getInstancia().descripcion[j + 1];
                        Tesis.getInstancia().edicion[j] = Tesis.getInstancia().edicion[j + 1];
                        Tesis.getInstancia().copias[j] = Tesis.getInstancia().copias[j + 1];
                        Tesis.getInstancia().dispobles[j] = Tesis.getInstancia().dispobles[j + 1];
                    }
                }
            }
            if (bibliografiaEncontrada == true) {
                JOptionPane.showMessageDialog(null, "¡La tesis fue eliminada con éxito!", "Tesis eliminada", JOptionPane.INFORMATION_MESSAGE);
                eliminarBibliografia.getInstancia().setVisible(false);
                ventanaAdministrador.getInstancia().setVisible(true);
                btn_eliminar.setEnabled(false);
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
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Libro Digital")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= LibroDigital.getInstancia().contador; i++) {
                if (LibroDigital.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    LibroDigital.getInstancia().contador = LibroDigital.getInstancia().contador - 1;
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
                    for (int j = i; j <= LibroDigital.getInstancia().contador; j++) {
                        LibroDigital.getInstancia().autor[j] = LibroDigital.getInstancia().autor[j + 1];
                        LibroDigital.getInstancia().isbn[j] = LibroDigital.getInstancia().isbn[j + 1];
                        LibroDigital.getInstancia().añoPublicacion[j] = LibroDigital.getInstancia().añoPublicacion[j + 1];
                        LibroDigital.getInstancia().titulo[j] = LibroDigital.getInstancia().titulo[j + 1];
                        LibroDigital.getInstancia().edicion[j] = LibroDigital.getInstancia().edicion[j + 1];
                        LibroDigital.getInstancia().palabrasClave[j] = LibroDigital.getInstancia().palabrasClave[j + 1];
                        LibroDigital.getInstancia().descripcion[j] = LibroDigital.getInstancia().descripcion[j + 1];
                        LibroDigital.getInstancia().temas[j] = LibroDigital.getInstancia().temas[j + 1];
                        LibroDigital.getInstancia().tamaño[j] = LibroDigital.getInstancia().tamaño[j + 1];
                    }
                }
            }
            if (bibliografiaEncontrada == true) {
                JOptionPane.showMessageDialog(null, "¡El libro digital fue eliminado con éxito!", "Libro digital eliminado", JOptionPane.INFORMATION_MESSAGE);
                eliminarBibliografia.getInstancia().setVisible(false);
                ventanaAdministrador.getInstancia().setVisible(true);
                btn_eliminar.setEnabled(false);
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
            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar2ActionPerformed
        eliminarBibliografia.getInstancia().setVisible(false);
        ventanaAdministrador.getInstancia().setVisible(true);
        btn_eliminar.setEnabled(false);
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
    }//GEN-LAST:event_btn_cancelar2ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if (comboBox_tipo2.getSelectedItem().equals("Libro")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                if (Libro.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    btn_eliminar.setEnabled(true);                
                    txt_autor2.setText(Libro.getInstancia().autor[i]);
                    txt_año2.setText(Libro.getInstancia().añoPublicacion[i]);
                    txt_titulo2.setText(Libro.getInstancia().titulo[i]);
                    txt_edicion2.setText(Libro.getInstancia().titulo[i]);
                    txt_palabras2.setText(Libro.getInstancia().palabrasClave[i]);
                    txt_descripcion2.setText(Libro.getInstancia().descripcion[i]);
                    txt_temas2.setText(Libro.getInstancia().temas[i]);
                    txt_copias2.setText(Libro.getInstancia().copias[i].toString());
                    txt_disponible.setText(Libro.getInstancia().dispobles[i].toString());
                }
            }
            if (bibliografiaEncontrada == true) {
                JOptionPane.showMessageDialog(null, "¡Libro con el ISBN " + txt_isbn2.getText() + " encontrado!", "Libro encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Libro no encontrado. Verifica el ISBN.", "Error", JOptionPane.WARNING_MESSAGE);
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
                txt_disponible.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn2.setText("");
                comboBox_tipo2.setSelectedItem("Libro");
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Revista")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Revista.getInstancia().contador; i++) {
                if (Revista.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    btn_eliminar.setEnabled(true);
                    txt_autor2.setText(Revista.getInstancia().autor[i]);
                    txt_año2.setText(Revista.getInstancia().añoPublicacion[i]);
                    txt_titulo2.setText(Revista.getInstancia().titulo[i]);
                    txt_edicion2.setText(Revista.getInstancia().edicion[i]);
                    txt_descripcion2.setText(Revista.getInstancia().descripcion[i]);
                    txt_categoria2.setText(Revista.getInstancia().categoria[i]);
                    txt_ejemplares.setText(Revista.getInstancia().ejemplares[i]);
                    txt_temas2.setText(Revista.getInstancia().temas[i]);
                    txt_palabras2.setText(Revista.getInstancia().palabrasClave[i]);
                    txt_copias2.setText(Revista.getInstancia().copias[i].toString());
                    txt_disponible.setText(Revista.getInstancia().dispobles[i].toString());
                }
            }
            if (bibliografiaEncontrada == true) {
                JOptionPane.showMessageDialog(null, "¡Revista con el ISBN " + txt_isbn2.getText() + " encontrada!", "Revista encontrada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Revista no encontrada. Verifica el ISBN.", "Error", JOptionPane.WARNING_MESSAGE);
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
                txt_disponible.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn2.setText("");
                comboBox_tipo2.setSelectedItem("Libro");
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Tesis")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                if (Tesis.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    btn_eliminar.setEnabled(true);
                    txt_autor2.setText(Tesis.getInstancia().autor[i]);
                    txt_año2.setText(Tesis.getInstancia().añoPublicacion[i]);
                    txt_titulo2.setText(Tesis.getInstancia().titulo[i]);
                    txt_palabras2.setText(Tesis.getInstancia().palabrasClave[i]);
                    txt_area2.setText(Tesis.getInstancia().area[i]);
                    txt_temas2.setText(Tesis.getInstancia().temas[i]);
                    txt_descripcion2.setText(Tesis.getInstancia().descripcion[i]);
                    txt_edicion2.setText(Tesis.getInstancia().edicion[i]);
                    txt_copias2.setText(Tesis.getInstancia().copias[i].toString());
                    txt_disponible.setText(Tesis.getInstancia().dispobles[i].toString());
                }
            }
            if (bibliografiaEncontrada == true) {
                JOptionPane.showMessageDialog(null, "¡Tesis con el ISBN " + txt_isbn2.getText() + " encontrada!", "Tesis encontrada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Tesis no encontrada. Verifica el ISBN.", "Error", JOptionPane.WARNING_MESSAGE);
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
                txt_disponible.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn2.setText("");
                comboBox_tipo2.setSelectedItem("Libro");
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Libro Digital")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= LibroDigital.getInstancia().contador; i++) {
                if (LibroDigital.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    btn_eliminar.setEnabled(true);
                    txt_autor2.setText(LibroDigital.getInstancia().autor[i]);
                    txt_año2.setText(LibroDigital.getInstancia().añoPublicacion[i]);
                    txt_titulo2.setText(LibroDigital.getInstancia().titulo[i]);
                    txt_edicion2.setText(LibroDigital.getInstancia().edicion[i]);
                    txt_palabras2.setText(LibroDigital.getInstancia().palabrasClave[i]);
                    txt_descripcion2.setText(LibroDigital.getInstancia().descripcion[i]);
                    txt_temas2.setText(LibroDigital.getInstancia().temas[i]);
                    txt_tamaño.setText(LibroDigital.getInstancia().tamaño[i]);
                }
            }
            if (bibliografiaEncontrada == true) {
                JOptionPane.showMessageDialog(null, "¡Libro Digital con el ISBN " + txt_isbn2.getText() + " encontrado!", "Libro Digital encontrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Libro Digital no encontrado. Verifica el ISBN.", "Error", JOptionPane.WARNING_MESSAGE);
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
                txt_disponible.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn2.setText("");
                comboBox_tipo2.setSelectedItem("Libro");
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(eliminarBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminarBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminarBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminarBibliografia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminarBibliografia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar2;
    private javax.swing.JButton btn_eliminar;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_area2;
    private javax.swing.JTextField txt_autor2;
    private javax.swing.JTextField txt_año2;
    private javax.swing.JTextField txt_categoria2;
    private javax.swing.JTextField txt_copias2;
    private javax.swing.JTextField txt_descripcion2;
    private javax.swing.JTextField txt_disponible;
    private javax.swing.JTextField txt_edicion2;
    private javax.swing.JTextField txt_ejemplares;
    private javax.swing.JTextField txt_isbn2;
    private javax.swing.JTextField txt_palabras2;
    private javax.swing.JTextField txt_tamaño;
    private javax.swing.JTextField txt_temas2;
    private javax.swing.JTextField txt_titulo2;
    // End of variables declaration//GEN-END:variables
}
