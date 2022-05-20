/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas.instrucciones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.Intrucciones3;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author lopez
 */
public class Intraverbal extends javax.swing.JFrame {

    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    
    public Intraverbal() {
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

        LabelLogo2 = new javax.swing.JLabel();
        LabelLogo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreDelPrograma = new javax.swing.JLabel();
        ReconocimientoCorporal = new javax.swing.JLabel();
        MtroManuel1 = new javax.swing.JLabel();
        Elaboro = new javax.swing.JLabel();
        procedimiento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnRequiereApoyo = new javax.swing.JButton();
        btnCasiLogra = new javax.swing.JButton();
        btnCumplioObjetivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusableWindowState(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, -1));

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        LabelLogo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelLogo1MouseClicked(evt);
            }
        });
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Programa ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 190, 60));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 470, 40));

        ReconocimientoCorporal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal.setText("Programa intraverbal");
        ReconocimientoCorporal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 580, 40));

        MtroManuel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MtroManuel1.setText(" Elaboró:"); // NOI18N
        MtroManuel1.setToolTipText("");
        MtroManuel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 470, 40));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setText("Mtra. Melissa Alejandra Rodriguez Ruiz");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 580, 40));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 1050, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("PASO 1. Colóquese frente al niño y realice las preguntas de la lista.\nPASO 2. Refuerce si el niño responde correctamente a las preguntas.\nPASO 3. Si el niño no responde correctamente a las preguntas de apoyo verbal.\nPASO 4. Disminuya gradualmente el apoyo, hasta cumplir el criterio.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 1050, 140));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Lista de preguntas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 150, 40));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 1000, 30));

        btnRequiereApoyo.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo.setBorderPainted(false);
        btnRequiereApoyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 100, 40));

        btnCasiLogra.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra.setBorderPainted(false);
        btnCasiLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLograActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 100, 40));

        btnCumplioObjetivo.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo.setBorderPainted(false);
        btnCumplioObjetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAzul.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ListaPreguntas listapreguntas =  new ListaPreguntas();
        listapreguntas.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRequiereApoyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyoActionPerformed
        int Respuesta = JOptionPane.showConfirmDialog(this, "Seguro que quieres reiniciar el progreso de esta tarea?","Confirmar?",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(Respuesta == JOptionPane.YES_OPTION){
            estadoPorcentaje = 80.95238092;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            CargarBarra();
        }
    }//GEN-LAST:event_btnRequiereApoyoActionPerformed

    private void btnCasiLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLograActionPerformed
        if(estadoPorcentaje == 80.95238092){
            estadoPorcentaje = 83.3333333;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            CargarBarra();
        }
    }//GEN-LAST:event_btnCasiLograActionPerformed

    private void btnCumplioObjetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivoActionPerformed
        if(estadoPorcentaje < 85.71428568){
            estadoPorcentaje = 85.71428568;
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
            java.util.logging.Logger.getLogger(Intraverbal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intraverbal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intraverbal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intraverbal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intraverbal().setVisible(true);
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
    private javax.swing.JButton btnCasiLogra;
    private javax.swing.JButton btnCumplioObjetivo;
    private javax.swing.JButton btnRequiereApoyo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel procedimiento;
    // End of variables declaration//GEN-END:variables
}
