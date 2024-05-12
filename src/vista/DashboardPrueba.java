package vista;

import controlador.ControladorPrincipal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import principal.Login;

public class DashboardPrueba extends javax.swing.JFrame {

    public DashboardPrueba() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mostrarPanel(new Inicio());
        btnInicio.setBackground(new Color(23, 86, 197));
        //ControladorPrincipal controladorPrincipal = new ControladorPrincipal(this);
        ImageIcon icon = new ImageIcon("src\\imagenes\\birrete-blanco.png");
        this.getRootPane().setDefaultButton(null);
        this.setIconImage(icon.getImage());
        SetDate();
    }

    public static void mostrarPanel(JPanel p) {
        p.setSize(780, 430);
        p.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        fecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardPrueba().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnInicio = new principal.MyButton();
        btnAsignaturas = new principal.MyButton();
        btnDesempeño = new principal.MyButton();
        btnCalificaciones = new principal.MyButton();
        btnCerrarSesion = new principal.MyButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnCalificaciones1 = new principal.MyButton();
        btnEstudiantes = new principal.MyButton();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 640));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1020, 640));
        background.setPreferredSize(new java.awt.Dimension(1020, 640));

        menu.setBackground(new java.awt.Color(9, 72, 179));
        menu.setPreferredSize(new java.awt.Dimension(240, 640));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SCHOOLTOOL");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnInicio.setBackground(new java.awt.Color(9, 72, 179));
        btnInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hogar.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setColorHover(new java.awt.Color(23, 86, 197));
        btnInicio.setColorNormal(new java.awt.Color(9, 72, 179));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInicio.setIconTextGap(10);

        btnAsignaturas.setBackground(new java.awt.Color(9, 72, 179));
        btnAsignaturas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        btnAsignaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros2.png"))); // NOI18N
        btnAsignaturas.setText("Asignaturas");
        btnAsignaturas.setColorHover(new java.awt.Color(23, 86, 197));
        btnAsignaturas.setColorNormal(new java.awt.Color(9, 72, 179));
        btnAsignaturas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAsignaturas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAsignaturas.setIconTextGap(10);

        btnDesempeño.setBackground(new java.awt.Color(9, 72, 179));
        btnDesempeño.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        btnDesempeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/insignia.png"))); // NOI18N
        btnDesempeño.setText("Desempeño");
        btnDesempeño.setColorHover(new java.awt.Color(23, 86, 197));
        btnDesempeño.setColorNormal(new java.awt.Color(9, 72, 179));
        btnDesempeño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDesempeño.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnDesempeño.setIconTextGap(10);

        btnCalificaciones.setBackground(new java.awt.Color(9, 72, 179));
        btnCalificaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        btnCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calificacion.png"))); // NOI18N
        btnCalificaciones.setText("Calificaciones");
        btnCalificaciones.setColorHover(new java.awt.Color(23, 86, 197));
        btnCalificaciones.setColorNormal(new java.awt.Color(9, 72, 179));
        btnCalificaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCalificaciones.setIconTextGap(10);

        btnCerrarSesion.setBackground(new java.awt.Color(9, 72, 179));
        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar_sesion.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setColorHover(new java.awt.Color(23, 86, 197));
        btnCerrarSesion.setColorNormal(new java.awt.Color(9, 72, 179));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCerrarSesion.setIconTextGap(10);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnCalificaciones1.setBackground(new java.awt.Color(9, 72, 179));
        btnCalificaciones1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        btnCalificaciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf2.png"))); // NOI18N
        btnCalificaciones1.setText("Generar informe");
        btnCalificaciones1.setColorHover(new java.awt.Color(23, 86, 197));
        btnCalificaciones1.setColorNormal(new java.awt.Color(9, 72, 179));
        btnCalificaciones1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalificaciones1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCalificaciones1.setIconTextGap(10);

        btnEstudiantes.setBackground(new java.awt.Color(9, 72, 179));
        btnEstudiantes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        btnEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduado-gordo.png"))); // NOI18N
        btnEstudiantes.setText("Estudiantes");
        btnEstudiantes.setColorHover(new java.awt.Color(23, 86, 197));
        btnEstudiantes.setColorNormal(new java.awt.Color(9, 72, 179));
        btnEstudiantes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEstudiantes.setIconTextGap(10);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDesempeño, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCalificaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDesempeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCalificaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(780, 150));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Profesor/Calificaciones/Logros");

        fecha.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(fecha)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                    .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public principal.MyButton btnAsignaturas;
    public principal.MyButton btnCalificaciones;
    public principal.MyButton btnCalificaciones1;
    public principal.MyButton btnCerrarSesion;
    public principal.MyButton btnDesempeño;
    public principal.MyButton btnEstudiantes;
    public principal.MyButton btnInicio;
    public static javax.swing.JPanel contenido;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
