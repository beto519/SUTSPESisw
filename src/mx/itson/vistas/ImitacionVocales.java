/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas;

/**
 *
 * @author lopez
 */
public class ImitacionVocales extends javax.swing.JFrame {

    /**
     * Creates new form ImitacionVocales
     */
    public ImitacionVocales() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        procedimiento1 = new javax.swing.JLabel();
        Elaboro = new javax.swing.JLabel();
        MtroManuel1 = new javax.swing.JLabel();
        FechaRetro = new javax.swing.JLabel();
        FechaNumRetro = new javax.swing.JLabel();
        FechaNumElab = new javax.swing.JLabel();
        FechaElab = new javax.swing.JLabel();
        NombreDelPrograma = new javax.swing.JLabel();
        ReconocimientoCorporal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Mei = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("PASO 1. Colóquese sentado frente al niño. \nPASO 2. Llame al niño por su nombre y de la instrucción: “di A”.\nPASO 3. Si el niño responde A, refuerce inmediatamente.\nPASO 4. Si el niño no responde correctamente, de apoyo físico modelando el sonido de la vocal en su boca.\nPASO 5. Repita el procedimiento con cada una de las vocales.\nPASO 6. Disminuya el apoyo gradualmente hasta cumplir el criterio.\n");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1010, 180));

        procedimiento1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento1.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento1.setToolTipText("");
        procedimiento1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1010, 30));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setText("Mtro. Manuel Esquer Sumuano");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 560, 40));

        MtroManuel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MtroManuel1.setText(" Elaboró:"); // NOI18N
        MtroManuel1.setToolTipText("");
        MtroManuel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 450, 40));

        FechaRetro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaRetro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FechaRetro.setText("Fecha de  Retroalimentación:"); // NOI18N
        FechaRetro.setToolTipText("");
        FechaRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 450, -1));

        FechaNumRetro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaNumRetro.setText("15-02-2016");
        FechaNumRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaNumRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 560, -1));

        FechaNumElab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaNumElab.setText("18-01-2016");
        FechaNumElab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaNumElab, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 560, 30));

        FechaElab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaElab.setText(" Fecha de Elaboración:");
        FechaElab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaElab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 450, 30));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 450, 40));

        ReconocimientoCorporal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal.setText("Imitacion de vocales");
        ReconocimientoCorporal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 560, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Programa ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 190, 60));

        Mei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/Mei.png"))); // NOI18N
        getContentPane().add(Mei, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 90, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAzul.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1010, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

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
            java.util.logging.Logger.getLogger(ImitacionVocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImitacionVocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImitacionVocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImitacionVocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImitacionVocales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Elaboro;
    private javax.swing.JLabel FechaElab;
    private javax.swing.JLabel FechaNumElab;
    private javax.swing.JLabel FechaNumRetro;
    private javax.swing.JLabel FechaRetro;
    private javax.swing.JLabel Mei;
    private javax.swing.JLabel MtroManuel1;
    private javax.swing.JLabel NombreDelPrograma;
    private javax.swing.JLabel ReconocimientoCorporal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel procedimiento1;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
