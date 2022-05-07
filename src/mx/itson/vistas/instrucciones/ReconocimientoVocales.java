/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas.instrucciones;

import javax.swing.JOptionPane;
import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author vinko
 */
public class ReconocimientoVocales extends javax.swing.JFrame {
    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    /**
     * Creates new form ReconocimientoVocales
     */
    public ReconocimientoVocales() {
        initComponents();
                 setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
         niño();
    }
    private void niño() {
        Alumno alu = Alumno.obtenerPorId(ln.claveNiño);
        porcentajeActual = alu.getPorcentaje();
        estadoPorcentaje = porcentajeActual;
        BarraProgreso();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelLogo2 = new javax.swing.JLabel();
        LabelLogo1 = new javax.swing.JLabel();
        MtroManuel = new javax.swing.JLabel();
        Elaboro = new javax.swing.JLabel();
        NombreDelPrograma = new javax.swing.JLabel();
        Programa = new javax.swing.JLabel();
        procedimiento = new javax.swing.JLabel();
        Procedimiento = new javax.swing.JScrollPane();
        txtProcedimiento = new javax.swing.JTextArea();
        ReconocimientoDeVocales = new javax.swing.JLabel();
        btnRequiereApoyo = new javax.swing.JButton();
        btnCasiLogra = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnCumplioObjetivo = new javax.swing.JButton();
        TxtFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, -1));

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MtroManuel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel.setText("  Mtro. Manuel Esquer Sumuano  ");
        MtroManuel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 600, 40));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Elaboro.setText(" Elaboró:"); // NOI18N
        Elaboro.setToolTipText("");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 490, 40));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 490, 40));

        Programa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Programa.setText("Programa");
        getContentPane().add(Programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 1090, 30));

        txtProcedimiento.setEditable(false);
        txtProcedimiento.setColumns(20);
        txtProcedimiento.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        txtProcedimiento.setRows(5);
        txtProcedimiento.setText("PASO 1. Realice imágenes de las vocales por pares (a,e,i,o,u)\nPASO 2. Siente al niño frente a usted, en una mesa de trabajo.\nPASO 3. De un lado coloque una imagen (por ejemplo la a).\nPASO 4. Del otro lado coloque las vocales, incluyendo la misma que está a un lado (a).\nPASO 5. Llame al niño por su nombre, señale la a (que está sola) y diga: “es la a”, haga énfasis en la \npalabra a. \nPASO 6. Luego pregunte, al mismo tiempo que señala las imágenes¿Cuál de estos es la a?\nPASO 7. El niño debe señalar la a.\nPASO 8. Refuerce las respuestas correctas.\nPASO 9. Si no hay respuesta correcta dé apoyo físico, y refuerce.\nPASO 10. Repita el procedimiento con cada una de las vocales.\n");
        Procedimiento.setViewportView(txtProcedimiento);

        getContentPane().add(Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 1090, 300));

        ReconocimientoDeVocales.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoDeVocales.setText("Reconocimiento de Vocales");
        ReconocimientoDeVocales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoDeVocales, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 600, 40));

        btnRequiereApoyo.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo.setBorderPainted(false);
        btnRequiereApoyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 100, 40));

        btnCasiLogra.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra.setBorderPainted(false);
        btnCasiLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLograActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 100, 40));

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 500, 40));

        btnCumplioObjetivo.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo.setBorderPainted(false);
        btnCumplioObjetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 590, 100, 40));

        TxtFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoRosa.jpg"))); // NOI18N
        getContentPane().add(TxtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequiereApoyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyoActionPerformed
        int Respuesta = JOptionPane.showConfirmDialog(this, "Seguro que quieres reiniciar el progreso de esta tarea?","Confirmar?",
        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(Respuesta == JOptionPane.YES_OPTION){
        estadoPorcentaje = 61.11111;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        }
    }//GEN-LAST:event_btnRequiereApoyoActionPerformed

    private void btnCasiLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLograActionPerformed
        if(estadoPorcentaje == 61.11111){
        estadoPorcentaje = 63.88889;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        }
    }//GEN-LAST:event_btnCasiLograActionPerformed

    private void btnCumplioObjetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivoActionPerformed
        if(estadoPorcentaje < 66.66667){
        estadoPorcentaje = 66.66667;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        }
    }//GEN-LAST:event_btnCumplioObjetivoActionPerformed
    
    
    public void BarraProgreso()
   {
        if(porcentajeActual == 61.11111){
          jProgressBar1.setValue(0);
        }if(porcentajeActual == 63.88889){
          jProgressBar1.setValue(50);
        }if(porcentajeActual == 66.66667){
          jProgressBar1.setValue(100);
        }
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
            java.util.logging.Logger.getLogger(ReconocimientoVocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReconocimientoVocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReconocimientoVocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReconocimientoVocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReconocimientoVocales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Elaboro;
    private javax.swing.JLabel LabelLogo1;
    private javax.swing.JLabel LabelLogo2;
    private javax.swing.JLabel MtroManuel;
    private javax.swing.JLabel NombreDelPrograma;
    private javax.swing.JScrollPane Procedimiento;
    private javax.swing.JLabel Programa;
    private javax.swing.JLabel ReconocimientoDeVocales;
    private javax.swing.JLabel TxtFondo;
    private javax.swing.JButton btnCasiLogra;
    private javax.swing.JButton btnCumplioObjetivo;
    private javax.swing.JButton btnRequiereApoyo;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JTextArea txtProcedimiento;
    // End of variables declaration//GEN-END:variables
}
