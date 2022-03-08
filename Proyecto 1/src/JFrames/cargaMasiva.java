package JFrames;

import Clases.Libro;
import Clases.Revista;
import Clases.Tesis;
import Clases.LibroDigital;
import java.awt.Color;
import javax.swing.JOptionPane;

public class cargaMasiva extends javax.swing.JFrame {

    public static cargaMasiva instancia;

    public static cargaMasiva getInstancia() {
        if (instancia == null) {
            instancia = new cargaMasiva();
        }
        return instancia;
    }

    public cargaMasiva() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        btn_cancelar = new javax.swing.JButton();
        btn_cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

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

        btn_cargar.setBackground(new java.awt.Color(51, 51, 255));
        btn_cargar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cargar.setText("Cargar");
        btn_cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cargarMouseEntered(evt);
            }
        });
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
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
        cargaMasiva.getInstancia().setVisible(false);
        crearBibliografia.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        String[] cadenaTexto = areaTexto.getText().split(";");
        String[] saltoTexto = areaTexto.getText().split("\n");
        int saltoLinea = -14;

        for (int j = 0; j < saltoTexto.length; j++) {
            saltoLinea = saltoLinea + 14;
            if (cadenaTexto[saltoLinea + 0].equals("0") || cadenaTexto[saltoLinea + 0].equals("\n" + "0")) {
                boolean isbnExistente = false;
                String isbnPrevio = cadenaTexto[saltoLinea + 3];

                for (int i = 0; i <= Libro.getInstancia().contador; i++) {
                    if (Libro.getInstancia().isbn[i].equals(isbnPrevio)) {
                        isbnExistente = true;
                    }
                }
                if (isbnExistente == false) {
                    JOptionPane.showMessageDialog(null, "Nuevo libro: " + cadenaTexto[saltoLinea + 4], "Libro añadido con éxito", JOptionPane.INFORMATION_MESSAGE);
                    Libro.getInstancia().contador = Libro.getInstancia().contador + 1;
                    Libro.getInstancia().autor[Libro.getInstancia().contador] = cadenaTexto[saltoLinea + 1];
                    Libro.getInstancia().añoPublicacion[Libro.getInstancia().contador] = cadenaTexto[saltoLinea + 2];
                    Libro.getInstancia().isbn[Libro.getInstancia().contador] = cadenaTexto[saltoLinea + 3];
                    Libro.getInstancia().titulo[Libro.getInstancia().contador] = cadenaTexto[saltoLinea + 4];
                    Libro.getInstancia().edicion[Libro.getInstancia().contador] = cadenaTexto[saltoLinea + 5];
                    Libro.getInstancia().palabrasClave[Libro.getInstancia().contador] = cadenaTexto[saltoLinea + 6];
                    Libro.getInstancia().descripcion[Libro.getInstancia().contador] = cadenaTexto[saltoLinea + 7];
                    Libro.getInstancia().temas[Libro.getInstancia().contador] = cadenaTexto[saltoLinea + 8];
                    Libro.getInstancia().copias[Libro.getInstancia().contador] = Integer.parseInt(cadenaTexto[saltoLinea + 9]);
                    Libro.getInstancia().dispobles[Libro.getInstancia().contador] = Integer.parseInt(cadenaTexto[saltoLinea + 13]);
                }
                if (isbnExistente == true) {
                    JOptionPane.showMessageDialog(null, "Ya existe un libro con ese isbn", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            if (cadenaTexto[saltoLinea + 0].equals("1") || cadenaTexto[saltoLinea + 0].equals("\n" + "1")) {
                boolean isbnExistente = false;
                String isbnPrevio = cadenaTexto[saltoLinea + 3];

                for (int i = 0; i <= Revista.getInstancia().contador; i++) {
                    if (Revista.getInstancia().isbn[i].equals(isbnPrevio)) {
                        isbnExistente = true;
                    }
                }
                if (isbnExistente == false) {
                    JOptionPane.showMessageDialog(null, "Nueva revista: " + cadenaTexto[saltoLinea + 4], "Revista añadida con éxito", JOptionPane.INFORMATION_MESSAGE);
                    Revista.getInstancia().contador = Revista.getInstancia().contador + 1;
                    Revista.getInstancia().isbn[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 3];
                    Revista.getInstancia().autor[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 1];
                    Revista.getInstancia().añoPublicacion[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 2];
                    Revista.getInstancia().titulo[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 4];
                    Revista.getInstancia().edicion[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 5];
                    Revista.getInstancia().descripcion[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 7];
                    Revista.getInstancia().categoria[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 10];
                    Revista.getInstancia().ejemplares[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 11];
                    Revista.getInstancia().temas[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 8];
                    Revista.getInstancia().palabrasClave[Revista.getInstancia().contador] = cadenaTexto[saltoLinea + 6];
                    Revista.getInstancia().copias[Revista.getInstancia().contador] = Integer.parseInt(cadenaTexto[saltoLinea + 9]);
                    Revista.getInstancia().dispobles[Revista.getInstancia().contador] = Integer.parseInt(cadenaTexto[saltoLinea + 13]);
                }
                if (isbnExistente == true) {
                    JOptionPane.showMessageDialog(null, "Ya existe una revista con ese ID", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            if (cadenaTexto[saltoLinea + 0].equals("2") || cadenaTexto[saltoLinea + 0].equals("\n" + "2")) {
                boolean isbnExistente = false;
                String isbnPrevio = cadenaTexto[saltoLinea + 3];

                for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
                    if (Tesis.getInstancia().isbn[i].equals(isbnPrevio)) {
                        isbnExistente = true;
                    }
                }
                if (isbnExistente == false) {
                    JOptionPane.showMessageDialog(null, "Nueva tesis: " + cadenaTexto[saltoLinea + 4], "Tesis añadida con éxito", JOptionPane.INFORMATION_MESSAGE);
                    Tesis.getInstancia().contador = Tesis.getInstancia().contador + 1;
                    Tesis.getInstancia().isbn[Tesis.getInstancia().contador] = cadenaTexto[saltoLinea + 3];
                    Tesis.getInstancia().autor[Tesis.getInstancia().contador] = cadenaTexto[saltoLinea + 1];
                    Tesis.getInstancia().añoPublicacion[Tesis.getInstancia().contador] = cadenaTexto[saltoLinea + 2];
                    Tesis.getInstancia().titulo[Tesis.getInstancia().contador] = cadenaTexto[saltoLinea + 4];
                    Tesis.getInstancia().palabrasClave[Tesis.getInstancia().contador] = cadenaTexto[saltoLinea + 6];
                    Tesis.getInstancia().area[Tesis.getInstancia().contador] = cadenaTexto[saltoLinea + 12];
                    Tesis.getInstancia().temas[Tesis.getInstancia().contador] = cadenaTexto[saltoLinea + 8];
                    Tesis.getInstancia().descripcion[Tesis.getInstancia().contador] = cadenaTexto[saltoLinea + 7];
                    Tesis.getInstancia().edicion[Tesis.getInstancia().contador] = cadenaTexto[saltoLinea + 5];
                    Tesis.getInstancia().copias[Tesis.getInstancia().contador] = Integer.parseInt(cadenaTexto[saltoLinea + 9]);
                    Tesis.getInstancia().dispobles[Tesis.getInstancia().contador] = Integer.parseInt(cadenaTexto[saltoLinea + 13]);
                }
                if (isbnExistente == true) {
                    JOptionPane.showMessageDialog(null, "Ya existe una tesis con ese ID", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        areaTexto.setText("");
        cargaMasiva.getInstancia().setVisible(false);
        crearBibliografia.getInstancia().setVisible(true);
    }//GEN-LAST:event_btn_cargarActionPerformed

    private void btn_cargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cargarMouseEntered
        btn_cargar.setBackground(Color.white);
        btn_cargar.setForeground(Color.blue);
        btn_cancelar.setBackground(Color.blue);
        btn_cancelar.setForeground(Color.white);
    }//GEN-LAST:event_btn_cargarMouseEntered

    private void btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseEntered
        btn_cargar.setBackground(Color.blue);
        btn_cargar.setForeground(Color.white);
        btn_cancelar.setBackground(Color.white);
        btn_cancelar.setForeground(Color.blue);
    }//GEN-LAST:event_btn_cancelarMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cargaMasiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
