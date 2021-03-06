/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mx.itson.entidades.Terapeuta;
import mx.itson.interfaces.DAOTerapeutaIMP;

/**
 *
 * @author jotha
 */
public class VerTerapeutas extends javax.swing.JFrame {
DAOTerapeutaIMP dao = new DAOTerapeutaIMP();
    /**
     * Creates new form VerTerapeutas
     */
    public VerTerapeutas() {
        initComponents();
        LlenarTabla();
        setLocationRelativeTo(null);
        lbl_id.setVisible(false);
           setExtendedState(MAXIMIZED_BOTH);
        buscarRolTerapeuta();
    }
    
    public static int idEdit = 0;
      
     private void LlenarTabla() {
       
        List<Terapeuta> list = dao.obtenerTodos();
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Puesto");
        model.addColumn("Correo");
        model.addColumn("Usuario");

        for (int i = 0; i < list.size(); i++) {

            model.addRow(
                    new Object[]{list.get(i).getId(), list.get(i).getNombre(),
                        list.get(i).getPuesto(), list.get(i).getCorreo(), list.get(i).getCodigoUsuario()
                    }
            );

            tblTerapeutas.setModel(model);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTerapeutas = new javax.swing.JTable();
        lbl_AddTerapeuta = new javax.swing.JLabel();
        lbl_EliminarTerapeuta = new javax.swing.JLabel();
        lbl_ActualizarLista = new javax.swing.JLabel();
        lbl_editarTerapeuta = new javax.swing.JLabel();
        lbl_Volver = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTerapeutas =new JTable(){

            public boolean isCellEditable(int row, int column){
                for (int i = 0; i<tblTerapeutas.getRowCount(); i++){

                    if (row == i){
                        return false;
                    }
                }
                return true;
            }
        };
        tblTerapeutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTerapeutasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTerapeutas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 900, 410));

        lbl_AddTerapeuta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_AddTerapeuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AddTerapeuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/AgregarTerapeuta.png"))); // NOI18N
        lbl_AddTerapeuta.setText("A??adir Terapeuta");
        lbl_AddTerapeuta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_AddTerapeuta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_AddTerapeuta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_AddTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AddTerapeutaMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_AddTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        lbl_EliminarTerapeuta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_EliminarTerapeuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EliminarTerapeuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/EliminarTerapeuta.png"))); // NOI18N
        lbl_EliminarTerapeuta.setText("Eliminar Terapeuta");
        lbl_EliminarTerapeuta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_EliminarTerapeuta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_EliminarTerapeuta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_EliminarTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EliminarTerapeutaMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_EliminarTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        lbl_ActualizarLista.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_ActualizarLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ActualizarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/ActualizarTerapeuta.png"))); // NOI18N
        lbl_ActualizarLista.setText("Actualizar Lista");
        lbl_ActualizarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_ActualizarLista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_ActualizarLista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_ActualizarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ActualizarListaMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_ActualizarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, -1, -1));

        lbl_editarTerapeuta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_editarTerapeuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_editarTerapeuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/EditarTerapeuta.png"))); // NOI18N
        lbl_editarTerapeuta.setText("Editar Terapeuta");
        lbl_editarTerapeuta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_editarTerapeuta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_editarTerapeuta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl_editarTerapeuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_editarTerapeutaMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_editarTerapeuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        lbl_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/volverazul.png"))); // NOI18N
        lbl_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VolverMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));
        getContentPane().add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAzul.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VolverMouseClicked
        Menu abrir = new Menu();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_VolverMouseClicked

    
    private void buscarRolTerapeuta(){
    IniciarSesion terapeuta = new IniciarSesion();
    String usuario = terapeuta.empU;
    dao.obtenerUser(usuario);
    
    Terapeuta t = new Terapeuta();
    t = dao.obtenerUser(usuario);
    t.getPuesto();
        if (t.getPuesto().equals("Admin")) {
            
        }else{
        
        this.lbl_AddTerapeuta.setVisible(false);
        this.lbl_editarTerapeuta.setVisible(false);
        this.lbl_EliminarTerapeuta.setVisible(false);
        }
    
    
    
    }
    
    private void lbl_AddTerapeutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AddTerapeutaMouseClicked

        
        
        
AgregarTerapeuta abrir = new AgregarTerapeuta();
abrir.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_AddTerapeutaMouseClicked
    
    private void tblTerapeutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTerapeutasMouseClicked
        int row = tblTerapeutas.getSelectedRow();
        int id = (int) tblTerapeutas.getModel().getValueAt(row, 0);
        lbl_id.setText(id + "");
        
        idEdit = id;
        
        
        if(evt.getClickCount() == 2){
            MostrarTerapeuta MT = new MostrarTerapeuta();
            MT.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_tblTerapeutasMouseClicked

    private void lbl_EliminarTerapeutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EliminarTerapeutaMouseClicked
       int respuesta = JOptionPane.showConfirmDialog(this, "Seguro que quieres eliminar este/a terapeuta?", "Confirmar", 
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       
       if(respuesta == JOptionPane.YES_OPTION){
        dao.eliminar(Integer.parseInt(lbl_id.getText()));
        LlenarTabla();
        
       }
       if(respuesta == JOptionPane.NO_OPTION){
           JOptionPane.showMessageDialog(this, "????Ten Cuidado!!");
       }
    }//GEN-LAST:event_lbl_EliminarTerapeutaMouseClicked

    private void lbl_ActualizarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ActualizarListaMouseClicked
        LlenarTabla();
    }//GEN-LAST:event_lbl_ActualizarListaMouseClicked

    private void lbl_editarTerapeutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editarTerapeutaMouseClicked
    EditarTerapeuta ET = new EditarTerapeuta();
    ET.setVisible(true);
    this.dispose();
    
        
    }//GEN-LAST:event_lbl_editarTerapeutaMouseClicked

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
            java.util.logging.Logger.getLogger(VerTerapeutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerTerapeutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerTerapeutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerTerapeutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerTerapeutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ActualizarLista;
    private javax.swing.JLabel lbl_AddTerapeuta;
    private javax.swing.JLabel lbl_EliminarTerapeuta;
    private javax.swing.JLabel lbl_Volver;
    private javax.swing.JLabel lbl_editarTerapeuta;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tblTerapeutas;
    // End of variables declaration//GEN-END:variables
}
