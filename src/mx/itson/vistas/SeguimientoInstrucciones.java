/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas;

/**
 *
 * @author vinko
 */
public class SeguimientoInstrucciones extends javax.swing.JFrame {

    /**
     * Creates new form SeguimientoInstrucciones
     */
    public SeguimientoInstrucciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mei = new javax.swing.JLabel();
        SeguimientoDeInstrucciones = new javax.swing.JLabel();
        NombreDelPrograma = new javax.swing.JLabel();
        FechaNumElab = new javax.swing.JLabel();
        FechaElab = new javax.swing.JLabel();
        FechaNumRetro = new javax.swing.JLabel();
        FechaRetro = new javax.swing.JLabel();
        MtroManuel = new javax.swing.JLabel();
        Elaboro = new javax.swing.JLabel();
        procedimiento = new javax.swing.JLabel();
        Programa = new javax.swing.JLabel();
        Procedimiento = new javax.swing.JScrollPane();
        txtProcedimiento = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Instrucciones = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/Mei.png"))); // NOI18N
        getContentPane().add(Mei, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        SeguimientoDeInstrucciones.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SeguimientoDeInstrucciones.setForeground(new java.awt.Color(0, 0, 0));
        SeguimientoDeInstrucciones.setText("Seguimiento de instrucciones");
        SeguimientoDeInstrucciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(SeguimientoDeInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 480, 40));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setForeground(new java.awt.Color(0, 0, 0));
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 350, 40));

        FechaNumElab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaNumElab.setForeground(new java.awt.Color(0, 0, 0));
        FechaNumElab.setText("  7-05-2017");
        FechaNumElab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaNumElab, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 480, 40));

        FechaElab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaElab.setForeground(new java.awt.Color(0, 0, 0));
        FechaElab.setText(" Fecha de Elaboración:");
        FechaElab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaElab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 350, 40));

        FechaNumRetro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaNumRetro.setForeground(new java.awt.Color(0, 0, 0));
        FechaNumRetro.setText("  7-06-2017");
        FechaNumRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaNumRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 480, 40));

        FechaRetro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaRetro.setForeground(new java.awt.Color(0, 0, 0));
        FechaRetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FechaRetro.setText("Fecha de Retroalimentación:"); // NOI18N
        FechaRetro.setToolTipText("");
        FechaRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 350, 40));

        MtroManuel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel.setForeground(new java.awt.Color(0, 0, 0));
        MtroManuel.setText("  Mtro. Manuel Esquer Sumuano  ");
        MtroManuel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 480, 40));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setForeground(new java.awt.Color(0, 0, 0));
        Elaboro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Elaboro.setText(" Elaboró:"); // NOI18N
        Elaboro.setToolTipText("");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 350, 40));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setForeground(new java.awt.Color(0, 0, 0));
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 830, 30));

        Programa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Programa.setForeground(new java.awt.Color(0, 0, 0));
        Programa.setText("Programa");
        getContentPane().add(Programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        txtProcedimiento.setEditable(false);
        txtProcedimiento.setColumns(20);
        txtProcedimiento.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        txtProcedimiento.setRows(5);
        txtProcedimiento.setText("PASO 1. Seleccione la lista de instrucciones.\nPASO 2. Dé la instrucción en 3 ocasiones cada una de las instrucciones de la lista.\nPASO 3. De un reforzador por cada respuesta correcta.\nPASO 4. Si el niño no realiza las instrucciones dé apoyo.\nPASO 5. El apoyo consiste en ayudar físicamente al niño para que haga las instrucciones, por ejemplo, \n“tirar la basura”, se toma al niño de sus manos para que tome el objeto que va a tirar, luego se le conduce al \nbote de basura y después se le abre la mano para que tire la basura.\nPASO 6. Disminuya gradualmente los apoyos hasta cumplir el criterio.\n\n");
        Procedimiento.setViewportView(txtProcedimiento);

        getContentPane().add(Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 830, 210));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cel: 44 22 64 55 32 ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, 690, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Puente de Alvarado 305, Col. Carretas. Querétaro, Querétaro. ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, -1, -1));

        Btn_Instrucciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_Instrucciones.setText("Ver Instrucciones");
        Btn_Instrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Instrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_InstruccionesMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 200, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoRosa.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_InstruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_InstruccionesMouseClicked
        InstruccSeguimientoInstrucciones instrucciones = new InstruccSeguimientoInstrucciones();
        instrucciones.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_InstruccionesMouseClicked

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
            java.util.logging.Logger.getLogger(SeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeguimientoInstrucciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Instrucciones;
    private javax.swing.JLabel Elaboro;
    private javax.swing.JLabel FechaElab;
    private javax.swing.JLabel FechaNumElab;
    private javax.swing.JLabel FechaNumRetro;
    private javax.swing.JLabel FechaRetro;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Mei;
    private javax.swing.JLabel MtroManuel;
    private javax.swing.JLabel NombreDelPrograma;
    private javax.swing.JScrollPane Procedimiento;
    private javax.swing.JLabel Programa;
    private javax.swing.JLabel SeguimientoDeInstrucciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JTextArea txtProcedimiento;
    // End of variables declaration//GEN-END:variables
}
