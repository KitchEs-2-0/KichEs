/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[]args){
        Inicio p1=new Inicio();
       p1.setVisible(true);
        esperar(3);
        p1.setVisible(false);
        Traductor t1=new Traductor();
        t1.setVisible(true);
         
    }   
    public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
//            System.out.println(e);
         }
    } 
}
