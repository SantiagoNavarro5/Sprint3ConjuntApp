package SeccionVisual;

import Visitas.VisitasGuardia;
import Reservaciones.ReservacionesEmpleado;
import AvisosGenerales.AvisosAdmin;
import PaginaPrincipal.PaginaPrincipal;
import Notificaciones.NotificacionesAdmin;
import Domicilios.DomiciliosGuardia;
import Cuentas.CuentasAdmin;
//import ConfiguracionGeneral.CrearCuentaAdmin;
import ConfiguracionGeneral.ConfiguracionAdmin;
import QuejasGeneral.QuejasAdmin;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PaginaAdmin extends javax.swing.JFrame {

    public PaginaAdmin() {
        initComponents();
        ajustarImagenLabel();
        Visitas.setVisible(false);
        Reservaciones.setVisible(false);
        Domicilios.setVisible(false);
        
        PaginaPrincipal p1 = new PaginaPrincipal ();
        p1.setSize(350, 328);
        p1.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p1, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelPagina = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Visitas = new javax.swing.JButton();
        Reservaciones = new javax.swing.JButton();
        Domicilios = new javax.swing.JButton();
        PaginaPrincipal = new javax.swing.JButton();
        Cuentas = new javax.swing.JButton();
        AvisosGeneral = new javax.swing.JButton();
        AvisoPersonal = new javax.swing.JButton();
        Quejas = new javax.swing.JButton();
        Configuración = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PanelPagina.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelPaginaLayout = new javax.swing.GroupLayout(PanelPagina);
        PanelPagina.setLayout(PanelPaginaLayout);
        PanelPaginaLayout.setHorizontalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        PanelPaginaLayout.setVerticalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        Titulo.setBackground(new java.awt.Color(141, 153, 174));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 147, 244));
        jLabel2.setText("ConjuntApp");

        Visitas.setText("Visitas");
        Visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitasActionPerformed(evt);
            }
        });

        Reservaciones.setText("Reservaciones");
        Reservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservacionesActionPerformed(evt);
            }
        });

        Domicilios.setText("Domicilios");
        Domicilios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomiciliosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(Visitas)
                .addGap(18, 18, 18)
                .addComponent(Reservaciones)
                .addGap(18, 18, 18)
                .addComponent(Domicilios)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(TituloLayout.createSequentialGroup()
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Visitas)
                    .addComponent(Reservaciones)
                    .addComponent(Domicilios))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PaginaPrincipal.setText("Pagina principal");
        PaginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginaPrincipalActionPerformed(evt);
            }
        });

        Cuentas.setText("Cuentas");
        Cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentasActionPerformed(evt);
            }
        });

        AvisosGeneral.setText("AvisosGenerales");

        AvisoPersonal.setText("Aviso personal");
        AvisoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvisoPersonalActionPerformed(evt);
            }
        });

        Quejas.setText("Quejas y reclamos");
        Quejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuejasActionPerformed(evt);
            }
        });

        Configuración.setText("Configuración");
        Configuración.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguraciónActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaginaPrincipal)
                    .addComponent(Cuentas)
                    .addComponent(AvisosGeneral)
                    .addComponent(AvisoPersonal)
                    .addComponent(Quejas)
                    .addComponent(Configuración))
                .addGap(28, 28, 28))
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PaginaPrincipal)
                        .addGap(18, 18, 18)
                        .addComponent(Cuentas)
                        .addGap(18, 18, 18)
                        .addComponent(AvisosGeneral)
                        .addGap(18, 18, 18)
                        .addComponent(AvisoPersonal)
                        .addGap(18, 18, 18)
                        .addComponent(Quejas)
                        .addGap(18, 18, 18)
                        .addComponent(Configuración)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PaginaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaginaPrincipalActionPerformed
        PaginaPrincipal p1 = new PaginaPrincipal ();
        p1.setSize(350, 328);
        p1.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p1, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_PaginaPrincipalActionPerformed

    private void CuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentasActionPerformed
        CuentasAdmin p2 = new CuentasAdmin ();
        p2.setSize(350, 328);
        p2.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p2, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_CuentasActionPerformed

    private void AvisoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvisoPersonalActionPerformed
        NotificacionesAdmin p3 = new NotificacionesAdmin ();
        p3.setSize(350, 328);
        p3.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p3, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_AvisoPersonalActionPerformed

    private void ReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservacionesActionPerformed
        ReservacionesEmpleado p4 = new ReservacionesEmpleado ();
        p4.setSize(350, 328);
        p4.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p4, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ReservacionesActionPerformed

    private void VisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitasActionPerformed
        VisitasGuardia p5 = new VisitasGuardia ();
        p5.setSize(350, 328);
        p5.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p5, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_VisitasActionPerformed

    private void DomiciliosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomiciliosActionPerformed
        DomiciliosGuardia p6 = new DomiciliosGuardia ();
        p6.setSize(350, 328);
        p6.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p6, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_DomiciliosActionPerformed

    private void ConfiguraciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguraciónActionPerformed
        ConfiguracionAdmin p8 = new ConfiguracionAdmin ();
        p8.setSize(350, 328);
        p8.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p8, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ConfiguraciónActionPerformed

    private void QuejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuejasActionPerformed
        QuejasAdmin p9 = new QuejasAdmin ();
        p9.setSize(350, 328);
        p9.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p9, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_QuejasActionPerformed
    
    public void cambiarPanel(JPanel nuevoPanel) {
        /*
        CrearCuentaAdmin p9 = new CrearCuentaAdmin ();
        p9.setSize(350, 328);
        p9.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p9, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
        */
    }
    
    public void ajustarImagenLabel() {
        // Cargar la imagen
        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("/LlavesFondoGris.png"));
        // Escalar la imagen al tamaño del JLabel
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon iconoRedimensionado = new ImageIcon(imagenEscalada);
        // Establecer la imagen en el JLabel
        Logo.setIcon(iconoRedimensionado);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvisoPersonal;
    private javax.swing.JButton AvisosGeneral;
    private javax.swing.JButton Configuración;
    private javax.swing.JButton Cuentas;
    private javax.swing.JButton Domicilios;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton PaginaPrincipal;
    private javax.swing.JPanel PanelPagina;
    private javax.swing.JButton Quejas;
    private javax.swing.JButton Reservaciones;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton Visitas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
