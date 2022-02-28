package JFrames;

import javax.swing.table.DefaultTableModel;
import Clases.Bibliografia;

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
        tbl_mostrarUsuarios = new javax.swing.JTable();
        btn_Regresar = new javax.swing.JButton();
        btn_verBibliografia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tbl_mostrarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Año", "Título", "Descripción", "Palabras", "Edición", "Temas", "Copias", "Área", "Categoría", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_mostrarUsuarios.setRowHeight(35);
        jScrollPane1.setViewportView(tbl_mostrarUsuarios);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_verBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_verBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
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
        String[][] tabla = new String[10][12];
        for (int i = 0; i <= Bibliografia.getInstancia().contador; i++) {
            for (int j = 0; j < 12; j++) {
                tabla[i][0] = Bibliografia.getInstancia().isbn[i];
                tabla[i][1] = Bibliografia.getInstancia().autor[i];
                tabla[i][2] = Bibliografia.getInstancia().año[i];
                tabla[i][3] = Bibliografia.getInstancia().titulo[i];
                tabla[i][4] = Bibliografia.getInstancia().descripcion[i];
                tabla[i][5] = Bibliografia.getInstancia().palabras[i];
                tabla[i][6] = Bibliografia.getInstancia().edicion[i];
                tabla[i][7] = Bibliografia.getInstancia().temas[i];
                tabla[i][8] = Bibliografia.getInstancia().copias[i];
                tabla[i][9] = Bibliografia.getInstancia().area[i];
                tabla[i][10] = Bibliografia.getInstancia().categoria[i];
                tabla[i][11] = Bibliografia.getInstancia().tipo[i];
            }
        }

        System.out.println("PRUEBA DE IMPORTACIÓN DE USUARIOS");
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 11; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
        String[] encabezado = {"ISBN", "Autor", "Año", "Título", "Descripción", "Palabras", "Edición", "Temas", "Copias", "Área","Categoría", "Tipo"};
        tbl_mostrarUsuarios.setModel(new DefaultTableModel(
                tabla,
                encabezado
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_mostrarUsuarios;
    // End of variables declaration//GEN-END:variables
}
