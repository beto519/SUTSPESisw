/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.vistas.instrucciones;

/**
 *
 * @author jotha
 */
public class InstruccManejoEspacial extends javax.swing.JFrame {

    /**
     * Creates new form InstruccManejoEspacial
     */
    public InstruccManejoEspacial() {
        initComponents();
       setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, -1));

        jTextField1.setText("¿Cuál es tu brazo derecho?");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, 40));

        jTextField2.setText("¿Cuál es tu mano derecha?");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 40));

        jTextField3.setText("¿Dónde está el (auto)?");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 270, 40));

        jTextField4.setText("¿Cuál es tu mano izquierda?");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, 40));

        jTextField5.setText("¿Cuál es tu pie izquierdo?");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 200, 40));

        jTextField6.setText("¿Cuál es tu pierna derecha?");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 200, 40));

        jTextField7.setText("¿Dónde está (la imagen)?");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 270, 40));

        jTextField8.setText("¿Cuál es tu pierna izquierda?");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 200, 40));

        jTextField9.setText("¿Cuál es tu oreja izquierda?");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 200, 40));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Coloque un juguete (auto) detrás de un objeto y \ndelante de un objeto; alternativamente pregunte:");
        getContentPane().add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 270, 40));

        jTextField10.setText("¿Dónde está la canica?");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 270, 40));

        jTextField11.setText("¿Cuál es tu ojo izquierdo?");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 200, 40));

        jTextField12.setText("¿Cuál es tu oreja derecha?");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 200, 40));

        jTextField13.setText("¿Cuál es tu pie derecho?");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 200, 40));

        jTextField14.setText("¿Cuál es tu ojo derecho?");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 200, 40));

        jTextField15.setText("¿Dónde está el (auto)?");
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 270, 40));

        jTextField16.setText("¿Cuál es el primero?");
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 200, 40));

        jTextField20.setText("¿Cuál es tu brazo izquierdo?");
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 200, 40));

        jTextField21.setText("Repita 10 veces.");
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 270, 40));

        jTextField25.setText("Coloque varios objetos de una misma clase en cadena, por ejemplo varios autos. Y pregunte  alternadamente al niño:");
        getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 660, 40));

        jTextField26.setText("Repita 10 veces cada uno de estos ejercicios.");
        getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 630, 260, 40));

        jTextField27.setText("¿Cuál es el último?");
        getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, 200, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Coloque un objeto (canica) dentro de una caja y \nsáquelo sucesivamente, alternativamente  \npregunte al niño:");
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 270, 70));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Coloque una figura arriba, y después abajo. \nAlterativamente pregunte:");
        getContentPane().add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 270, 50));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Coloque un auto de juguete cerca y lejos del \nniño, y pregunte:");
        getContentPane().add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 270, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAmarillo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        ManejoEspacial corporal = new ManejoEspacial();
        corporal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
ManejoEspacial abrir = new ManejoEspacial();
abrir.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

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
            java.util.logging.Logger.getLogger(InstruccManejoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstruccManejoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstruccManejoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstruccManejoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstruccManejoEspacial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
