/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import mx.itson.controlador.DBHelper;
import mx.itson.entidades.Alumno;
import mx.itson.entidades.Terapeuta;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.interfaces.DAOTerapeutaIMP;

/**
 *
 * @author vinko
 */
public class EditarNiños extends javax.swing.JFrame {

    VerNiños VN = new VerNiños();
    DAOAlumnoIMP dao = new DAOAlumnoIMP();
    Alumno alumno = dao.obtenerPorId(VN.idEdit);
    private FileInputStream fis;
    private int longitudBytes = 0;
    
    
    
    public EditarNiños() {
        
        initComponents();
        setLocationRelativeTo(null);
        RefrescarAlumnos();
        lbl_id.setText(VN.idEdit+"");
    }
    
    
    
    public void EditarNino() {
            
            String NombreCompleto;
            NombreCompleto = txtNombre.getText().trim();
            String Edad;
            Edad = txtEdad.getText().trim();
            String Tutor;
            Tutor = txtTutor.getText().trim();
            long CodigoUsuario;
            CodigoUsuario = Long.valueOf(txtTelefono.getText());
            String nombreImg;
            nombreImg = txt_NombreImagen.getText().trim();
            
            
            try {
                if(longitudBytes != 0){
                 Connection cn = DBHelper.conectar();
                PreparedStatement pst = cn.prepareStatement("UPDATE `bxopxuzsnsc4au7ggfnf`.`terapeuta` SET nombreCom = ?, Area = ?, email = ?, "
                        + "usuario = ?, contraseña = ?, nomImagen = ?, imagen = ? WHERE IdTerap = ?");
                
                pst.setString(1, NombreCompleto);
                pst.setString(2, Edad);
                pst.setString(3, Tutor);
                pst.setString(4, CodigoUsuario+"");
                pst.setString(5, nombreImg);
                pst.setBlob(6, fis, longitudBytes);
                pst.setInt(7, VN.idEdit);
                
                
                pst.executeUpdate();
                cn.close();
                txt_NombreImagen.setBackground(Color.green);
                lbl_imagen.setText("Foto");
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            }else{
                Connection cn = DBHelper.conectar();
                PreparedStatement pst = cn.prepareStatement("UPDATE `bxopxuzsnsc4au7ggfnf`.`alumno` SET nombreCom = ?, Area = ?, edad = ?, "
                        + "tutor = ?, contraseña = ?, nomImagen = ? WHERE IdTerap = ?");
                
                pst.setString(1, NombreCompleto);
                pst.setString(2, Edad);
                pst.setString(3, Tutor);
                pst.setString(4, CodigoUsuario+"");
                pst.setString(5, nombreImg);
                pst.setBlob(6, fis, longitudBytes);
                pst.setInt(7, VN.idEdit);
                
                
                pst.executeUpdate();
                cn.close();
                txt_NombreImagen.setBackground(Color.green);
                lbl_imagen.setText("Foto");
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                }
                
            } catch (SQLException e) {
                System.out.println("Error al guardar foto " + e);
                JOptionPane.showMessageDialog(null, "¡¡Error al guardar foto!!");
            }
        
    }
    
    
    
    private void RefrescarAlumnos(){
        
        VerNiños vn = new VerNiños();
        DAOAlumnoIMP dao = new DAOAlumnoIMP();
        
        try {
            Alumno nino = dao.obtenerPorId(vn.idEdit);
            txtNombre.setText(nino.getNombre());
            txtEdad.setText.textArea(nino.getEdad());
            txtTutor.setText(nino.getNombreTutor());
            txtTelefono.setText(nino.getTelefono());
            nino.getNomImagen();
            nino.getImagen();
            
            try {
                
                Connection cn = DBHelper.conectar() ;
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM bxopxuzsnsc4au7ggfnf.terapeuta WHERE IdTerap = " + vn.idEdit);
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    //leer Binario
                    Blob blob = rs.getBlob(8);
                    //pasar el binario a imagen
                    byte[] data = blob.getBytes(1, (int) blob.length());
                    //lee la imagen
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new ByteArrayInputStream(data));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    
                    ImageIcon icono = new ImageIcon(img);
                    Icon imagen = new ImageIcon(icono.getImage().getScaledInstance(lbl_imagen.getWidth(), lbl_imagen.getHeight(), Image.SCALE_DEFAULT));
                    lbl_imagen.setIcon(imagen);
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "¡Error al cargar!");
                System.out.println("Error al cargar foto: " + e);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Volver = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblPuesto = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtTutor = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        lbl_subirImagen = new javax.swing.JLabel();
        lbl_imagen = new javax.swing.JLabel();
        lbl_AddTerapeuta = new javax.swing.JLabel();
        txt_NombreImagen = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/volverazul.png"))); // NOI18N
        lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VolverMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 220, 50));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 380, 50));

        lblPuesto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(0, 0, 0));
        lblPuesto.setText("Edad");
        getContentPane().add(lblPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 220, 50));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 380, 50));

        lblCorreo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("Nombre de Padre/Madre/Tutor");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 310, 50));
        getContentPane().add(txtTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 380, 50));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 380, 50));

        lblContraseña.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña.setText("Nombre de la Imagen");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 220, 50));

        lblUsuario1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario1.setText("Telefono");
        getContentPane().add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 220, 50));

        lbl_subirImagen.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_subirImagen.setForeground(new java.awt.Color(0, 0, 0));
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
        getContentPane().add(lbl_subirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));
        getContentPane().add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 450, 530));

        lbl_AddTerapeuta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_AddTerapeuta.setForeground(new java.awt.Color(0, 0, 0));
        lbl_AddTerapeuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AddTerapeuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/editarNiño.png"))); // NOI18N
        lbl_AddTerapeuta.setText("Editar Niño");
        lbl_AddTerapeuta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_AddTerapeuta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_AddTerapeuta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_AddTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AddNinoMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_AddTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));
        getContentPane().add(txt_NombreImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 380, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoRosa.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 720));

        lbl_id.setText("jLabel1");
        getContentPane().add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VolverMouseClicked

        VerNiños abrir = new VerNiños();
        abrir.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_VolverMouseClicked

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

    private void lbl_AddNinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AddNinoMouseClicked
        EditarNino();
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_AddNinoMouseClicked

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
            java.util.logging.Logger.getLogger(EditarNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarNiños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarNiños().setVisible(true);
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
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_subirImagen;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTutor;
    private javax.swing.JTextField txt_NombreImagen;
    // End of variables declaration//GEN-END:variables
}
