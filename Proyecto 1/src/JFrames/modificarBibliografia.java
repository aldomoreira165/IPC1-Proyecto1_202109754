package JFrames;

import Clases.Bibliografia;
import javax.swing.JOptionPane;
import Clases.*;

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
        txt_disponible = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_ejemplares = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txt_tamaño = new javax.swing.JTextField();
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

        txt_disponible.setEnabled(false);

        jLabel37.setText("Disponibles:");

        txt_ejemplares.setEnabled(false);

        jLabel38.setText("Ejemplares:");

        txt_tamaño.setEnabled(false);

        jLabel39.setText("Tamaño:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(comboBox_tipo2, 0, 271, Short.MAX_VALUE)
                            .addComponent(btn_cancelar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
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

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

        if (comboBox_tipo2.getSelectedItem().equals("Libro")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                if (Libro.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    Libro.getInstancia().autor[i] = txt_autor2.getText();
                    Libro.getInstancia().añoPublicacion[i] = txt_año2.getText();
                    Libro.getInstancia().titulo[i] = txt_titulo2.getText();
                    Libro.getInstancia().edicion[i] = txt_edicion2.getText();
                    Libro.getInstancia().palabrasClave[i] = txt_palabras2.getText();
                    Libro.getInstancia().descripcion[i] = txt_descripcion2.getText();
                    Libro.getInstancia().temas[i] = txt_temas2.getText();
                    Libro.getInstancia().copias[i] = Integer.parseInt(txt_copias2.getText());
                    Libro.getInstancia().dispobles[i] = Integer.parseInt(txt_disponible.getText());
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
                txt_disponible.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn2.setText("");
                comboBox_tipo2.setSelectedItem("Libro");
                txt_autor2.setEnabled(false);
                txt_año2.setEnabled(false);
                txt_titulo2.setEnabled(false);
                txt_descripcion2.setEnabled(false);
                txt_palabras2.setEnabled(false);
                txt_edicion2.setEnabled(false);
                txt_temas2.setEnabled(false);
                txt_copias2.setEnabled(false);
                txt_area2.setEnabled(false);
                txt_categoria2.setEnabled(false);
                txt_disponible.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
                btn_modificar.setEnabled(false);
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Revista")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Revista.getInstancia().contador; i++) {
                if (Revista.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    Revista.getInstancia().autor[i] = txt_autor2.getText();
                    Revista.getInstancia().añoPublicacion[i] = txt_año2.getText();
                    Revista.getInstancia().titulo[i] = txt_titulo2.getText();
                    Revista.getInstancia().edicion[i] = txt_edicion2.getText();
                    Revista.getInstancia().descripcion[i] = txt_descripcion2.getText();
                    Revista.getInstancia().categoria[i] = txt_categoria2.getText();
                    Revista.getInstancia().ejemplares[i] = txt_ejemplares.getText();
                    Revista.getInstancia().temas[i] = txt_temas2.getText();
                    Revista.getInstancia().palabrasClave[i] = txt_palabras2.getText();
                    Revista.getInstancia().copias[i] = Integer.parseInt(txt_copias2.getText()) ;
                    Revista.getInstancia().dispobles[i] = Integer.parseInt(txt_disponible.getText());
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
                txt_disponible.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn2.setText("");
                comboBox_tipo2.setSelectedItem("Libro");
                txt_autor2.setEnabled(false);
                txt_año2.setEnabled(false);
                txt_titulo2.setEnabled(false);
                txt_descripcion2.setEnabled(false);
                txt_palabras2.setEnabled(false);
                txt_edicion2.setEnabled(false);
                txt_temas2.setEnabled(false);
                txt_copias2.setEnabled(false);
                txt_area2.setEnabled(false);
                txt_categoria2.setEnabled(false);
                txt_disponible.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
                btn_modificar.setEnabled(false);
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Tesis")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                if (Tesis.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    Tesis.getInstancia().autor[i] = txt_autor2.getText();
                    Tesis.getInstancia().añoPublicacion[i] = txt_año2.getText();
                    Tesis.getInstancia().titulo[i] = txt_titulo2.getText();
                    Tesis.getInstancia().palabrasClave[i] = txt_palabras2.getText();
                    Tesis.getInstancia().area[i] = txt_area2.getText();
                    Tesis.getInstancia().temas[i] = txt_temas2.getText();
                    Tesis.getInstancia().descripcion[i] = txt_descripcion2.getText();
                    Tesis.getInstancia().edicion[i] = txt_edicion2.getText();
                    Tesis.getInstancia().copias[i] = Integer.parseInt(txt_copias2.getText());
                    Tesis.getInstancia().dispobles[i] = Integer.parseInt(txt_disponible.getText());
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
                txt_disponible.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn2.setText("");
                comboBox_tipo2.setSelectedItem("Libro");
                txt_autor2.setEnabled(false);
                txt_año2.setEnabled(false);
                txt_titulo2.setEnabled(false);
                txt_descripcion2.setEnabled(false);
                txt_palabras2.setEnabled(false);
                txt_edicion2.setEnabled(false);
                txt_temas2.setEnabled(false);
                txt_copias2.setEnabled(false);
                txt_area2.setEnabled(false);
                txt_categoria2.setEnabled(false);
                txt_disponible.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
                btn_modificar.setEnabled(false);
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Libro Digital")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= LibroDigital.getInstancia().contador; i++) {
                if (LibroDigital.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    LibroDigital.getInstancia().autor[i] = txt_autor2.getText();
                    LibroDigital.getInstancia().añoPublicacion[i] = txt_año2.getText();
                    LibroDigital.getInstancia().titulo[i] = txt_titulo2.getText();
                    LibroDigital.getInstancia().edicion[i] = txt_edicion2.getText();
                    LibroDigital.getInstancia().palabrasClave[i] = txt_palabras2.getText();
                    LibroDigital.getInstancia().descripcion[i] = txt_descripcion2.getText();
                    LibroDigital.getInstancia().temas[i] = txt_temas2.getText();
                    LibroDigital.getInstancia().tamaño[i] = txt_tamaño.getText();
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
                txt_disponible.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn2.setText("");
                comboBox_tipo2.setSelectedItem("Libro");
                txt_autor2.setEnabled(false);
                txt_año2.setEnabled(false);
                txt_titulo2.setEnabled(false);
                txt_descripcion2.setEnabled(false);
                txt_palabras2.setEnabled(false);
                txt_edicion2.setEnabled(false);
                txt_temas2.setEnabled(false);
                txt_copias2.setEnabled(false);
                txt_area2.setEnabled(false);
                txt_categoria2.setEnabled(false);
                txt_disponible.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
                btn_modificar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar2ActionPerformed

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
        txt_autor2.setEnabled(false);
        txt_año2.setEnabled(false);
        txt_titulo2.setEnabled(false);
        txt_descripcion2.setEnabled(false);
        txt_palabras2.setEnabled(false);
        txt_edicion2.setEnabled(false);
        txt_temas2.setEnabled(false);
        txt_copias2.setEnabled(false);
        txt_area2.setEnabled(false);
        txt_categoria2.setEnabled(false);
        txt_disponible.setEnabled(false);
        txt_ejemplares.setEnabled(false);
        txt_tamaño.setEnabled(false);
        btn_modificar.setEnabled(false);
        modificarBibliografia.getInstancia().setVisible(false);
        ventanaAdministrador.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_cancelar2ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        if (comboBox_tipo2.getSelectedItem().equals("Libro")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                if (Libro.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    btn_modificar.setEnabled(true);
                    txt_autor2.setEnabled(true);
                    txt_año2.setEnabled(true);
                    txt_titulo2.setEnabled(true);
                    txt_edicion2.setEnabled(true);
                    txt_palabras2.setEnabled(true);
                    txt_descripcion2.setEnabled(true);
                    txt_temas2.setEnabled(true);
                    txt_copias2.setEnabled(true);
                    txt_disponible.setEnabled(true);
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
                txt_autor2.setEnabled(false);
                txt_año2.setEnabled(false);
                txt_titulo2.setEnabled(false);
                txt_descripcion2.setEnabled(false);
                txt_palabras2.setEnabled(false);
                txt_edicion2.setEnabled(false);
                txt_temas2.setEnabled(false);
                txt_copias2.setEnabled(false);
                txt_area2.setEnabled(false);
                txt_categoria2.setEnabled(false);
                txt_disponible.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Revista")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Revista.getInstancia().contador; i++) {
                if (Revista.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    btn_modificar.setEnabled(true);
                    txt_autor2.setEnabled(true);
                    txt_año2.setEnabled(true);
                    txt_titulo2.setEnabled(true);
                    txt_edicion2.setEnabled(true);
                    txt_palabras2.setEnabled(true);
                    txt_descripcion2.setEnabled(true);
                    txt_temas2.setEnabled(true);
                    txt_copias2.setEnabled(true);
                    txt_disponible.setEnabled(true);
                    txt_categoria2.setEnabled(true);
                    txt_ejemplares.setEnabled(true);
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
                txt_autor2.setEnabled(false);
                txt_año2.setEnabled(false);
                txt_titulo2.setEnabled(false);
                txt_descripcion2.setEnabled(false);
                txt_palabras2.setEnabled(false);
                txt_edicion2.setEnabled(false);
                txt_temas2.setEnabled(false);
                txt_copias2.setEnabled(false);
                txt_area2.setEnabled(false);
                txt_categoria2.setEnabled(false);
                txt_disponible.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Tesis")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                if (Tesis.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    btn_modificar.setEnabled(true);
                    txt_autor2.setEnabled(true);
                    txt_año2.setEnabled(true);
                    txt_titulo2.setEnabled(true);
                    txt_palabras2.setEnabled(true);
                    txt_area2.setEnabled(true);
                    txt_temas2.setEnabled(true);
                    txt_descripcion2.setEnabled(true);
                    txt_edicion2.setEnabled(true);
                    txt_copias2.setEnabled(true);
                    txt_disponible.setEnabled(true);
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
                txt_autor2.setEnabled(false);
                txt_año2.setEnabled(false);
                txt_titulo2.setEnabled(false);
                txt_descripcion2.setEnabled(false);
                txt_palabras2.setEnabled(false);
                txt_edicion2.setEnabled(false);
                txt_temas2.setEnabled(false);
                txt_copias2.setEnabled(false);
                txt_area2.setEnabled(false);
                txt_categoria2.setEnabled(false);
                txt_disponible.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
            }
        }
        if (comboBox_tipo2.getSelectedItem().equals("Libro Digital")) {
            boolean bibliografiaEncontrada;
            bibliografiaEncontrada = false;
            for (int i = 0; i <= LibroDigital.getInstancia().contador; i++) {
                if (LibroDigital.getInstancia().isbn[i].equals(txt_isbn2.getText())) {
                    bibliografiaEncontrada = true;
                    btn_modificar.setEnabled(true);
                    txt_autor2.setEnabled(true);
                    txt_año2.setEnabled(true);
                    txt_titulo2.setEnabled(true);
                    txt_edicion2.setEnabled(true);
                    txt_palabras2.setEnabled(true);
                    txt_descripcion2.setEnabled(true);
                    txt_temas2.setEnabled(true);
                    txt_tamaño.setEnabled(true);
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
                txt_autor2.setEnabled(false);
                txt_año2.setEnabled(false);
                txt_titulo2.setEnabled(false);
                txt_descripcion2.setEnabled(false);
                txt_palabras2.setEnabled(false);
                txt_edicion2.setEnabled(false);
                txt_temas2.setEnabled(false);
                txt_copias2.setEnabled(false);
                txt_area2.setEnabled(false);
                txt_categoria2.setEnabled(false);
                txt_disponible.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
            }
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
