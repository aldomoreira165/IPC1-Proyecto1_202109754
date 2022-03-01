package JFrames;

import javax.swing.table.DefaultTableModel;
import Clases.*;

public class mostrarBibliografia extends javax.swing.JFrame {

    private static mostrarBibliografia instancia;

    public static mostrarBibliografia getInstancia() {
        if (instancia == null) {
            instancia = new mostrarBibliografia();
        }
        return instancia;
    }

    public mostrarBibliografia() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mostrarLibros = new javax.swing.JTable();
        btn_Regresar = new javax.swing.JButton();
        btn_verBibliografia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_mostrarRevistas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_mostrarTesis = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_mostrarLibroDigital = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tbl_mostrarLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Autor", "Año Publicación", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Copias", "Disponibles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_mostrarLibros.setRowHeight(35);
        jScrollPane1.setViewportView(tbl_mostrarLibros);
        if (tbl_mostrarLibros.getColumnModel().getColumnCount() > 0) {
            tbl_mostrarLibros.getColumnModel().getColumn(8).setHeaderValue("Copias");
        }

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        btn_verBibliografia.setText("Ver bibliografía");
        btn_verBibliografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verBibliografiaActionPerformed(evt);
            }
        });

        tbl_mostrarRevistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Autor", "Año Publicación", "Título", "Edición", "Descripción", "Categoría", "Ejemplares", "Temas", "Palabras Clave", "Copias", "Disponibles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_mostrarRevistas.setRowHeight(35);
        jScrollPane2.setViewportView(tbl_mostrarRevistas);
        if (tbl_mostrarRevistas.getColumnModel().getColumnCount() > 0) {
            tbl_mostrarRevistas.getColumnModel().getColumn(8).setHeaderValue("Copias");
        }

        tbl_mostrarTesis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Autor", "Año Publicación", "Título", "alabras Clave", "Área", "Temas", "Descripción", "Edición", "Copias", "Disponibles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_mostrarTesis.setRowHeight(35);
        jScrollPane3.setViewportView(tbl_mostrarTesis);
        if (tbl_mostrarTesis.getColumnModel().getColumnCount() > 0) {
            tbl_mostrarTesis.getColumnModel().getColumn(8).setHeaderValue("Copias");
        }

        tbl_mostrarLibroDigital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Autor", "Año Publicación", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_mostrarLibroDigital.setRowHeight(35);
        jScrollPane4.setViewportView(tbl_mostrarLibroDigital);

        jLabel1.setText("Libros");

        jLabel2.setText("Revistas");

        jLabel3.setText("Tesis");

        jLabel4.setText("Libro Digital");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_verBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_verBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        ventanaAdministrador.getInstancia().setVisible(true);
        mostrarBibliografia.getInstancia().setVisible(false);
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_verBibliografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verBibliografiaActionPerformed
        String[][] tablaLibros = new String[10][10];
        for (int i = 0; i <= Libro.getInstancia().contador; i++) {
            for (int j = 0; j < 10; j++) {
                tablaLibros[i][0] = Libro.getInstancia().isbn[i];
                tablaLibros[i][1] = Libro.getInstancia().autor[i];
                tablaLibros[i][2] = Libro.getInstancia().añoPublicacion[i];
                tablaLibros[i][3] = Libro.getInstancia().titulo[i];
                tablaLibros[i][4] = Libro.getInstancia().edicion[i];
                tablaLibros[i][5] = Libro.getInstancia().palabrasClave[i];
                tablaLibros[i][6] = Libro.getInstancia().descripcion[i];
                tablaLibros[i][7] = Libro.getInstancia().temas[i];
                tablaLibros[i][8] = Libro.getInstancia().copias[i];
                tablaLibros[i][9] = Libro.getInstancia().dispobles[i];
            }
        }
        String[] encabezadoLibros = {"ISBN", "Autor", "Año Publicación", "Título", "Edición", "Palabras Clave", "Descripción", "Temas", "Copias"};
        tbl_mostrarLibros.setModel(new DefaultTableModel(
                tablaLibros,
                encabezadoLibros
        ));

        String[][] tablaRevistas = new String[10][12];
        for (int i = 0; i <= Revista.getInstancia().contador; i++) {
            for (int j = 0; j < 12; j++) {
                tablaRevistas[i][0] = Revista.getInstancia().isbn[i];
                tablaRevistas[i][1] = Revista.getInstancia().autor[i];
                tablaRevistas[i][2] = Revista.getInstancia().añoPublicacion[i];
                tablaRevistas[i][3] = Revista.getInstancia().titulo[i];
                tablaRevistas[i][4] = Revista.getInstancia().edicion[i];
                tablaRevistas[i][5] = Revista.getInstancia().descripcion[i];
                tablaRevistas[i][6] = Revista.getInstancia().categoria[i];
                tablaRevistas[i][7] = Revista.getInstancia().ejemplares[i];
                tablaRevistas[i][8] = Revista.getInstancia().temas[i];
                tablaRevistas[i][9] = Revista.getInstancia().palabrasClave[i];
                tablaRevistas[i][10] = Revista.getInstancia().copias[i];
                tablaRevistas[i][11] = Revista.getInstancia().dispobles[i];
            }
        }
        String[] encabezadoRevistas = {"ISBN", "Autor", "Año Publicación", "Título", "Edición", "Descripción","Categoría","Ejemplares","Temas","Palabras Clave","Copias","Disponibles"};
        tbl_mostrarRevistas.setModel(new DefaultTableModel(
                tablaRevistas,
                encabezadoRevistas
        ));

        String[][] tablaTesis = new String[10][11];
        for (int i = 0; i <= Tesis.getInstancia().contador; i++) {
            for (int j = 0; j < 11; j++) {
                tablaTesis[i][0] = Tesis.getInstancia().isbn[i];
                tablaTesis[i][1] = Tesis.getInstancia().autor[i];
                tablaTesis[i][2] = Tesis.getInstancia().añoPublicacion[i];
                tablaTesis[i][3] = Tesis.getInstancia().titulo[i];
                tablaTesis[i][4] = Tesis.getInstancia().palabrasClave[i];
                tablaTesis[i][5] = Tesis.getInstancia().area[i];
                tablaTesis[i][6] = Tesis.getInstancia().temas[i];
                tablaTesis[i][7] = Tesis.getInstancia().descripcion[i];
                tablaTesis[i][8] = Tesis.getInstancia().edicion[i];
                tablaTesis[i][9] = Tesis.getInstancia().copias[i];
                tablaTesis[i][10] = Tesis.getInstancia().dispobles[i];
            }
        }
        String[] encabezadoTesis = {"ISBN", "Autor", "Año Publicación", "Título", "Palabras Clave", "Área","Temas","Descripción","Edición","Copias","Disponibles"};
        tbl_mostrarTesis.setModel(new DefaultTableModel(
                tablaTesis,
                encabezadoTesis
        ));

        String[][] tablaLibroDigital = new String[10][9];
        for (int i = 0; i <= LibroDigital.getInstancia().contador; i++) {
            for (int j = 0; j < 9; j++) {
                tablaLibroDigital[i][0] = LibroDigital.getInstancia().isbn[i];
                tablaLibroDigital[i][1] = LibroDigital.getInstancia().autor[i];
                tablaLibroDigital[i][2] = LibroDigital.getInstancia().añoPublicacion[i];
                tablaLibroDigital[i][3] = LibroDigital.getInstancia().titulo[i];
                tablaLibroDigital[i][4] = LibroDigital.getInstancia().edicion[i];
                tablaLibroDigital[i][5] = LibroDigital.getInstancia().palabrasClave[i];
                tablaLibroDigital[i][6] = LibroDigital.getInstancia().descripcion[i];
                tablaLibroDigital[i][7] = LibroDigital.getInstancia().temas[i];
                tablaLibroDigital[i][8] = LibroDigital.getInstancia().tamaño[i];
            }
        }
        String[] encabezadoLibroDigital = {"ISBN", "Autor", "Año Publicación", "Título","Edición","Palabras Clave","Descripción","Temas", "Tamaño"};
        tbl_mostrarLibroDigital.setModel(new DefaultTableModel(
                tablaLibroDigital,
                encabezadoLibroDigital
        ));

    }//GEN-LAST:event_btn_verBibliografiaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrarBibliografia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_verBibliografia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbl_mostrarLibroDigital;
    private javax.swing.JTable tbl_mostrarLibros;
    private javax.swing.JTable tbl_mostrarRevistas;
    private javax.swing.JTable tbl_mostrarTesis;
    // End of variables declaration//GEN-END:variables
}
