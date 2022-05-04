/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas.instrucciones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author lopez
 */
public class AdiosConMano extends javax.swing.JFrame {
    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    
private int  estadoPorcentaje;
    /**
     * Creates new form AdiosConMano
     */
    public AdiosConMano() {
        initComponents();
        setLocationRelativeTo(null);

   this.setExtendedState(MAXIMIZED_BOTH);

    }
private void CargarBarra(){
jProgressBar1.setValue(estadoPorcentaje);

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
        Elaboro1 = new javax.swing.JLabel();
        ReconocimientoCorporal1 = new javax.swing.JLabel();
        procedimiento2 = new javax.swing.JLabel();
        NombreDelPrograma1 = new javax.swing.JLabel();
        MtroManuel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        btnRequiereApoyo = new javax.swing.JButton();
        btnCumplioObjetivo = new javax.swing.JButton();
        btnCasiLogra = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Elaboro1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro1.setText("Mtro. Manuel Esquer Sumuano");
        Elaboro1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 560, 40));

        ReconocimientoCorporal1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal1.setText("Enseñar a decir adiós con la mano");
        ReconocimientoCorporal1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 560, 40));

        procedimiento2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento2.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento2.setToolTipText("");
        procedimiento2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 1010, 30));

        NombreDelPrograma1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma1.setText(" Nombre del Programa:");
        NombreDelPrograma1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 450, 40));

        MtroManuel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MtroManuel2.setText(" Elaboró:"); // NOI18N
        MtroManuel2.setToolTipText("");
        MtroManuel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 450, 40));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("PASO 1. Cuando vaya a despedirse de las personas.\n\nPASO 2. Llámelo por su nombre y dé la instrucción: “di adiós”.\n\nPASO 3. La respuesta correcta es mover la mano diciendo adiós.\n\nPASO 4. Si da la respuesta correcta refuerce.\n\nPASO 5. Si no se da la respuesta correcta ofrezca apoyo físico.\n\nPASO 6. Disminuya el apoyo gradualmente hasta cumplir el criterio.");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 1010, 340));

        btnRequiereApoyo.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo.setBorderPainted(false);
        btnRequiereApoyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 100, 40));

        btnCumplioObjetivo.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo.setBorderPainted(false);
        btnCumplioObjetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 610, 100, 40));

        btnCasiLogra.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra.setBorderPainted(false);
        btnCasiLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLograActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 100, 40));

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 500, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("Programa ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 190, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAzul.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel6.setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void obtenerNiño(){
Alumno.editar();



}
    private void btnCasiLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLograActionPerformed
estadoPorcentaje = 50;    
CargarBarra();
// TODO add your handling code here:
    }//GEN-LAST:event_btnCasiLograActionPerformed

    private void btnRequiereApoyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyoActionPerformed
estadoPorcentaje = 0;
CargarBarra();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequiereApoyoActionPerformed

    private void btnCumplioObjetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivoActionPerformed
estadoPorcentaje = 100;  
CargarBarra();// TODO add your handling code here:
    }//GEN-LAST:event_btnCumplioObjetivoActionPerformed

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
            java.util.logging.Logger.getLogger(AdiosConMano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdiosConMano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdiosConMano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdiosConMano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdiosConMano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Elaboro1;
    private javax.swing.JLabel LabelLogo1;
    private javax.swing.JLabel LabelLogo2;
    private javax.swing.JLabel MtroManuel2;
    private javax.swing.JLabel NombreDelPrograma1;
    private javax.swing.JLabel ReconocimientoCorporal1;
    private javax.swing.JButton btnCasiLogra;
    private javax.swing.JButton btnCumplioObjetivo;
    private javax.swing.JButton btnRequiereApoyo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel procedimiento2;
    // End of variables declaration//GEN-END:variables
}
