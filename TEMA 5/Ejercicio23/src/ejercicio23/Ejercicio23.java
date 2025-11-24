/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taxi taxiParametrizado = new Taxi("1234AAA", "Polo", 90, 23541425);
        System.out.println(taxiParametrizado);
        
        Taxi taxiPordefecto = new Taxi();
        System.out.println(taxiPordefecto);
        taxiPordefecto.setModelo("Megane");
    }
    
}
