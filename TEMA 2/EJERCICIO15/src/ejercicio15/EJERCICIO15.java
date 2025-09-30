/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author fmont
 */
public class EJERCICIO15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000;
        int horas, minutos, segundos;
        
        horas = tiempo / 3600;
        minutos = (tiempo % 3600) / 60;
        segundos = tiempo % 60;
        
        System.out.println("10.000 segundos hacen un total de: "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos");
    }
    
}
