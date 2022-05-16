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
public class EmparejamientoObjetos extends javax.swing.JFrame {

    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    private double estadoPorcentaje;
    double porcentajeActual;

    /**
     * Creates new form EmparejamientoObjetos
     */
    public EmparejamientoObjetos() {
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
        Elaboro1 = new javax.swing.JLabel();
        NombreDelPrograma1 = new javax.swing.JLabel();
        ReconocimientoCorporal1 = new javax.swing.JLabel();
        procedimiento2 = new javax.swing.JLabel();
        MtroManuel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        btn_LoHace = new javax.swing.JButton();
        btn_NoLoHace = new javax.swing.JButton();
        btn_LoHaceConAyuda = new javax.swing.JButton();
        PB_ProgresoNiño = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 60, -1, -1));

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        LabelLogo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelLogo1MouseClicked(evt);
            }
        });
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Elaboro1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro1.setText("Mtro. Manuel Esquer Sumuano");
        Elaboro1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 560, 40));

        NombreDelPrograma1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma1.setText(" Nombre del Programa:");
        NombreDelPrograma1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 450, 40));

        ReconocimientoCorporal1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal1.setText("Emparejamiento de Objetos");
        ReconocimientoCorporal1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 560, 40));

        procedimiento2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento2.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento2.setToolTipText("");
        procedimiento2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 1010, 30));

        MtroManuel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MtroManuel2.setText(" Elaboró:"); // NOI18N
        MtroManuel2.setToolTipText("");
        MtroManuel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 450, 40));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Objetos comunes para hacer el ejercicio:\nCuchara.\nVaso.\nPlato.\nZapatos.\nCalcetines.\nFrutas.\n");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 1010, 190));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("Programa ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 190, 60));

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("PASO 1. Seleccione objetos comunes. El criterio de selección de objetos es que deben tener 2 iguales, por\n ejemplo, dos naranjas.\nPASO 2. Siéntese frente al niño en una mesa de trabajo.\nPASO 3. Coloque sobre la mesa  dos objetos distintos (por ejemplo, una naranja y un zapato). \nLos objetos deben estar separados entre sí por una distancia de aproximadamente 40 centímetros.\nPASO 4. Llame al niño por su nombre y diga “Junta las cosas iguales” al mismo tiempo que muestra el objeto y \nse lo entrega en la mano, siempre cuidando que ponga atención al objeto que entregamos.\nPASO 5. La respuesta correcta del niño es la de juntar los objetos iguales. Si no da la respuesta correcta dé\napoyo tomando la mano\ndel niño y dirigiendo su mano hacia el objeto igual, apóyelo para que suelte el objeto.\nPASO 6. Disminuya gradualmente el apoyo hasta cumplir el criterio.\nPASO 7. Refuerce cada respuesta correcta, sin importar si lo hizo o no con apoyo.\n");
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 1010, 340));

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAzul.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 870));

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
        estadoPorcentaje = 28.57142856;
        CargarBarra();
        PorcentajeNiño();
    }//GEN-LAST:event_btn_LoHaceMouseClicked

    private void btn_NoLoHaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NoLoHaceMouseClicked
        estadoPorcentaje = 23.8095238;
        CargarBarra();
        PorcentajeNiño();
    }//GEN-LAST:event_btn_NoLoHaceMouseClicked

    private void btn_LoHaceConAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoHaceConAyudaMouseClicked
        estadoPorcentaje = 26.19047618;
        CargarBarra();
        PorcentajeNiño();
    }//GEN-LAST:event_btn_LoHaceConAyudaMouseClicked

    private void btn_LoHaceConAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoHaceConAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LoHaceConAyudaActionPerformed

    private void LabelLogo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelLogo1MouseClicked
Instrucciones2 abrir = new Instrucciones2();
abrir.setVisible(true);
dispose();
        // TODO add your handling code here:
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
    private javax.swing.JLabel LabelLogo1;
    private javax.swing.JLabel LabelLogo2;
    private javax.swing.JLabel MtroManuel2;
    private javax.swing.JLabel NombreDelPrograma1;
    private javax.swing.JProgressBar PB_ProgresoNiño;
    private javax.swing.JLabel ReconocimientoCorporal1;
    private javax.swing.JButton btn_LoHace;
    private javax.swing.JButton btn_LoHaceConAyuda;
    private javax.swing.JButton btn_NoLoHace;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel procedimiento2;
    // End of variables declaration//GEN-END:variables
}
