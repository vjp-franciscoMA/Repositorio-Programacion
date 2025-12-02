/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author alumno
 */
public class Lobos extends Canidos{
    public Lobos() {
        super();
    }
    public Lobos(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    @Override
    public void sonido() {
        System.out.println("Aullido.");
    }

    @Override
    public void alimentacion() {
        System.out.println("Carnívora.");
    }

    @Override
    public void habitat() {
        System.out.println("Bosque.");
    }

    @Override
    public void nombreCientifico() {
        System.out.println("Canis lupus.");
    }
}
