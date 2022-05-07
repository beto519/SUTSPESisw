/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.vistas.instrucciones;

import javax.swing.JFrame;
import mx.itson.entidades.Alumno;
import mx.itson.interfaces.DAOAlumnoIMP;
import mx.itson.vistas.LoginNiños;

/**
 *
 * @author jotha
 */
public class InstruccPartesCuerpo extends javax.swing.JFrame {

    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    public static int barrita;
    
    public InstruccPartesCuerpo() {
        initComponents();
      //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
                 setLocationRelativeTo(null);
       //  this.setExtendedState(MAXIMIZED_BOTH);
         niño();
    }
    
    private void CargarBarra() {

    }

    private void niño() {
        Alumno alu = Alumno.obtenerPorId(ln.claveNiño);
        porcentajeActual = alu.getPorcentaje();
        estadoPorcentaje = porcentajeActual;
        BarraProgreso();
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        Instrucciones_1 = new javax.swing.JLabel();
        Instrucciones_2 = new javax.swing.JLabel();
        Instrucciones_3 = new javax.swing.JLabel();
        Instrucciones_4 = new javax.swing.JLabel();
        Instrucciones_5 = new javax.swing.JLabel();
        Instrucciones_6 = new javax.swing.JLabel();
        Instrucciones_7 = new javax.swing.JLabel();
        Instrucciones_8 = new javax.swing.JLabel();
        Instrucciones_9 = new javax.swing.JLabel();
        Instrucciones_10 = new javax.swing.JLabel();
        Instrucciones_11 = new javax.swing.JLabel();
        Instrucciones_12 = new javax.swing.JLabel();
        Instrucciones_13 = new javax.swing.JLabel();
        Instrucciones_14 = new javax.swing.JLabel();
        Instrucciones_15 = new javax.swing.JLabel();
        btnRequiereApoyo5 = new javax.swing.JButton();
        btnCumplioObjetivo = new javax.swing.JButton();
        btnCasiLogra = new javax.swing.JButton();
        btnRequiereApoyo6 = new javax.swing.JButton();
        btnCasiLogra1 = new javax.swing.JButton();
        btnCumplioObjetivo1 = new javax.swing.JButton();
        btnRequiereApoyo7 = new javax.swing.JButton();
        btnCasiLogra2 = new javax.swing.JButton();
        btnCumplioObjetivo2 = new javax.swing.JButton();
        btnRequiereApoyo8 = new javax.swing.JButton();
        btnCasiLogra3 = new javax.swing.JButton();
        btnCumplioObjetivo3 = new javax.swing.JButton();
        btnRequiereApoyo9 = new javax.swing.JButton();
        btnCasiLogra4 = new javax.swing.JButton();
        btnCumplioObjetivo4 = new javax.swing.JButton();
        btnRequiereApoyo10 = new javax.swing.JButton();
        btnCasiLogra5 = new javax.swing.JButton();
        btnCumplioObjetivo5 = new javax.swing.JButton();
        btnRequiereApoyo11 = new javax.swing.JButton();
        btnCasiLogra6 = new javax.swing.JButton();
        btnCumplioObjetivo6 = new javax.swing.JButton();
        btnRequiereApoyo12 = new javax.swing.JButton();
        btnCasiLogra7 = new javax.swing.JButton();
        btnCumplioObjetivo7 = new javax.swing.JButton();
        btnRequiereApoyo13 = new javax.swing.JButton();
        btnCasiLogra8 = new javax.swing.JButton();
        btnCumplioObjetivo8 = new javax.swing.JButton();
        btnRequiereApoyo14 = new javax.swing.JButton();
        btnCasiLogra9 = new javax.swing.JButton();
        btnCumplioObjetivo9 = new javax.swing.JButton();
        btnRequiereApoyo15 = new javax.swing.JButton();
        btnCasiLogra10 = new javax.swing.JButton();
        btnCumplioObjetivo10 = new javax.swing.JButton();
        btnRequiereApoyo16 = new javax.swing.JButton();
        btnCasiLogra11 = new javax.swing.JButton();
        btnCumplioObjetivo11 = new javax.swing.JButton();
        btnRequiereApoyo17 = new javax.swing.JButton();
        btnCasiLogra12 = new javax.swing.JButton();
        btnCumplioObjetivo12 = new javax.swing.JButton();
        btnRequiereApoyo18 = new javax.swing.JButton();
        btnCasiLogra13 = new javax.swing.JButton();
        btnCumplioObjetivo13 = new javax.swing.JButton();
        btnRequiereApoyo19 = new javax.swing.JButton();
        btnCasiLogra14 = new javax.swing.JButton();
        btnCumplioObjetivo14 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, -1));

        Instrucciones_1.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_1.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_1.setText("1. Tócate la cabeza.");
        getContentPane().add(Instrucciones_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 62, -1, 40));

        Instrucciones_2.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_2.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_2.setText("2. Tócate las orejas.");
        getContentPane().add(Instrucciones_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        Instrucciones_3.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_3.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_3.setText("3. Tócate los cachetes.");
        getContentPane().add(Instrucciones_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        Instrucciones_4.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_4.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_4.setText("4. Tócate la nariz.");
        getContentPane().add(Instrucciones_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        Instrucciones_5.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_5.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_5.setText("5. Tócate los ojos.");
        getContentPane().add(Instrucciones_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        Instrucciones_6.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_6.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_6.setText("6. Tócate la boca.");
        getContentPane().add(Instrucciones_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        Instrucciones_7.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_7.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_7.setText("7. Tócate el cabello.");
        getContentPane().add(Instrucciones_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        Instrucciones_8.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_8.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_8.setText("8. Tócate el cuello.");
        getContentPane().add(Instrucciones_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        Instrucciones_9.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_9.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_9.setText("9. Tócate los hombros.");
        getContentPane().add(Instrucciones_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        Instrucciones_10.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_10.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_10.setText("10. Tócate los brazos.");
        getContentPane().add(Instrucciones_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        Instrucciones_11.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_11.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_11.setText("11. Tócate el pecho.");
        getContentPane().add(Instrucciones_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));

        Instrucciones_12.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_12.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_12.setText("12. Tócate la panza.");
        getContentPane().add(Instrucciones_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        Instrucciones_13.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_13.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_13.setText("13. Tócate las rodillas.");
        getContentPane().add(Instrucciones_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));

        Instrucciones_14.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_14.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_14.setText("14. Tócate los pies.");
        getContentPane().add(Instrucciones_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, -1, -1));

        Instrucciones_15.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Instrucciones_15.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_15.setText("15. Tócate las manos.");
        getContentPane().add(Instrucciones_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, -1, -1));

        btnRequiereApoyo5.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo5.setBorderPainted(false);
        btnRequiereApoyo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 50, 30));

        btnCumplioObjetivo.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo.setBorderPainted(false);
        btnCumplioObjetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 50, 30));

        btnCasiLogra.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra.setBorderPainted(false);
        btnCasiLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLograActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 50, 30));

        btnRequiereApoyo6.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo6.setBorderPainted(false);
        btnRequiereApoyo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 50, 30));

        btnCasiLogra1.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra1.setBorderPainted(false);
        btnCasiLogra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 50, 30));

        btnCumplioObjetivo1.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo1.setBorderPainted(false);
        btnCumplioObjetivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 50, 30));

        btnRequiereApoyo7.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo7.setBorderPainted(false);
        btnRequiereApoyo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 50, 30));

        btnCasiLogra2.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra2.setBorderPainted(false);
        btnCasiLogra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 50, 30));

        btnCumplioObjetivo2.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo2.setBorderPainted(false);
        btnCumplioObjetivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 50, 30));

        btnRequiereApoyo8.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo8.setBorderPainted(false);
        btnRequiereApoyo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 50, 30));

        btnCasiLogra3.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra3.setBorderPainted(false);
        btnCasiLogra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 50, 30));

        btnCumplioObjetivo3.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo3.setBorderPainted(false);
        btnCumplioObjetivo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 50, 30));

        btnRequiereApoyo9.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo9.setBorderPainted(false);
        btnRequiereApoyo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 50, 30));

        btnCasiLogra4.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra4.setBorderPainted(false);
        btnCasiLogra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 50, 30));

        btnCumplioObjetivo4.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo4.setBorderPainted(false);
        btnCumplioObjetivo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 50, 30));

        btnRequiereApoyo10.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo10.setBorderPainted(false);
        btnRequiereApoyo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 50, 30));

        btnCasiLogra5.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra5.setBorderPainted(false);
        btnCasiLogra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 50, 30));

        btnCumplioObjetivo5.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo5.setBorderPainted(false);
        btnCumplioObjetivo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 50, 30));

        btnRequiereApoyo11.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo11.setBorderPainted(false);
        btnRequiereApoyo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 50, 30));

        btnCasiLogra6.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra6.setBorderPainted(false);
        btnCasiLogra6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 50, 30));

        btnCumplioObjetivo6.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo6.setBorderPainted(false);
        btnCumplioObjetivo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 50, 30));

        btnRequiereApoyo12.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo12.setBorderPainted(false);
        btnRequiereApoyo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 50, 30));

        btnCasiLogra7.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra7.setBorderPainted(false);
        btnCasiLogra7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 50, 30));

        btnCumplioObjetivo7.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo7.setBorderPainted(false);
        btnCumplioObjetivo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 70, 50, 30));

        btnRequiereApoyo13.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo13.setBorderPainted(false);
        btnRequiereApoyo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, 50, 30));

        btnCasiLogra8.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra8.setBorderPainted(false);
        btnCasiLogra8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 50, 30));

        btnCumplioObjetivo8.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo8.setBorderPainted(false);
        btnCumplioObjetivo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 130, 50, 30));

        btnRequiereApoyo14.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo14.setBorderPainted(false);
        btnRequiereApoyo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 50, 30));

        btnCasiLogra9.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra9.setBorderPainted(false);
        btnCasiLogra9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, 50, 30));

        btnCumplioObjetivo9.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo9.setBorderPainted(false);
        btnCumplioObjetivo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 190, 50, 30));

        btnRequiereApoyo15.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo15.setBorderPainted(false);
        btnRequiereApoyo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, 50, 30));

        btnCasiLogra10.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra10.setBorderPainted(false);
        btnCasiLogra10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, 50, 30));

        btnCumplioObjetivo10.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo10.setBorderPainted(false);
        btnCumplioObjetivo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 250, 50, 30));

        btnRequiereApoyo16.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo16.setBorderPainted(false);
        btnRequiereApoyo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, 50, 30));

        btnCasiLogra11.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra11.setBorderPainted(false);
        btnCasiLogra11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, 50, 30));

        btnCumplioObjetivo11.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo11.setBorderPainted(false);
        btnCumplioObjetivo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 310, 50, 30));

        btnRequiereApoyo17.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo17.setBorderPainted(false);
        btnRequiereApoyo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 370, 50, 30));

        btnCasiLogra12.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra12.setBorderPainted(false);
        btnCasiLogra12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, 50, 30));

        btnCumplioObjetivo12.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo12.setBorderPainted(false);
        btnCumplioObjetivo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 370, 50, 30));

        btnRequiereApoyo18.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo18.setBorderPainted(false);
        btnRequiereApoyo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo18ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, 50, 30));

        btnCasiLogra13.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra13.setBorderPainted(false);
        btnCasiLogra13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 430, 50, 30));

        btnCumplioObjetivo13.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo13.setBorderPainted(false);
        btnCumplioObjetivo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 430, 50, 30));

        btnRequiereApoyo19.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo19.setBorderPainted(false);
        btnRequiereApoyo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo19ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 30));

        btnCasiLogra14.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra14.setBorderPainted(false);
        btnCasiLogra14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 50, 30));

        btnCumplioObjetivo14.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo14.setBorderPainted(false);
        btnCumplioObjetivo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 50, 30));

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 800, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoAmarillo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        ReconocimientoCorporal corporal = new ReconocimientoCorporal();
        corporal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRequiereApoyo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo5ActionPerformed

        estadoPorcentaje = 52.5925925928;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequiereApoyo5ActionPerformed

    private void btnCumplioObjetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivoActionPerformed
        if (porcentajeActual < 52.9629629632) {
            estadoPorcentaje = 52.9629629632;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCumplioObjetivoActionPerformed

    private void btnCasiLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLograActionPerformed
        if (porcentajeActual == 52.5925925928) {
            estadoPorcentaje = 51.48148148161;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasiLograActionPerformed

    private void btnRequiereApoyo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo6ActionPerformed
        estadoPorcentaje = 50.7407407408;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo6ActionPerformed

    private void btnCasiLogra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra1ActionPerformed
        if (porcentajeActual == 50.7407407408) {
            estadoPorcentaje = 50.5555555556;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra1ActionPerformed

    private void btnCumplioObjetivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo1ActionPerformed
        if (porcentajeActual < 51.1111111112) {
            estadoPorcentaje = 51.1111111112;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo1ActionPerformed

    private void btnRequiereApoyo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo7ActionPerformed
        estadoPorcentaje = 51.1111111112;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo7ActionPerformed

    private void btnCasiLogra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra2ActionPerformed
        if (porcentajeActual == 51.1111111112) {
            estadoPorcentaje = 50.74074074081;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra2ActionPerformed

    private void btnCumplioObjetivo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo2ActionPerformed
        if (porcentajeActual < 51.4814814816) {
            estadoPorcentaje = 51.4814814816;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo2ActionPerformed

    private void btnRequiereApoyo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo8ActionPerformed
         estadoPorcentaje = 51.4814814816;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo8ActionPerformed

    private void btnCasiLogra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra3ActionPerformed
        if (porcentajeActual == 51.4814814816) {
            estadoPorcentaje = 50.925925926;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra3ActionPerformed

    private void btnCumplioObjetivo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo3ActionPerformed
        if (porcentajeActual < 51.851851852) {
            estadoPorcentaje = 51.851851852;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo3ActionPerformed

    private void btnRequiereApoyo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo9ActionPerformed
        estadoPorcentaje = 51.851851852;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo9ActionPerformed

    private void btnCasiLogra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra4ActionPerformed
        if (porcentajeActual == 51.851851852) {
            estadoPorcentaje = 51.11111111121;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra4ActionPerformed

    private void btnCumplioObjetivo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo4ActionPerformed
        if (porcentajeActual < 52.2222222224) {
            estadoPorcentaje = 52.2222222224;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo4ActionPerformed

    private void btnRequiereApoyo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo10ActionPerformed
        estadoPorcentaje = 52.2222222224;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo10ActionPerformed

    private void btnCasiLogra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra5ActionPerformed
        if (porcentajeActual == 52.2222222224) {
            estadoPorcentaje = 51.2962962964;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra5ActionPerformed

    private void btnCumplioObjetivo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo5ActionPerformed
        if (porcentajeActual < 52.5925925928) {
            estadoPorcentaje = 52.5925925928;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo5ActionPerformed

    private void btnRequiereApoyo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo11ActionPerformed
        estadoPorcentaje = 50.37037037041;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo11ActionPerformed

    private void btnCasiLogra6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra6ActionPerformed
        if (porcentajeActual == 50.37037037041) {
            estadoPorcentaje = 50.3703703704;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra6ActionPerformed

    private void btnCumplioObjetivo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo6ActionPerformed
        if (porcentajeActual < 50.7407407408) {
            estadoPorcentaje = 50.7407407408;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo6ActionPerformed

    private void btnRequiereApoyo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo12ActionPerformed
        estadoPorcentaje = 52.9629629632;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo12ActionPerformed

    private void btnCasiLogra7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra7ActionPerformed
        if (porcentajeActual == 52.9629629632) {
            estadoPorcentaje = 51.6666666668;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra7ActionPerformed

    private void btnCumplioObjetivo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo7ActionPerformed
        if (porcentajeActual < 53.3333333336) {
            estadoPorcentaje = 53.3333333336;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo7ActionPerformed

    private void btnRequiereApoyo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo13ActionPerformed
        estadoPorcentaje = 53.3333333336;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo13ActionPerformed

    private void btnCasiLogra8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra8ActionPerformed
        if (porcentajeActual == 53.3333333336) {
            estadoPorcentaje = 51.8518518521;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra8ActionPerformed

    private void btnCumplioObjetivo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo8ActionPerformed
        if (porcentajeActual < 53.703703704) {
            estadoPorcentaje = 53.703703704;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo8ActionPerformed

    private void btnRequiereApoyo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo14ActionPerformed
        estadoPorcentaje = 53.703703704;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo14ActionPerformed

    private void btnCasiLogra9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra9ActionPerformed
        if (porcentajeActual == 53.703703704) {
            estadoPorcentaje = 52.0370370372;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra9ActionPerformed

    private void btnCumplioObjetivo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo9ActionPerformed
        if (porcentajeActual < 54.0740740744) {
            estadoPorcentaje = 54.0740740744;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo9ActionPerformed

    private void btnRequiereApoyo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo15ActionPerformed
        estadoPorcentaje = 54.0740740744;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo15ActionPerformed

    private void btnCasiLogra10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra10ActionPerformed
        if (porcentajeActual == 54.0740740744) {
            estadoPorcentaje = 52.22222222241;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra10ActionPerformed

    private void btnCumplioObjetivo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo10ActionPerformed
        if (porcentajeActual < 54.4444444448) {
            estadoPorcentaje = 54.4444444448;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo10ActionPerformed

    private void btnRequiereApoyo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo16ActionPerformed
        estadoPorcentaje = 54.4444444448;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo16ActionPerformed

    private void btnCasiLogra11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra11ActionPerformed
        if (porcentajeActual == 54.4444444448) {
            estadoPorcentaje = 52.4074074076;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra11ActionPerformed

    private void btnCumplioObjetivo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo11ActionPerformed
        if (porcentajeActual < 54.8148148152) {
            estadoPorcentaje = 54.8148148152;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo11ActionPerformed

    private void btnRequiereApoyo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo17ActionPerformed
        estadoPorcentaje = 54.8148148152;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo17ActionPerformed

    private void btnCasiLogra12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra12ActionPerformed
        if (porcentajeActual == 54.8148148152) {
            estadoPorcentaje = 52.59259259281;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra12ActionPerformed

    private void btnCumplioObjetivo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo12ActionPerformed
        if (porcentajeActual < 55.1851851856) {
            estadoPorcentaje = 55.1851851856;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo12ActionPerformed

    private void btnRequiereApoyo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo18ActionPerformed
        estadoPorcentaje = 55.1851851856;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo18ActionPerformed

    private void btnCasiLogra13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra13ActionPerformed
         if (porcentajeActual == 55.1851851856) {
            estadoPorcentaje = 52.777777778;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
         System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra13ActionPerformed

    private void btnCumplioObjetivo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo13ActionPerformed
        if (porcentajeActual < 55.555555556) {
            estadoPorcentaje = 55.555555556;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo13ActionPerformed

    private void btnRequiereApoyo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo19ActionPerformed
        estadoPorcentaje = 50;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo19ActionPerformed

    private void btnCasiLogra14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra14ActionPerformed
        if (porcentajeActual == 50) {
            estadoPorcentaje = 50.185185185;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra14ActionPerformed

    private void btnCumplioObjetivo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo14ActionPerformed
        if (porcentajeActual < 50.3703703704) {
            estadoPorcentaje = 50.37037037041;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo14ActionPerformed

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
            java.util.logging.Logger.getLogger(InstruccPartesCuerpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstruccPartesCuerpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstruccPartesCuerpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstruccPartesCuerpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstruccPartesCuerpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Instrucciones_1;
    private javax.swing.JLabel Instrucciones_10;
    private javax.swing.JLabel Instrucciones_11;
    private javax.swing.JLabel Instrucciones_12;
    private javax.swing.JLabel Instrucciones_13;
    private javax.swing.JLabel Instrucciones_14;
    private javax.swing.JLabel Instrucciones_15;
    private javax.swing.JLabel Instrucciones_2;
    private javax.swing.JLabel Instrucciones_3;
    private javax.swing.JLabel Instrucciones_4;
    private javax.swing.JLabel Instrucciones_5;
    private javax.swing.JLabel Instrucciones_6;
    private javax.swing.JLabel Instrucciones_7;
    private javax.swing.JLabel Instrucciones_8;
    private javax.swing.JLabel Instrucciones_9;
    private javax.swing.JButton btnCasiLogra;
    private javax.swing.JButton btnCasiLogra1;
    private javax.swing.JButton btnCasiLogra10;
    private javax.swing.JButton btnCasiLogra11;
    private javax.swing.JButton btnCasiLogra12;
    private javax.swing.JButton btnCasiLogra13;
    private javax.swing.JButton btnCasiLogra14;
    private javax.swing.JButton btnCasiLogra2;
    private javax.swing.JButton btnCasiLogra3;
    private javax.swing.JButton btnCasiLogra4;
    private javax.swing.JButton btnCasiLogra5;
    private javax.swing.JButton btnCasiLogra6;
    private javax.swing.JButton btnCasiLogra7;
    private javax.swing.JButton btnCasiLogra8;
    private javax.swing.JButton btnCasiLogra9;
    private javax.swing.JButton btnCumplioObjetivo;
    private javax.swing.JButton btnCumplioObjetivo1;
    private javax.swing.JButton btnCumplioObjetivo10;
    private javax.swing.JButton btnCumplioObjetivo11;
    private javax.swing.JButton btnCumplioObjetivo12;
    private javax.swing.JButton btnCumplioObjetivo13;
    private javax.swing.JButton btnCumplioObjetivo14;
    private javax.swing.JButton btnCumplioObjetivo2;
    private javax.swing.JButton btnCumplioObjetivo3;
    private javax.swing.JButton btnCumplioObjetivo4;
    private javax.swing.JButton btnCumplioObjetivo5;
    private javax.swing.JButton btnCumplioObjetivo6;
    private javax.swing.JButton btnCumplioObjetivo7;
    private javax.swing.JButton btnCumplioObjetivo8;
    private javax.swing.JButton btnCumplioObjetivo9;
    private javax.swing.JButton btnRequiereApoyo10;
    private javax.swing.JButton btnRequiereApoyo11;
    private javax.swing.JButton btnRequiereApoyo12;
    private javax.swing.JButton btnRequiereApoyo13;
    private javax.swing.JButton btnRequiereApoyo14;
    private javax.swing.JButton btnRequiereApoyo15;
    private javax.swing.JButton btnRequiereApoyo16;
    private javax.swing.JButton btnRequiereApoyo17;
    private javax.swing.JButton btnRequiereApoyo18;
    private javax.swing.JButton btnRequiereApoyo19;
    private javax.swing.JButton btnRequiereApoyo5;
    private javax.swing.JButton btnRequiereApoyo6;
    private javax.swing.JButton btnRequiereApoyo7;
    private javax.swing.JButton btnRequiereApoyo8;
    private javax.swing.JButton btnRequiereApoyo9;
    private javax.swing.JButton btnVolver;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
