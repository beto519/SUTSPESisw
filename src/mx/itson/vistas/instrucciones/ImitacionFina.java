/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas.instrucciones;

/**
 *
 * @author lopez
 */
public class ImitacionFina extends javax.swing.JFrame {

    /**
     * Creates new form ImitacionFina
     */
    public ImitacionFina() {
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

        LabelLogo2 = new javax.swing.JLabel();
        LabelLogo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        procedimiento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        procedimiento1 = new javax.swing.JLabel();
        Elaboro = new javax.swing.JLabel();
        MtroManuel1 = new javax.swing.JLabel();
        NombreDelPrograma = new javax.swing.JLabel();
        ReconocimientoCorporal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 60, -1, -1));

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1.- Soplar.\n2.- Sacar la lengua.\n3.- Abrir y cerrar la boca.\n4.- Peinarse.\n5.- Mover los hombros.\n6.- Cerrar los ojos.\n7.- Cepillarse los dientes.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 1010, 210));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 1010, 30));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("PASO 1. Colóquese frente al niño. Seleccione una lista de comportamientos a imitar.\n\nPASO 2. Llame por su nombre al niño y de la instrucción “Haz esto”. Inmediatamente que da la instrucción haga\nun movimiento fino.\n\nPASO 3. Si el niño realiza la respuesta imitando al terapeuta dé un reforzador.\n\nPASO 4. Si no da la respuesta correcta, vuelva a dar la instrucción, luego inmediatamente ofrezca apoyo físico.\n\nPASO 5. Disminuya gradualmente el apoyo físico hasta alcanzar el criterio.\n\nPASO 6. Cada instrucción se repite 10 veces. Entre instrucciones debe haber por lo menos 10 segundos de\nseparación.\n");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 1010, 390));

        procedimiento1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento1.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento1.setToolTipText("");
        procedimiento1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 1010, 30));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setText("Mtro. Manuel Esquer Sumuano");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 560, 40));

        MtroManuel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MtroManuel1.setText(" Elaboró:"); // NOI18N
        MtroManuel1.setToolTipText("");
        MtroManuel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 450, 40));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 450, 40));

        ReconocimientoCorporal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal.setText("Imitación fina");
        ReconocimientoCorporal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 560, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Programa ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 190, 60));

        txtFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 110, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAzul.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1280, 960));

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
            java.util.logging.Logger.getLogger(ImitacionFina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImitacionFina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImitacionFina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImitacionFina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImitacionFina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Elaboro;
    private javax.swing.JLabel LabelLogo1;
    private javax.swing.JLabel LabelLogo2;
    private javax.swing.JLabel MtroManuel1;
    private javax.swing.JLabel NombreDelPrograma;
    private javax.swing.JLabel ReconocimientoCorporal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JLabel procedimiento1;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
