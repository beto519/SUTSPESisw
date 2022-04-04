/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas.instrucciones;

/**
 *
 * @author lopez
 */
public class EmparejamientoObjetos extends javax.swing.JFrame {

    /**
     * Creates new form EmparejamientoObjetos
     */
    public EmparejamientoObjetos() {
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

        FechaElab1 = new javax.swing.JLabel();
        Elaboro1 = new javax.swing.JLabel();
        NombreDelPrograma1 = new javax.swing.JLabel();
        ReconocimientoCorporal1 = new javax.swing.JLabel();
        procedimiento2 = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JTextField();
        MtroManuel2 = new javax.swing.JLabel();
        Mei1 = new javax.swing.JLabel();
        FechaNumRetro1 = new javax.swing.JLabel();
        FechaRetro1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        FechaNumElab1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaElab1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaElab1.setText(" Fecha de Elaboración:");
        FechaElab1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaElab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 450, 30));

        Elaboro1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro1.setText("Mtro. Manuel Esquer Sumuano");
        Elaboro1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 560, 40));

        NombreDelPrograma1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma1.setText(" Nombre del Programa:");
        NombreDelPrograma1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 450, 40));

        ReconocimientoCorporal1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal1.setText("Emparejamiento de Objetos");
        ReconocimientoCorporal1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 560, 40));

        procedimiento2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento2.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento2.setToolTipText("");
        procedimiento2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1010, 30));

        txtFecha1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFecha1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecha1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 90, 40));

        MtroManuel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MtroManuel2.setText(" Elaboró:"); // NOI18N
        MtroManuel2.setToolTipText("");
        MtroManuel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 450, 40));

        Mei1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/Mei.png"))); // NOI18N
        getContentPane().add(Mei1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        FechaNumRetro1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaNumRetro1.setText("15-02-2016");
        FechaNumRetro1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaNumRetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 560, -1));

        FechaRetro1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaRetro1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FechaRetro1.setText("Fecha de  Retroalimentación:"); // NOI18N
        FechaRetro1.setToolTipText("");
        FechaRetro1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaRetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 450, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Objetos comunes para hacer el ejercicio:\nCuchara.\nVaso.\nPlato.\nZapatos.\nCalcetines.\nFrutas.\n");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1010, 190));

        FechaNumElab1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaNumElab1.setText("18-01-2016");
        FechaNumElab1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaNumElab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 560, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("Programa ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 190, 60));

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("PASO 1. Seleccione objetos comunes. El criterio de selección de objetos es que deben tener 2 iguales, por ejemplo, dos naranjas.\nPASO 2. Siéntese frente al niño en una mesa de trabajo.\nPASO 3. Coloque sobre la mesa  dos objetos distintos (por ejemplo, una naranja y un zapato). Los objetos deben estar separados entre sí por una distancia de aproximadamente 40 centímetros.\nPASO 4. Llame al niño por su nombre y diga “Junta las cosas iguales” al mismo tiempo que muestra el objeto y se lo entrega en la mano, siempre cuidando que ponga atención al objeto que entregamos.\nPASO 5. La respuesta correcta del niño es la de juntar los objetos iguales. Si no da la respuesta correcta dé apoyo tomando la mano del niño y dirigiendo su mano hacia el objeto igual, apóyelo para que suelte el objeto.\nPASO 6. Disminuya gradualmente el apoyo hasta cumplir el criterio.\nPASO 7. Refuerce cada respuesta correcta, sin importar si lo hizo o no con apoyo.\n");
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1010, 200));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAzul.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFecha1ActionPerformed

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
            java.util.logging.Logger.getLogger(EmparejamientoObjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmparejamientoObjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmparejamientoObjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmparejamientoObjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmparejamientoObjetos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Elaboro1;
    private javax.swing.JLabel FechaElab1;
    private javax.swing.JLabel FechaNumElab1;
    private javax.swing.JLabel FechaNumRetro1;
    private javax.swing.JLabel FechaRetro1;
    private javax.swing.JLabel Mei1;
    private javax.swing.JLabel MtroManuel2;
    private javax.swing.JLabel NombreDelPrograma1;
    private javax.swing.JLabel ReconocimientoCorporal1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel procedimiento2;
    private javax.swing.JTextField txtFecha1;
    // End of variables declaration//GEN-END:variables
}