/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Usuario;

import Controlador.ConexionBADA;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DatosUsuario extends javax.swing.JPanel {

    ConexionBADA conecta=new ConexionBADA();
    public DatosUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnmodificarcontaseña = new javax.swing.JButton();
        btnmodificarnombre = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnmodificaredad = new javax.swing.JButton();
        btnmodificar5 = new javax.swing.JButton();
        lblusuario = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnmodificarapellido = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Datos Usuario");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Usuario");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Nombre");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Apellido");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Edad");

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnmodificarcontaseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificarcontaseña.setText("Modificar");
        btnmodificarcontaseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarcontaseñaActionPerformed(evt);
            }
        });

        btnmodificarnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificarnombre.setText("Modificar");
        btnmodificarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarnombreActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Edad");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Contraseña");

        btnmodificaredad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificaredad.setText("Modificar");
        btnmodificaredad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificaredadActionPerformed(evt);
            }
        });

        btnmodificar5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificar5.setText("Guardar Cambios");
        btnmodificar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificar5ActionPerformed(evt);
            }
        });

        lblusuario.setText("usuario");

        lblnombre.setText("Nombre");

        jLabel4.setText("apellido");

        btnmodificarapellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificarapellido.setText("Modificar");
        btnmodificarapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarapellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnmodificarnombre)
                                    .addComponent(btnmodificaredad)
                                    .addComponent(btnmodificarcontaseña)
                                    .addComponent(btnmodificarapellido)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnmodificar5)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusuario))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre)
                    .addComponent(btnmodificarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnmodificarapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnmodificaredad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificarcontaseña, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodificarcontaseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarcontaseñaActionPerformed
         Usuario usuario=new Usuario();
        try {
            String contraseña=JOptionPane.showInputDialog("Ingrese el nuevo apellido");
            usuario.setPassword(contraseña);
            String sql="UPDATE persona SET password='"+usuario.getPassword()+"' WHERE usuario ='"+lblusuario.getText()+"'";
            PreparedStatement ps=conecta.getCon().prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato modificado");
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificarcontaseñaActionPerformed

    private void btnmodificarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarnombreActionPerformed
       Usuario usuario=new Usuario();
        try {
            String nombre=JOptionPane.showInputDialog("Ingrese el nuevo nombre");
            usuario.setNombre(nombre);
            String sql="UPDATE persona SET nombre='"+usuario.getApellido()+"' WHERE usuario ='"+lblusuario.getText()+"'";
            PreparedStatement ps=conecta.getCon().prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato modificado");
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificarnombreActionPerformed

    private void btnmodificaredadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificaredadActionPerformed
         Usuario usuario=new Usuario();
        try {
            String edad=JOptionPane.showInputDialog("Ingrese la edad");
            usuario.setApellido(edad);
            String sql="UPDATE persona SET edad='"+usuario.getEdad()+"' WHERE usuario ='"+lblusuario.getText()+"'";
            PreparedStatement ps=conecta.getCon().prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato modificado");
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificaredadActionPerformed

    private void btnmodificar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificar5ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String sql="DELETE FROM `persona` WHERE '"+lblusuario+"'";
            ResultSet rs=conecta.query(sql);
            if(rs.next()==true){
                JOptionPane.showMessageDialog(null, "El usuario ha sido eliminado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnmodificarapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarapellidoActionPerformed
       Usuario usuario=new Usuario();
        try {
            String apellido=JOptionPane.showInputDialog("Ingrese el nuevo apellido");
            usuario.setApellido(apellido);
            String sql="UPDATE persona SET apellido='"+usuario.getApellido()+"' WHERE usuario ='"+lblusuario.getText()+"'";
            PreparedStatement ps=conecta.getCon().prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato modificado");
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnmodificarapellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnmodificar5;
    private javax.swing.JButton btnmodificarapellido;
    private javax.swing.JButton btnmodificarcontaseña;
    private javax.swing.JButton btnmodificaredad;
    private javax.swing.JButton btnmodificarnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblusuario;
    // End of variables declaration//GEN-END:variables
}
