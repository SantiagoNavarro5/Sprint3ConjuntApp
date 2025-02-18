package ConfiguracionGeneral;

import Clases.UsuarioAdmin;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class CrearLaCuentaAdmin extends javax.swing.JFrame {
    
    private final List<UsuarioAdmin> usuarioadmin; // Lista de admins

    public CrearLaCuentaAdmin(List<UsuarioAdmin> usuarioadmin) {
        this.usuarioadmin = usuarioadmin;
        
        if (this.usuarioadmin.isEmpty()) {
            this.usuarioadmin.add(new UsuarioAdmin("admin", "admin@email.com", "admin123", "1234"));
        }
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        Confirmar = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CrearGuardia = new javax.swing.JButton();
        CrearAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 191, 245));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Crear cuenta");

        jLabel2.setText("Nombre");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Confirmar");

        jLabel5.setText("Email");

        jLabel6.setText("Codigo");

        CrearGuardia.setText("Crear cuenta como guardia");

        CrearAdmin.setText("Crear cuenta como admin");
        CrearAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                                .addComponent(CrearAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(CrearGuardia)
                                .addGap(5, 5, 5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Contraseña, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Confirmar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrearGuardia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

    private void CrearAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearAdminActionPerformed
        //List<UsuarioAdmin> usuarioadmin = new ArrayList<>(); 
        String nombreUsuario = Nombre.getText().trim();
        String contrasena = Contraseña.getText().trim();
        String confirmarContrasena = Confirmar.getText().trim();
        String codigo = Codigo.getText().trim();
        String email = Email.getText().trim();

        if (nombreUsuario.isEmpty()|| contrasena.isEmpty() || confirmarContrasena.isEmpty() || codigo.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; //Que se llenen todos los espacios
        }

        if (!contrasena.equals(confirmarContrasena)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
            return;//Que las contraseñas coincidan
        }
        
        if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(this, "El correo electrónico no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;//Aseguren un correo correcto
        }
        
        
        if (buscarUsuario(nombreUsuario) != null) {
            JOptionPane.showMessageDialog(this, "El usuario ya existe. Intenta con otro nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }//Para que no se repita el usuario
        
        usuarioadmin.add(new UsuarioAdmin(nombreUsuario, contrasena, codigo, email));
        JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_CrearAdminActionPerformed
    
    private UsuarioAdmin buscarUsuario(String nombreUsuario) {
        for (UsuarioAdmin u : usuarioadmin) {
            if (u.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                return u;
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Codigo;
    private javax.swing.JPasswordField Confirmar;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JButton CrearAdmin;
    private javax.swing.JButton CrearGuardia;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
