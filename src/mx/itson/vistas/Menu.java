/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas;

/**
 *
 * @author lopez
 */
public class Menu extends javax.swing.JFrame {

    public static int nivelInstruccion;

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        btnIntrucciones = new javax.swing.JLabel();
        btnVerNinos = new javax.swing.JLabel();
        btnVerTerapeuta = new javax.swing.JLabel();
        txtInstrucciones = new javax.swing.JLabel();
        txtVerNiños = new javax.swing.JLabel();
        txtVerTerapeutas = new javax.swing.JLabel();
        btnIntrucciones1 = new javax.swing.JLabel();
        txtInstrucciones1 = new javax.swing.JLabel();
        btnIntrucciones2 = new javax.swing.JLabel();
        txtInstrucciones2 = new javax.swing.JLabel();
        LabelLogo1 = new javax.swing.JLabel();
        LabelLogo2 = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(155, 20, 136));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIntrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/IntruccionesBtn.png"))); // NOI18N
        btnIntrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntruccionesMouseClicked(evt);
            }
        });
        jPanel1.add(btnIntrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        btnVerNinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/editarNiño.png"))); // NOI18N
        btnVerNinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerNinosMouseClicked(evt);
            }
        });
        jPanel1.add(btnVerNinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        btnVerTerapeuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/contrato.png"))); // NOI18N
        btnVerTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerTerapeutaMouseClicked(evt);
            }
        });
        jPanel1.add(btnVerTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        txtInstrucciones.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtInstrucciones.setForeground(new java.awt.Color(102, 255, 102));
        txtInstrucciones.setText("NIVEL 1");
        jPanel1.add(txtInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        txtVerNiños.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtVerNiños.setForeground(new java.awt.Color(102, 255, 102));
        txtVerNiños.setText("VER NIÑOS");
        jPanel1.add(txtVerNiños, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtVerTerapeutas.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtVerTerapeutas.setForeground(new java.awt.Color(102, 255, 102));
        txtVerTerapeutas.setText("VER TERAPEUTAS");
        jPanel1.add(txtVerTerapeutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        btnIntrucciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/IntruccionesBtn.png"))); // NOI18N
        btnIntrucciones1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntrucciones1MouseClicked(evt);
            }
        });
        jPanel1.add(btnIntrucciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        txtInstrucciones1.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtInstrucciones1.setForeground(new java.awt.Color(102, 255, 102));
        txtInstrucciones1.setText("NIVEL 2");
        jPanel1.add(txtInstrucciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        btnIntrucciones2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/IntruccionesBtn.png"))); // NOI18N
        btnIntrucciones2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntrucciones2MouseClicked(evt);
            }
        });
        jPanel1.add(btnIntrucciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        txtInstrucciones2.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtInstrucciones2.setForeground(new java.awt.Color(102, 255, 102));
        txtInstrucciones2.setText("NIVEL 3");
        jPanel1.add(txtInstrucciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 720));

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -10, -1, -1));

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoLogin.jpg"))); // NOI18N
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntruccionesMouseClicked

        nivelInstruccion = 1;
        LoginNiños instruc = new LoginNiños();
        instruc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIntruccionesMouseClicked

    private void btnVerNinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerNinosMouseClicked
        VerNiños verNinino = new VerNiños();
        verNinino.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVerNinosMouseClicked

    private void btnVerTerapeutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerTerapeutaMouseClicked
        VerTerapeutas verTerapeuta = new VerTerapeutas();
        verTerapeuta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVerTerapeutaMouseClicked

    private void btnIntrucciones1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntrucciones1MouseClicked
        nivelInstruccion = 2;
        LoginNiños abrir = new LoginNiños();
        abrir.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnIntrucciones1MouseClicked

    private void btnIntrucciones2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntrucciones2MouseClicked
        nivelInstruccion = 3;
        LoginNiños abrir = new LoginNiños();
        abrir.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIntrucciones2MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelLogo1;
    private javax.swing.JLabel LabelLogo2;
    private javax.swing.JLabel btnIntrucciones;
    private javax.swing.JLabel btnIntrucciones1;
    private javax.swing.JLabel btnIntrucciones2;
    private javax.swing.JLabel btnVerNinos;
    private javax.swing.JLabel btnVerTerapeuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtInstrucciones;
    private javax.swing.JLabel txtInstrucciones1;
    private javax.swing.JLabel txtInstrucciones2;
    private javax.swing.JLabel txtVerNiños;
    private javax.swing.JLabel txtVerTerapeutas;
    // End of variables declaration//GEN-END:variables
}
