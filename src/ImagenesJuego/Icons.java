package ImagenesJuego;

import Consultas.ConsultasSQL;
import Controlador.ConexionBADA;
import Interfaz.Preguntas;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Icons extends javax.swing.JLabel{
    ConexionBADA conecta=new ConexionBADA();
    int x,y;
    public Icons(JPanel panel){
        this.x=panel.getWidth();
        this.y=panel.getHeight();
        this.setSize(x,y);
    }
    public Icons(){
    }
    
    public int Random(){
    Preguntas pregunta=new Preguntas();
        Random rd=new Random();
        int numero;
        numero=(rd.nextInt(4-1)); 
        System.out.println(numero);
        return numero;
    }
    public void paint(Graphics g){
            int i=Random();
            ImageIcon n=new ImageIcon(getClass().getResource("/ImagenesJuego/ImagenPrueba"+i+".jpg"));
            g.drawImage(n.getImage(), 0, 0,x,y, null);                  
        
    }
    
    
}
