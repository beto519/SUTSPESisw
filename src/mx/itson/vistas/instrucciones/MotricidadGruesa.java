/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.vistas.instrucciones;

/**
 *
 * @author jotha
 */
public class MotricidadGruesa extends javax.swing.JFrame {

    /**
     * Creates new form MotricidadGruesa
     */
    public MotricidadGruesa() {
        initComponents();
                 setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReconocimientoCorporal = new javax.swing.JLabel();
        NombreDelPrograma = new javax.swing.JLabel();
        FechaNumElab = new javax.swing.JLabel();
        FechaElab = new javax.swing.JLabel();
        FechaNumRetro = new javax.swing.JLabel();
        FechaRetro = new javax.swing.JLabel();
        MtroManuel = new javax.swing.JLabel();
        Elaboro = new javax.swing.JLabel();
        Programa = new javax.swing.JLabel();
        procedimiento = new javax.swing.JLabel();
        Procedimiento = new javax.swing.JScrollPane();
        txtProcedimiento = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Mei = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReconocimientoCorporal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ReconocimientoCorporal.setText("  Ejercicios de motricidad gruesa");
        ReconocimientoCorporal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ReconocimientoCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 480, 40));

        NombreDelPrograma.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NombreDelPrograma.setText(" Nombre del Programa:");
        NombreDelPrograma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(NombreDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 350, 40));

        FechaNumElab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaNumElab.setText("  18-01-2016  ");
        FechaNumElab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaNumElab, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 480, 40));

        FechaElab.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaElab.setText(" Fecha de Elaboración:");
        FechaElab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaElab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 350, 40));

        FechaNumRetro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaNumRetro.setText("  15-02-2016");
        FechaNumRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaNumRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 480, 40));

        FechaRetro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FechaRetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FechaRetro.setText("Fecha de Retroalimentación:"); // NOI18N
        FechaRetro.setToolTipText("");
        FechaRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(FechaRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 350, 40));

        MtroManuel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MtroManuel.setText("  Mtro. Manuel Esquer Sumuano  ");
        MtroManuel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MtroManuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 480, 40));

        Elaboro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Elaboro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Elaboro.setText(" Elaboró:"); // NOI18N
        Elaboro.setToolTipText("");
        Elaboro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Elaboro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 350, 40));

        Programa.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Programa.setText("Programa");
        getContentPane().add(Programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        procedimiento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        procedimiento.setText("PROCEDIMIENTO"); // NOI18N
        procedimiento.setToolTipText("");
        procedimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 830, 30));

        txtProcedimiento.setEditable(false);
        txtProcedimiento.setColumns(20);
        txtProcedimiento.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        txtProcedimiento.setRows(5);
        txtProcedimiento.setText("Para mejorar la motricidad gruesa se harán circuitos donde debe tratar de hacer equilibrio, correr, saltar, \nrodar, escalar.\n\nPoner una línea en el suelo, o una tabla al aire, por donde el niño debe pasar cada vez a mayor velocidad \nmanteniendo el equilibrio o cuidando de siempre pisar la línea que le trazaron. Recuerde, inicie lento y vaya \nimprimiendo cada vez más velocidad.\nColocar una hilera de 5 a 10 obstáculos, los cuales el niño debe pasar por ellos saltándolos. \nLos obstáculos pueden ser cilindros pequeños, o aros.\n\nColocar un circuito, puede apoyarse con aros grandes, o con un gusano de estimulación motriz, \npor donde el niño debe pasar agachado o a gatas.\n\nColocar un circuito donde el niño deba ir y venir corriendo, por lo menos tres repeticiones en este circuito.\n\nPara el circuito de escalar puede apoyarse con el uso de una escalera.\n\nColocar un circuito en donde se acueste y tenga que rodar.\n\nLanzar una pelota.\n\nCachar una pelota.\n\nMantener el equilibrio.\n\n\n");
        Procedimiento.setViewportView(txtProcedimiento);

        getContentPane().add(Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 830, 510));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cel: 44 22 64 55 32 ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 850, 690, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Puente de Alvarado 305, Col. Carretas. Querétaro, Querétaro. ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 820, -1, -1));

        Mei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/Mei.png"))); // NOI18N
        getContentPane().add(Mei, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAmarillo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MotricidadGruesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotricidadGruesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotricidadGruesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotricidadGruesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotricidadGruesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Elaboro;
    private javax.swing.JLabel FechaElab;
    private javax.swing.JLabel FechaNumElab;
    private javax.swing.JLabel FechaNumRetro;
    private javax.swing.JLabel FechaRetro;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Mei;
    private javax.swing.JLabel MtroManuel;
    private javax.swing.JLabel NombreDelPrograma;
    private javax.swing.JScrollPane Procedimiento;
    private javax.swing.JLabel Programa;
    private javax.swing.JLabel ReconocimientoCorporal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JTextArea txtProcedimiento;
    // End of variables declaration//GEN-END:variables
}
