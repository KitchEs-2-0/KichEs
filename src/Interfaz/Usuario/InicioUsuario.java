/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Usuario;

import Controlador.ConexionBADA;
import Interfaz.TraductorlogIn;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Interfaz.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class InicioUsuario extends javax.swing.JFrame {

 FondoPanel a=new FondoPanel();
    ConexionBADA conecto=new ConexionBADA();
    DatosUsuario datos=new DatosUsuario();
    public InicioUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    class FondoPanel extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen=new ImageIcon(getClass().getResource("/Recursos/InicioJuegos.jpeg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Contenedor = new FondoPanel();
        jPanel1 = new javax.swing.JPanel();
        bntperfil = new javax.swing.JButton();
        btnjuegos = new javax.swing.JButton();
        btnestadistica = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnatras = new javax.swing.JButton();
        lblUsuarioJ = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        bntperfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pngPerfil.png"))); // NOI18N
        bntperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntperfilActionPerformed(evt);
            }
        });

        btnjuegos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnjuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Juegos.jpeg"))); // NOI18N
        btnjuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjuegosActionPerformed(evt);
            }
        });

        btnestadistica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnestadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Estadistica.jpeg"))); // NOI18N
        btnestadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadisticaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(bntperfil)
                .addGap(74, 74, 74)
                .addComponent(btnjuegos)
                .addGap(70, 70, 70)
                .addComponent(btnestadistica)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntperfil)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnjuegos, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnestadistica)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnatras.setText("Atras");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnatras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuarioJ, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnatras)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblUsuarioJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void usuario(){
        try {
            System.out.println(lblUsuarioJ.getText());
            String sql="SELECT Nombre,apellido,usuario,password,edad FROM persona WHERE usuario LIKE'"+lblUsuarioJ.getText()+"'";
            ResultSet rs=conecto.query(sql);
            if(rs.next()){
                String nombre=rs.getString("Nombre");
                String apel=rs.getString("apellido");
                String usuario=rs.getString("usuario");
                String edad=rs.getString("edad");
                String password=rs.getString("password");
                
                System.out.println(nombre+" "+apel+" "+usuario+" "+edad+" "+password);
                datos.lblusuario.setText(usuario);
                datos.lblnombre.setText(nombre);
                datos.lblapellido.setText(apel);
                datos.lbledad.setText(edad);
                datos.lblpassword.setText(password);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(TraductorlogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    private void bntperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntperfilActionPerformed
        
       
       datos.setSize(479, 488);
       datos.setLocation(5, 5);
       Contenedor.removeAll();
       Contenedor.add(datos,BorderLayout.CENTER);
       Contenedor.revalidate();
       Contenedor.repaint();
       usuario();
    }//GEN-LAST:event_bntperfilActionPerformed

    private void btnjuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjuegosActionPerformed
       JuegosUsuario juegos=new JuegosUsuario();
       
       juegos.setSize(479, 488);
       juegos.setLocation(5, 5);
       Contenedor.removeAll();
       Contenedor.add(juegos,BorderLayout.CENTER);
       Contenedor.revalidate();
       Contenedor.repaint();
    }//GEN-LAST:event_btnjuegosActionPerformed

    private void btnestadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadisticaActionPerformed
       EstadisticaUsuario estadistica=new EstadisticaUsuario();
//       Estju estadistica=new Estju();
//       this.setVisible(false);
//        estadistica.setVisible(true);
        estadistica.setSize(479, 488);
       estadistica.setLocation(5, 5);
       Contenedor.removeAll();
       Contenedor.add(estadistica,BorderLayout.CENTER);
       Contenedor.revalidate();
       Contenedor.repaint();
    }//GEN-LAST:event_btnestadisticaActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        TraductorlogIn login=new TraductorlogIn();
        login.setVisible(true);       
        this.dispose();
        
    }//GEN-LAST:event_btnatrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Contenedor;
    private javax.swing.JButton bntperfil;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btnestadistica;
    private javax.swing.JButton btnjuegos;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblUsuarioJ;
    // End of variables declaration//GEN-END:variables
}
