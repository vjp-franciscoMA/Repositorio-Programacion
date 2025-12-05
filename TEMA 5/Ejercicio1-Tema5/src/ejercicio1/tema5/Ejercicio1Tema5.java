/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.tema5;

/**
 *
 * @author fmont
 */
public class Ejercicio1Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.setMarca("Mercedes");
        coche1.setModelo("GLA");
        coche1.setVelocidad(0);
        coche1.setMotorEncendido(false);
        
        coche1.arrancarCoche();
        coche1.acelerarCoche();
        
        System.out.println(coche1.getMarca());
        System.out.println(coche1.getModelo());
        System.out.println(coche1.getVelocidad());
        System.out.println(coche1.getMotorEncendido());
        System.out.println(coche1.toString());
    }
    
}
