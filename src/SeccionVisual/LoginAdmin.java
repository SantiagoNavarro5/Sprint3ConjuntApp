package SeccionVisual;


import SeccionVisual.Login;
import SeccionVisual.PaginaAdmin;
import Clases.UsuarioAdmin;
import Clases.Usuario;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


public class LoginAdmin extends javax.swing.JFrame {
    
    private static List<UsuarioAdmin> usuarioadmin; // Lista de admins
    public static UsuarioAdmin usuarioLogueado; // Usuario autenticado
    
    public static List<UsuarioAdmin> obtenerUsuariosAdmin() {
        return usuarioadmin; // Devuelve la lista actual de usuarios
    }
    // Método para agregar un nuevo usuario
    public static void agregarUsuarioAdmin(UsuarioAdmin usuario) {
        usuarioadmin.add(usuario); // Agrega un nuevo usuario a la lista
    }
    /**/
    public LoginAdmin(List<UsuarioAdmin> usuarioadmin) {
        /*
        this.usuarioadmin = usuarioadmin;
        
        if (this.usuarioadmin.isEmpty()) {
            this.usuarioadmin.add(new UsuarioAdmin("admin", "admin@email.com", "admin123", "1234"));
        }
        */
        if (usuarioadmin == null) {
            this.usuarioadmin = new ArrayList<>(); // Asegurar que no sea null
            System.out.println("Lista vacía, añadiendo el usuario admin.");
            this.usuarioadmin.add(new UsuarioAdmin("admin", "admin@email.com", "admin123", "1234"));
        } else {
            this.usuarioadmin = usuarioadmin;
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        contrasenaField = new javax.swing.JPasswordField();
        CodigoField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Acceder = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 191, 245));

        jPanel1.setBackground(new java.awt.Color(44, 191, 245));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Acceso");

        jLabel3.setText("Nombre");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Codigo");

        Acceder.setBackground(new java.awt.Color(21, 147, 244));
        Acceder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Acceder.setForeground(new java.awt.Color(255, 255, 255));
        Acceder.setText("Acceder");
        Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccederActionPerformed(evt);
            }
        });

        Regresar.setBackground(new java.awt.Color(44, 191, 245));
        Regresar.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Acceder)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                            .addComponent(Regresar))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usuarioField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contrasenaField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CodigoField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(CodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Acceder, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(Regresar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccederActionPerformed
        String nombreUsuario = usuarioField.getText();
        String contrasena = new String(contrasenaField.getPassword());
        String codigo = new String(CodigoField.getPassword());
        
        UsuarioAdmin usuarioadmin = buscarUsuario(nombreUsuario);
        if (usuarioadmin == null) {
            JOptionPane.showMessageDialog(jPanel1, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (usuarioadmin.getContraseña().equals(contrasena) && usuarioadmin.getCodigo().equals(codigo)) {
            usuarioLogueado = usuarioadmin;
            this.setVisible(false); // Ocultar el frame actual
            new PaginaAdmin().setVisible(true); // Mostrar el nuevo frame
        } else {
            JOptionPane.showMessageDialog(jPanel1, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AccederActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        List<Usuario> usuarios = new ArrayList<>();
        this.setVisible(false); // Ocultar el frame actual
        new Login(usuarios).setVisible(true); // Mostrar el nuevo frame
    }//GEN-LAST:event_RegresarActionPerformed

    private UsuarioAdmin buscarUsuario(String nombreUsuario) {
        for (UsuarioAdmin usuario : usuarioadmin) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceder;
    private javax.swing.JPasswordField CodigoField;
    private javax.swing.JButton Regresar;
    private javax.swing.JPasswordField contrasenaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuarioField;
    // End of variables declaration//GEN-END:variables
}
