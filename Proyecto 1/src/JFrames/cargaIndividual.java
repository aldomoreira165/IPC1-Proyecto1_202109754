package JFrames;

import JFrames.ventanaAdministrador;
import JFrames.crearBibliografia;
import javax.swing.JOptionPane;
import Clases.Libro;
import Clases.Revista;
import Clases.Tesis;
import Clases.LibroDigital;

public class cargaIndividual extends javax.swing.JFrame {

    private static cargaIndividual instancia;

    public static cargaIndividual getInstancia() {
        if (instancia == null) {
            instancia = new cargaIndividual();
        }
        return instancia;
    }

    public cargaIndividual() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_palabras = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_año = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        txt_edicion = new javax.swing.JTextField();
        txt_temas = new javax.swing.JTextField();
        txt_copias = new javax.swing.JTextField();
        txt_area = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        txt_isbn = new javax.swing.JTextField();
        comboBox_tipo = new javax.swing.JComboBox<>();
        btn_cargarBibliografia = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_disponibles = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_ejemplares = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_tamaño = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btn_activar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txt_palabras.setEnabled(false);

        txt_titulo.setEnabled(false);

        txt_descripcion.setEnabled(false);

        txt_año.setEnabled(false);

        txt_autor.setEnabled(false);

        txt_edicion.setEnabled(false);

        txt_temas.setEnabled(false);

        txt_copias.setEnabled(false);

        txt_area.setEnabled(false);

        txt_categoria.setEnabled(false);

        txt_isbn.setEnabled(false);

        comboBox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Tesis", "Libro Digital" }));

        btn_cargarBibliografia.setText("Cargar");
        btn_cargarBibliografia.setEnabled(false);
        btn_cargarBibliografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarBibliografiaActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Autor:");

        jLabel2.setText("Año:");

        jLabel3.setText("Título:");

        jLabel4.setText("Descripción:");

        jLabel5.setText("Palabras:");

        jLabel6.setText("Edición:");

        jLabel7.setText("Temas:");

        jLabel8.setText("Copias:");

        jLabel9.setText("Área:");

        jLabel10.setText("Categoría:");

        jLabel11.setText("ISBN:");

        jLabel12.setText("Tipo:");

        txt_disponibles.setEnabled(false);

        jLabel13.setText("Disponibles:");

        txt_ejemplares.setEnabled(false);

        jLabel14.setText("Ejemplares:");

        txt_tamaño.setEnabled(false);

        jLabel15.setText("Tamaño:");

