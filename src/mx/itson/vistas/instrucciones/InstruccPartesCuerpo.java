/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.vistas.instrucciones;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author jotha
 */
public class InstruccPartesCuerpo extends javax.swing.JFrame {

    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    public static int barrita;
    
    public InstruccPartesCuerpo() {
        initComponents();
      //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
         this.setExtendedState(MAXIMIZED_BOTH);
                 setLocationRelativeTo(null);
       //  this.setExtendedState(MAXIMIZED_BOTH);
         niño();
    }
    

    private void niño() {
        Alumno alu = Alumno.obtenerPorId(ln.claveNiño);
        porcentajeActual = alu.getPorcentaje();
        estadoPorcentaje = porcentajeActual;
    }

    private void PorcentajeNiño() {

        try {
            alum.setPorcentaje(estadoPorcentaje);
            alum.setIdAlumno(ln.claveNiño);
            Alumno.editar(alum);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        Instrucciones_1 = new javax.swing.JLabel();
        Instrucciones_2 = new javax.swing.JLabel();
        Instrucciones_3 = new javax.swing.JLabel();
        Instrucciones_4 = new javax.swing.JLabel();
        Instrucciones_5 = new javax.swing.JLabel();
        Instrucciones_6 = new javax.swing.JLabel();
        Instrucciones_7 = new javax.swing.JLabel();
        Instrucciones_8 = new javax.swing.JLabel();
        Instrucciones_9 = new javax.swing.JLabel();
        Instrucciones_10 = new javax.swing.JLabel();
        Instrucciones_11 = new javax.swing.JLabel();
        Instrucciones_12 = new javax.swing.JLabel();
        Instrucciones_13 = new javax.swing.JLabel();
        Instrucciones_14 = new javax.swing.JLabel();
        Instrucciones_15 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
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
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 100, 40));

        Instrucciones_1.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_1.setText("1. Tócate la cabeza.");
        getContentPane().add(Instrucciones_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 62, -1, 40));

        Instrucciones_2.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_2.setText("2. Tócate las orejas.");
        getContentPane().add(Instrucciones_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        Instrucciones_3.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_3.setText("3. Tócate los cachetes.");
        getContentPane().add(Instrucciones_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        Instrucciones_4.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_4.setText("4. Tócate la nariz.");
        getContentPane().add(Instrucciones_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        Instrucciones_5.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_5.setText("5. Tócate los ojos.");
        getContentPane().add(Instrucciones_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        Instrucciones_6.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_6.setText("6. Tócate la boca.");
        getContentPane().add(Instrucciones_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        Instrucciones_7.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_7.setText("7. Tócate el cabello.");
        getContentPane().add(Instrucciones_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        Instrucciones_8.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_8.setText("8. Tócate el cuello.");
        getContentPane().add(Instrucciones_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        Instrucciones_9.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_9.setText("9. Tócate los hombros.");
        getContentPane().add(Instrucciones_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        Instrucciones_10.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_10.setText("10. Tócate los brazos.");
        getContentPane().add(Instrucciones_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        Instrucciones_11.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_11.setText("11. Tócate el pecho.");
        getContentPane().add(Instrucciones_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));

        Instrucciones_12.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_12.setText("12. Tócate la panza.");
        getContentPane().add(Instrucciones_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        Instrucciones_13.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_13.setText("13. Tócate las rodillas.");
        getContentPane().add(Instrucciones_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));

        Instrucciones_14.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_14.setText("14. Tócate los pies.");
        getContentPane().add(Instrucciones_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, -1, -1));

        Instrucciones_15.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_15.setText("15. Tócate las manos.");
        getContentPane().add(Instrucciones_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAmarillo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        ReconocimientoCorporal corporal = new ReconocimientoCorporal();
        corporal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

  
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
            java.util.logging.Logger.getLogger(InstruccPartesCuerpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstruccPartesCuerpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstruccPartesCuerpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstruccPartesCuerpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstruccPartesCuerpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Instrucciones_1;
    private javax.swing.JLabel Instrucciones_10;
    private javax.swing.JLabel Instrucciones_11;
    private javax.swing.JLabel Instrucciones_12;
    private javax.swing.JLabel Instrucciones_13;
    private javax.swing.JLabel Instrucciones_14;
    private javax.swing.JLabel Instrucciones_15;
    private javax.swing.JLabel Instrucciones_2;
    private javax.swing.JLabel Instrucciones_3;
    private javax.swing.JLabel Instrucciones_4;
    private javax.swing.JLabel Instrucciones_5;
    private javax.swing.JLabel Instrucciones_6;
    private javax.swing.JLabel Instrucciones_7;
    private javax.swing.JLabel Instrucciones_8;
    private javax.swing.JLabel Instrucciones_9;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables
}
