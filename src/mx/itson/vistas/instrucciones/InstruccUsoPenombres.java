/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas.instrucciones;

import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author vinko
 */
public class InstruccUsoPenombres extends javax.swing.JFrame {

    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    public static int barrita;
    
    public InstruccUsoPenombres() {
        initComponents();
                 setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
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
        Instrucciones_16 = new javax.swing.JLabel();
        Instrucciones_17 = new javax.swing.JLabel();
        Instrucciones_18 = new javax.swing.JLabel();
        Instrucciones_19 = new javax.swing.JLabel();
        Instrucciones_20 = new javax.swing.JLabel();
        Instrucciones_21 = new javax.swing.JLabel();
        Instrucciones_22 = new javax.swing.JLabel();
        Instrucciones_23 = new javax.swing.JLabel();
        Instrucciones_24 = new javax.swing.JLabel();
        Instrucciones_25 = new javax.swing.JLabel();
        Instrucciones_26 = new javax.swing.JLabel();
        Instrucciones_27 = new javax.swing.JLabel();
        Instrucciones_28 = new javax.swing.JLabel();
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
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, -1));

        Instrucciones_1.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_1.setText("1. ¿Cuál es tu brazo izquierdo?");
        getContentPane().add(Instrucciones_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        Instrucciones_2.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_2.setText("2. ¿Cuál es tu brazo derecho?");
        getContentPane().add(Instrucciones_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        Instrucciones_3.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_3.setText("3. ¿Cuál es tu mano izquierda?");
        getContentPane().add(Instrucciones_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        Instrucciones_4.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_4.setText("4. ¿Cuál es tu mano derecha?");
        getContentPane().add(Instrucciones_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Instrucciones_5.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_5.setText("5. ¿Cuál es tu pierna izquierda?");
        getContentPane().add(Instrucciones_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        Instrucciones_6.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_6.setText("6. ¿Cuál es tu pierna derecha?");
        getContentPane().add(Instrucciones_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        Instrucciones_7.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_7.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_7.setText("7. ¿Cuál es tu ojo izquierdo?");
        getContentPane().add(Instrucciones_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        Instrucciones_8.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_8.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_8.setText("8. ¿Cuál es tu ojo derecho?");
        getContentPane().add(Instrucciones_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        Instrucciones_9.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_9.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_9.setText("9. ¿Cuál es tu pie izquierdo?");
        getContentPane().add(Instrucciones_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        Instrucciones_10.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_10.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_10.setText("10. ¿Cuál es tu pie derecho?");
        getContentPane().add(Instrucciones_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        Instrucciones_11.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_11.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_11.setText("11. ¿Cuál es tu oreja izquierda?");
        getContentPane().add(Instrucciones_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        Instrucciones_12.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_12.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_12.setText("12. ¿Cuál es tu oreja derecha?");
        getContentPane().add(Instrucciones_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        Instrucciones_13.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_13.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_13.setText("14. ¿Dónde está (la imagen)?");
        getContentPane().add(Instrucciones_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        Instrucciones_14.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_14.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_14.setText("Coloque un auto de juguete cerca y lejos del niño, y pregunte:");
        getContentPane().add(Instrucciones_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        Instrucciones_15.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_15.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_15.setText("15. ¿Dónde está el (auto)?");
        getContentPane().add(Instrucciones_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        Instrucciones_16.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_16.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_16.setText("16. ¿Dónde está el (auto)?");
        getContentPane().add(Instrucciones_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        Instrucciones_17.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_17.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_17.setText("17. ¿Cuál es el primero? ");
        getContentPane().add(Instrucciones_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, -1));

        Instrucciones_18.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_18.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_18.setText("sucesivamente, alternativamente pregunte al niño:");
        getContentPane().add(Instrucciones_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        Instrucciones_19.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_19.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_19.setText("Coloque varios objetos de una misma clase en cadena, por ejemplo");
        getContentPane().add(Instrucciones_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        Instrucciones_20.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_20.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_20.setText("varios autos. Y pregunte alternadamente al niño:");
        getContentPane().add(Instrucciones_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, -1, -1));

        Instrucciones_21.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_21.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_21.setText("Coloque un objeto (canica) dentro de una caja y sáquelo");
        getContentPane().add(Instrucciones_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        Instrucciones_22.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_22.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_22.setText("Coloque una figura arriba, y después abajo. Alterativamente pregunte:");
        getContentPane().add(Instrucciones_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        Instrucciones_23.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_23.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_23.setText("Repita 10 veces.");
        getContentPane().add(Instrucciones_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        Instrucciones_24.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_24.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_24.setText("alternativamente pregunte:");
        getContentPane().add(Instrucciones_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        Instrucciones_25.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_25.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_25.setText("Coloque un juguete (auto) detrás de un objeto y delante de un objeto;");
        getContentPane().add(Instrucciones_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        Instrucciones_26.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_26.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_26.setText("Repita 10 veces cada uno de estos ejercicios.");
        getContentPane().add(Instrucciones_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, -1, -1));

        Instrucciones_27.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_27.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_27.setText("17.1. ¿Cuál es el último?");
        getContentPane().add(Instrucciones_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, -1));

        Instrucciones_28.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_28.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_28.setText("13. ¿Dónde está la canica?");
        getContentPane().add(Instrucciones_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoRosa.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        UsoPenombres corporal = new UsoPenombres();
        corporal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    
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
            java.util.logging.Logger.getLogger(InstruccUsoPenombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstruccUsoPenombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstruccUsoPenombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstruccUsoPenombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstruccUsoPenombres().setVisible(true);
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
    private javax.swing.JLabel Instrucciones_16;
    private javax.swing.JLabel Instrucciones_17;
    private javax.swing.JLabel Instrucciones_18;
    private javax.swing.JLabel Instrucciones_19;
    private javax.swing.JLabel Instrucciones_2;
    private javax.swing.JLabel Instrucciones_20;
    private javax.swing.JLabel Instrucciones_21;
    private javax.swing.JLabel Instrucciones_22;
    private javax.swing.JLabel Instrucciones_23;
    private javax.swing.JLabel Instrucciones_24;
    private javax.swing.JLabel Instrucciones_25;
    private javax.swing.JLabel Instrucciones_26;
    private javax.swing.JLabel Instrucciones_27;
    private javax.swing.JLabel Instrucciones_28;
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
