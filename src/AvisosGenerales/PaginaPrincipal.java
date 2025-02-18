package PaginaPrincipal;

import AvisosGenerales.AvisosAdmin;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class PaginaPrincipal extends javax.swing.JPanel {
    //private static List<String> avisos = new ArrayList<>();
    /*
    public static void actualizarTexto(List<String> nuevosAvisos) {
        avisos = nuevosAvisos; // Actualiza la lista con los nuevos avisos
        actualizarTexto();
    }
    */
    /*
    private static void actualizarTexto() {
        
        if(avisos.isEmpty()){
            jTextField1.setText("No hay avisos.");
        } else {
            StringBuilder sb = new StringBuilder("<html>");
            for(String aviso : avisos){
                sb.append(aviso).append("<br><br>");
            }
            sb.append("</html>");
            jScrollPane1.setText(sb.toString());
        }
    }
    */
    
    public PaginaPrincipal() {
        initComponents();
        Panel1.setVisible(false);
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        
        AvisosAdmin ventana = new AvisosAdmin();
        Titulo1.setText(ventana.titulo);
        Contenido1.setText(ventana.texto);
        Panel1.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        Contenido1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
        Contenido2 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Titulo3 = new javax.swing.JLabel();
        Contenido3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(141, 153, 174));
        jLabel1.setText("Avisos recientes");

        Panel1.setBackground(new java.awt.Color(251, 133, 0));

        Titulo1.setBackground(new java.awt.Color(245, 83, 34));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
            .addComponent(Contenido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenido1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        Panel2.setBackground(new java.awt.Color(251, 133, 0));

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenido2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        Panel3.setBackground(new java.awt.Color(251, 133, 0));

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addComponent(Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenido3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contenido1;
    private javax.swing.JLabel Contenido2;
    private javax.swing.JLabel Contenido3;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
