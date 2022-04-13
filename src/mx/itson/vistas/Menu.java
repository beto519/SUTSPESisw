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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAgregarTerapeuta = new javax.swing.JLabel();
        btnEditarTerapeuta = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JLabel();
        btnIntrucciones = new javax.swing.JLabel();
        btnVerNinos = new javax.swing.JLabel();
        btnVerTerapeuta = new javax.swing.JLabel();
        txtIniciarSesion = new javax.swing.JLabel();
        txtAgregarTerapeuta = new javax.swing.JLabel();
        txtEditarTerapeuta = new javax.swing.JLabel();
        txtInstrucciones = new javax.swing.JLabel();
        txtVerNiños = new javax.swing.JLabel();
        txtVerTerapeutas = new javax.swing.JLabel();
        TxtTitulo = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 153));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Puente de Alvarado 305, Col. Carretas. Querétaro, Querétaro. ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 204, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cel: 44 22 64 55 32 ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 690, -1));

        jPanel1.setBackground(new java.awt.Color(155, 20, 136));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarTerapeuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/AgregarTerapeuta.png"))); // NOI18N
        btnAgregarTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarTerapeutaMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregarTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        btnEditarTerapeuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/EditarTerapeuta.png"))); // NOI18N
        btnEditarTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarTerapeutaMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditarTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/log-in_1.png"))); // NOI18N
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, 100));

        btnIntrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/IntruccionesBtn.png"))); // NOI18N
        btnIntrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntruccionesMouseClicked(evt);
            }
        });
        jPanel1.add(btnIntrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        btnVerNinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/editarNiño.png"))); // NOI18N
        btnVerNinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerNinosMouseClicked(evt);
            }
        });
        jPanel1.add(btnVerNinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        btnVerTerapeuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/contrato.png"))); // NOI18N
        btnVerTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerTerapeutaMouseClicked(evt);
            }
        });
        jPanel1.add(btnVerTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        txtIniciarSesion.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtIniciarSesion.setForeground(new java.awt.Color(102, 255, 102));
        txtIniciarSesion.setText("INICIAR SESION");
        jPanel1.add(txtIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtAgregarTerapeuta.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtAgregarTerapeuta.setForeground(new java.awt.Color(102, 255, 102));
        txtAgregarTerapeuta.setText("AGREGAR TERAPEUTAS");
        jPanel1.add(txtAgregarTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        txtEditarTerapeuta.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtEditarTerapeuta.setForeground(new java.awt.Color(102, 255, 102));
        txtEditarTerapeuta.setText("EDITAR TERAPEUTAS");
        jPanel1.add(txtEditarTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtInstrucciones.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtInstrucciones.setForeground(new java.awt.Color(102, 255, 102));
        txtInstrucciones.setText("INSTRUCCIONES");
        jPanel1.add(txtInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        txtVerNiños.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtVerNiños.setForeground(new java.awt.Color(102, 255, 102));
        txtVerNiños.setText("VER NIÑOS");
        jPanel1.add(txtVerNiños, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        txtVerTerapeutas.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        txtVerTerapeutas.setForeground(new java.awt.Color(102, 255, 102));
        txtVerTerapeutas.setText("VER TERAPEUTAS");
        jPanel1.add(txtVerTerapeutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 670));

        TxtTitulo.setFont(new java.awt.Font("Tempus Sans ITC", 3, 48)); // NOI18N
        TxtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        TxtTitulo.setText("SUTSPESISW");
        getContentPane().add(TxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 290, -1));

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoLogin.jpg"))); // NOI18N
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTerapeutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarTerapeutaMouseClicked
        AgregarTerapeuta AgreTerapeuta = new AgregarTerapeuta();
        AgreTerapeuta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarTerapeutaMouseClicked

    private void btnEditarTerapeutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarTerapeutaMouseClicked
        MostrarTerapeuta EdiTerapeuta = new MostrarTerapeuta();
        EdiTerapeuta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditarTerapeutaMouseClicked

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        IniciarSesion logIn = new IniciarSesion();
        logIn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnIntruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntruccionesMouseClicked
        Instrucciones instruc = new Instrucciones();
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
    private javax.swing.JLabel TxtTitulo;
    private javax.swing.JLabel btnAgregarTerapeuta;
    private javax.swing.JLabel btnEditarTerapeuta;
    private javax.swing.JLabel btnIniciarSesion;
    private javax.swing.JLabel btnIntrucciones;
    private javax.swing.JLabel btnVerNinos;
    private javax.swing.JLabel btnVerTerapeuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtAgregarTerapeuta;
    private javax.swing.JLabel txtEditarTerapeuta;
    private javax.swing.JLabel txtIniciarSesion;
    private javax.swing.JLabel txtInstrucciones;
    private javax.swing.JLabel txtVerNiños;
    private javax.swing.JLabel txtVerTerapeutas;
    // End of variables declaration//GEN-END:variables
}
