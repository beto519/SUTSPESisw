/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.vistas.instrucciones;

import javax.swing.JOptionPane;
import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.Intrucciones3;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author jotha
 */
public class ManejoEspacial extends javax.swing.JFrame {

    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    
    public ManejoEspacial() {
        initComponents();
                 setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
         niño();
         VerificarNivelNiño();
    }

     private void VerificarNivelNiño(){
    Alumno alu = Alumno.obtenerPorId(ln.claveNiño);
    int NivelNiño = Integer.parseInt(alu.getNivel());
    if(NivelNiño == 4){
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
        ReconocimientoCorporal = new javax.swing.JLabel();
        NombreDelPrograma = new javax.swing.JLabel();
        MtroManuel = new javax.swing.JLabel();
        Elaboro = new javax.swing.JLabel();
        Programa = new javax.swing.JLabel();
        procedimiento = new javax.swing.JLabel();
        Procedimiento = new javax.swing.JScrollPane();
        txtProcedimiento = new javax.swing.JTextArea();
        Btn_Instrucciones = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnRequiereApoyo = new javax.swing.JButton();
        btnCasiLogra = new javax.swing.JButton();
        btnCumplioObjetivo = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

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

        ReconocimientoCorporal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal.setText("  Manejo espacial  ");
        ReconocimientoCorporal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 480, 40));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 350, 40));

        MtroManuel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel.setText("  Mtro. Manuel Esquer Sumuano  ");
        MtroManuel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 480, 40));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Elaboro.setText(" Elaboró:"); // NOI18N
        Elaboro.setToolTipText("");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 350, 40));

        Programa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Programa.setText("Programa");
        getContentPane().add(Programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 830, 30));

        txtProcedimiento.setEditable(false);
        txtProcedimiento.setColumns(20);
        txtProcedimiento.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtProcedimiento.setRows(5);
        txtProcedimiento.setText("PASO 1. Colóquese frente al niño y dé las instrucciones de la lista.\nPASO 2. El niño debe realizar las instrucciones correctamente.\nPASO 3. Si da la respuesta correcta, refuerce.\nPASO 4. Si no da la respuesta correcta, dé apoyo físico.\nPASO 5. Disminuya gradualmente el apoyo hasta cumplir el criterio.\nPASO 6. Repita este procedimiento con cada una de las instrucciones.");
        Procedimiento.setViewportView(txtProcedimiento);

        getContentPane().add(Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 830, 180));

        Btn_Instrucciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_Instrucciones.setText("Ver Instrucciones");
        Btn_Instrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Instrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_InstruccionesMouseClicked(evt);
            }
        });
        Btn_Instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 200, 50));

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 820, 40));

        btnRequiereApoyo.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo.setBorderPainted(false);
        btnRequiereApoyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 100, 40));

        btnCasiLogra.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra.setBorderPainted(false);
        btnCasiLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLograActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 100, 40));

        btnCumplioObjetivo.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo.setBorderPainted(false);
        btnCumplioObjetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 100, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAmarillo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_InstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InstruccionesActionPerformed
InstruccManejoEspacial abrir = new  InstruccManejoEspacial();
abrir.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_InstruccionesActionPerformed

    private void Btn_InstruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_InstruccionesMouseClicked
        InstruccManejoEspacial instrucciones = new InstruccManejoEspacial();
        instrucciones.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_InstruccionesMouseClicked

    private void btnRequiereApoyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyoActionPerformed
        int Respuesta = JOptionPane.showConfirmDialog(this, "Seguro que quieres reiniciar el progreso de esta tarea?","Confirmar?",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(Respuesta == JOptionPane.YES_OPTION){
            estadoPorcentaje = 85.71428568;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            CargarBarra();
        }
    }//GEN-LAST:event_btnRequiereApoyoActionPerformed

    private void btnCasiLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLograActionPerformed
        if(estadoPorcentaje == 85.71428568){
            estadoPorcentaje = 88.09523806;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            CargarBarra();
        }
    }//GEN-LAST:event_btnCasiLograActionPerformed

    private void btnCumplioObjetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivoActionPerformed
        if(estadoPorcentaje < 90.47619044){
            estadoPorcentaje = 90.47619044;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            CargarBarra();
        }
    }//GEN-LAST:event_btnCumplioObjetivoActionPerformed

    private void LabelLogo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelLogo1MouseClicked
        Intrucciones3 abrir = new Intrucciones3();
        abrir.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(ManejoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManejoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManejoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManejoEspacial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManejoEspacial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Instrucciones;
    private javax.swing.JLabel Elaboro;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelLogo1;
    private javax.swing.JLabel LabelLogo2;
    private javax.swing.JLabel MtroManuel;
    private javax.swing.JLabel NombreDelPrograma;
    private javax.swing.JScrollPane Procedimiento;
    private javax.swing.JLabel Programa;
    private javax.swing.JLabel ReconocimientoCorporal;
    private javax.swing.JButton btnCasiLogra;
    private javax.swing.JButton btnCumplioObjetivo;
    private javax.swing.JButton btnRequiereApoyo;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JTextArea txtProcedimiento;
    // End of variables declaration//GEN-END:variables
}
