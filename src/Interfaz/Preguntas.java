
package Interfaz;

import Consultas.ConsultasSQL;
import Controlador.ConexionBADA;
import Interfaz.Usuario.InicioUsuario;
import Modelo.Cjuego;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.applet.AudioClip;
import java.sql.PreparedStatement;
import java.util.HashMap; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */

public class Preguntas extends JFrame{
   
   ConexionBADA conecta=new ConexionBADA();
   
   ImageIcon imagen1[]=new ImageIcon[11];
   
//   int contador;

 FondoPanel fondo=new FondoPanel();

    public Preguntas() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("YUPAYKUNA--LOS NUMEROS");
        for (int i = 1; i <11; i++) {
            imagen1[i]=new ImageIcon(getClass().getResource("/ImagenesJuegoN1/Numero"+i+".png")); 
        }
            lblImagenSalida.setIcon(imagen1[1]);
       
    }
    
    
    class FondoPanel extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen=new ImageIcon(getClass().getResource("/Recursos/ImagenJuegos.jpeg")).getImage();
            
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
    public void usuariosalir(){
        InicioUsuario inicio=new InicioUsuario();
       inicio.setVisible(true);
       this.dispose();
        String usu=lblusuario.getText();
        inicio.lblUsuarioJ.setText(usu);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new FondoPanel();
        lblPreguntas = new javax.swing.JLabel();
        btnsiguinete = new javax.swing.JButton();
        radio2 = new javax.swing.JRadioButton();
        radio1 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        btnSalirjuego = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        lblImagenSalida = new javax.swing.JLabel();
        btnaudio = new javax.swing.JButton();
        lblp1 = new javax.swing.JLabel();
        lblp2 = new javax.swing.JLabel();
        lblp3 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblclicks = new javax.swing.JLabel();
        lblcorrecto = new javax.swing.JLabel();
        lblincorrecto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 513));

        lblPreguntas.setBackground(new java.awt.Color(0, 0, 0));
        lblPreguntas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPreguntas.setForeground(new java.awt.Color(255, 255, 255));
        lblPreguntas.setText("Pregunta");

        btnsiguinete.setText("Siguiente");
        btnsiguinete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsiguineteMouseClicked(evt);
            }
        });
        btnsiguinete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguineteActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio2);
        radio2.setText("Palabra2");

        buttonGroup1.add(radio1);
        radio1.setText("Palabra1");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio3);
        radio3.setText("Palabra3");

        btnSalirjuego.setText("Salir");
        btnSalirjuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirjuegoActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnaudio.setText("Audio");
        btnaudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaudioActionPerformed(evt);
            }
        });

        lblp1.setForeground(new java.awt.Color(255, 255, 255));

        lblp2.setForeground(new java.awt.Color(255, 255, 255));

        lblp3.setForeground(new java.awt.Color(255, 255, 255));

        lblusuario.setText("jLabel1");

        lblclicks.setText("0");

        lblcorrecto.setText("0");

        lblincorrecto.setText("0");

        jLabel1.setText("Correctas");

        jLabel2.setText("Incorrectas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblp3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblp1)
                                .addComponent(lblp2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(lblImagenSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(radio3)
                                                    .addComponent(radio1)
                                                    .addComponent(radio2)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(btnaudio)))
                                        .addGap(67, 67, 67))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnsiguinete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSalirjuego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcorrecto)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblincorrecto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lblPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblclicks))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblclicks)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblincorrecto)
                        .addComponent(lblcorrecto)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(lblp1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblp2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblp3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(lblPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnaudio)
                        .addGap(61, 61, 61)
                        .addComponent(radio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio3)
                        .addGap(34, 34, 34)
                        .addComponent(btnsiguinete, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalirjuego, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblImagenSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirjuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirjuegoActionPerformed
       usuariosalir();
    }//GEN-LAST:event_btnSalirjuegoActionPerformed

    private void btnsiguineteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguineteActionPerformed
        validaRadios();
    }//GEN-LAST:event_btnsiguineteActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
//       
         int numero=0;
        lblImagenSalida.setIcon(imagen1[numero]);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
