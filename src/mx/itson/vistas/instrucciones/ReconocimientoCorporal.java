
package mx.itson.vistas.instrucciones;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author jotha
 */
public class ReconocimientoCorporal extends javax.swing.JFrame {

    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    InstruccPartesCuerpo ipc = new InstruccPartesCuerpo();
    public  double estadoPorcentaje;
    double porcentajeActual;
    LoginNiños ln = new LoginNiños();
    
    public ReconocimientoCorporal() {
        initComponents();
    
        setResizable(false);
         setLocationRelativeTo(null);
         jProgressBar1.setValue(ipc.barrita);
         niño();
        // this.setExtendedState(MAXIMIZED_BOTH);
     //   setLayout(new BorderLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
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
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, -1));

        ReconocimientoCorporal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal.setText("  Reconocimiento Corporal");
        ReconocimientoCorporal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 620, 40));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 480, 40));

        MtroManuel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel.setText("  Mtro. Manuel Esquer Sumuano  ");
        MtroManuel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 620, 40));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Elaboro.setText(" Elaboró:"); // NOI18N
        Elaboro.setToolTipText("");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 480, 40));

        Programa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Programa.setText("Programa");
        getContentPane().add(Programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 1100, 30));

        txtProcedimiento.setEditable(false);
        txtProcedimiento.setColumns(20);
        txtProcedimiento.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        txtProcedimiento.setRows(5);
        txtProcedimiento.setText("PASO 1. Colóquese frente al niño y tenga a la mano la lista de instrucciones.\nPASO 2. Llame al niño por su nombre y dé la instrucción de la lista.\nPASO 3. Si el niño realiza la respuesta correcta de un reforzador.\nPASO 4. Si el niño no responde correctamente apoye físicamente.\nPASO 5. Disminuya el apoyo hasta alcanzar el criterio (reconocer el 80% de las partes del cuerpo).\nPASO 6. Repita 5 veces cada instrucción. Entre una y otra instrucción deje un tiempo de 10 segundos.\nPASO 7. Refuerce cada respuesta correcta.\n");
        Procedimiento.setViewportView(txtProcedimiento);

        getContentPane().add(Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 1100, 310));

        Btn_Instrucciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_Instrucciones.setText("Ver Instrucciones");
        Btn_Instrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Instrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_InstruccionesMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, 200, 50));

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 500, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAmarillo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Btn_InstruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_InstruccionesMouseClicked
        InstruccPartesCuerpo instrucciones = new InstruccPartesCuerpo();
        instrucciones.setVisible(true);
         dispose();
    }//GEN-LAST:event_Btn_InstruccionesMouseClicked

    private void niño() {
        Alumno alu = Alumno.obtenerPorId(ln.claveNiño);
        porcentajeActual = alu.getPorcentaje();
        estadoPorcentaje = porcentajeActual;
        BarraProgreso();
    }
    
    public void BarraProgreso()
   {
    if(porcentajeActual == 50){
          jProgressBar1.setValue(0);
        }if(porcentajeActual == 50.185185185){
          jProgressBar1.setValue(3);
        }if(porcentajeActual == 50.37037037041){
          jProgressBar1.setValue(7);
        }if(porcentajeActual == 50.3703703704){
          jProgressBar1.setValue(10);
        }if(porcentajeActual == 50.7407407408){
          jProgressBar1.setValue(14);
        }if(porcentajeActual == 50.5555555556){
          jProgressBar1.setValue(17);
        }if(porcentajeActual == 51.1111111112){
          jProgressBar1.setValue(21);
        }if(porcentajeActual == 50.74074074081){
          jProgressBar1.setValue(24);
        }if(porcentajeActual == 51.4814814816){
          jProgressBar1.setValue(28);
        }if(porcentajeActual == 50.925925926){
          jProgressBar1.setValue(31);
        }if(porcentajeActual == 51.851851852){
          jProgressBar1.setValue(35);
        }if(porcentajeActual == 51.11111111121){
          jProgressBar1.setValue(38);
        }if(porcentajeActual == 52.2222222224){
          jProgressBar1.setValue(42);
        }if(porcentajeActual == 51.2962962964){
          jProgressBar1.setValue(45);
        }if(porcentajeActual == 52.5925925928){
          jProgressBar1.setValue(49);
        }if(porcentajeActual == 51.48148148161){
          jProgressBar1.setValue(52);
        }if(porcentajeActual == 52.9629629632){
          jProgressBar1.setValue(56);
        }if(porcentajeActual == 51.6666666668){
          jProgressBar1.setValue(59);
        }if(porcentajeActual == 53.3333333336){
          jProgressBar1.setValue(63);
        }if(porcentajeActual == 51.8518518521){
          jProgressBar1.setValue(66);
        }if(porcentajeActual == 53.703703704){
          jProgressBar1.setValue(70);
        }if(porcentajeActual == 52.0370370372){
          jProgressBar1.setValue(73);
        }if(porcentajeActual == 54.0740740744){
          jProgressBar1.setValue(77);
        }if(porcentajeActual == 52.22222222241){
          jProgressBar1.setValue(80);
        }if(porcentajeActual == 54.4444444448){
          jProgressBar1.setValue(84);
        }if(porcentajeActual == 52.4074074076){
          jProgressBar1.setValue(87);
        }if(porcentajeActual == 54.8148148152){
          jProgressBar1.setValue(91);
        }if(porcentajeActual == 52.59259259281){
          jProgressBar1.setValue(94);
        }if(porcentajeActual == 55.1851851856){
          jProgressBar1.setValue(98);
        }if(porcentajeActual == 52.777777778){
          jProgressBar1.setValue(99);
        }if(porcentajeActual == 55.555555556){
          jProgressBar1.setValue(100);
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
            java.util.logging.Logger.getLogger(ReconocimientoCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReconocimientoCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReconocimientoCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReconocimientoCorporal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReconocimientoCorporal().setVisible(true);
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JTextArea txtProcedimiento;
    // End of variables declaration//GEN-END:variables
}
