/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mx.itson.controlador.DBHelper;
import mx.itson.entidades.Terapeuta;
import mx.itson.interfaces.DAOTerapeutaIMP;

/**
 *
 * @author lopez
 */
public class AgregarTerapeuta extends javax.swing.JFrame {

    private FileInputStream fis;
    private int longitudBytes;
    
    public AgregarTerapeuta() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }
    private void limpiarCampos(){
    
    // Metodo para limpiar los espacios despeus de guardar a un terapeuta    
    txtNombre.setText("");
    txtUsuario.setText("");
    txtCorreo.setText("");
    txtUsuario.setText("");
    txtContraseña.setText("");
    }
    
    public void GuardarImagen() {

            String NombreCompleto;
            NombreCompleto = txtNombre.getText().trim();
            String Puesto;
            Puesto = txtPuesto.getText().trim();
            String Email;
            Email = txtCorreo.getText().trim();
            String CodigoUsuario;
            CodigoUsuario = txtUsuario.getText();
            String Contraseña;
            Contraseña = String.valueOf(txtContraseña.getPassword());

            try {

                Connection cn = DBHelper.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into `sutspes`.`terapeuta` values (?,?,?,?,?,MD5(?),?)");
                
                pst.setInt(1, 0);
                pst.setString(2, NombreCompleto);
                pst.setString(3, Puesto);
                pst.setString(4, Email);
                pst.setString(5, CodigoUsuario+"");
                pst.setString(6, Contraseña);
                pst.setBlob(7, fis, longitudBytes);
                
                pst.executeUpdate();
                cn.close();
                limpiarCampos();
                lbl_imagen.setText("Foto");
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                
            } catch (SQLException e) {
                System.out.println("Error al guardar foto " + e);
                JOptionPane.showMessageDialog(null, "¡¡Error al guardar foto!!");
            }

    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Volver = new javax.swing.JLabel();
        lbl_AddTerapeuta = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblPuesto = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        lbl_imagen = new javax.swing.JLabel();
        lbl_subirImagen = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/volverazul.png"))); // NOI18N
        lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VolverMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        lbl_AddTerapeuta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_AddTerapeuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AddTerapeuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/AgregarTerapeuta.png"))); // NOI18N
        lbl_AddTerapeuta.setText("Añadir Terapeuta");
        lbl_AddTerapeuta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_AddTerapeuta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_AddTerapeuta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_AddTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AddTerapeutaMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_AddTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, -1, -1));

        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 220, 50));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 380, 50));

        lblPuesto.setText("Puesto");
        getContentPane().add(lblPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 220, 50));
        getContentPane().add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 380, 50));

        lblCorreo.setText("Correo");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 220, 50));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 380, 50));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 380, 50));

        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 220, 50));

        lblUsuario1.setText("Usuario");
        getContentPane().add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 220, 50));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 380, 50));
        getContentPane().add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 310, 260));

        lbl_subirImagen.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_subirImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_subirImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/subirimagen.png"))); // NOI18N
        lbl_subirImagen.setText("Subir Foto");
        lbl_subirImagen.setToolTipText("");
        lbl_subirImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_subirImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_subirImagen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_subirImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_subirImagenMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_subirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 470, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAzul.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VolverMouseClicked

        VerTerapeutas abrir = new VerTerapeutas();
        abrir.setVisible(true);
        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_VolverMouseClicked

    private void lbl_AddTerapeutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AddTerapeutaMouseClicked
        GuardarImagen();
// TODO add your handling code here:
    }//GEN-LAST:event_lbl_AddTerapeutaMouseClicked

    private void lbl_subirImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_subirImagenMouseClicked
        JFileChooser se = new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = se.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {

                fis = new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int) se.getSelectedFile().length();
                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(lbl_imagen.getWidth(), lbl_imagen.getHeight(), Image.SCALE_DEFAULT);
                lbl_imagen.setIcon(new ImageIcon(icono));
                lbl_imagen.updateUI();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Error en el primer catch");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error en el segundo catch");
            }
        }

    }//GEN-LAST:event_lbl_subirImagenMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarTerapeuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTerapeuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTerapeuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTerapeuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTerapeuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lbl_AddTerapeuta;
    private javax.swing.JLabel lbl_Volver;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_subirImagen;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
