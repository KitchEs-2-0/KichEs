/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Usuario;

import Consultas.ConsultasSQL;
import Controlador.ConexionBADA;
import Interfaz.Traductor;
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
        lbledad = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnmodificarnombre = new javax.swing.JButton();
        btnmodificarcontaseña = new javax.swing.JButton();
        lblpassword = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        btnmodificaredad = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        btnmodificarapellido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Datos Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Usuario:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 58, 24));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Nombre:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 70, 24));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Apellido:");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 70, 24));

        lbledad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbledad.setText("Edad");
        add(lbledad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Contraseña:");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, 24));

        btnmodificarnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificarnombre.setText("Modificar");
        btnmodificarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarnombreActionPerformed(evt);
            }
        });
        add(btnmodificarnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, 38));

        btnmodificarcontaseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificarcontaseña.setText("Modificar");
        btnmodificarcontaseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarcontaseñaActionPerformed(evt);
            }
        });
        add(btnmodificarcontaseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, 38));

        lblpassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblpassword.setText("Contraseña");
        add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 95, 32));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Edad:");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 58, 24));

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblusuario.setText("Usuario");
        add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 74, -1));

        btnmodificaredad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificaredad.setText("Modificar");
        btnmodificaredad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificaredadActionPerformed(evt);
            }
        });
        add(btnmodificaredad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, 38));

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombre.setText("Nombre");
        add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 74, -1));

        lblapellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblapellido.setText("Apellido");
        add(lblapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 74, -1));

        btnmodificarapellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmodificarapellido.setText("Modificar");
        btnmodificarapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarapellidoActionPerformed(evt);
            }
        });
        add(btnmodificarapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 38));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FondoPerfil.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodificarcontaseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarcontaseñaActionPerformed
         Usuario usuario=new Usuario();
        try {
            String contraseña=JOptionPane.showInputDialog("Ingrese el nuevo apellido");
            usuario.setPassword(contraseña);
            if (contraseña.equals("")) {
                JOptionPane.showMessageDialog(null, "Dato Invalido");
            }else{
            String sql="UPDATE persona SET password='"+usuario.getPassword()+"' WHERE usuario ='"+lblusuario.getText()+"'";
            PreparedStatement ps=conecta.getCon().prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato modificado");}
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificarcontaseñaActionPerformed

    private void btnmodificarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarnombreActionPerformed
       Usuario usuario=new Usuario();
        try {
            String nombre=JOptionPane.showInputDialog("Ingrese el nuevo nombre");
            usuario.setNombre(nombre);
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Dato Invalido");
            }else{
                String sql="UPDATE persona SET nombre='"+usuario.getNombre()+"' WHERE usuario ='"+lblusuario.getText()+"'";
            PreparedStatement ps=conecta.getCon().prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato modificado");
            }   
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificarnombreActionPerformed

    private void btnmodificaredadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificaredadActionPerformed
         Usuario usuario=new Usuario();
        try {
            String edad=JOptionPane.showInputDialog("Ingrese la edad");
            usuario.setEdad(edad);
            if (edad.equals("")) {
                JOptionPane.showMessageDialog(null, "Dato Invalido");
            }else{
            String sql="UPDATE persona SET edad='"+usuario.getEdad()+"' WHERE usuario ='"+lblusuario.getText()+"'";
            PreparedStatement ps=conecta.getCon().prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato modificado");}
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificaredadActionPerformed

    private void btnmodificarapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarapellidoActionPerformed
       Usuario usuario=new Usuario();
        try {
            String apellido=JOptionPane.showInputDialog("Ingrese el nuevo apellido");
            usuario.setApellido(apellido);
            if (apellido.equals("")) {
                JOptionPane.showMessageDialog(null, "Dato Invalido");
            }else{
            String sql="UPDATE persona SET apellido='"+usuario.getApellido()+"' WHERE usuario ='"+lblusuario.getText()+"'";
            PreparedStatement ps=conecta.getCon().prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato modificado");}
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnmodificarapellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmodificarapellido;
    private javax.swing.JButton btnmodificarcontaseña;
    private javax.swing.JButton btnmodificaredad;
    private javax.swing.JButton btnmodificarnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    public javax.swing.JLabel lblapellido;
    public javax.swing.JLabel lbledad;
    public javax.swing.JLabel lblnombre;
    public javax.swing.JLabel lblpassword;
    public javax.swing.JLabel lblusuario;
    // End of variables declaration//GEN-END:variables



}
