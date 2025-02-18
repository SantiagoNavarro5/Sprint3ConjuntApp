package SeccionVisual;


import SeccionVisual.CrearCuenta;
import SeccionVisual.PaginaClientes;
import Clases.UsuarioAdmin;
import Clases.Usuario;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Login extends javax.swing.JFrame {
    
    private static List<Usuario> usuarios; // Lista de usuarios
    public static Usuario usuarioLogueado; // Usuario autenticado
    
    public static List<Usuario> obtenerUsuariosExistentes() {
        return usuarios; // Devuelve la lista actual de usuarios
    }
    // Método para agregar un nuevo usuario
    public static void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario); // Agrega un nuevo usuario a la lista
    }
    
    public Login(List<Usuario> usuarios) {
        //this.usuarios = usuarios;
        /*
        if (Login.usuarios == null) { // Solo asignar si no está inicializado
            Login.usuarios = usuarios;
        }
        */
        if (usuarios == null) {
            this.usuarios = new ArrayList<>(); // Asegurar que no sea null
        } else {
            this.usuarios = usuarios;
        }
        initComponents();
        //usuarios = new ArrayList<>();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        contrasenaField = new javax.swing.JPasswordField();
        Acceder = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CrearCuenta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AccesoAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 191, 245));

        jPanel1.setBackground(new java.awt.Color(44, 191, 245));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Acceso");

        Acceder.setBackground(new java.awt.Color(21, 147, 244));
        Acceder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Acceder.setForeground(new java.awt.Color(255, 255, 255));
        Acceder.setText("Acceder");
        Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccederActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(44, 191, 245));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton2.setText("Olvide mi contraseña");

        CrearCuenta.setBackground(new java.awt.Color(44, 191, 245));
        CrearCuenta.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        CrearCuenta.setText("Click aqui para crear una cuenta");
        CrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Contraseña");

        AccesoAdmin.setBackground(new java.awt.Color(21, 147, 244));
        AccesoAdmin.setFont(new java.awt.Font("Tahoma", 0, 6)); // NOI18N
        AccesoAdmin.setForeground(new java.awt.Color(255, 255, 255));
        AccesoAdmin.setText("Acceder como administrador");
        AccesoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesoAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CrearCuenta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contrasenaField, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(usuarioField)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Acceder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AccesoAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(contrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccesoAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CrearCuenta)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        Usuario usuario = buscarUsuario(nombreUsuario);
        if (usuario == null) {
            JOptionPane.showMessageDialog(jPanel1, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (usuario.getContraseña().equals(contrasena)) {
            usuarioLogueado = usuario;
            this.setVisible(false); // Ocultar el frame actual
            new PaginaClientes().setVisible(true); // Mostrar el nuevo frame
        } else {
            JOptionPane.showMessageDialog(jPanel1, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        /*
        this.setVisible(false); // Ocultar el frame actual
        new PaginaClientes().setVisible(true); // Mostrar el nuevo frame
        */
    }//GEN-LAST:event_AccederActionPerformed

    private void CrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentaActionPerformed
        List<Usuario> usuarios = new ArrayList<>(); 
        this.setVisible(false); // Ocultar el frame actual
        new CrearCuenta(usuarios).setVisible(true); // Mostrar el nuevo frame
    }//GEN-LAST:event_CrearCuentaActionPerformed

    private void AccesoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesoAdminActionPerformed
        List<UsuarioAdmin> usuarioadmin = new ArrayList<>();
        this.setVisible(false); // Ocultar el frame actual
        new LoginAdmin(usuarioadmin).setVisible(true); // Mostrar el nuevo frame
    }//GEN-LAST:event_AccesoAdminActionPerformed
    
    private Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceder;
    private javax.swing.JButton AccesoAdmin;
    private javax.swing.JButton CrearCuenta;
    private javax.swing.JPasswordField contrasenaField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuarioField;
    // End of variables declaration//GEN-END:variables
}
