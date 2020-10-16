
package Controlador;

import Interfaz.Inicio;
import Interfaz.Traductor;

public class main {
    public static void main(String[]args){
        Inicio inicio=new Inicio();
       inicio.setVisible(true);
//        esperar(3);
        inicio.setVisible(false);
        Traductor t1=new Traductor();
        t1.setVisible(true);
         
    }   
    public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
         }
    } 
}
