/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas.instrucciones;

import javax.swing.JOptionPane;
import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.Instrucciones2;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author vinko
 */
public class ReconocimientoColores extends javax.swing.JFrame {
    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    /**
     * Creates new form ReconocimientoColores
     */
    public ReconocimientoColores() {
        initComponents();
                 setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
         niño();
         VerificarNivelNiño();
    }

    private void VerificarNivelNiño(){
    Alumno alu = Alumno.obtenerPorId(ln.claveNiño);
    int NivelNiño = Integer.parseInt(alu.getNivel());
    if(NivelNiño == 3){
       this.btnCasiLogra.setVisible(false);
       this.btnCumplioObjetivo.setVisible(false);
       this.btnRequiereApoyo.setVisible(false);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelLogo1 = new javax.swing.JLabel();
        LabelLogo2 = new javax.swing.JLabel();
        MtroManuel = new javax.swing.JLabel();
        Elaboro = new javax.swing.JLabel();
        NombreDelPrograma = new javax.swing.JLabel();
        Programa = new javax.swing.JLabel();
        procedimiento = new javax.swing.JLabel();
        Procedimiento = new javax.swing.JScrollPane();
        txtProcedimiento = new javax.swing.JTextArea();
        ReconocimientoDeColores = new javax.swing.JLabel();
        btnRequiereApoyo = new javax.swing.JButton();
        btnCasiLogra = new javax.swing.JButton();
        btnCumplioObjetivo = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        TxtFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        LabelLogo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelLogo1MouseClicked(evt);
            }
        });
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, -1));

        MtroManuel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel.setText("  Mtro. Manuel Esquer Sumuano  ");
        MtroManuel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 630, 40));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Elaboro.setText(" Elaboró:"); // NOI18N
        Elaboro.setToolTipText("");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 510, 40));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 510, 40));

        Programa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Programa.setText("Programa");
        getContentPane().add(Programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 1140, 30));

        txtProcedimiento.setEditable(false);
        txtProcedimiento.setColumns(20);
        txtProcedimiento.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        txtProcedimiento.setRows(5);
        txtProcedimiento.setText("PASO 1. Realice círculos de distintos colores (Rojo, amarillo, verde, blanco, negro, azul, morado, gris)\nPASO 2. Siente al niño frente a usted, en una mesa de trabajo.\nPASO 3. De un lado coloque un círculo de color (por ejemplo el rojo).\nPASO 4. Del otro lado coloque un círculo de color rojo y otros dos diferentes.\nPASO 5. Llame al niño por su nombre, señale círculo rojo (mostrándoselo al niño) y diga: “es rojo”, \nhaga énfasis en la palabra rojo. \nPASO 6. Luego pregunte, al mismo tiempo que señala los otros círculos ¿Cuál de estos es rojo?\nPASO 7. El niño debe señalar el círculo de color rojo.\nPASO 8. Refuerce las respuestas correctas.\nPASO 9. Si no hay respuesta correcta dé apoyo físico, y refuerce.\nPASO 10. Repita el procedimiento con cada uno de los colores.\n");
        Procedimiento.setViewportView(txtProcedimiento);

        getContentPane().add(Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 1140, 280));

        ReconocimientoDeColores.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoDeColores.setText("Reconocimiento de colores  ");
        ReconocimientoDeColores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoDeColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 630, 40));

        btnRequiereApoyo.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo.setBorderPainted(false);
        btnRequiereApoyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 100, 40));

        btnCasiLogra.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra.setBorderPainted(false);
        btnCasiLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLograActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 100, 40));

        btnCumplioObjetivo.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo.setBorderPainted(false);
        btnCumplioObjetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, 100, 40));

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 500, 40));

        TxtFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoRosa.jpg"))); // NOI18N
        getContentPane().add(TxtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequiereApoyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyoActionPerformed
        int Respuesta = JOptionPane.showConfirmDialog(this, "Seguro que quieres reiniciar el progreso de esta tarea?","Confirmar?",
        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(Respuesta == JOptionPane.YES_OPTION){
        estadoPorcentaje = 57.14285712;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        CargarBarra();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequiereApoyoActionPerformed

    private void btnCasiLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLograActionPerformed
       if(estadoPorcentaje == 57.14285712){
        estadoPorcentaje = 59.5238095;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        CargarBarra();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasiLograActionPerformed

    private void btnCumplioObjetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivoActionPerformed
        if(estadoPorcentaje < 61.90476188){
        estadoPorcentaje = 61.90476188;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        CargarBarra();
        }
    }//GEN-LAST:event_btnCumplioObjetivoActionPerformed

    private void LabelLogo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelLogo1MouseClicked
Instrucciones2 abrir = new Instrucciones2();
abrir.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_LabelLogo1MouseClicked

    private void niño() {
        Alumno alu = Alumno.obtenerPorId(ln.claveNiño);
        porcentajeActual = alu.getPorcentaje();
        estadoPorcentaje = porcentajeActual;
        CargarBarra();
    }
    
    private void CargarBarra() {
        jProgressBar1.setValue((int) estadoPorcentaje);

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
            java.util.logging.Logger.getLogger(ReconocimientoColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReconocimientoColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReconocimientoColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReconocimientoColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReconocimientoColores().setVisible(true);
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
    private javax.swing.JLabel ReconocimientoDeColores;
    private javax.swing.JLabel TxtFondo;
    private javax.swing.JButton btnCasiLogra;
    private javax.swing.JButton btnCumplioObjetivo;
    private javax.swing.JButton btnRequiereApoyo;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JTextArea txtProcedimiento;
    // End of variables declaration//GEN-END:variables
}