//        int contador=1; 
//        int sum =0;
//        contador++;
//        sum= sum+contador;
//        System.out.println("contador"+sum);
//          Acumulador();
    }//GEN-LAST:event_radio1ActionPerformed

    private void btnaudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaudioActionPerformed
//        audio(1);
        Random a=new Random();
        int numero;
        numero=(a.nextInt(10-1)); 
        if (numero==0) {
            numero=numero+1; 
        }
        System.out.println("audio"+numero);
        AudioClip audio;
        audio=java.applet.Applet.newAudioClip(getClass().getResource("/AudiosJuego/"+numero+".wav")) ;
        audio.play();
    }//GEN-LAST:event_btnaudioActionPerformed

    private int count=0;
    private void btnsiguineteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguineteMouseClicked
        count++;
        String numero=String.valueOf(count);
        lblclicks.setText(numero);
    }//GEN-LAST:event_btnsiguineteMouseClicked
              
//    public  AudioClip audio(int a){
//        AudioClip audio;
//        audio=java.applet.Applet.newAudioClip(getClass().getResource("/AudiosJuego/"+a+".m4a")) ;
//        audio.play();
//        return audio;
//    }
    
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
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalirjuego;
    private javax.swing.JButton btnaudio;
    private javax.swing.JButton btnsiguinete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblImagenSalida;
    public javax.swing.JLabel lblPreguntas;
    private javax.swing.JLabel lblclicks;
    private javax.swing.JLabel lblcorrecto;
    private javax.swing.JLabel lblincorrecto;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lblp2;
    private javax.swing.JLabel lblp3;
    public javax.swing.JLabel lblusuario;
    public static javax.swing.JRadioButton radio1;
    public static javax.swing.JRadioButton radio2;
    public static javax.swing.JRadioButton radio3;
    // End of variables declaration//GEN-END:variables

    
    public void siguiente(){
        Random rd=new Random();
        int numero;
        numero=(rd.nextInt(10)+1); 
        
//        System.out.println(numero);
        
        String sql="SELECT preguntas.pregunta, preguntas.Respuesta,imagen.imagen FROM preguntas, imagen WHERE preguntas.codPregunta LIKE '"+numero+"';";
        ResultSet rs;
        ImageIcon foto= conecta.getFoto(Integer.valueOf(numero));
        InputStream is=null;
        ImageIcon ii=null ;
        ConsultasSQL consulta=new ConsultasSQL(conecta.getCon(), sql);
        if(consulta.getError()==null){
                rs=consulta.getResultado();
                try {
                    rs.next();
                    String pregunta = rs.getString("pregunta");
                    lblPreguntas.setText(pregunta);
                    String respuesta=rs.getString("Respuesta");
                    lblp1.setText(respuesta);
                    if(foto!=null){
                        lblImagenSalida.setIcon(foto);
                    }else{
                        lblImagenSalida.setIcon(null);
                    }
                    lblImagenSalida.updateUI();
                    
                    
                    
                  int n=0,num=0;
                while (n==num) { 
                    Random r=new Random();
                    num=(r.nextInt(20)+1); 
        
                    Random a=new Random();
                    n=(a.nextInt(20)+1); 

                    }
                    
                    ramdonPreguntas(num,n);
                    
                } catch (SQLException ex) {
                    ex.getMessage();
                }
            }
            
            RandomPregunta();
        lblImagenSalida.setIcon(imagen1[numero]);
        click();
    }
    
    public void ramdonPreguntas(int num1, int num2){
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
            treeMap.put(1, "PICHKA CHUNKA");        treeMap.put(7, "CHUSKU CHUNKA");
            treeMap.put(2, "PATSAK");               treeMap.put(8, "CHUNKA PUSAK");
            treeMap.put(3, "HUNU");                 treeMap.put(9, "PUSAK PATSAK");
            treeMap.put(4, "SUKTA PATSAK");         treeMap.put(10, "CHUNKA SHUK");
            treeMap.put(5, "WARANKA");              treeMap.put(11, "TAWA CHUNKA");
            treeMap.put(6,"CHUSKU PATSAK");
            treeMap.put(12, "SUKTA CHUNKA");        treeMap.put(18, "CHUNKA PISQAYOP");
            treeMap.put(13, "CHUNKA PUSAK");        treeMap.put(19, "QANCHIS CHUNKA");
            treeMap.put(14, "ISHKAY CHUNKA");       treeMap.put(20, "PUSAQ CHUNKA");
            treeMap.put(15, "PUSAK CHUNKA");          
            treeMap.put(16, "CHUNKA SHUK");         
            treeMap.put(17,"KIMSA PATSAK");
                
                    
                    Iterator<Integer> it = treeMap.keySet().iterator();
                    while(it.hasNext()){
                    Integer key = it.next();
                    if (key==num1) {
                        lblp2.setText(treeMap.get(key));
                    }
                    if (key==num2) {
                         lblp3.setText(treeMap.get(key));
                         
                    }
                    
            }
    }            
    
    private void validaRadios() {
         String cad="";
            String a=lblp1.getText();
            if (radio1.isSelected()) {
             cad+=radio1.getText();
            }
            if (radio2.isSelected()) {
             cad+=radio2.getText();
            }
            if (radio3.isSelected()) {
             cad+=radio3.getText();
            }
            
            
   
            
            System.out.println(a);
            System.out.println(cad);
            
            
            if (a.equals(cad)){ 
                System.out.println("correcto");
                int correct=Integer.parseInt(lblcorrecto.getText());
                int cont=correct+1;
                lblcorrecto.setText(String.valueOf(cont));
                
            }else{
                System.out.println("Incorrecto");
                int incorrect=Integer.parseInt(lblincorrecto.getText());
                int cont1=incorrect+1;
                lblincorrecto.setText(String.valueOf(cont1));
            
         limpiarradio();
        }
         
        siguiente();
    }

    public void RandomPregunta(){
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
            treeMap.put(1, lblp1.getText());        
            treeMap.put(2, lblp2.getText());  
            treeMap.put(3, lblp3.getText());
           

        int n=0, nu=0,num=0;
        while (n==nu || n==num || nu==num) { 
            
            Random s=new Random();
            n=(s.nextInt(3)+1);
          
            Random t=new Random();
            nu=(s.nextInt(3)+1);
         
            Random u=new Random();
            num=(u.nextInt(3)+1);
        }
      
//        System.out.println(n+" "+nu+" "+num);

        Iterator<Integer> it = treeMap.keySet().iterator();
            while(it.hasNext()){
                Integer key = it.next();
             if (n==key) {
                radio1.setText(treeMap.get(key));
            }
            if (nu==key) {
                radio2.setText(treeMap.get(key));
            }
            if (num==key) {
                radio3.setText(treeMap.get(key));
            }
      
                       
        } 
        
        
    }
    
    public void limpiarradio(){
        radio1.removeAll();
        radio2.removeAll();
        radio3.removeAll();
       
    }
    
    public void click(){
        int correcto=Integer.parseInt(lblcorrecto.getText());
        int incorrecto=Integer.parseInt(lblincorrecto.getText());
        int sum=correcto+incorrecto;
        if(sum==10){
            enviarEstadistica();
            JOptionPane.showMessageDialog(null, "Test terminado");
            this.dispose();
            JOptionPane.showMessageDialog(null, "Datos de juego guardado");
        }
    }
    
   public void enviarEstadistica(){
       try {
           int p=Integer.parseInt(lblcorrecto.getText());
           int porcent=(p*100)/10;
           Cjuego j=new Cjuego();
           j.setCodPreguntasC("1");
           j.setDificultadC("baja");
           j.setCodUsuarioC(lblusuario.getText());
           j.setPorcentaje(porcent);
           
           String sql="INSERT INTO juego(codPreguntas,usuarioJ,estadistica) VALUES (?,?,?)";
           PreparedStatement ps=conecta.getCon().prepareStatement(sql);
           ps.setString(1,j.getCodPreguntasC());
           ps.setString(2,j.getCodUsuarioC());
           ps.setInt(3,j.getPorcentaje());
           ps.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
    
}
