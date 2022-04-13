/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.vistas;

/**
 *
 * @author jotha
 */
public class VerNiños extends javax.swing.JFrame {

    /**
     * Creates new form VerNiños
     */
    public VerNiños() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Niños = new javax.swing.JTable();
        lbl_volver = new javax.swing.JLabel();
        lbl_actualizarNiño = new javax.swing.JLabel();
        lbl_edita = new javax.swing.JLabel();
        lbl_borrarNiño = new javax.swing.JLabel();
        lbl_agregarNiño = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Niños.setBackground(new java.awt.Color(255, 0, 255));
        tbl_Niños.setForeground(new java.awt.Color(255, 0, 255));
        tbl_Niños.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Nivel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Niños.setGridColor(new java.awt.Color(255, 0, 255));
        tbl_Niños.setSelectionForeground(new java.awt.Color(255, 0, 255));
        jScrollPane2.setViewportView(tbl_Niños);
        if (tbl_Niños.getColumnModel().getColumnCount() > 0) {
            tbl_Niños.getColumnModel().getColumn(0).setResizable(false);
            tbl_Niños.getColumnModel().getColumn(1).setResizable(false);
            tbl_Niños.getColumnModel().getColumn(2).setResizable(false);
            tbl_Niños.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 840, 560));

        lbl_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/regresar.png"))); // NOI18N
        lbl_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 110, 70));

        lbl_actualizarNiño.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_actualizarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/actualizarNiño.png"))); // NOI18N
        lbl_actualizarNiño.setText("Actualizar Lista ");
        lbl_actualizarNiño.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_actualizarNiño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_actualizarNiño.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lbl_actualizarNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 640, -1, -1));

        lbl_edita.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_edita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/editarNiño.png"))); // NOI18N
        lbl_edita.setText("Editar Niño");
        lbl_edita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_edita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_edita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lbl_edita, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, -1, -1));

        lbl_borrarNiño.setBackground(new java.awt.Color(0, 0, 0));
        lbl_borrarNiño.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_borrarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/BorrarNiño.png"))); // NOI18N
        lbl_borrarNiño.setText("Eliminar Niño");
        lbl_borrarNiño.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_borrarNiño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_borrarNiño.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lbl_borrarNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, -1, -1));

        lbl_agregarNiño.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_agregarNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agregarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/agregarNiño.png"))); // NOI18N
        lbl_agregarNiño.setText("Agregar Niño");
        lbl_agregarNiño.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_agregarNiño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_agregarNiño.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lbl_agregarNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoRosa.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VerNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerNiños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_actualizarNiño;
    private javax.swing.JLabel lbl_agregarNiño;
    private javax.swing.JLabel lbl_borrarNiño;
    private javax.swing.JLabel lbl_edita;
    private javax.swing.JLabel lbl_volver;
    private javax.swing.JTable tbl_Niños;
    // End of variables declaration//GEN-END:variables
}
