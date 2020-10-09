package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    
}