        btn_activar.setText("Activar Celdas");
        btn_activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_activarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_isbn, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_area, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_copias, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_temas, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_edicion, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_autor, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_año, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_palabras)
                    .addComponent(comboBox_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cargarBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_disponibles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_ejemplares, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(txt_tamaño, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(btn_activar)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_activar))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(32, 32, 32)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel5)
                                                                        .addGap(32, 32, 32)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addGap(32, 32, 32)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel7)
                                                                                        .addGap(32, 32, 32)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jLabel8)
                                                                                                .addGap(32, 32, 32)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addComponent(jLabel9)
                                                                                                        .addGap(32, 32, 32)
                                                                                                        .addComponent(jLabel10))
                                                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                            .addComponent(txt_copias, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(txt_disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                            .addComponent(jLabel13)))
                                                                                    .addComponent(txt_temas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                            .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                    .addComponent(txt_palabras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                                        .addComponent(jLabel14)
                                                        .addGap(26, 26, 26))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(txt_ejemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel15)))
                                            .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cargarBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        crearBibliografia.getInstancia().setVisible(true);
        cargaIndividual.getInstancia().setVisible(false);
        txt_autor.setText("");
        txt_año.setText("");
        txt_titulo.setText("");
        txt_descripcion.setText("");
        txt_palabras.setText("");
        txt_edicion.setText("");
        txt_temas.setText("");
        txt_copias.setText("");
        txt_area.setText("");
        txt_categoria.setText("");
        txt_disponibles.setText("");
        txt_ejemplares.setText("");
        txt_tamaño.setText("");
        txt_isbn.setText("");
        comboBox_tipo.setSelectedItem("Libro");
        txt_autor.setEnabled(false);
        txt_año.setEnabled(false);
        txt_titulo.setEnabled(false);
        txt_descripcion.setEnabled(false);
        txt_palabras.setEnabled(false);
        txt_edicion.setEnabled(false);
        txt_temas.setEnabled(false);
        txt_copias.setEnabled(false);
        txt_area.setEnabled(false);
        txt_categoria.setEnabled(false);
        txt_disponibles.setEnabled(false);
        txt_ejemplares.setEnabled(false);
        txt_tamaño.setEnabled(false);
        txt_isbn.setEnabled(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_cargarBibliografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarBibliografiaActionPerformed

        if (comboBox_tipo.getSelectedItem().equals("Libro")) {
            boolean isbnExistente = false;
            String isbnPrevio = txt_isbn.getText();

            for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                if (Libro.getInstancia().isbn[i].equals(isbnPrevio)) {
                    isbnExistente = true;
                }
            }
            if (isbnExistente == false) {
                JOptionPane.showMessageDialog(null, "Nuevo libro: " + txt_titulo.getText(), "Libro añadido con éxito", JOptionPane.INFORMATION_MESSAGE);
                Libro.getInstancia().contador = Libro.getInstancia().contador + 1;
                Libro.getInstancia().autor[Libro.getInstancia().contador] = txt_autor.getText();
                Libro.getInstancia().añoPublicacion[Libro.getInstancia().contador] = txt_año.getText();
                Libro.getInstancia().isbn[Libro.getInstancia().contador] = txt_isbn.getText();
                Libro.getInstancia().titulo[Libro.getInstancia().contador] = txt_titulo.getText();
                Libro.getInstancia().edicion[Libro.getInstancia().contador] = txt_edicion.getText();
                Libro.getInstancia().palabrasClave[Libro.getInstancia().contador] = txt_palabras.getText();
                Libro.getInstancia().descripcion[Libro.getInstancia().contador] = txt_descripcion.getText();
                Libro.getInstancia().temas[Libro.getInstancia().contador] = txt_temas.getText();
                Libro.getInstancia().copias[Libro.getInstancia().contador] = txt_copias.getText();
                Libro.getInstancia().dispobles[Libro.getInstancia().contador] = txt_disponibles.getText();

                txt_autor.setText("");
                txt_año.setText("");
                txt_titulo.setText("");
                txt_descripcion.setText("");
                txt_palabras.setText("");
                txt_edicion.setText("");
                txt_temas.setText("");
                txt_copias.setText("");
                txt_area.setText("");
                txt_categoria.setText("");
                txt_disponibles.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn.setText("");
                comboBox_tipo.setSelectedItem("Libro");
                txt_autor.setEnabled(false);
                txt_año.setEnabled(false);
                txt_titulo.setEnabled(false);
                txt_descripcion.setEnabled(false);
                txt_palabras.setEnabled(false);
                txt_edicion.setEnabled(false);
                txt_temas.setEnabled(false);
                txt_copias.setEnabled(false);
                txt_area.setEnabled(false);
                txt_categoria.setEnabled(false);
                txt_disponibles.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
                txt_isbn.setEnabled(false);

                cargaIndividual.getInstancia().setVisible(false);
                crearBibliografia.getInstancia().setVisible(true);
            }
            if (isbnExistente == true) {
                JOptionPane.showMessageDialog(null, "Ya existe un libro con ese isbn", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (comboBox_tipo.getSelectedItem().equals("Revista")) {
            boolean isbnExistente = false;
            String isbnPrevio = txt_isbn.getText();

            for (int i = 0; i <= Revista.getInstancia().contador; i++) {
                if (Revista.getInstancia().isbn[i].equals(isbnPrevio)) {
                    isbnExistente = true;
                }
            }
            if (isbnExistente == false) {
                JOptionPane.showMessageDialog(null, "Nueva revista: " + txt_titulo.getText(), "Revista añadido con éxito", JOptionPane.INFORMATION_MESSAGE);
                Revista.getInstancia().contador = Revista.getInstancia().contador + 1;
                Revista.getInstancia().isbn[Revista.getInstancia().contador] = txt_isbn.getText();
                Revista.getInstancia().autor[Revista.getInstancia().contador] = txt_autor.getText();
                Revista.getInstancia().añoPublicacion[Revista.getInstancia().contador] = txt_año.getText();
                Revista.getInstancia().titulo[Revista.getInstancia().contador] = txt_titulo.getText();
                Revista.getInstancia().edicion[Revista.getInstancia().contador] = txt_edicion.getText();
                Revista.getInstancia().descripcion[Revista.getInstancia().contador] = txt_descripcion.getText();
                Revista.getInstancia().categoria[Revista.getInstancia().contador] = txt_categoria.getText();
                Revista.getInstancia().ejemplares[Revista.getInstancia().contador] = txt_ejemplares.getText();
                Revista.getInstancia().temas[Revista.getInstancia().contador] = txt_temas.getText();
                Revista.getInstancia().palabrasClave[Revista.getInstancia().contador] = txt_palabras.getText();
                Revista.getInstancia().copias[Revista.getInstancia().contador] = txt_copias.getText();
                Revista.getInstancia().dispobles[Revista.getInstancia().contador] = txt_disponibles.getText();

                txt_autor.setText("");
                txt_año.setText("");
                txt_titulo.setText("");
                txt_descripcion.setText("");
                txt_palabras.setText("");
                txt_edicion.setText("");
                txt_temas.setText("");
                txt_copias.setText("");
                txt_area.setText("");
                txt_categoria.setText("");
                txt_disponibles.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn.setText("");
                comboBox_tipo.setSelectedItem("Libro");
                txt_autor.setEnabled(false);
                txt_año.setEnabled(false);
                txt_titulo.setEnabled(false);
                txt_descripcion.setEnabled(false);
                txt_palabras.setEnabled(false);
                txt_edicion.setEnabled(false);
                txt_temas.setEnabled(false);
                txt_copias.setEnabled(false);
                txt_area.setEnabled(false);
                txt_categoria.setEnabled(false);
                txt_disponibles.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
                txt_isbn.setEnabled(false);

                cargaIndividual.getInstancia().setVisible(false);
                crearBibliografia.getInstancia().setVisible(true);
            }
            if (isbnExistente == true) {
                JOptionPane.showMessageDialog(null, "Ya existe una revista con ese isbn", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (comboBox_tipo.getSelectedItem().equals("Tesis")) {
            boolean isbnExistente = false;
            String isbnPrevio = txt_isbn.getText();

            for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                if (Tesis.getInstancia().isbn[i].equals(isbnPrevio)) {
                    isbnExistente = true;
                }
            }
            if (isbnExistente == false) {
                JOptionPane.showMessageDialog(null, "Nueva tesis: " + txt_titulo.getText(), "Tesis añadido con éxito", JOptionPane.INFORMATION_MESSAGE);
                Tesis.getInstancia().contador = Tesis.getInstancia().contador + 1;
                Tesis.getInstancia().isbn[Tesis.getInstancia().contador] = txt_isbn.getText();
                Tesis.getInstancia().autor[Tesis.getInstancia().contador] = txt_autor.getText();
                Tesis.getInstancia().añoPublicacion[Tesis.getInstancia().contador] = txt_año.getText();
                Tesis.getInstancia().titulo[Tesis.getInstancia().contador] = txt_titulo.getText();
                Tesis.getInstancia().palabrasClave[Tesis.getInstancia().contador] = txt_palabras.getText();
                Tesis.getInstancia().area[Tesis.getInstancia().contador] = txt_area.getText();
                Tesis.getInstancia().temas[Tesis.getInstancia().contador] = txt_temas.getText();
                Tesis.getInstancia().descripcion[Tesis.getInstancia().contador] = txt_descripcion.getText();
                Tesis.getInstancia().edicion[Tesis.getInstancia().contador] = txt_edicion.getText();
                Tesis.getInstancia().copias[Tesis.getInstancia().contador] = txt_copias.getText();
                Tesis.getInstancia().dispobles[Tesis.getInstancia().contador] = txt_disponibles.getText();

                txt_autor.setText("");
                txt_año.setText("");
                txt_titulo.setText("");
                txt_descripcion.setText("");
                txt_palabras.setText("");
                txt_edicion.setText("");
                txt_temas.setText("");
                txt_copias.setText("");
                txt_area.setText("");
                txt_categoria.setText("");
                txt_disponibles.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn.setText("");
                comboBox_tipo.setSelectedItem("Libro");
                txt_autor.setEnabled(false);
                txt_año.setEnabled(false);
                txt_titulo.setEnabled(false);
                txt_descripcion.setEnabled(false);
                txt_palabras.setEnabled(false);
                txt_edicion.setEnabled(false);
                txt_temas.setEnabled(false);
                txt_copias.setEnabled(false);
                txt_area.setEnabled(false);
                txt_categoria.setEnabled(false);
                txt_disponibles.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
                txt_isbn.setEnabled(false);

                cargaIndividual.getInstancia().setVisible(false);
                crearBibliografia.getInstancia().setVisible(true);
            }
            if (isbnExistente == true) {
                JOptionPane.showMessageDialog(null, "Ya existe una tesis con ese isbn", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (comboBox_tipo.getSelectedItem().equals("Libro Digital")) {
            boolean isbnExistente = false;
            String isbnPrevio = txt_isbn.getText();

            for (int i = 0; i <= LibroDigital.getInstancia().contador; i++) {
                if (LibroDigital.getInstancia().isbn[i].equals(isbnPrevio)) {
                    isbnExistente = true;
                }
            }
            if (isbnExistente == false) {
                JOptionPane.showMessageDialog(null, "Nuevo libro digital: " + txt_titulo.getText(), "Libro digital añadido con éxito", JOptionPane.INFORMATION_MESSAGE);
                LibroDigital.getInstancia().contador = LibroDigital.getInstancia().contador + 1;
                LibroDigital.getInstancia().isbn[LibroDigital.getInstancia().contador] = txt_isbn.getText();
                LibroDigital.getInstancia().autor[LibroDigital.getInstancia().contador] = txt_autor.getText();
                LibroDigital.getInstancia().añoPublicacion[LibroDigital.getInstancia().contador] = txt_año.getText();
                LibroDigital.getInstancia().titulo[LibroDigital.getInstancia().contador] = txt_titulo.getText();
                LibroDigital.getInstancia().edicion[LibroDigital.getInstancia().contador] = txt_edicion.getText();
                LibroDigital.getInstancia().palabrasClave[LibroDigital.getInstancia().contador] = txt_palabras.getText();
                LibroDigital.getInstancia().descripcion[LibroDigital.getInstancia().contador] = txt_descripcion.getText();
                LibroDigital.getInstancia().temas[LibroDigital.getInstancia().contador] = txt_temas.getText();
                LibroDigital.getInstancia().tamaño[LibroDigital.getInstancia().contador] = txt_tamaño.getText();

                txt_autor.setText("");
                txt_año.setText("");
                txt_titulo.setText("");
                txt_descripcion.setText("");
                txt_palabras.setText("");
                txt_edicion.setText("");
                txt_temas.setText("");
                txt_copias.setText("");
                txt_area.setText("");
                txt_categoria.setText("");
                txt_disponibles.setText("");
                txt_ejemplares.setText("");
                txt_tamaño.setText("");
                txt_isbn.setText("");
                comboBox_tipo.setSelectedItem("Libro");
                txt_autor.setEnabled(false);
                txt_año.setEnabled(false);
                txt_titulo.setEnabled(false);
                txt_descripcion.setEnabled(false);
                txt_palabras.setEnabled(false);
                txt_edicion.setEnabled(false);
                txt_temas.setEnabled(false);
                txt_copias.setEnabled(false);
                txt_area.setEnabled(false);
                txt_categoria.setEnabled(false);
                txt_disponibles.setEnabled(false);
                txt_ejemplares.setEnabled(false);
                txt_tamaño.setEnabled(false);
                txt_isbn.setEnabled(false);

                cargaIndividual.getInstancia().setVisible(false);
                crearBibliografia.getInstancia().setVisible(true);
            }
            if (isbnExistente == true) {
                JOptionPane.showMessageDialog(null, "Ya existe un libro digital con ese isbn", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_cargarBibliografiaActionPerformed

    private void btn_activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_activarActionPerformed
        txt_autor.setText("");
        txt_año.setText("");
        txt_titulo.setText("");
        txt_descripcion.setText("");
        txt_palabras.setText("");
        txt_edicion.setText("");
        txt_temas.setText("");
        txt_copias.setText("");
        txt_area.setText("");
        txt_categoria.setText("");
        txt_disponibles.setText("");
        txt_ejemplares.setText("");
        txt_tamaño.setText("");
        txt_isbn.setText("");
        txt_autor.setEnabled(false);
        txt_año.setEnabled(false);
        txt_titulo.setEnabled(false);
        txt_descripcion.setEnabled(false);
        txt_palabras.setEnabled(false);
        txt_edicion.setEnabled(false);
        txt_temas.setEnabled(false);
        txt_copias.setEnabled(false);
        txt_area.setEnabled(false);
        txt_categoria.setEnabled(false);
        txt_disponibles.setEnabled(false);
        txt_ejemplares.setEnabled(false);
        txt_tamaño.setEnabled(false);
        txt_isbn.setEnabled(false);
        if (comboBox_tipo.getSelectedItem().equals("Libro")) {
            txt_autor.setEnabled(true);
            txt_año.setEnabled(true);
            txt_isbn.setEnabled(true);
            txt_titulo.setEnabled(true);
            txt_edicion.setEnabled(true);
            txt_palabras.setEnabled(true);
            txt_descripcion.setEnabled(true);
            txt_temas.setEnabled(true);
            txt_copias.setEnabled(true);
            txt_disponibles.setEnabled(true);
            btn_cargarBibliografia.setEnabled(true);
        }
        if (comboBox_tipo.getSelectedItem().equals("Revista")) {
            txt_autor.setEnabled(true);
            txt_año.setEnabled(true);
            txt_isbn.setEnabled(true);
            txt_titulo.setEnabled(true);
            txt_edicion.setEnabled(true);
            txt_descripcion.setEnabled(true);
            txt_categoria.setEnabled(true);
            txt_ejemplares.setEnabled(true);
            txt_temas.setEnabled(true);
            txt_palabras.setEnabled(true);
            txt_copias.setEnabled(true);
            txt_disponibles.setEnabled(true);
            btn_cargarBibliografia.setEnabled(true);
        }
        if (comboBox_tipo.getSelectedItem().equals("Tesis")) {
            txt_autor.setEnabled(true);
            txt_año.setEnabled(true);
            txt_isbn.setEnabled(true);
            txt_titulo.setEnabled(true);
            txt_palabras.setEnabled(true);
            txt_area.setEnabled(true);
            txt_temas.setEnabled(true);
            txt_descripcion.setEnabled(true);
            txt_edicion.setEnabled(true);
            txt_copias.setEnabled(true);
            txt_disponibles.setEnabled(true);
            btn_cargarBibliografia.setEnabled(true);
        }
        if (comboBox_tipo.getSelectedItem().equals("Libro Digital")) {
            txt_autor.setEnabled(true);
            txt_año.setEnabled(true);
            txt_isbn.setEnabled(true);
            txt_titulo.setEnabled(true);
            txt_edicion.setEnabled(true);
            txt_palabras.setEnabled(true);
            txt_descripcion.setEnabled(true);
            txt_temas.setEnabled(true);
            txt_tamaño.setEnabled(true);
            btn_cargarBibliografia.setEnabled(true);
        }
    }//GEN-LAST:event_btn_activarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cargaIndividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_activar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cargarBibliografia;
    private javax.swing.JComboBox<String> comboBox_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_area;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_año;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_copias;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_disponibles;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_ejemplares;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_palabras;
    private javax.swing.JTextField txt_tamaño;
    private javax.swing.JTextField txt_temas;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
