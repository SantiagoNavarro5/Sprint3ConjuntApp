package ConfiguracionGeneral;

import Clases.Servicios;
import Clases.Usuario;
import SeccionVisual.Login;
import java.util.ArrayList;
import java.util.List;


public class ConfiguracionComun extends javax.swing.JPanel {

    public ConfiguracionComun() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CerrarSesion = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(141, 153, 174));
        jLabel1.setText("Configuración");

        jPanel1.setBackground(new java.awt.Color(245, 83, 34));

        CerrarSesion.setText("Cerrar sesion");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CerrarSesion)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(CerrarSesion)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(231, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        //Login.usuarioLogueado = null; // Aquí se accede al usuarioLogueado desde Login (porque es estático)
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();// Mostrar la ventana de login nuevamente
        //List<Usuario> usuarios = obtenerListaUsuarios();
        //List<Usuario> usuarios = Servicios.obtenerUsuariosExistentes();
        //new Login(usuarios).setVisible(true);
        List<Usuario> usuarios = Login.obtenerUsuariosExistentes();
        new Login(usuarios).setVisible(true);
        //new Login(this.usuarios).setVisible(true);
        //new Login(obtenerListaUsuarios()).setVisible(true); // Mostrar la ventana de login
    }//GEN-LAST:event_CerrarSesionActionPerformed
    
    private List<Usuario> obtenerListaUsuarios() {
        // Aquí deberías cargar la lista de usuarios, por ejemplo, desde una base de datos o un archivo
        return new ArrayList<>(); // Reemplázalo con la verdadera fuente de datos
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
