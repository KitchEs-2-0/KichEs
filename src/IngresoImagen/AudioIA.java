package IngresoImagen;

import Controlador.ConexionBADA;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AudioIA {
    
 
    public void Agregar_Audio(CPreguntas vo){
        try {
            ConexionBADA conecta=new ConexionBADA();
            String sql=" INSERT INTO preguntas (codPregunta, pregunta, codImagen, Respuesta, Audio) VALUES (?,?,?,?,?)";
            PreparedStatement ps=conecta.getCon().prepareStatement(sql);
            ps.setInt(1,vo.getCodigoPregunta());
            ps.setString(2, vo.getPregunta());
            ps.setString(3,vo.getCodImagen());
            ps.setString(4, vo.getRespuesta());
            ps.setBytes(5, vo.getArchivoaudio());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

 