/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ASUS
 */
public class Cjuego {
    private int codJuegoC;
    private String dificultadC;
    private String codPreguntasC;
    private String codUsuarioC;
    private int porcentaje;

    public Cjuego() {
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    
    public int getCodJuegoC() {
        return codJuegoC;
    }

    public void setCodJuegoC(int codJuegoC) {
        this.codJuegoC = codJuegoC;
    }

    public String getDificultadC() {
        return dificultadC;
    }

    public void setDificultadC(String dificultadC) {
        this.dificultadC = dificultadC;
    }

    public String getCodPreguntasC() {
        return codPreguntasC;
    }

    public void setCodPreguntasC(String codPreguntasC) {
        this.codPreguntasC = codPreguntasC;
    }

    public String getCodUsuarioC() {
        return codUsuarioC;
    }

    public void setCodUsuarioC(String codUsuarioC) {
        this.codUsuarioC = codUsuarioC;
    }
    
    
}
