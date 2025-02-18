package SeccionVisual;


import Visitas.VisitasCliente;
import Reservaciones.ReservacionesCliente;
import Notificaciones.PagosCliente;
import PaginaPrincipal.PaginaPrincipal;
import Notificaciones.NotificacionesCliente;
import Domicilios.DomiciliosCliente;
import Cuentas.CuentaCliente;
import ConfiguracionGeneral.ConfiguracionComun;
import QuejasGeneral.QuejasClientes;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PaginaClientes extends javax.swing.JFrame {

    public PaginaClientes() {
        initComponents();
        ajustarImagenLabel();
        Pagos.setVisible(false);
        
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

        PanelMenu = new javax.swing.JPanel();
        PanelPagina = new javax.swing.JPanel();
        PaginaPrincipal = new javax.swing.JButton();
        Cuenta = new javax.swing.JButton();
        Notificaciones = new javax.swing.JButton();
        Reservaciones = new javax.swing.JButton();
        Visitas = new javax.swing.JButton();
        Domicilios = new javax.swing.JButton();
        Configuracion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Titulo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Pagos = new javax.swing.JButton();
        Quejas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMenu.setBackground(new java.awt.Color(255, 255, 255));

        PanelPagina.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelPaginaLayout = new javax.swing.GroupLayout(PanelPagina);
        PanelPagina.setLayout(PanelPaginaLayout);
        PanelPaginaLayout.setHorizontalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        PanelPaginaLayout.setVerticalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        PaginaPrincipal.setText("PaginaPrincipal");
        PaginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginaPrincipalActionPerformed(evt);
            }
        });

        Cuenta.setText("Cuenta");
        Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaActionPerformed(evt);
            }
        });

        Notificaciones.setText("Notificaciones");
        Notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificacionesActionPerformed(evt);
            }
        });

        Reservaciones.setText("Reservaciones");
        Reservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservacionesActionPerformed(evt);
            }
        });

        Visitas.setText("Visitas");
        Visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitasActionPerformed(evt);
            }
        });

        Domicilios.setText("Domicilios y paquetes");
        Domicilios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomiciliosActionPerformed(evt);
            }
        });

        Configuracion.setText("Configuración");
        Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionActionPerformed(evt);
            }
        });

        Titulo.setBackground(new java.awt.Color(141, 153, 174));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(21, 147, 244));
        jLabel9.setText("ConjuntApp");

        Pagos.setText("Pagos pendientes");
        Pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pagos)
                .addGap(21, 21, 21))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TituloLayout.createSequentialGroup()
                .addComponent(Pagos)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Quejas.setText("Quejas y reclamos");
        Quejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuejasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addComponent(PanelPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaginaPrincipal)
                    .addComponent(Cuenta)
                    .addComponent(Notificaciones)
                    .addComponent(Reservaciones)
                    .addComponent(Visitas)
                    .addComponent(Domicilios)
                    .addComponent(Configuracion)
                    .addComponent(Quejas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PaginaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Notificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Reservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Visitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Domicilios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quejas))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Configuracion)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(PanelPagina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaActionPerformed
        CuentaCliente p2 = new CuentaCliente ();
        p2.setSize(350, 328);
        p2.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p2, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_CuentaActionPerformed

    private void NotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificacionesActionPerformed
        NotificacionesCliente p3 = new NotificacionesCliente ();
        p3.setSize(350, 328);
        p3.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p3, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_NotificacionesActionPerformed

    private void ReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservacionesActionPerformed
        ReservacionesCliente p4 = new ReservacionesCliente ();
        p4.setSize(350, 328);
        p4.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p4, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ReservacionesActionPerformed

    private void VisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitasActionPerformed
        VisitasCliente p5 = new VisitasCliente ();
        p5.setSize(350, 328);
        p5.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p5, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_VisitasActionPerformed

    private void DomiciliosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomiciliosActionPerformed
        DomiciliosCliente p6 = new DomiciliosCliente ();
        p6.setSize(350, 328);
        p6.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p6, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_DomiciliosActionPerformed

    private void PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagosActionPerformed
        PagosCliente p7 = new PagosCliente ();
        p7.setSize(350, 328);
        p7.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p7, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_PagosActionPerformed

    private void ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionActionPerformed
        ConfiguracionComun p8 = new ConfiguracionComun ();
        p8.setSize(350, 328);
        p8.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p8, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ConfiguracionActionPerformed

    private void QuejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuejasActionPerformed
        QuejasClientes p9 = new QuejasClientes ();
        p9.setSize(350, 328);
        p9.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p9, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_QuejasActionPerformed
    
    public void ajustarImagenLabel() {
        /*
        Logo.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                // Cargar la imagen
                ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("/LlavesFondoGris.png"));
                // Escalar la imagen al tamaño del JLabel
                Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(
                    Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
                // Crear un nuevo ImageIcon con la imagen redimensionada
                ImageIcon iconoRedimensionado = new ImageIcon(imagenEscalada);
                // Establecer la imagen en el JLabel
                Logo.setIcon(iconoRedimensionado);
            }
        });
        */
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
    private javax.swing.JButton Configuracion;
    private javax.swing.JButton Cuenta;
    private javax.swing.JButton Domicilios;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Notificaciones;
    private javax.swing.JButton PaginaPrincipal;
    private javax.swing.JButton Pagos;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPagina;
    private javax.swing.JButton Quejas;
    private javax.swing.JButton Reservaciones;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton Visitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
