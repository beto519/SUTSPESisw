/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas.instrucciones;

import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.Instrucciones2;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author lopez
 */
public class ImitacionGruesa extends javax.swing.JFrame {

    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    private double estadoPorcentaje;
    double porcentajeActual;

    /**
     * Creates new form Imitacion
     */
    public ImitacionGruesa() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        niño();
        VerificarNivelNiño();
    }

    private void CargarBarra() {
        PB_ProgresoNiño.setValue((int) estadoPorcentaje);
    }

    private void VerificarNivelNiño(){
    Alumno alu = Alumno.obtenerPorId(ln.claveNiño);
    int NivelNiño = Integer.parseInt(alu.getNivel());
    if(NivelNiño == 3){
       this.btn_LoHace.setVisible(false);
       this.btn_LoHaceConAyuda.setVisible(false);
       this.btn_NoLoHace.setVisible(false);
    }
}
    
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
        btn_LoHace = new javax.swing.JButton();
        btn_NoLoHace = new javax.swing.JButton();
        btn_LoHaceConAyuda = new javax.swing.JButton();
        PB_ProgresoNiño = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 50, -1, -1));

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        LabelLogo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelLogo1MouseClicked(evt);
            }
        });
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Extender el brazo derecho al frente.\nExtender el brazo izquierdo al frente.\nExtender ambos brazos al frente.\nExtender el brazo derecho lateralmente.\nExtender el brazo izquierdo lateralmente.\nExtender ambos brazos lateralmente.\nMover negativamente la cabeza.\nAplaudir.\nTaparse el ojo derecho con la mano derecha.\nTaparse el ojo izquierdo con la mano izquierda.\nTaparse ambos ojos con ambas manos.\nPararse.\nAgacharse.\nFlexionar la pierna izquierda.\nFlexionar la pierna derecha.\nBrincar.\nAbrir y cerrar la puerta.\nSentarse.\nBotar una pelota.\nTocar la puerta.\nTirar un objeto.\nRecoger un objeto.\nAcomodar la silla.\nGuardar en una bolsa.\nTocarse las rodillas.\nTocarse las orejas.\n Tocarse la cabeza con ambas manos.\nAcostarse.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 1010, 310));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("LISTA DE COMPORTAMIENTOS A IMITAR"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 1010, 30));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("PASO 1. Colóquese frente al niño. Seleccione una lista de comportamientos a imitar.\nPASO 2. Llame por su nombre al niño y de la instrucción “Haz esto”. Inmediatamente que da la instrucción haga un movimiento grueso.\nPASO 3. Si el niño realiza la respuesta imitando al terapeuta dé un reforzador.\nPASO 4. Si no da la respuesta correcta, vuelva a dar la instrucción, luego inmediatamente ofrezca apoyo físico.\nPASO 5. Disminuya gradualmente el apoyo físico hasta alcanzar el criterio.\nPASO 6. Cada instrucción se repite 10 veces. Entre instrucciones debe haber por lo menos 10 segundos de separación.\n");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 1010, 200));

        procedimiento1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento1.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento1.setToolTipText("");
        procedimiento1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 1010, 30));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setText("Mtra. Melissa Alejandra Rodriguez Ruiz");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 560, 40));

        MtroManuel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MtroManuel1.setText(" Elaboró:"); // NOI18N
        MtroManuel1.setToolTipText("");
        MtroManuel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 450, 40));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 450, 40));

        ReconocimientoCorporal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal.setText("Imitacion Gruesa");
        ReconocimientoCorporal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 560, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Programa ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 190, 60));

        btn_LoHace.setBackground(new java.awt.Color(0, 255, 51));
        btn_LoHace.setText("Lo hace");
        btn_LoHace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LoHaceMouseClicked(evt);
            }
        });
        getContentPane().add(btn_LoHace, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 740, -1, -1));

        btn_NoLoHace.setBackground(new java.awt.Color(255, 0, 0));
        btn_NoLoHace.setForeground(new java.awt.Color(255, 255, 255));
        btn_NoLoHace.setText("No Lo Hace");
        btn_NoLoHace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NoLoHaceMouseClicked(evt);
            }
        });
        getContentPane().add(btn_NoLoHace, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 740, -1, -1));

        btn_LoHaceConAyuda.setBackground(new java.awt.Color(255, 255, 0));
        btn_LoHaceConAyuda.setText("Lo Hace Con Ayuda");
        btn_LoHaceConAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LoHaceConAyudaMouseClicked(evt);
            }
        });
        btn_LoHaceConAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoHaceConAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_LoHaceConAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 740, -1, -1));

        PB_ProgresoNiño.setStringPainted(true);
        getContentPane().add(PB_ProgresoNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 800, 1010, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAzul.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void niño() {
        Alumno alu = Alumno.obtenerPorId(ln.claveNiño);
        porcentajeActual = alu.getPorcentaje();
        estadoPorcentaje = porcentajeActual;
        CargarBarra();
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
    private void btn_LoHaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoHaceMouseClicked
        estadoPorcentaje = 42.85714284;
        CargarBarra();
        PorcentajeNiño();
    }//GEN-LAST:event_btn_LoHaceMouseClicked

    private void btn_NoLoHaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NoLoHaceMouseClicked
        estadoPorcentaje = 38.09523808;
        CargarBarra();
        PorcentajeNiño();
    }//GEN-LAST:event_btn_NoLoHaceMouseClicked

    private void btn_LoHaceConAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoHaceConAyudaMouseClicked
        estadoPorcentaje = 40.47619046;
        CargarBarra();
        PorcentajeNiño();
    }//GEN-LAST:event_btn_LoHaceConAyudaMouseClicked

    private void btn_LoHaceConAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoHaceConAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LoHaceConAyudaActionPerformed

    private void LabelLogo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelLogo1MouseClicked
Instrucciones2 abrir = new Instrucciones2();
abrir.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_LabelLogo1MouseClicked

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
            java.util.logging.Logger.getLogger(ImitacionGruesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImitacionGruesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImitacionGruesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImitacionGruesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImitacionGruesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Elaboro;
    private javax.swing.JLabel LabelLogo1;
    private javax.swing.JLabel LabelLogo2;
    private javax.swing.JLabel MtroManuel1;
    private javax.swing.JLabel NombreDelPrograma;
    private javax.swing.JProgressBar PB_ProgresoNiño;
    private javax.swing.JLabel ReconocimientoCorporal;
    private javax.swing.JButton btn_LoHace;
    private javax.swing.JButton btn_LoHaceConAyuda;
    private javax.swing.JButton btn_NoLoHace;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JLabel procedimiento1;
    // End of variables declaration//GEN-END:variables
}
