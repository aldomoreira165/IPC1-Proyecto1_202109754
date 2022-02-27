package JFrames;

import JFrames.ventanaAdministrador;
import JFrames.crearBibliografia;
import javax.swing.JOptionPane;
import Clases.Bibliografia;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        comboBox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista ", "Tesis", "Libro Digital" }));

        btn_cargarBibliografia.setText("Cargar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
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
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                    .addComponent(jLabel10))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addComponent(comboBox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                    .addComponent(jLabel12))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                    .addComponent(btn_cargarBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                            .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                    .addComponent(txt_copias, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                            .addComponent(txt_temas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                    .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(txt_palabras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
        txt_isbn.setText("");
        comboBox_tipo.setSelectedItem("Libro");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_cargarBibliografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarBibliografiaActionPerformed
        boolean isbnExistente = false;
        String isbnPrevio = txt_isbn.getText();

        for (int i = 0; i <= Bibliografia.getInstancia().contador; i++) {
            if (Bibliografia.getInstancia().isbn[i].equals(isbnPrevio)) {
                isbnExistente = true;
            }
        }
        if (isbnExistente == false) {
            JOptionPane.showMessageDialog(null, "Nuevo libro: " + txt_titulo.getText(), "Libro añadido con éxito", JOptionPane.INFORMATION_MESSAGE);
            Bibliografia.getInstancia().contador = Bibliografia.getInstancia().contador + 1;
            Bibliografia.getInstancia().autor[Bibliografia.getInstancia().contador] = txt_autor.getText();
            Bibliografia.getInstancia().año[Bibliografia.getInstancia().contador] = txt_año.getText();
            Bibliografia.getInstancia().titulo[Bibliografia.getInstancia().contador] = txt_titulo.getText();
            Bibliografia.getInstancia().descripcion[Bibliografia.getInstancia().contador] = txt_descripcion.getText();
            Bibliografia.getInstancia().palabras[Bibliografia.getInstancia().contador]= txt_palabras.getText();
            Bibliografia.getInstancia().edicion[Bibliografia.getInstancia().contador] = txt_edicion.getText();
            Bibliografia.getInstancia().temas[Bibliografia.getInstancia().contador] = txt_temas.getText();
            Bibliografia.getInstancia().copias[Bibliografia.getInstancia().contador] = txt_copias.getText();
            Bibliografia.getInstancia().area[Bibliografia.getInstancia().contador] = txt_area.getText();
            Bibliografia.getInstancia().categoria[Bibliografia.getInstancia().contador] = txt_categoria.getText();
            Bibliografia.getInstancia().isbn[Bibliografia.getInstancia().contador] = txt_isbn.getText();
            Bibliografia.getInstancia().tipo[Bibliografia.getInstancia().contador] = (String) comboBox_tipo.getSelectedItem();

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
            txt_isbn.setText("");
            comboBox_tipo.setSelectedItem("Libro");

            cargaIndividual.getInstancia().setVisible(false);
            crearBibliografia.getInstancia().setVisible(true);

            System.out.println(Bibliografia.getInstancia().contador);
            for (int i = 0; i <= Bibliografia.getInstancia().contador; i++) {
                System.out.println(Bibliografia.getInstancia().autor[i]);
                System.out.println(Bibliografia.getInstancia().año[i]);
                System.out.println(Bibliografia.getInstancia().titulo[i]);
                System.out.println(Bibliografia.getInstancia().descripcion[i]);
                String[] arregloPalabras = Bibliografia.getInstancia().palabras[i].split(",", 0);
                for (int j = 0; j < arregloPalabras.length; j++) {
                    System.out.print(arregloPalabras[j]+" ");
                }
                System.out.println(" ");
                String[] arregloTemas = Bibliografia.getInstancia().temas[i].split(",", 0);
                for (int j = 0; j < arregloTemas.length; j++) {
                    System.out.print(arregloTemas[j]+" ");
                }
                System.out.println(" ");
                System.out.println(Bibliografia.getInstancia().edicion[i]);
                System.out.println(Bibliografia.getInstancia().copias[i]);
                System.out.println(Bibliografia.getInstancia().area[i]);
                System.out.println(Bibliografia.getInstancia().categoria[i]);
                System.out.println(Bibliografia.getInstancia().isbn[i]);
                System.out.println(Bibliografia.getInstancia().tipo[i]);
            }
        }
        if (isbnExistente == true) {
            JOptionPane.showMessageDialog(null, "Ya existe un libro con ese isbn", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_cargarBibliografiaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cargaIndividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cargarBibliografia;
    private javax.swing.JComboBox<String> comboBox_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_palabras;
    private javax.swing.JTextField txt_temas;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
