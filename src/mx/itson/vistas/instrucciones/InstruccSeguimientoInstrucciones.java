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
public class InstruccSeguimientoInstrucciones extends javax.swing.JFrame {
    DAOAlumnoIMP Alumno = new DAOAlumnoIMP();
    LoginNiños ln = new LoginNiños();
    Alumno alum = new Alumno();
    public  double estadoPorcentaje;
    double porcentajeActual;
    public static int barrita;
    /**
     * Creates new form InstruccSeguimientoInstrucciones
     */
    public InstruccSeguimientoInstrucciones() {
        initComponents();
                 setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
         niño();
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
        Instrucciones_16 = new javax.swing.JLabel();
        Instrucciones_17 = new javax.swing.JLabel();
        Instrucciones_18 = new javax.swing.JLabel();
        Instrucciones_19 = new javax.swing.JLabel();
        Instrucciones_20 = new javax.swing.JLabel();
        Instrucciones_21 = new javax.swing.JLabel();
        Instrucciones_22 = new javax.swing.JLabel();
        Instrucciones_23 = new javax.swing.JLabel();
        Instrucciones_24 = new javax.swing.JLabel();
        Instrucciones_25 = new javax.swing.JLabel();
        Instrucciones_26 = new javax.swing.JLabel();
        Instrucciones_27 = new javax.swing.JLabel();
        Instrucciones_28 = new javax.swing.JLabel();
        Instrucciones_29 = new javax.swing.JLabel();
        Instrucciones_30 = new javax.swing.JLabel();
        Instrucciones_31 = new javax.swing.JLabel();
        Instrucciones_32 = new javax.swing.JLabel();
        Instrucciones_33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
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
        btnRequiereApoyo20 = new javax.swing.JButton();
        btnCumplioObjetivo15 = new javax.swing.JButton();
        btnCasiLogra15 = new javax.swing.JButton();
        btnRequiereApoyo21 = new javax.swing.JButton();
        btnCasiLogra16 = new javax.swing.JButton();
        btnCumplioObjetivo16 = new javax.swing.JButton();
        btnRequiereApoyo22 = new javax.swing.JButton();
        btnCasiLogra17 = new javax.swing.JButton();
        btnCumplioObjetivo17 = new javax.swing.JButton();
        btnRequiereApoyo23 = new javax.swing.JButton();
        btnCasiLogra18 = new javax.swing.JButton();
        btnCumplioObjetivo18 = new javax.swing.JButton();
        btnRequiereApoyo24 = new javax.swing.JButton();
        btnCasiLogra19 = new javax.swing.JButton();
        btnCumplioObjetivo19 = new javax.swing.JButton();
        btnRequiereApoyo25 = new javax.swing.JButton();
        btnCasiLogra20 = new javax.swing.JButton();
        btnCumplioObjetivo20 = new javax.swing.JButton();
        btnRequiereApoyo26 = new javax.swing.JButton();
        btnCasiLogra21 = new javax.swing.JButton();
        btnCumplioObjetivo21 = new javax.swing.JButton();
        btnRequiereApoyo27 = new javax.swing.JButton();
        btnCasiLogra22 = new javax.swing.JButton();
        btnCumplioObjetivo22 = new javax.swing.JButton();
        btnRequiereApoyo28 = new javax.swing.JButton();
        btnCasiLogra23 = new javax.swing.JButton();
        btnCumplioObjetivo23 = new javax.swing.JButton();
        btnRequiereApoyo29 = new javax.swing.JButton();
        btnCasiLogra24 = new javax.swing.JButton();
        btnCumplioObjetivo24 = new javax.swing.JButton();
        btnRequiereApoyo30 = new javax.swing.JButton();
        btnCasiLogra25 = new javax.swing.JButton();
        btnCumplioObjetivo25 = new javax.swing.JButton();
        btnRequiereApoyo31 = new javax.swing.JButton();
        btnCasiLogra26 = new javax.swing.JButton();
        btnCumplioObjetivo26 = new javax.swing.JButton();
        btnRequiereApoyo32 = new javax.swing.JButton();
        btnCasiLogra27 = new javax.swing.JButton();
        btnCumplioObjetivo27 = new javax.swing.JButton();
        btnRequiereApoyo33 = new javax.swing.JButton();
        btnCasiLogra28 = new javax.swing.JButton();
        btnCumplioObjetivo28 = new javax.swing.JButton();
        btnRequiereApoyo34 = new javax.swing.JButton();
        btnCasiLogra29 = new javax.swing.JButton();
        btnCumplioObjetivo29 = new javax.swing.JButton();
        btnRequiereApoyo35 = new javax.swing.JButton();
        btnRequiereApoyo36 = new javax.swing.JButton();
        btnRequiereApoyo37 = new javax.swing.JButton();
        btnCasiLogra30 = new javax.swing.JButton();
        btnCasiLogra31 = new javax.swing.JButton();
        btnCasiLogra32 = new javax.swing.JButton();
        btnCumplioObjetivo30 = new javax.swing.JButton();
        btnCumplioObjetivo31 = new javax.swing.JButton();
        btnCumplioObjetivo32 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, -1));

        Instrucciones_1.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_1.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_1.setText("1. Ponte de pie.");
        getContentPane().add(Instrucciones_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        Instrucciones_2.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_2.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_2.setText("2. Ven.");
        getContentPane().add(Instrucciones_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        Instrucciones_3.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_3.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_3.setText("3. Toca el piso con las manos.");
        getContentPane().add(Instrucciones_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        Instrucciones_4.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_4.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_4.setText("4. Levanta los brazos.");
        getContentPane().add(Instrucciones_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        Instrucciones_5.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_5.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_5.setText("5. Baja los brazos.");
        getContentPane().add(Instrucciones_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Instrucciones_6.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_6.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_6.setText("6. Aplaude.");
        getContentPane().add(Instrucciones_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        Instrucciones_7.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_7.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_7.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_7.setText("7. Cruza los brazos.");
        getContentPane().add(Instrucciones_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        Instrucciones_8.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_8.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_8.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_8.setText("8. Toma esto (cualquier objeto).");
        getContentPane().add(Instrucciones_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        Instrucciones_9.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_9.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_9.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_9.setText("9. Ponlo debajo de la silla.");
        getContentPane().add(Instrucciones_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        Instrucciones_10.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_10.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_10.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_10.setText("10. Dame eso.");
        getContentPane().add(Instrucciones_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        Instrucciones_11.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_11.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_11.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_11.setText("11. Abre la puerta.");
        getContentPane().add(Instrucciones_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        Instrucciones_12.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_12.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_12.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_12.setText("12. Cierra la puerta.");
        getContentPane().add(Instrucciones_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        Instrucciones_13.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_13.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_13.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_13.setText("15. Cierra el libro.");
        getContentPane().add(Instrucciones_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        Instrucciones_14.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_14.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_14.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_14.setText("14. Abre el libro.");
        getContentPane().add(Instrucciones_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        Instrucciones_15.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_15.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_15.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_15.setText("16. Dame tu mano.");
        getContentPane().add(Instrucciones_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        Instrucciones_16.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_16.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_16.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_16.setText("17. Toma el dulce.");
        getContentPane().add(Instrucciones_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        Instrucciones_17.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_17.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_17.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_17.setText("18. Levántate.");
        getContentPane().add(Instrucciones_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        Instrucciones_18.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_18.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_18.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_18.setText("19. Vete para allá.");
        getContentPane().add(Instrucciones_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        Instrucciones_19.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_19.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_19.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_19.setText("20. Pon tus manos en el escritorio.");
        getContentPane().add(Instrucciones_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        Instrucciones_20.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_20.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_20.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_20.setText("21. Pon las manos sobre la cabeza.");
        getContentPane().add(Instrucciones_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        Instrucciones_21.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_21.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_21.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_21.setText("22. Tócate las rodillas con las manos.");
        getContentPane().add(Instrucciones_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        Instrucciones_22.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_22.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_22.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_22.setText("23. Abre y cierra las manos.");
        getContentPane().add(Instrucciones_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        Instrucciones_23.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_23.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_23.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_23.setText("24. Junta tus dedos.");
        getContentPane().add(Instrucciones_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        Instrucciones_24.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_24.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_24.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_24.setText("25. Ponlo sobre la silla.");
        getContentPane().add(Instrucciones_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        Instrucciones_25.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_25.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_25.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_25.setText("30. Cierra la caja.");
        getContentPane().add(Instrucciones_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        Instrucciones_26.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_26.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_26.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_26.setText("29. Abre la caja.");
        getContentPane().add(Instrucciones_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        Instrucciones_27.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_27.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_27.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_27.setText("31. Dame el cuaderno.");
        getContentPane().add(Instrucciones_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        Instrucciones_28.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_28.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_28.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_28.setText("33. Dame las manos.");
        getContentPane().add(Instrucciones_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, -1, -1));

        Instrucciones_29.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_29.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_29.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_29.setText("32. Saca la lengua.");
        getContentPane().add(Instrucciones_29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, -1));

        Instrucciones_30.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_30.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_30.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_30.setText("28. Agáchate.");
        getContentPane().add(Instrucciones_30, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        Instrucciones_31.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_31.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_31.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_31.setText("13. Recoge eso. ");
        getContentPane().add(Instrucciones_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 170, -1));

        Instrucciones_32.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_32.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_32.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_32.setText("27. Cierra el frasco.");
        getContentPane().add(Instrucciones_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        Instrucciones_33.setBackground(new java.awt.Color(0, 0, 0));
        Instrucciones_33.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        Instrucciones_33.setForeground(new java.awt.Color(0, 0, 0));
        Instrucciones_33.setText("26. Abre el frasco.");
        getContentPane().add(Instrucciones_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("en el suelo)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("(algo que esté ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 650, 560, 40));

        btnRequiereApoyo5.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo5.setBorderPainted(false);
        btnRequiereApoyo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 50, 30));

        btnCumplioObjetivo.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo.setBorderPainted(false);
        btnCumplioObjetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 50, 30));

        btnCasiLogra.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra.setBorderPainted(false);
        btnCasiLogra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLograActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 50, 30));

        btnRequiereApoyo6.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo6.setBorderPainted(false);
        btnRequiereApoyo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 50, 30));

        btnCasiLogra1.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra1.setBorderPainted(false);
        btnCasiLogra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 50, 30));

        btnCumplioObjetivo1.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo1.setBorderPainted(false);
        btnCumplioObjetivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 50, 30));

        btnRequiereApoyo7.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo7.setBorderPainted(false);
        btnRequiereApoyo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 50, 30));

        btnCasiLogra2.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra2.setBorderPainted(false);
        btnCasiLogra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 50, 30));

        btnCumplioObjetivo2.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo2.setBorderPainted(false);
        btnCumplioObjetivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 50, 30));

        btnRequiereApoyo8.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo8.setBorderPainted(false);
        btnRequiereApoyo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 50, 30));

        btnCasiLogra3.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra3.setBorderPainted(false);
        btnCasiLogra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 50, 30));

        btnCumplioObjetivo3.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo3.setBorderPainted(false);
        btnCumplioObjetivo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 50, 30));

        btnRequiereApoyo9.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo9.setBorderPainted(false);
        btnRequiereApoyo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 50, 30));

        btnCasiLogra4.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra4.setBorderPainted(false);
        btnCasiLogra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 50, 30));

        btnCumplioObjetivo4.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo4.setBorderPainted(false);
        btnCumplioObjetivo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 50, 30));

        btnRequiereApoyo10.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo10.setBorderPainted(false);
        btnRequiereApoyo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 50, 30));

        btnCasiLogra5.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra5.setBorderPainted(false);
        btnCasiLogra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 50, 30));

        btnCumplioObjetivo5.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo5.setBorderPainted(false);
        btnCumplioObjetivo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 50, 30));

        btnRequiereApoyo11.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo11.setBorderPainted(false);
        btnRequiereApoyo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 50, 30));

        btnCasiLogra6.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra6.setBorderPainted(false);
        btnCasiLogra6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 50, 30));

        btnCumplioObjetivo6.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo6.setBorderPainted(false);
        btnCumplioObjetivo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 50, 30));

        btnRequiereApoyo12.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo12.setBorderPainted(false);
        btnRequiereApoyo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 50, 30));

        btnCasiLogra7.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra7.setBorderPainted(false);
        btnCasiLogra7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 50, 30));

        btnCumplioObjetivo7.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo7.setBorderPainted(false);
        btnCumplioObjetivo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 50, 30));

        btnRequiereApoyo13.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo13.setBorderPainted(false);
        btnRequiereApoyo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 50, 30));

        btnCasiLogra8.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra8.setBorderPainted(false);
        btnCasiLogra8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 50, 30));

        btnCumplioObjetivo8.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo8.setBorderPainted(false);
        btnCumplioObjetivo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 50, 30));

        btnRequiereApoyo14.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo14.setBorderPainted(false);
        btnRequiereApoyo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 50, 30));

        btnCasiLogra9.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra9.setBorderPainted(false);
        btnCasiLogra9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 50, 30));

        btnCumplioObjetivo9.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo9.setBorderPainted(false);
        btnCumplioObjetivo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 50, 30));

        btnRequiereApoyo15.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo15.setBorderPainted(false);
        btnRequiereApoyo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 50, 30));

        btnCasiLogra10.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra10.setBorderPainted(false);
        btnCasiLogra10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 50, 30));

        btnCumplioObjetivo10.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo10.setBorderPainted(false);
        btnCumplioObjetivo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 50, 30));

        btnRequiereApoyo16.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo16.setBorderPainted(false);
        btnRequiereApoyo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 50, 30));

        btnCasiLogra11.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra11.setBorderPainted(false);
        btnCasiLogra11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 50, 30));

        btnCumplioObjetivo11.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo11.setBorderPainted(false);
        btnCumplioObjetivo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 50, 30));

        btnRequiereApoyo17.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo17.setBorderPainted(false);
        btnRequiereApoyo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 50, 30));

        btnCasiLogra12.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra12.setBorderPainted(false);
        btnCasiLogra12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 50, 30));

        btnCumplioObjetivo12.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo12.setBorderPainted(false);
        btnCumplioObjetivo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 50, 30));

        btnRequiereApoyo18.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo18.setBorderPainted(false);
        btnRequiereApoyo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo18ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 50, 30));

        btnCasiLogra13.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra13.setBorderPainted(false);
        btnCasiLogra13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 50, 30));

        btnCumplioObjetivo13.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo13.setBorderPainted(false);
        btnCumplioObjetivo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 50, 30));

        btnRequiereApoyo19.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo19.setBorderPainted(false);
        btnRequiereApoyo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo19ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 50, 30));

        btnCasiLogra14.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra14.setBorderPainted(false);
        btnCasiLogra14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 50, 30));

        btnCumplioObjetivo14.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo14.setBorderPainted(false);
        btnCumplioObjetivo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 50, 30));

        btnRequiereApoyo20.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo20.setBorderPainted(false);
        btnRequiereApoyo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo20ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 370, 50, 30));

        btnCumplioObjetivo15.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo15.setBorderPainted(false);
        btnCumplioObjetivo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 370, 50, 30));

        btnCasiLogra15.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra15.setBorderPainted(false);
        btnCasiLogra15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, 50, 30));

        btnRequiereApoyo21.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo21.setBorderPainted(false);
        btnRequiereApoyo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo21ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, 50, 30));

        btnCasiLogra16.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra16.setBorderPainted(false);
        btnCasiLogra16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 50, 30));

        btnCumplioObjetivo16.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo16.setBorderPainted(false);
        btnCumplioObjetivo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 410, 50, 30));

        btnRequiereApoyo22.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo22.setBorderPainted(false);
        btnRequiereApoyo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo22ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 50, 30));

        btnCasiLogra17.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra17.setBorderPainted(false);
        btnCasiLogra17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 450, 50, 30));

        btnCumplioObjetivo17.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo17.setBorderPainted(false);
        btnCumplioObjetivo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 450, 50, 30));

        btnRequiereApoyo23.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo23.setBorderPainted(false);
        btnRequiereApoyo23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo23ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, 50, 30));

        btnCasiLogra18.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra18.setBorderPainted(false);
        btnCasiLogra18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra18ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 490, 50, 30));

        btnCumplioObjetivo18.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo18.setBorderPainted(false);
        btnCumplioObjetivo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo18ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 490, 50, 30));

        btnRequiereApoyo24.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo24.setBorderPainted(false);
        btnRequiereApoyo24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo24ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo24, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 50, 30));

        btnCasiLogra19.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra19.setBorderPainted(false);
        btnCasiLogra19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra19ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, 50, 30));

        btnCumplioObjetivo19.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo19.setBorderPainted(false);
        btnCumplioObjetivo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo19ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 210, 50, 30));

        btnRequiereApoyo25.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo25.setBorderPainted(false);
        btnRequiereApoyo25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo25ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo25, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 50, 30));

        btnCasiLogra20.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra20.setBorderPainted(false);
        btnCasiLogra20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra20ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 50, 30));

        btnCumplioObjetivo20.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo20.setBorderPainted(false);
        btnCumplioObjetivo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo20ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 290, 50, 30));

        btnRequiereApoyo26.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo26.setBorderPainted(false);
        btnRequiereApoyo26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo26ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 50, 30));

        btnCasiLogra21.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra21.setBorderPainted(false);
        btnCasiLogra21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra21ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 650, 50, 30));

        btnCumplioObjetivo21.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo21.setBorderPainted(false);
        btnCumplioObjetivo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo21ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, 50, 30));

        btnRequiereApoyo27.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo27.setBorderPainted(false);
        btnRequiereApoyo27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo27ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo27, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 50, 30));

        btnCasiLogra22.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra22.setBorderPainted(false);
        btnCasiLogra22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra22ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 50, 30));

        btnCumplioObjetivo22.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo22.setBorderPainted(false);
        btnCumplioObjetivo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo22ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 50, 30));

        btnRequiereApoyo28.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo28.setBorderPainted(false);
        btnRequiereApoyo28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo28ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo28, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 50, 30));

        btnCasiLogra23.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra23.setBorderPainted(false);
        btnCasiLogra23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra23ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 50, 50, 30));

        btnCumplioObjetivo23.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo23.setBorderPainted(false);
        btnCumplioObjetivo23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo23ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 50, 50, 30));

        btnRequiereApoyo29.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo29.setBorderPainted(false);
        btnRequiereApoyo29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo29ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo29, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 50, 30));

        btnCasiLogra24.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra24.setBorderPainted(false);
        btnCasiLogra24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra24ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 50, 30));

        btnCumplioObjetivo24.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo24.setBorderPainted(false);
        btnCumplioObjetivo24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo24ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 90, 50, 30));

        btnRequiereApoyo30.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo30.setBorderPainted(false);
        btnRequiereApoyo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo30ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo30, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, 50, 30));

        btnCasiLogra25.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra25.setBorderPainted(false);
        btnCasiLogra25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra25ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 50, 30));

        btnCumplioObjetivo25.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo25.setBorderPainted(false);
        btnCumplioObjetivo25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo25ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 130, 50, 30));

        btnRequiereApoyo31.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo31.setBorderPainted(false);
        btnRequiereApoyo31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo31ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo31, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, 50, 30));

        btnCasiLogra26.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra26.setBorderPainted(false);
        btnCasiLogra26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra26ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, 50, 30));

        btnCumplioObjetivo26.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo26.setBorderPainted(false);
        btnCumplioObjetivo26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo26ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 170, 50, 30));

        btnRequiereApoyo32.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo32.setBorderPainted(false);
        btnRequiereApoyo32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo32ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo32, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, 50, 30));

        btnCasiLogra27.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra27.setBorderPainted(false);
        btnCasiLogra27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra27ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, 50, 30));

        btnCumplioObjetivo27.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo27.setBorderPainted(false);
        btnCumplioObjetivo27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo27ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 250, 50, 30));

        btnRequiereApoyo33.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo33.setBorderPainted(false);
        btnRequiereApoyo33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo33ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo33, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 330, 50, 30));

        btnCasiLogra28.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra28.setBorderPainted(false);
        btnCasiLogra28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra28ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, 50, 30));

        btnCumplioObjetivo28.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo28.setBorderPainted(false);
        btnCumplioObjetivo28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo28ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 330, 50, 30));

        btnRequiereApoyo34.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo34.setBorderPainted(false);
        btnRequiereApoyo34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo34ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 50, 30));

        btnCasiLogra29.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra29.setBorderPainted(false);
        btnCasiLogra29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra29ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 50, 30));

        btnCumplioObjetivo29.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo29.setBorderPainted(false);
        btnCumplioObjetivo29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo29ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 50, 30));

        btnRequiereApoyo35.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo35.setBorderPainted(false);
        btnRequiereApoyo35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo35ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo35, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 530, 50, 30));

        btnRequiereApoyo36.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo36.setBorderPainted(false);
        btnRequiereApoyo36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo36ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo36, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 570, 50, 30));

        btnRequiereApoyo37.setBackground(new java.awt.Color(255, 51, 51));
        btnRequiereApoyo37.setBorderPainted(false);
        btnRequiereApoyo37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequiereApoyo37ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequiereApoyo37, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 610, 50, 30));

        btnCasiLogra30.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra30.setBorderPainted(false);
        btnCasiLogra30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra30ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 610, 50, 30));

        btnCasiLogra31.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra31.setBorderPainted(false);
        btnCasiLogra31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra31ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, 50, 30));

        btnCasiLogra32.setBackground(new java.awt.Color(255, 255, 102));
        btnCasiLogra32.setBorderPainted(false);
        btnCasiLogra32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasiLogra32ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasiLogra32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 530, 50, 30));

        btnCumplioObjetivo30.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo30.setBorderPainted(false);
        btnCumplioObjetivo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo30ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 530, 50, 30));

        btnCumplioObjetivo31.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo31.setBorderPainted(false);
        btnCumplioObjetivo31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo31ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 570, 50, 30));

        btnCumplioObjetivo32.setBackground(new java.awt.Color(51, 204, 0));
        btnCumplioObjetivo32.setBorderPainted(false);
        btnCumplioObjetivo32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumplioObjetivo32ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCumplioObjetivo32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 610, 50, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/imagenes/FondoRosa.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        SeguimientoInstrucciones corporal = new SeguimientoInstrucciones();
        corporal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnRequiereApoyo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo5ActionPerformed

        estadoPorcentaje = 73.400671181;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequiereApoyo5ActionPerformed

    private void btnCumplioObjetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivoActionPerformed
        if (porcentajeActual < 73.56902135) {
            estadoPorcentaje = 73.569021351;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCumplioObjetivoActionPerformed

    private void btnCasiLograActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLograActionPerformed
        if (porcentajeActual == 73.400671181) {
            estadoPorcentaje = 72.89562067;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasiLograActionPerformed

    private void btnRequiereApoyo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo6ActionPerformed
        estadoPorcentaje = 72.55892034;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo6ActionPerformed

    private void btnCasiLogra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra1ActionPerformed
        if (porcentajeActual == 72.55892034) {
            estadoPorcentaje = 72.47474525;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra1ActionPerformed

    private void btnCumplioObjetivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo1ActionPerformed
        if (porcentajeActual < 72.72727051) {
            estadoPorcentaje = 72.727270511;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo1ActionPerformed

    private void btnRequiereApoyo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo7ActionPerformed
        estadoPorcentaje = 72.727270511;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo7ActionPerformed

    private void btnCasiLogra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra2ActionPerformed
        if (porcentajeActual == 72.727270511) {
            estadoPorcentaje = 72.55892034;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra2ActionPerformed

    private void btnCumplioObjetivo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo2ActionPerformed
        if (porcentajeActual < 72.89562067) {
            estadoPorcentaje = 72.895620671;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo2ActionPerformed

    private void btnRequiereApoyo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo8ActionPerformed
        estadoPorcentaje = 72.895620671;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo8ActionPerformed

    private void btnCasiLogra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra3ActionPerformed
        if (porcentajeActual == 72.895620671) {
            estadoPorcentaje = 72.64309542;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra3ActionPerformed

    private void btnCumplioObjetivo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo3ActionPerformed
        if (porcentajeActual < 73.06397084) {
            estadoPorcentaje = 73.063970841;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo3ActionPerformed

    private void btnRequiereApoyo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo9ActionPerformed
        estadoPorcentaje = 73.063970841;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo9ActionPerformed

    private void btnCasiLogra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra4ActionPerformed
        if (porcentajeActual == 73.063970841) {
            estadoPorcentaje = 72.72727051;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra4ActionPerformed

    private void btnCumplioObjetivo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo4ActionPerformed
        if (porcentajeActual < 73.23232101) {
            estadoPorcentaje = 73.232321011;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo4ActionPerformed

    private void btnRequiereApoyo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo10ActionPerformed
        estadoPorcentaje = 73.232321011;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo10ActionPerformed

    private void btnCasiLogra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra5ActionPerformed
        if (porcentajeActual == 73.232321011) {
            estadoPorcentaje = 72.81144559;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra5ActionPerformed

    private void btnCumplioObjetivo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo5ActionPerformed
        if (porcentajeActual < 73.40067118) {
            estadoPorcentaje = 73.400671181;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo5ActionPerformed

    private void btnRequiereApoyo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo11ActionPerformed
        estadoPorcentaje = 72.390570171;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo11ActionPerformed

    private void btnCasiLogra6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra6ActionPerformed
        if (porcentajeActual == 72.390570171) {
            estadoPorcentaje = 72.39057017;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra6ActionPerformed

    private void btnCumplioObjetivo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo6ActionPerformed
        if (porcentajeActual < 72.55892034) {
            estadoPorcentaje = 72.558920341;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo6ActionPerformed

    private void btnRequiereApoyo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo12ActionPerformed
        estadoPorcentaje = 73.569021351;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo12ActionPerformed

    private void btnCasiLogra7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra7ActionPerformed
        if (porcentajeActual == 73.569021351) {
            estadoPorcentaje = 72.97979576;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra7ActionPerformed

    private void btnCumplioObjetivo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo7ActionPerformed
        if (porcentajeActual < 73.73737152) {
            estadoPorcentaje = 73.737371521;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo7ActionPerformed

    private void btnRequiereApoyo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo13ActionPerformed
        estadoPorcentaje = 73.737371521;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo13ActionPerformed

    private void btnCasiLogra8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra8ActionPerformed
        if (porcentajeActual == 73.737371521) {
            estadoPorcentaje = 73.06397084;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra8ActionPerformed

    private void btnCumplioObjetivo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo8ActionPerformed
        if (porcentajeActual < 73.90572168) {
            estadoPorcentaje = 73.905721681;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo8ActionPerformed

    private void btnRequiereApoyo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo14ActionPerformed
        estadoPorcentaje = 73.905721681;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo14ActionPerformed

    private void btnCasiLogra9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra9ActionPerformed
        if (porcentajeActual == 73.905721681) {
            estadoPorcentaje = 73.14814593;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra9ActionPerformed

    private void btnCumplioObjetivo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo9ActionPerformed
        if (porcentajeActual < 74.07407185) {
            estadoPorcentaje = 74.074071851;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo9ActionPerformed

    private void btnRequiereApoyo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo15ActionPerformed
        estadoPorcentaje = 74.074071851;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo15ActionPerformed

    private void btnCasiLogra10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra10ActionPerformed
        if (porcentajeActual == 74.074071851) {
            estadoPorcentaje = 73.23232101;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra10ActionPerformed

    private void btnCumplioObjetivo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo10ActionPerformed
        if (porcentajeActual < 74.24242202) {
            estadoPorcentaje = 74.242422021;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo10ActionPerformed

    private void btnRequiereApoyo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo16ActionPerformed
        estadoPorcentaje = 74.242422021;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo16ActionPerformed

    private void btnCasiLogra11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra11ActionPerformed
        if (porcentajeActual == 74.242422021) {
            estadoPorcentaje = 73.3164961;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra11ActionPerformed

    private void btnCumplioObjetivo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo11ActionPerformed
        if (porcentajeActual < 74.41077219) {
            estadoPorcentaje = 74.410772191;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo11ActionPerformed

    private void btnRequiereApoyo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo17ActionPerformed
        estadoPorcentaje = 74.410772191;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo17ActionPerformed

    private void btnCasiLogra12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra12ActionPerformed
        if (porcentajeActual == 74.410772191) {
            estadoPorcentaje = 73.40067118;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra12ActionPerformed

    private void btnCumplioObjetivo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo12ActionPerformed
        if (porcentajeActual < 74.57912236) {
            estadoPorcentaje = 74.579122361;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo12ActionPerformed

    private void btnRequiereApoyo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo18ActionPerformed
        estadoPorcentaje = 74.579122361;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo18ActionPerformed

    private void btnCasiLogra13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra13ActionPerformed
        if (porcentajeActual == 74.579122361) {
            estadoPorcentaje = 73.48484626;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra13ActionPerformed

    private void btnCumplioObjetivo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo13ActionPerformed
        if (porcentajeActual < 74.74747253) {
            estadoPorcentaje = 74.747472531;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
            barrita = 100;
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo13ActionPerformed

    private void btnRequiereApoyo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo19ActionPerformed
        estadoPorcentaje = 72.22222;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo19ActionPerformed

    private void btnCasiLogra14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra14ActionPerformed
        if (porcentajeActual == 72.22222) {
            estadoPorcentaje = 72.30639508;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra14ActionPerformed

    private void btnCumplioObjetivo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo14ActionPerformed
        if (porcentajeActual < 72.39057017) {
            estadoPorcentaje = 72.390570171;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo14ActionPerformed

    private void btnRequiereApoyo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo20ActionPerformed

        estadoPorcentaje = 76.59932438;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequiereApoyo20ActionPerformed

    private void btnCumplioObjetivo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo15ActionPerformed
        if (porcentajeActual < 76.76767455) {
            estadoPorcentaje = 76.76767455;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCumplioObjetivo15ActionPerformed

    private void btnCasiLogra15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra15ActionPerformed
        if (porcentajeActual == 76.59932438) {
            estadoPorcentaje = 74.49494727;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasiLogra15ActionPerformed

    private void btnRequiereApoyo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo21ActionPerformed
        estadoPorcentaje = 76.76767455;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo21ActionPerformed

    private void btnCasiLogra16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra16ActionPerformed
        if (porcentajeActual == 76.76767455) {
            estadoPorcentaje = 74.57912236;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra16ActionPerformed

    private void btnCumplioObjetivo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo16ActionPerformed
        if (porcentajeActual < 76.93602472) {
            estadoPorcentaje = 76.93602472;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo16ActionPerformed

    private void btnRequiereApoyo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo22ActionPerformed
        estadoPorcentaje = 76.93602472;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo22ActionPerformed

    private void btnCasiLogra17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra17ActionPerformed
        if (porcentajeActual == 76.93602472) {
            estadoPorcentaje = 74.66329744;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra17ActionPerformed

    private void btnCumplioObjetivo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo17ActionPerformed
        if (porcentajeActual < 77.10437489) {
            estadoPorcentaje = 77.10437489;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo17ActionPerformed

    private void btnRequiereApoyo23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo23ActionPerformed
        estadoPorcentaje = 77.10437489;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo23ActionPerformed

    private void btnCasiLogra18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra18ActionPerformed
        if (porcentajeActual == 77.10437489) {
            estadoPorcentaje = 74.74747253;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra18ActionPerformed

    private void btnCumplioObjetivo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo18ActionPerformed
        if (porcentajeActual < 77.27272505) {
            estadoPorcentaje = 77.27272505;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo18ActionPerformed

    private void btnRequiereApoyo24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo24ActionPerformed
        estadoPorcentaje = 75.92592371;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo24ActionPerformed

    private void btnCasiLogra19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra19ActionPerformed
        if (porcentajeActual == 75.92592371) {
            estadoPorcentaje = 74.15824694;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra19ActionPerformed

    private void btnCumplioObjetivo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo19ActionPerformed
        if (porcentajeActual < 76.09427388) {
            estadoPorcentaje = 76.09427388;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo19ActionPerformed

    private void btnRequiereApoyo25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo25ActionPerformed
        estadoPorcentaje = 76.26262404;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo25ActionPerformed

    private void btnCasiLogra20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra20ActionPerformed
        if (porcentajeActual == 76.26262404) {
            estadoPorcentaje = 74.32659711;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra20ActionPerformed

    private void btnCumplioObjetivo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo20ActionPerformed
        if (porcentajeActual < 76.43097421) {
            estadoPorcentaje = 76.43097421;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo20ActionPerformed

    private void btnRequiereApoyo26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo26ActionPerformed
        estadoPorcentaje = 74.91582271;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo26ActionPerformed

    private void btnCasiLogra21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra21ActionPerformed
        if (porcentajeActual == 74.91582271) {
            estadoPorcentaje = 73.65319643;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra21ActionPerformed

    private void btnCumplioObjetivo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo21ActionPerformed
        if (porcentajeActual < 75.08417286) {
            estadoPorcentaje = 75.08417286;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo21ActionPerformed

    private void btnRequiereApoyo27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo27ActionPerformed
        estadoPorcentaje = 75.08417286;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo27ActionPerformed

    private void btnCasiLogra22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra22ActionPerformed
        if (porcentajeActual == 75.08417286) {
            estadoPorcentaje = 73.73737152;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra22ActionPerformed

    private void btnCumplioObjetivo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo22ActionPerformed
        if (porcentajeActual < 75.25252303) {
            estadoPorcentaje = 75.25252303;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo22ActionPerformed

    private void btnRequiereApoyo28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo28ActionPerformed
        estadoPorcentaje = 75.25252303;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo28ActionPerformed

    private void btnCasiLogra23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra23ActionPerformed
        if (porcentajeActual == 75.25252303) {
            estadoPorcentaje = 73.8215466;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra23ActionPerformed

    private void btnCumplioObjetivo23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo23ActionPerformed
        if (porcentajeActual < 75.4208732) {
            estadoPorcentaje = 75.4208732;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo23ActionPerformed

    private void btnRequiereApoyo29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo29ActionPerformed
        estadoPorcentaje = 75.4208732;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo29ActionPerformed

    private void btnCasiLogra24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra24ActionPerformed
        if (porcentajeActual == 75.4208732) {
            estadoPorcentaje = 73.90572168;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra24ActionPerformed

    private void btnCumplioObjetivo24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo24ActionPerformed
        if (porcentajeActual < 75.58922337) {
            estadoPorcentaje = 75.58922337;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo24ActionPerformed

    private void btnRequiereApoyo30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo30ActionPerformed
        estadoPorcentaje = 75.58922337;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo30ActionPerformed

    private void btnCasiLogra25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra25ActionPerformed
        if (porcentajeActual == 75.58922337) {
            estadoPorcentaje = 73.98989677;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra25ActionPerformed

    private void btnCumplioObjetivo25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo25ActionPerformed
        if (porcentajeActual < 75.75757354) {
            estadoPorcentaje = 75.75757354;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo25ActionPerformed

    private void btnRequiereApoyo31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo31ActionPerformed
        estadoPorcentaje = 75.75757354;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo31ActionPerformed

    private void btnCasiLogra26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra26ActionPerformed
        if (porcentajeActual == 75.75757354) {
            estadoPorcentaje = 74.07407185;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra26ActionPerformed

    private void btnCumplioObjetivo26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo26ActionPerformed
        if (porcentajeActual < 75.92592371) {
            estadoPorcentaje = 75.92592371;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo26ActionPerformed

    private void btnRequiereApoyo32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo32ActionPerformed
        estadoPorcentaje = 76.09427388;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo32ActionPerformed

    private void btnCasiLogra27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra27ActionPerformed
        if (porcentajeActual == 76.09427388) {
            estadoPorcentaje = 74.24242202;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra27ActionPerformed

    private void btnCumplioObjetivo27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo27ActionPerformed
        if (porcentajeActual < 76.26262404) {
            estadoPorcentaje = 76.26262404;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo27ActionPerformed

    private void btnRequiereApoyo33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo33ActionPerformed
        estadoPorcentaje = 76.43097421;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo33ActionPerformed

    private void btnCasiLogra28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra28ActionPerformed
        if (porcentajeActual == 76.43097421) {
            estadoPorcentaje = 74.41077219;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra28ActionPerformed

    private void btnCumplioObjetivo28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo28ActionPerformed
        if (porcentajeActual < 76.59932438) {
            estadoPorcentaje = 76.59932438;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
            barrita = 100;
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo28ActionPerformed

    private void btnRequiereApoyo34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo34ActionPerformed
        estadoPorcentaje = 74.747472531;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo34ActionPerformed

    private void btnCasiLogra29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra29ActionPerformed
        if (porcentajeActual == 74.747472531) {
            estadoPorcentaje = 73.56902135;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra29ActionPerformed

    private void btnCumplioObjetivo29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo29ActionPerformed
        if (porcentajeActual < 74.9158227) {
            estadoPorcentaje = 74.91582271;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo29ActionPerformed

    private void btnRequiereApoyo35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo35ActionPerformed
        estadoPorcentaje = 77.27272505;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo35ActionPerformed

    private void btnRequiereApoyo36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo36ActionPerformed
        estadoPorcentaje = 77.44107522;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo36ActionPerformed

    private void btnRequiereApoyo37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequiereApoyo37ActionPerformed
        estadoPorcentaje = 77.60942539;
        PorcentajeNiño();
        porcentajeActual = estadoPorcentaje;
        BarraProgreso();
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnRequiereApoyo37ActionPerformed

    private void btnCasiLogra30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra30ActionPerformed
        if (porcentajeActual == 77.60942539) {
            estadoPorcentaje = 75;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra30ActionPerformed

    private void btnCasiLogra31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra31ActionPerformed
        if (porcentajeActual == 77.44107522) {
            estadoPorcentaje = 74.9158227;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra31ActionPerformed

    private void btnCasiLogra32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasiLogra32ActionPerformed
        if (porcentajeActual == 77.27272505) {
            estadoPorcentaje = 74.83164761;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCasiLogra32ActionPerformed

    private void btnCumplioObjetivo30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo30ActionPerformed
        if (porcentajeActual < 77.44107522) {
            estadoPorcentaje = 77.44107522;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo30ActionPerformed

    private void btnCumplioObjetivo31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo31ActionPerformed
        if (porcentajeActual < 77.60942539) {
            estadoPorcentaje = 77.60942539;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo31ActionPerformed

    private void btnCumplioObjetivo32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumplioObjetivo32ActionPerformed
        if (porcentajeActual < 77.777778) {
            estadoPorcentaje = 77.777778;
            PorcentajeNiño();
            porcentajeActual = estadoPorcentaje;
            BarraProgreso();
        }
        System.out.println(estadoPorcentaje);
        System.out.println(porcentajeActual);
    }//GEN-LAST:event_btnCumplioObjetivo32ActionPerformed

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
            java.util.logging.Logger.getLogger(InstruccSeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstruccSeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstruccSeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstruccSeguimientoInstrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstruccSeguimientoInstrucciones().setVisible(true);
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
    private javax.swing.JLabel Instrucciones_16;
    private javax.swing.JLabel Instrucciones_17;
    private javax.swing.JLabel Instrucciones_18;
    private javax.swing.JLabel Instrucciones_19;
    private javax.swing.JLabel Instrucciones_2;
    private javax.swing.JLabel Instrucciones_20;
    private javax.swing.JLabel Instrucciones_21;
    private javax.swing.JLabel Instrucciones_22;
    private javax.swing.JLabel Instrucciones_23;
    private javax.swing.JLabel Instrucciones_24;
    private javax.swing.JLabel Instrucciones_25;
    private javax.swing.JLabel Instrucciones_26;
    private javax.swing.JLabel Instrucciones_27;
    private javax.swing.JLabel Instrucciones_28;
    private javax.swing.JLabel Instrucciones_29;
    private javax.swing.JLabel Instrucciones_3;
    private javax.swing.JLabel Instrucciones_30;
    private javax.swing.JLabel Instrucciones_31;
    private javax.swing.JLabel Instrucciones_32;
    private javax.swing.JLabel Instrucciones_33;
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
    private javax.swing.JButton btnCasiLogra15;
    private javax.swing.JButton btnCasiLogra16;
    private javax.swing.JButton btnCasiLogra17;
    private javax.swing.JButton btnCasiLogra18;
    private javax.swing.JButton btnCasiLogra19;
    private javax.swing.JButton btnCasiLogra2;
    private javax.swing.JButton btnCasiLogra20;
    private javax.swing.JButton btnCasiLogra21;
    private javax.swing.JButton btnCasiLogra22;
    private javax.swing.JButton btnCasiLogra23;
    private javax.swing.JButton btnCasiLogra24;
    private javax.swing.JButton btnCasiLogra25;
    private javax.swing.JButton btnCasiLogra26;
    private javax.swing.JButton btnCasiLogra27;
    private javax.swing.JButton btnCasiLogra28;
    private javax.swing.JButton btnCasiLogra29;
    private javax.swing.JButton btnCasiLogra3;
    private javax.swing.JButton btnCasiLogra30;
    private javax.swing.JButton btnCasiLogra31;
    private javax.swing.JButton btnCasiLogra32;
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
    private javax.swing.JButton btnCumplioObjetivo15;
    private javax.swing.JButton btnCumplioObjetivo16;
    private javax.swing.JButton btnCumplioObjetivo17;
    private javax.swing.JButton btnCumplioObjetivo18;
    private javax.swing.JButton btnCumplioObjetivo19;
    private javax.swing.JButton btnCumplioObjetivo2;
    private javax.swing.JButton btnCumplioObjetivo20;
    private javax.swing.JButton btnCumplioObjetivo21;
    private javax.swing.JButton btnCumplioObjetivo22;
    private javax.swing.JButton btnCumplioObjetivo23;
    private javax.swing.JButton btnCumplioObjetivo24;
    private javax.swing.JButton btnCumplioObjetivo25;
    private javax.swing.JButton btnCumplioObjetivo26;
    private javax.swing.JButton btnCumplioObjetivo27;
    private javax.swing.JButton btnCumplioObjetivo28;
    private javax.swing.JButton btnCumplioObjetivo29;
    private javax.swing.JButton btnCumplioObjetivo3;
    private javax.swing.JButton btnCumplioObjetivo30;
    private javax.swing.JButton btnCumplioObjetivo31;
    private javax.swing.JButton btnCumplioObjetivo32;
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
    private javax.swing.JButton btnRequiereApoyo20;
    private javax.swing.JButton btnRequiereApoyo21;
    private javax.swing.JButton btnRequiereApoyo22;
    private javax.swing.JButton btnRequiereApoyo23;
    private javax.swing.JButton btnRequiereApoyo24;
    private javax.swing.JButton btnRequiereApoyo25;
    private javax.swing.JButton btnRequiereApoyo26;
    private javax.swing.JButton btnRequiereApoyo27;
    private javax.swing.JButton btnRequiereApoyo28;
    private javax.swing.JButton btnRequiereApoyo29;
    private javax.swing.JButton btnRequiereApoyo30;
    private javax.swing.JButton btnRequiereApoyo31;
    private javax.swing.JButton btnRequiereApoyo32;
    private javax.swing.JButton btnRequiereApoyo33;
    private javax.swing.JButton btnRequiereApoyo34;
    private javax.swing.JButton btnRequiereApoyo35;
    private javax.swing.JButton btnRequiereApoyo36;
    private javax.swing.JButton btnRequiereApoyo37;
    private javax.swing.JButton btnRequiereApoyo5;
    private javax.swing.JButton btnRequiereApoyo6;
    private javax.swing.JButton btnRequiereApoyo7;
    private javax.swing.JButton btnRequiereApoyo8;
    private javax.swing.JButton btnRequiereApoyo9;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
