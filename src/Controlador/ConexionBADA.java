package Controlador;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ConexionBADA {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    private String CadenaConexion="jdbc:mysql://localhost:3306/kiches"+"?useTimezone=true&serverTimezone=UTC";
    private String usuarioPo="root";
    private String contrasena="";
    
        public ConexionBADA() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBADA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
           con=DriverManager.getConnection(CadenaConexion,usuarioPo, contrasena);
       } catch (SQLException ex) {
            Logger.getLogger(ConexionBADA.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error coneccion");
        }
    }
    
    
    public ResultSet query(String sql){
   
        try {
            st=con.createStatement();
            ResultSet resul=st.executeQuery(sql);
            return resul;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBADA.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
           
    }
    
    
    public void noQuery (String nqry){
        try {
            st=con.createStatement();
            st.execute(nqry);
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBADA.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
    public  ImageIcon getFoto(int id){
        
            String sql="SELECT  imagen FROM imagen WHERE codImagen='"+id+"'";
            ImageIcon ii=null;
            InputStream is = null;
            try {
                st=con.createStatement();
                rs=st.executeQuery(sql);
                if(rs.next()){
                is= rs.getBinaryStream(1);
                BufferedImage bi=ImageIO.read(is);
                ii=new ImageIcon(bi);
            }
        } catch (SQLException ex){ex.printStackTrace();} catch(IOException ex){ex.printStackTrace();} 
           
        return ii;
    }
    
}
