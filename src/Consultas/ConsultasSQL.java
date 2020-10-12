/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ConsultasSQL {
    Connection con;
    ResultSet rs;
    ResultSetMetaData mtd;
    String[] columnas;
    String consulta, error;
    
    public ConsultasSQL(Connection c, String sql){
        this.con=c;
        this.consulta=sql;
        
        try {
            Statement st=con.createStatement();
            rs=st.executeQuery(consulta);
            mtd=rs.getMetaData();
            error=null;
        } catch (SQLException ex) {
            error=ex.getMessage();
        }
        
    }
    
    public String getError(){
        return this.error;
    }
    public ResultSet getResultado(){
        return this.rs;
    }
    
    public String [] getNombresColumnas() {
        
        try {
            int numColumnas=mtd.getColumnCount();
            this.columnas = new String[numColumnas];
            for(int a=0;a<numColumnas;a++){
                columnas[a]=mtd.getColumnLabel(a+1);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    return columnas;
}
    
}
