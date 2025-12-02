/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Leones extends Felinos{
    public Leones() {
        super();
    }
    public Leones(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    @Override
    public void sonido() {
        System.out.println("Rugido.");;
    }

    @Override
    public void alimentacion() {
        System.out.println("Carnívora.");;
    }

    @Override
    public void habitat() {
        System.out.println("Sabana.");;
    }

    @Override
    public void nombreCientifico() {
        System.out.println("Panthera leo.");
    }
}
