package IngresoImagen;

import java.io.InputStream;

public class CPreguntas {

    private int codigoPregunta;
    private String Pregunta;
    private String codImagen;
    private String respuesta;
    private byte[] archivoaudio;
    private InputStream archivoaudioin;

    public CPreguntas() {
    }

    public int getCodigoPregunta() {
        return codigoPregunta;
    }

    public void setCodigoPregunta(int codigoPregunta) {
        this.codigoPregunta = codigoPregunta;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    public String getCodImagen() {
        return codImagen;
    }

    public void setCodImagen(String codImagen) {
        this.codImagen = codImagen;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public byte[] getArchivoaudio() {
        return archivoaudio;
    }

    public void setArchivoaudio(byte[] archivoaudio) {
        this.archivoaudio = archivoaudio;
    }

    public InputStream getArchivoaudioin() {
        return archivoaudioin;
    }

    public void setArchivoaudioin(InputStream archivoaudioin) {
        this.archivoaudioin = archivoaudioin;
    }
}
