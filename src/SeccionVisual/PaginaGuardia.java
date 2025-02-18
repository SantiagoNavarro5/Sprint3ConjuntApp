package SeccionVisual;

import Visitas.VisitasGuardia;
import Reservaciones.ReservacionesEmpleado;
import PaginaPrincipal.PaginaPrincipal;
import Domicilios.DomiciliosGuardia;
import CuentasGeneral.CuentaGuardia;
import ConfiguracionGeneral.ConfiguracionComun;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PaginaGuardia extends javax.swing.JFrame {

    public PaginaGuardia() {
        initComponents();
        ajustarImagenLabel();
        
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

        jPanel3 = new javax.swing.JPanel();
        PanelPagina = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PaginaPrincipal = new javax.swing.JButton();
        Cuentas = new javax.swing.JButton();
        Visitas = new javax.swing.JButton();
        Domicilios = new javax.swing.JButton();
        Reservaciones = new javax.swing.JButton();
        Configuración = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        PanelPagina.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelPaginaLayout = new javax.swing.GroupLayout(PanelPagina);
        PanelPagina.setLayout(PanelPaginaLayout);
        PanelPaginaLayout.setHorizontalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        PanelPaginaLayout.setVerticalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(141, 153, 174));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 147, 244));
        jLabel2.setText("ConjuntApp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
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

        Visitas.setText("Visitas");
        Visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitasActionPerformed(evt);
            }
        });

        Domicilios.setText("Domicilios");
        Domicilios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomiciliosActionPerformed(evt);
            }
        });

        Reservaciones.setText("Reservaciones");
        Reservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservacionesActionPerformed(evt);
            }
        });

        Configuración.setText("Configuración");
        Configuración.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguraciónActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(PanelPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaginaPrincipal)
                    .addComponent(Cuentas)
                    .addComponent(Visitas)
                    .addComponent(Reservaciones)
                    .addComponent(Domicilios)
                    .addComponent(Configuración))
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PaginaPrincipal)
                        .addGap(18, 18, 18)
                        .addComponent(Cuentas)
                        .addGap(18, 18, 18)
                        .addComponent(Visitas)
                        .addGap(18, 18, 18)
                        .addComponent(Domicilios)
                        .addGap(18, 18, 18)
                        .addComponent(Reservaciones)
                        .addGap(18, 18, 18)
                        .addComponent(Configuración)
                        .addGap(0, 90, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        CuentaGuardia p2 = new CuentaGuardia ();
        p2.setSize(350, 328);
        p2.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p2, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_CuentasActionPerformed

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

    private void ReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservacionesActionPerformed
        ReservacionesEmpleado p4 = new ReservacionesEmpleado ();
        p4.setSize(350, 328);
        p4.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p4, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ReservacionesActionPerformed

    private void ConfiguraciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguraciónActionPerformed
        ConfiguracionComun p8 = new ConfiguracionComun ();
        p8.setSize(350, 328);
        p8.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p8, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ConfiguraciónActionPerformed
    
    
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
    private javax.swing.JButton Configuración;
    private javax.swing.JButton Cuentas;
    private javax.swing.JButton Domicilios;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton PaginaPrincipal;
    private javax.swing.JPanel PanelPagina;
    private javax.swing.JButton Reservaciones;
    private javax.swing.JButton Visitas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
