package AvisosGenerales;

import Clases.AvisoGeneral;
import PaginaPrincipal.PaginaPrincipal;
import javax.swing.JOptionPane;

public class AvisosAdmin extends javax.swing.JPanel {
    //private AvisoGeneral avisoGeneral;

    public AvisosAdmin() { //(AvisoGeneral avisoGeneral)
        //this.avisoGeneral = avisoGeneral;
        initComponents();
    }
    public static String texto = "";
    public static String titulo = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EnviarTexto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        Titulo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(141, 153, 174));
        jLabel1.setText("Realizar un aviso");

        jPanel1.setBackground(new java.awt.Color(251, 133, 0));

        EnviarTexto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EnviarTexto.setText("Enviar");
        EnviarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarTextoActionPerformed(evt);
            }
        });

        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EnviarTexto)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnviarTexto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(190, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarTextoActionPerformed
        texto = Texto.getText();
        titulo = Titulo.getText();
        /*
        String titulo = Titulo.getText();
        String mensaje = Texto.getText();

        if (!titulo.isEmpty() && !mensaje.isEmpty()) {
            avisoGeneral.agregarAviso(titulo, mensaje);
            PaginaPrincipal.actualizarTexto(avisoGeneral.getAvisos()); // Pasar lista de avisos
            Titulo.setText("");
            Texto.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, escribe un título y un mensaje.");
        }
        */
    }//GEN-LAST:event_EnviarTextoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarTexto;
    private javax.swing.JTextArea Texto;
    private javax.swing.JTextField Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
