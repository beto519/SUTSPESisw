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
public class SeguimientoInstrucciones extends javax.swing.JFrame {

    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    public static int barrita;
    
    public SeguimientoInstrucciones() {
        initComponents();
                 setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
         niño();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelLogo2 = new javax.swing.JLabel();
        LabelLogo1 = new javax.swing.JLabel();
        SeguimientoDeInstrucciones = new javax.swing.JLabel();
        NombreDelPrograma = new javax.swing.JLabel();
        MtroManuel = new javax.swing.JLabel();
        Elaboro = new javax.swing.JLabel();
        procedimiento = new javax.swing.JLabel();
        Programa = new javax.swing.JLabel();
        Procedimiento = new javax.swing.JScrollPane();
        txtProcedimiento = new javax.swing.JTextArea();
        Btn_Instrucciones = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/sutspes  en png.png"))); // NOI18N
        getContentPane().add(LabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, -1));

        LabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/CENTRO DE APOYO EDUCATIVO INFANTIL EN PNG.png"))); // NOI18N
        getContentPane().add(LabelLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SeguimientoDeInstrucciones.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SeguimientoDeInstrucciones.setText("Seguimiento de instrucciones");
        SeguimientoDeInstrucciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(SeguimientoDeInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 680, 40));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 450, 40));

        MtroManuel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel.setText("  Mtro. Manuel Esquer Sumuano  ");
        MtroManuel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 680, 40));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Elaboro.setText(" Elaboró:"); // NOI18N
        Elaboro.setToolTipText("");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 450, 40));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 1130, 30));

        Programa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Programa.setText("Programa");
        getContentPane().add(Programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        txtProcedimiento.setEditable(false);
        txtProcedimiento.setColumns(20);
        txtProcedimiento.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        txtProcedimiento.setRows(5);
        txtProcedimiento.setText("PASO 1. Seleccione la lista de instrucciones.\nPASO 2. Dé la instrucción en 3 ocasiones cada una de las instrucciones de la lista.\nPASO 3. De un reforzador por cada respuesta correcta.\nPASO 4. Si el niño no realiza las instrucciones dé apoyo.\nPASO 5. El apoyo consiste en ayudar físicamente al niño para que haga las instrucciones, por ejemplo, \n“tirar la basura”, se toma al niño de sus manos para que tome el objeto que va a tirar, luego se le conduce al \nbote de basura y después se le abre la mano para que tire la basura.\nPASO 6. Disminuya gradualmente los apoyos hasta cumplir el criterio.\n\n");
        Procedimiento.setViewportView(txtProcedimiento);

        getContentPane().add(Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 1130, 340));

        Btn_Instrucciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_Instrucciones.setText("Ver Instrucciones");
        Btn_Instrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Instrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_InstruccionesMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, 200, 50));

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 500, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoRosa.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_InstruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_InstruccionesMouseClicked
        InstruccSeguimientoInstrucciones instrucciones = new InstruccSeguimientoInstrucciones();
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
    if(porcentajeActual == 72.22222){
          jProgressBar1.setValue(0);
        }if(porcentajeActual == 72.30639508){
          jProgressBar1.setValue(1);
        }if(porcentajeActual == 72.390570171){
          jProgressBar1.setValue(3);
        }if(porcentajeActual == 72.39057017){
          jProgressBar1.setValue(4);
        }if(porcentajeActual == 72.558920341){
          jProgressBar1.setValue(6);
        }if(porcentajeActual == 72.47474525){
          jProgressBar1.setValue(7);
        }if(porcentajeActual == 72.727270511){
          jProgressBar1.setValue(9);
        }if(porcentajeActual == 72.55892034){
          jProgressBar1.setValue(10);
        }if(porcentajeActual == 72.895620671){
          jProgressBar1.setValue(12);
        }if(porcentajeActual == 72.64309542){
          jProgressBar1.setValue(13);
        }if(porcentajeActual == 73.063970841){
          jProgressBar1.setValue(15);
        }if(porcentajeActual == 72.72727051){
          jProgressBar1.setValue(16);
        }if(porcentajeActual == 73.232321011){
          jProgressBar1.setValue(18);
        }if(porcentajeActual == 72.81144559){
          jProgressBar1.setValue(19);
        }if(porcentajeActual == 73.400671181){
          jProgressBar1.setValue(21);
        }if(porcentajeActual == 72.89562067){
          jProgressBar1.setValue(22);
        }if(porcentajeActual == 73.569021351){
          jProgressBar1.setValue(24);
        }if(porcentajeActual == 72.97979576){
          jProgressBar1.setValue(25);
        }if(porcentajeActual == 73.737371521){
          jProgressBar1.setValue(27);
        }if(porcentajeActual == 73.06397084){
          jProgressBar1.setValue(28);
        }if(porcentajeActual == 73.905721681){
          jProgressBar1.setValue(30);
        }if(porcentajeActual == 73.14814593){
          jProgressBar1.setValue(31);
        }if(porcentajeActual == 74.074071851){
          jProgressBar1.setValue(33);
        }if(porcentajeActual == 73.23232101){
          jProgressBar1.setValue(34);
        }if(porcentajeActual == 74.242422021){
          jProgressBar1.setValue(36);
        }if(porcentajeActual == 73.3164961){
          jProgressBar1.setValue(37);
        }if(porcentajeActual == 74.410772191){
          jProgressBar1.setValue(39);
        }if(porcentajeActual == 73.40067118){
          jProgressBar1.setValue(40);
        }if(porcentajeActual == 74.579122361){
          jProgressBar1.setValue(42);
        }if(porcentajeActual == 73.48484626){
          jProgressBar1.setValue(43);
        }if(porcentajeActual == 74.747472531){
          jProgressBar1.setValue(45);
        }if(porcentajeActual == 73.56902135){
          jProgressBar1.setValue(46);
        }if(porcentajeActual == 74.91582271){
          jProgressBar1.setValue(48);
        }if(porcentajeActual == 73.65319643){
          jProgressBar1.setValue(49);
        }if(porcentajeActual == 75.08417286){
          jProgressBar1.setValue(51);
        }if(porcentajeActual == 73.73737152){
          jProgressBar1.setValue(52);
        }if(porcentajeActual == 75.25252303){
          jProgressBar1.setValue(54);
        }if(porcentajeActual == 73.8215466){
          jProgressBar1.setValue(55);
        }if(porcentajeActual == 75.4208732){
          jProgressBar1.setValue(57);
        }if(porcentajeActual == 73.90572168){
          jProgressBar1.setValue(58);
        }if(porcentajeActual == 75.58922337){
          jProgressBar1.setValue(60);
        }if(porcentajeActual == 73.98989677){
          jProgressBar1.setValue(61);
        }if(porcentajeActual == 75.75757354){
          jProgressBar1.setValue(63);
        }if(porcentajeActual == 74.07407185){
          jProgressBar1.setValue(64);
        }if(porcentajeActual == 75.92592371){
          jProgressBar1.setValue(66);
        }if(porcentajeActual == 74.15824694){
          jProgressBar1.setValue(67);
        }if(porcentajeActual == 76.09427388){
          jProgressBar1.setValue(69);
        }if(porcentajeActual == 74.24242202){
          jProgressBar1.setValue(70);
        }if(porcentajeActual == 76.26262404){
          jProgressBar1.setValue(72);
        }if(porcentajeActual == 74.32659711){
          jProgressBar1.setValue(73);
        }if(porcentajeActual == 76.43097421){
          jProgressBar1.setValue(75);
        }if(porcentajeActual == 74.41077219){
          jProgressBar1.setValue(76);
        }if(porcentajeActual == 76.59932438){
          jProgressBar1.setValue(78);
        }if(porcentajeActual == 74.49494727){
          jProgressBar1.setValue(79);
        }if(porcentajeActual == 76.76767455){
          jProgressBar1.setValue(81);
        }if(porcentajeActual == 74.57912236){
          jProgressBar1.setValue(82);
        }if(porcentajeActual == 76.93602472){
          jProgressBar1.setValue(84);
        }if(porcentajeActual == 74.66329744){
          jProgressBar1.setValue(85);
        }if(porcentajeActual == 77.10437489){
          jProgressBar1.setValue(87);
        }if(porcentajeActual == 74.74747253){
          jProgressBar1.setValue(88);
        }if(porcentajeActual == 77.27272505){
          jProgressBar1.setValue(90);
        }if(porcentajeActual == 74.83164761){
          jProgressBar1.setValue(91);
        }if(porcentajeActual == 77.44107522){
          jProgressBar1.setValue(93);
        }if(porcentajeActual == 74.9158227){
          jProgressBar1.setValue(94);
        }if(porcentajeActual == 77.60942539){
          jProgressBar1.setValue(96);
        }if(porcentajeActual == 75){
          jProgressBar1.setValue(98);
        }if(porcentajeActual == 77.777778){
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
            java.util.logging.Logger.getLogger(SeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeguimientoInstrucciones().setVisible(true);
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
    private javax.swing.JLabel SeguimientoDeInstrucciones;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JTextArea txtProcedimiento;
    // End of variables declaration//GEN-END:variables
}
