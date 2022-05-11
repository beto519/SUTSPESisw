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
public class InstruccSeguimientoInstrucciones extends javax.swing.JFrame {
    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    public static int barrita;
    /**
     * Creates new form InstruccSeguimientoInstrucciones
     */
    public InstruccSeguimientoInstrucciones() {
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
        Instrucciones_29 = new javax.swing.JLabel();
        Instrucciones_30 = new javax.swing.JLabel();
        Instrucciones_31 = new javax.swing.JLabel();
        Instrucciones_32 = new javax.swing.JLabel();
        Instrucciones_33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        Instrucciones_1.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_1.setText("1. Ponte de pie.");
        getContentPane().add(Instrucciones_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        Instrucciones_2.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_2.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_2.setText("2. Ven.");
        getContentPane().add(Instrucciones_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        Instrucciones_3.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_3.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_3.setText("3. Toca el piso con las manos.");
        getContentPane().add(Instrucciones_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        Instrucciones_4.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_4.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_4.setText("4. Levanta los brazos.");
        getContentPane().add(Instrucciones_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        Instrucciones_5.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_5.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_5.setText("5. Baja los brazos.");
        getContentPane().add(Instrucciones_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Instrucciones_6.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_6.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_6.setText("6. Aplaude.");
        getContentPane().add(Instrucciones_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        Instrucciones_7.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_7.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_7.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_7.setText("7. Cruza los brazos.");
        getContentPane().add(Instrucciones_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        Instrucciones_8.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_8.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_8.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_8.setText("8. Toma esto (cualquier objeto).");
        getContentPane().add(Instrucciones_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        Instrucciones_9.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_9.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_9.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_9.setText("9. Ponlo debajo de la silla.");
        getContentPane().add(Instrucciones_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        Instrucciones_10.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_10.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_10.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_10.setText("10. Dame eso.");
        getContentPane().add(Instrucciones_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        Instrucciones_11.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_11.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_11.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_11.setText("11. Abre la puerta.");
        getContentPane().add(Instrucciones_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        Instrucciones_12.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_12.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_12.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_12.setText("12. Cierra la puerta.");
        getContentPane().add(Instrucciones_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        Instrucciones_13.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_13.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_13.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_13.setText("15. Cierra el libro.");
        getContentPane().add(Instrucciones_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        Instrucciones_14.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_14.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_14.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_14.setText("14. Abre el libro.");
        getContentPane().add(Instrucciones_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        Instrucciones_15.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_15.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_15.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_15.setText("16. Dame tu mano.");
        getContentPane().add(Instrucciones_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        Instrucciones_16.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_16.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_16.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_16.setText("17. Toma el dulce.");
        getContentPane().add(Instrucciones_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        Instrucciones_17.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_17.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_17.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_17.setText("18. Levántate.");
        getContentPane().add(Instrucciones_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        Instrucciones_18.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_18.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_18.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_18.setText("19. Vete para allá.");
        getContentPane().add(Instrucciones_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        Instrucciones_19.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_19.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_19.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_19.setText("20. Pon tus manos en el escritorio.");
        getContentPane().add(Instrucciones_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        Instrucciones_20.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_20.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_20.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_20.setText("21. Pon las manos sobre la cabeza.");
        getContentPane().add(Instrucciones_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        Instrucciones_21.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_21.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_21.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_21.setText("22. Tócate las rodillas con las manos.");
        getContentPane().add(Instrucciones_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        Instrucciones_22.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_22.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_22.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_22.setText("23. Abre y cierra las manos.");
        getContentPane().add(Instrucciones_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        Instrucciones_23.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_23.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_23.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_23.setText("24. Junta tus dedos.");
        getContentPane().add(Instrucciones_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        Instrucciones_24.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_24.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_24.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_24.setText("25. Ponlo sobre la silla.");
        getContentPane().add(Instrucciones_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        Instrucciones_25.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_25.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_25.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_25.setText("30. Cierra la caja.");
        getContentPane().add(Instrucciones_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        Instrucciones_26.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_26.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_26.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_26.setText("29. Abre la caja.");
        getContentPane().add(Instrucciones_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        Instrucciones_27.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_27.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_27.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_27.setText("31. Dame el cuaderno.");
        getContentPane().add(Instrucciones_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        Instrucciones_28.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_28.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_28.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_28.setText("33. Dame las manos.");
        getContentPane().add(Instrucciones_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, -1, -1));

        Instrucciones_29.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_29.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_29.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_29.setText("32. Saca la lengua.");
        getContentPane().add(Instrucciones_29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, -1));

        Instrucciones_30.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_30.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_30.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_30.setText("28. Agáchate.");
        getContentPane().add(Instrucciones_30, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        Instrucciones_31.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_31.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_31.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_31.setText("13. Recoge eso. ");
        getContentPane().add(Instrucciones_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 170, -1));

        Instrucciones_32.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_32.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_32.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_32.setText("27. Cierra el frasco.");
        getContentPane().add(Instrucciones_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        Instrucciones_33.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_33.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_33.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_33.setText("26. Abre el frasco.");
        getContentPane().add(Instrucciones_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("en el suelo)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("(algo que esté ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoRosa.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        SeguimientoInstrucciones corporal = new SeguimientoInstrucciones();
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
            java.util.logging.Logger.getLogger(InstruccSeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstruccSeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstruccSeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstruccSeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstruccSeguimientoInstrucciones().setVisible(true);
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
    private javax.swing.JLabel Instrucciones_29;
    private javax.swing.JLabel Instrucciones_3;
    private javax.swing.JLabel Instrucciones_30;
    private javax.swing.JLabel Instrucciones_31;
    private javax.swing.JLabel Instrucciones_32;
    private javax.swing.JLabel Instrucciones_33;
    private javax.swing.JLabel Instrucciones_4;
    private javax.swing.JLabel Instrucciones_5;
    private javax.swing.JLabel Instrucciones_6;
    private javax.swing.JLabel Instrucciones_7;
    private javax.swing.JLabel Instrucciones_8;
    private javax.swing.JLabel Instrucciones_9;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
